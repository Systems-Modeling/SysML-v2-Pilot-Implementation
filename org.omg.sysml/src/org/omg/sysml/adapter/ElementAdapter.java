/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import java.util.Optional;

import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.omg.sysml.lang.sysml.Element;

public class ElementAdapter extends AdapterImpl {
	
	protected boolean isTransformed = false;

	public static ElementAdapter getOrCreateAdapter(Element target) {
		return getOrCreateAdapter(target, ElementAdapter.class);
	}
	
	protected static <T extends ElementAdapter> ElementAdapter getOrCreateAdapter(Element target, Class<T> kind) {
		return getExistingAdapter(target, kind).orElseGet(() -> initializeAdapter(target, kind));
	}
	
	protected static <T extends ElementAdapter> Optional<ElementAdapter> getExistingAdapter(Element target, Class<T> kind) {
		return target.eAdapters()
			.stream()
			.filter(kind::isInstance)
			.map(ElementAdapter.class::cast)
			.findFirst();
	}
	
	protected static <T extends ElementAdapter> ElementAdapter initializeAdapter(Element target, Class<T> kind) {
		// Replace existing adapter with a new adapter
		try {
			ElementAdapter adapter = 
					getExistingAdapter(target, ElementAdapter.class).map(other -> {
						target.eAdapters().remove(other);
						try {
							return kind.getConstructor(ElementAdapter.class).newInstance(other);
						} catch (Exception e) {
							e.printStackTrace();
							return other;
						}
					}).orElse(kind.getConstructor().newInstance());
			target.eAdapters().add(adapter);
			return adapter;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void removeAdapter(Element target) {
		getExistingAdapter(target, ElementAdapter.class).ifPresent(target.eAdapters()::remove);
	}
	
	public static boolean isElementTransformed(Element element) {
		return getExistingAdapter(element, ElementAdapter.class).map(ElementAdapter::isTransformed).orElse(false);
	}
	
	public ElementAdapter() {
		super();
	}
	
	public ElementAdapter(ElementAdapter other) {
		this();
		this.isTransformed = other.isTransformed;
	}
	
	@Override
	public boolean isAdapterForType(Object type) {
		return type instanceof Element;
	}

	@Override
	public Element getTarget() {
		return (Element)super.getTarget();
	}
	
	public boolean isTransformed() {
		return isTransformed;
	}
	
	public void setIsTransformed() {
		isTransformed = true;
	}
	
}
