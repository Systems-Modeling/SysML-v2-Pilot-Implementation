/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/

package org.omg.sysml.delegate.setting;

import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EStructuralFeature.Internal.SettingDelegate;

public class DerivedPropertySettingDelegateFactory 
	implements EStructuralFeature.Internal.SettingDelegate.Factory {
	
	public static final String SYSML_ANNOTATION = "http://www.omg.org/spec/SysML";
	
	private static final String PACKAGE_NAME = DerivedPropertySettingDelegateFactory.class.getPackage().getName();
	
	private final Map<EStructuralFeature, Constructor<?>> constructorMap = new HashMap<>();
	
	protected Constructor<?> getDelegateConstructor(EStructuralFeature eStructuralFeature) {
		Constructor<?> constructor = constructorMap.get(eStructuralFeature);
		if (constructor == null) {
			try {
				String delegateName = PACKAGE_NAME + "." + 
						eStructuralFeature.getEContainingClass().getName() + "_" + 
						eStructuralFeature.getName() + "_SettingDelegate";
				constructor = Class.forName(delegateName).getConstructor(EStructuralFeature.class);
				constructorMap.put(eStructuralFeature, constructor);
			} catch (ClassNotFoundException e) {
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
		return constructor;
	}
	
	@Override
	public SettingDelegate createSettingDelegate(EStructuralFeature eStructuralFeature) {
		Constructor<?> constructor = getDelegateConstructor(eStructuralFeature);
		if (constructor == null) {
			return new DefaultDerivedPropertySettingDelegate(eStructuralFeature);
		} else {
			try {
				return (SettingDelegate) constructor.newInstance(eStructuralFeature);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
	}

}
