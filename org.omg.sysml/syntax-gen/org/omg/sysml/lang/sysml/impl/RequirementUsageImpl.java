/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;


import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.ConcernUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.ElementUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getRequirementDefinition <em>Requirement Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getReqId <em>Req Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getRequiredConstraint <em>Required Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getAssumedConstraint <em>Assumed Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getSubjectParameter <em>Subject Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getFramedConcern <em>Framed Concern</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getActorParameter <em>Actor Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getStakeholderParameter <em>Stakeholder Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RequirementUsageImpl extends ConstraintUsageImpl implements RequirementUsage {

	/**
	 * The cached setting delegate for the '{@link #getRequirementDefinition() <em>Requirement Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequirementDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REQUIREMENT_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_USAGE__REQUIREMENT_DEFINITION).getSettingDelegate();

	/**
	 * The default value of the '{@link #getReqId() <em>Req Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqId()
	 * @generated
	 * @ordered
	 */
	protected static final String REQ_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReqId() <em>Req Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReqId()
	 * @generated
	 * @ordered
	 */
	protected String reqId = REQ_ID_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getText() <em>Text</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TEXT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_USAGE__TEXT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getRequiredConstraint() <em>Required Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredConstraint()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate REQUIRED_CONSTRAINT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAssumedConstraint() <em>Assumed Constraint</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssumedConstraint()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSUMED_CONSTRAINT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSubjectParameter() <em>Subject Parameter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubjectParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SUBJECT_PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_USAGE__SUBJECT_PARAMETER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFramedConcern() <em>Framed Concern</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFramedConcern()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FRAMED_CONCERN__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_USAGE__FRAMED_CONCERN).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getActorParameter() <em>Actor Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActorParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ACTOR_PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_USAGE__ACTOR_PARAMETER).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getStakeholderParameter() <em>Stakeholder Parameter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStakeholderParameter()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate STAKEHOLDER_PARAMETER__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.REQUIREMENT_USAGE__STAKEHOLDER_PARAMETER).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequirementUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.REQUIREMENT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementDefinition getRequirementDefinition() {
		return (RequirementDefinition)REQUIREMENT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequirementDefinition basicGetRequirementDefinition() {
		return (RequirementDefinition)REQUIREMENT_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRequirementDefinition(RequirementDefinition newRequirementDefinition) {
		REQUIREMENT_DEFINITION__ESETTING_DELEGATE.dynamicSet(this, null, 0, newRequirementDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequirementDefinition() {
		return basicGetRequirementDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getSubjectParameter() {
		return (Usage)SUBJECT_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Usage basicGetSubjectParameter() {
		return (Usage)SUBJECT_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSubjectParameter(Usage newSubjectParameter) {
		SUBJECT_PARAMETER__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSubjectParameter);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getActorParameter() {
		return (EList<PartUsage>)ACTOR_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartUsage> getStakeholderParameter() {
		return (EList<PartUsage>)STAKEHOLDER_PARAMETER__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getReqId() {
		return reqId;
	}

	@Override
	public void setReqId(String newReqId) {
		setReqIdGen(ElementUtil.unescapeString(newReqId));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReqIdGen(String newReqId) {
		String oldReqId = reqId;
		reqId = newReqId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.REQUIREMENT_USAGE__REQ_ID, oldReqId, reqId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReqId() {
		return REQ_ID_EDEFAULT == null ? reqId != null : !REQ_ID_EDEFAULT.equals(reqId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getText() {
		return (EList<String>)TEXT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getAssumedConstraint() {
		return (EList<ConstraintUsage>)ASSUMED_CONSTRAINT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConstraintUsage> getRequiredConstraint() {
		return (EList<ConstraintUsage>)REQUIRED_CONSTRAINT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<ConcernUsage> getFramedConcern() {
		return (EList<ConcernUsage>)FRAMED_CONCERN__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getConstraintDefinition() {
		return getRequirementDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate basicGetConstraintDefinition() {
		return basicGetRequirementDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintDefinition(Predicate newConstraintDefinition) {
		if (newConstraintDefinition != null && !(newConstraintDefinition instanceof RequirementDefinition)) {
			throw new IllegalArgumentException("newConstraintDefinition must be an instance of RequirementDefinition");
		}
		setRequirementDefinition((RequirementDefinition) newConstraintDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintDefinition() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDeclaredShortName() {
		return getReqId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDeclaredShortName(String newDeclaredShortName) {
		setReqId(newDeclaredShortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDeclaredShortName() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_DEFINITION:
				if (resolve) return getRequirementDefinition();
				return basicGetRequirementDefinition();
			case SysMLPackage.REQUIREMENT_USAGE__REQ_ID:
				return getReqId();
			case SysMLPackage.REQUIREMENT_USAGE__TEXT:
				return getText();
			case SysMLPackage.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT:
				return getRequiredConstraint();
			case SysMLPackage.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT:
				return getAssumedConstraint();
			case SysMLPackage.REQUIREMENT_USAGE__SUBJECT_PARAMETER:
				if (resolve) return getSubjectParameter();
				return basicGetSubjectParameter();
			case SysMLPackage.REQUIREMENT_USAGE__FRAMED_CONCERN:
				return getFramedConcern();
			case SysMLPackage.REQUIREMENT_USAGE__ACTOR_PARAMETER:
				return getActorParameter();
			case SysMLPackage.REQUIREMENT_USAGE__STAKEHOLDER_PARAMETER:
				return getStakeholderParameter();
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
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_DEFINITION:
				setRequirementDefinition((RequirementDefinition)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQ_ID:
				setReqId((String)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__TEXT:
				getText().clear();
				getText().addAll((Collection<? extends String>)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT:
				getRequiredConstraint().clear();
				getRequiredConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT:
				getAssumedConstraint().clear();
				getAssumedConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__SUBJECT_PARAMETER:
				setSubjectParameter((Usage)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__FRAMED_CONCERN:
				getFramedConcern().clear();
				getFramedConcern().addAll((Collection<? extends ConcernUsage>)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__ACTOR_PARAMETER:
				getActorParameter().clear();
				getActorParameter().addAll((Collection<? extends PartUsage>)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__STAKEHOLDER_PARAMETER:
				getStakeholderParameter().clear();
				getStakeholderParameter().addAll((Collection<? extends PartUsage>)newValue);
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
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_DEFINITION:
				setRequirementDefinition((RequirementDefinition)null);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQ_ID:
				setReqId(REQ_ID_EDEFAULT);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__TEXT:
				getText().clear();
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT:
				getRequiredConstraint().clear();
				return;
			case SysMLPackage.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT:
				getAssumedConstraint().clear();
				return;
			case SysMLPackage.REQUIREMENT_USAGE__SUBJECT_PARAMETER:
				setSubjectParameter((Usage)null);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__FRAMED_CONCERN:
				getFramedConcern().clear();
				return;
			case SysMLPackage.REQUIREMENT_USAGE__ACTOR_PARAMETER:
				getActorParameter().clear();
				return;
			case SysMLPackage.REQUIREMENT_USAGE__STAKEHOLDER_PARAMETER:
				getStakeholderParameter().clear();
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
			case SysMLPackage.REQUIREMENT_USAGE__CONSTRAINT_DEFINITION:
				return isSetConstraintDefinition();
			case SysMLPackage.REQUIREMENT_USAGE__DECLARED_SHORT_NAME:
				return isSetDeclaredShortName();
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_DEFINITION:
				return isSetRequirementDefinition();
			case SysMLPackage.REQUIREMENT_USAGE__REQ_ID:
				return isSetReqId();
			case SysMLPackage.REQUIREMENT_USAGE__TEXT:
				return TEXT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT:
				return REQUIRED_CONSTRAINT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT:
				return ASSUMED_CONSTRAINT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.REQUIREMENT_USAGE__SUBJECT_PARAMETER:
				return SUBJECT_PARAMETER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.REQUIREMENT_USAGE__FRAMED_CONCERN:
				return FRAMED_CONCERN__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.REQUIREMENT_USAGE__ACTOR_PARAMETER:
				return ACTOR_PARAMETER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.REQUIREMENT_USAGE__STAKEHOLDER_PARAMETER:
				return STAKEHOLDER_PARAMETER__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
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
		result.append(" (reqId: ");
		result.append(reqId);
		result.append(')');
		return result.toString();
	}

} //RequirementUsageImpl
