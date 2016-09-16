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

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import at.bestsolution.persistence.Key;

public interface SessionCache {
	public <O extends EObject, K extends Key<O>> O getObject(EClass eClass, K id);
	public <K extends Key<?>> void putObject(EObject object, K id, long version);
	public <K extends Key<?>> long getVersion(EObject object, K id);
	public <K extends Key<?>> boolean updateVersion(EObject object, K id, long version);
	public void evitObject(EObject object);
	public <K extends Key<?>> void evictObject(EClass eClass, K id);
	public void evictObjects(EClass eClass);
	public boolean isCached(EObject object);
	public void clear();
	public void release();

	public <O extends EObject> List<O> getQueryResult(String query, Object... parameters);
	public void putQueryResult(List<EObject> list, String query, Object... parameters);
	public void evitQueryResult(Selector<List<EObject>> selector);

	public <O extends EObject> Map<Object,O> getQueryMapResult(String query, Object... parameters);
	public void putQueryMapResult(Map<Object,EObject> map, String query, Object... parameters);
	public void evitQueryMapResult(Selector<Map<Object,EObject>> selector);

	public interface Selector<D> {
		public boolean select(String name, List<Object> parameters, D data);
	}
}
