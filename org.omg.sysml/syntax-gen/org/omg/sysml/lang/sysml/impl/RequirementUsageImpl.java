/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.CaseDefinition;
import org.omg.sysml.lang.sysml.CaseUsage;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ObjectiveMembership;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

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
 * </ul>
 *
 * @generated
 */
public class RequirementUsageImpl extends ConstraintUsageImpl implements RequirementUsage {

	public static final String REQUIREMENT_SUBSETTING_BASE_DEFAULT = "Requirements::requirementChecks";
	public static final String REQUIREMENT_SUBSETTING_SUBREQUIREMENT_DEFAULT = "Requirements::RequirementCheck::subrequirements";

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
		RequirementDefinition requirementDefinition = basicGetRequirementDefinition();
		return requirementDefinition != null && requirementDefinition.eIsProxy() ? (RequirementDefinition)eResolveProxy((InternalEObject)requirementDefinition) : requirementDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RequirementDefinition basicGetRequirementDefinition() {
		Predicate definition = super.basicGetConstraintDefinition();
		return definition instanceof RequirementDefinition? (RequirementDefinition)definition: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setRequirementDefinition(RequirementDefinition newRequirementDefinition) {
		throw new UnsupportedOperationException();
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
		Usage subjectParameter = basicGetSubjectParameter();
		return subjectParameter != null && subjectParameter.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)subjectParameter) : subjectParameter;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetSubjectParameter() {
		return UsageImpl.basicGetSubjectParameterOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSubjectParameter(Usage newSubjectParameter) {
		throw new UnsupportedOperationException();
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
		setReqIdGen(unescapeString(newReqId));
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
	 * @generated NOT
	 */
	@Override
	public EList<String> getText() {
		EList<String> text = new EObjectEList<>(String.class, this, SysMLPackage.REQUIREMENT_DEFINITION__TEXT);
		getDocumentationComment().stream().map(Comment::getBody).forEachOrdered(text::add);
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConstraintUsage> getRequiredConstraint() {
		EList<ConstraintUsage> constraints = new EObjectEList<>(ConstraintUsage.class, this, SysMLPackage.REQUIREMENT_DEFINITION__ASSUMED_CONSTRAINT);
		RequirementDefinitionImpl.getRequirementConstraints(this, RequirementConstraintKind.ASSUMPTION).forEachOrdered(constraints::add);
		return constraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConstraintUsage> getAssumedConstraint() {
		EList<ConstraintUsage> constraints = new EObjectEList<>(ConstraintUsage.class, this, SysMLPackage.REQUIREMENT_DEFINITION__REQUIRED_CONSTRAINT);
		RequirementDefinitionImpl.getRequirementConstraints(this, RequirementConstraintKind.REQUIREMENT).forEachOrdered(constraints::add);
		return constraints;
	}

	@Override
	protected String getDefaultSupertype() {
		return isRequirementConstraint()? 
				REQUIREMENT_SUBSETTING_SUBREQUIREMENT_DEFAULT:
				REQUIREMENT_SUBSETTING_BASE_DEFAULT;
	}
	
	@Override
	public boolean isRequirementConstraint() {
		Type owningType = getOwningType();
		return !isAssumptionConstraint() &&
			   (owningType instanceof RequirementDefinition || 
			    owningType instanceof RequirementUsage);
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
	@Override
	public String getHumanId() {
		return getReqId();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHumanId(String newHumanId) {
		setReqId(newHumanId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetHumanId() {
  		return false;
	}
	
	// Additional overrides
	
	public boolean isObjective() {
		return getOwningFeatureMembership() instanceof ObjectiveMembership;
	}
	
	public RequirementUsage getObjectiveRequirementOf(Type type) {
		return type instanceof CaseDefinition? ((CaseDefinition)type).getObjectiveRequirement():
			   type instanceof CaseUsage? ((CaseUsage)type).getObjectiveRequirement():
			   null;
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return isObjective()? Collections.singletonList(getObjectiveRequirementOf(type)):
			   super.getRelevantFeatures(type);
	}
	
	@Override
	public List<Feature> getOwnedParameters() {
		basicGetSubjectParameter();
		return super.getOwnedParameters();
	}
	
	@Override
	public void transform() {
		super.transform();
		basicGetSubjectParameter();
	}
	
	//

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
			case SysMLPackage.REQUIREMENT_USAGE__HUMAN_ID:
				return isSetHumanId();
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_DEFINITION:
				return isSetRequirementDefinition();
			case SysMLPackage.REQUIREMENT_USAGE__REQ_ID:
				return isSetReqId();
			case SysMLPackage.REQUIREMENT_USAGE__TEXT:
				return !getText().isEmpty();
			case SysMLPackage.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT:
				return !getRequiredConstraint().isEmpty();
			case SysMLPackage.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT:
				return !getAssumedConstraint().isEmpty();
			case SysMLPackage.REQUIREMENT_USAGE__SUBJECT_PARAMETER:
				return basicGetSubjectParameter() != null;
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
