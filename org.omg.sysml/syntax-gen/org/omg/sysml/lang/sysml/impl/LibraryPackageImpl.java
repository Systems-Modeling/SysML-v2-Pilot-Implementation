/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022-2024 Model Driven Solutions, Inc.
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
package org.omg.sysml.lang.sysml.impl;

import java.util.UUID;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.sysml.lang.sysml.LibraryPackage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ElementUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Library Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.LibraryPackageImpl#isStandard <em>Is Standard</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LibraryPackageImpl extends PackageImpl implements LibraryPackage {
	/**
	 * The default value of the '{@link #isStandard() <em>Is Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandard()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STANDARD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStandard() <em>Is Standard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStandard()
	 * @generated
	 * @ordered
	 */
	protected boolean isStandard = IS_STANDARD_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LibraryPackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.LIBRARY_PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isStandard() {
		return isStandard;
	}
	
	// Additional overrides
	
	public final String KERML_LIBRARY_BASE_URI = "https://www.omg.org/spec/KerML/";
	public final String SYSML_LIBRARY_BASE_URI = "https://www.omg.org/spec/SysML/";
	
	// UUID for "NameSpace_URL", per ITU-T Rec. X.667 (10/2012), Annex D.9
	public final UUID UUID_NAMESPACE_URL = UUID.fromString("6ba7b811-9dad-11d1-80b4-00c04fd430c8");
	
	@Override
	public String getElementId() {
		if (elementId == null && isStandard()) {
			Resource resource = eResource();
			if (resource != null) {
				String uri = resource.getURI().toString().contains("Kernel")?
						KERML_LIBRARY_BASE_URI: SYSML_LIBRARY_BASE_URI;
				String qualifiedName = getQualifiedName();
				if (qualifiedName != null) {
					elementId = ElementUtil.constructNameUUID(UUID_NAMESPACE_URL, uri + qualifiedName).toString();
				}
			}
		}
		return super.getElementId();
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsStandard(boolean newIsStandard) {
		boolean oldIsStandard = isStandard;
		isStandard = newIsStandard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.LIBRARY_PACKAGE__IS_STANDARD, oldIsStandard, isStandard));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.LIBRARY_PACKAGE__IS_STANDARD:
				return isStandard();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.LIBRARY_PACKAGE__IS_STANDARD:
				setIsStandard((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.LIBRARY_PACKAGE__IS_STANDARD:
				setIsStandard(IS_STANDARD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.LIBRARY_PACKAGE__IS_STANDARD:
				return isStandard != IS_STANDARD_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isStandard: ");
		result.append(isStandard);
		result.append(')');
		return result.toString();
	}

} //LibraryPackageImpl
