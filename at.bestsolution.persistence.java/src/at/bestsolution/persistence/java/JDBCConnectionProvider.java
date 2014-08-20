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
package at.bestsolution.persistence.java;

import java.sql.Blob;
import java.sql.Clob;
import java.sql.Connection;
import java.sql.SQLException;

public interface JDBCConnectionProvider {
	public String getDatabaseType();
	public Connection checkoutConnection();
	public void returnConnection(Connection connection);
	public Blob createTempBlob(Connection connection) throws SQLException;
	public Clob createTempClob(Connection connection) throws SQLException;
	public void releaseTempBlob(Connection connection, Blob blob) throws SQLException;
	public void releaseTempClob(Connection connection, Clob clob) throws SQLException;
}
