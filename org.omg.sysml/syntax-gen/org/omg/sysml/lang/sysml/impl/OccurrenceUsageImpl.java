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
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OccurrenceUsageImpl#getOccurrenceDefinition <em>Occurrence Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OccurrenceUsageImpl#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OccurrenceUsageImpl#isIndividual <em>Is Individual</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OccurrenceUsageImpl#getPortionKind <em>Portion Kind</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurrenceUsageImpl extends UsageImpl implements OccurrenceUsage {
	/**
	 * The cached setting delegate for the '{@link #getOccurrenceDefinition() <em>Occurrence Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOccurrenceDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OCCURRENCE_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getIndividualDefinition() <em>Individual Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndividualDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INDIVIDUAL_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION).getSettingDelegate();

	/**
	 * The default value of the '{@link #isIndividual() <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIVIDUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndividual() <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividual()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndividual = IS_INDIVIDUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortionKind() <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * Default for portionKind is null, per its 0..1 multiplicity in the MOF abstract syntax model.
	 * <!-- end-user-doc -->
	 * @see #getPortionKind()
	 * @generated NOT
	 * @ordered
	 */
	protected static final PortionKind PORTION_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortionKind() <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortionKind()
	 * @generated
	 * @ordered
	 */
	protected PortionKind portionKind = PORTION_KIND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrenceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OCCURRENCE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.omg.sysml.lang.sysml.Class> getOccurrenceDefinition() {
		return (EList<org.omg.sysml.lang.sysml.Class>)OCCURRENCE_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOccurrenceDefinition() {
		return !getOccurrenceDefinition().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceDefinition getIndividualDefinition() {
		return (OccurrenceDefinition)INDIVIDUAL_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OccurrenceDefinition basicGetIndividualDefinition() {
		return (OccurrenceDefinition)INDIVIDUAL_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndividualDefinition(OccurrenceDefinition newIndividualDefinition) {
		INDIVIDUAL_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newIndividualDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIndividual() {
		return isIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsIndividual(boolean newIsIndividual) {
		boolean oldIsIndividual = isIndividual;
		isIndividual = newIsIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL, oldIsIndividual, isIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortionKind getPortionKind() {
		return portionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortionKind(PortionKind newPortionKind) {
		PortionKind oldPortionKind = portionKind;
		portionKind = newPortionKind == null ? PORTION_KIND_EDEFAULT : newPortionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND, oldPortionKind, portionKind));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION:
				return getOccurrenceDefinition();
			case SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION:
				if (resolve) return getIndividualDefinition();
				return basicGetIndividualDefinition();
			case SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL:
				return isIndividual();
			case SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND:
				return getPortionKind();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION:
				getOccurrenceDefinition().clear();
				getOccurrenceDefinition().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION:
				setIndividualDefinition((OccurrenceDefinition)newValue);
				return;
			case SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL:
				setIsIndividual((Boolean)newValue);
				return;
			case SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND:
				setPortionKind((PortionKind)newValue);
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
			case SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION:
				getOccurrenceDefinition().clear();
				return;
			case SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION:
				setIndividualDefinition((OccurrenceDefinition)null);
				return;
			case SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL:
				setIsIndividual(IS_INDIVIDUAL_EDEFAULT);
				return;
			case SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND:
				setPortionKind(PORTION_KIND_EDEFAULT);
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
			case SysMLPackage.OCCURRENCE_USAGE__DEFINITION:
				return isSetDefinition();
			case SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION:
				return isSetOccurrenceDefinition();
			case SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION:
				return INDIVIDUAL_DEFINITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL:
				return isIndividual != IS_INDIVIDUAL_EDEFAULT;
			case SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND:
				return portionKind != PORTION_KIND_EDEFAULT;
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
		result.append(" (isIndividual: ");
		result.append(isIndividual);
		result.append(", portionKind: ");
		result.append(portionKind);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getDefinition() {
		@SuppressWarnings("unchecked")
		EList<Classifier> occurrenceDefinition = (EList<Classifier>)((EList<?>)getOccurrenceDefinition());
		return occurrenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinition() {
  		return false;
	}

} //OccurrenceUsageImpl
