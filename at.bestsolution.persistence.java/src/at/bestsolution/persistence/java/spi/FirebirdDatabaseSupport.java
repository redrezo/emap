/*******************************************************************************
 * Copyright (c) 2014 BestSolution.at and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Tom Schindl <tom.schindl@bestsolution.at> - initial API and implementation
 *******************************************************************************/
package at.bestsolution.persistence.java.spi;

import java.util.List;

import at.bestsolution.persistence.MappedQuery;
import at.bestsolution.persistence.expr.Expression;
import at.bestsolution.persistence.expr.PropertyExpression;
import at.bestsolution.persistence.java.DatabaseSupport;
import at.bestsolution.persistence.java.JavaObjectMapper;
import at.bestsolution.persistence.java.internal.PreparedInsertStatement;
import at.bestsolution.persistence.java.internal.PreparedUpdateStatement;
import at.bestsolution.persistence.java.query.ListDelegate;
import at.bestsolution.persistence.java.query.MappedQueryImpl;

public class FirebirdDatabaseSupport implements DatabaseSupport {

	@Override
	public String getDatabaseType() {
		return "Firebird";
	}

	@Override
	public QueryBuilder createQueryBuilder(String tableName) {
		return new FirebirdQueryBuilder(tableName);
	}

	@Override
	public PrimaryKeyGenType getPrimaryKeyType() {
		return PrimaryKeyGenType.SEQUENCE;
	}

	@Override
	public <O> MappedQuery<O> createMappedQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
		return new FirebirdMappedQuery<O>(rootMapper, rootPrefix, listDelegate);
	}

	@Override
	public boolean isArrayStoreSupported(Class<?> type) {
		return false;
	}

	public boolean isNestedResultSetsSupported() {
		// See http://stackoverflow.com/questions/935511/how-can-i-avoid-resultset-is-closed-exception-in-java
		return false;
	}

	static class FirebirdMappedQuery<O> extends MappedQueryImpl<O> {

		public FirebirdMappedQuery(JavaObjectMapper<O> rootMapper, String rootPrefix, ListDelegate<O> listDelegate) {
			super(rootMapper, rootPrefix, listDelegate);
		}

		@Override
		protected void appendCriteria(StringBuilder b, JavaObjectMapper<O> mapper, String colPrefix,
				Expression<O> expression) {
			switch (expression.type) {
			case ILIKE:
				b.append("lower(" +colPrefix + mapper.getColumnName(((PropertyExpression<O>)expression).property) + ") LIKE lower ( ? )" );
				return;
			default:
				super.appendCriteria(b, mapper, colPrefix, expression);
			}

		}
	}

	static class FirebirdQueryBuilder implements QueryBuilder {
		private String tableName;
		
		public FirebirdQueryBuilder(String tableName) {
			this.tableName = tableName;
		}


		@Override
		public UpdateStatement createUpdateStatement(String pkColumn, String lockColumn) {
			return new PreparedUpdateStatement(tableName, pkColumn, lockColumn);
		}

		@Override
		public InsertStatement createInsertStatement(String pkColumn, String primaryKeyExpression, String lockColumn) {
			return new PreparedInsertStatement(tableName, pkColumn, primaryKeyExpression, lockColumn) {
				@Override
				protected String createSQL(String tableName, String pkColumn,
						String primaryKeyExpression, String lockColumn,
						List<Column> columnList) {
					return super.createSQL(tableName, pkColumn, primaryKeyExpression, lockColumn,
							columnList) + " RETURNING " + '"' + pkColumn + '"';
				}
			};
		}
	}
}
