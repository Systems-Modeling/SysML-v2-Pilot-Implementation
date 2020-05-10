/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Parameter;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getRequirementOwningUsage <em>Requirement Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getSubjectParameter <em>Subject Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getReqId <em>Req Id</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getText <em>Text</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getRequiredConstraint <em>Required Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getAssumedConstraint <em>Assumed Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RequirementUsageImpl#getRequirementOwningDefinition <em>Requirement Owning Definition</em>}</li>
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
	 * The default value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected static final String TEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getText() <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getText()
	 * @generated
	 * @ordered
	 */
	protected String text = TEXT_EDEFAULT;

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
	public Usage getRequirementOwningUsage() {
		Usage requirementOwningUsage = basicGetRequirementOwningUsage();
		return requirementOwningUsage != null && requirementOwningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)requirementOwningUsage) : requirementOwningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetRequirementOwningUsage() {
		return super.basicGetConstraintOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setRequirementOwningUsage(Usage newRequirementOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequirementOwningUsage() {
		return basicGetRequirementOwningUsage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getSubjectParameter() {
		Parameter subjectParameter = basicGetSubjectParameter();
		return subjectParameter != null && subjectParameter.eIsProxy() ? (Parameter)eResolveProxy((InternalEObject)subjectParameter) : subjectParameter;
	}
	
	public EList<Parameter> getParameter() {
		return new DerivedEObjectEList<Parameter>(Parameter.class, this, SysMLPackage.BEHAVIOR__PARAMETER,
				new int[] { SysMLPackage.TYPE__FEATURE });
	}	
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Parameter basicGetSubjectParameter() {
		// Note: The subject parameter is assumed to be the first owned parameter.
		return (Parameter)getFeature().stream().
				filter(feature->feature instanceof Parameter).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSubjectParameter(Parameter newSubjectParameter) {
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
	@Override
	public String getText() {
		return text;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setText(String newText) {
		String oldText = text;
		text = newText;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.REQUIREMENT_USAGE__TEXT, oldText, text));
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getRequirementOwningDefinition() {
		Definition requirementOwningDefinition = basicGetRequirementOwningDefinition();
		return requirementOwningDefinition != null && requirementOwningDefinition.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)requirementOwningDefinition) : requirementOwningDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Definition basicGetRequirementOwningDefinition() {
		return super.basicGetConstraintOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setRequirementOwningDefinition(Definition newRequirementOwningDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRequirementOwningDefinition() {
		return basicGetRequirementOwningDefinition() != null;
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
	public Usage getConstraintOwningUsage() {
		return getRequirementOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage basicGetConstraintOwningUsage() {
		return basicGetRequirementOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintOwningUsage(Usage newConstraintOwningUsage) {
		setRequirementOwningUsage(newConstraintOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintOwningUsage() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getConstraintOwningDefinition() {
		return getRequirementOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition basicGetConstraintOwningDefinition() {
		return basicGetRequirementOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConstraintOwningDefinition(Definition newConstraintOwningDefinition) {
		setRequirementOwningDefinition(newConstraintOwningDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintOwningDefinition() {
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
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_OWNING_USAGE:
				if (resolve) return getRequirementOwningUsage();
				return basicGetRequirementOwningUsage();
			case SysMLPackage.REQUIREMENT_USAGE__SUBJECT_PARAMETER:
				if (resolve) return getSubjectParameter();
				return basicGetSubjectParameter();
			case SysMLPackage.REQUIREMENT_USAGE__REQ_ID:
				return getReqId();
			case SysMLPackage.REQUIREMENT_USAGE__TEXT:
				return getText();
			case SysMLPackage.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT:
				return getRequiredConstraint();
			case SysMLPackage.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT:
				return getAssumedConstraint();
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_OWNING_DEFINITION:
				if (resolve) return getRequirementOwningDefinition();
				return basicGetRequirementOwningDefinition();
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
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_OWNING_USAGE:
				setRequirementOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__SUBJECT_PARAMETER:
				setSubjectParameter((Parameter)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQ_ID:
				setReqId((String)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__TEXT:
				setText((String)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT:
				getRequiredConstraint().clear();
				getRequiredConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT:
				getAssumedConstraint().clear();
				getAssumedConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_OWNING_DEFINITION:
				setRequirementOwningDefinition((Definition)newValue);
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
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_OWNING_USAGE:
				setRequirementOwningUsage((Usage)null);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__SUBJECT_PARAMETER:
				setSubjectParameter((Parameter)null);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQ_ID:
				setReqId(REQ_ID_EDEFAULT);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__TEXT:
				setText(TEXT_EDEFAULT);
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT:
				getRequiredConstraint().clear();
				return;
			case SysMLPackage.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT:
				getAssumedConstraint().clear();
				return;
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_OWNING_DEFINITION:
				setRequirementOwningDefinition((Definition)null);
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
			case SysMLPackage.REQUIREMENT_USAGE__CONSTRAINT_OWNING_USAGE:
				return isSetConstraintOwningUsage();
			case SysMLPackage.REQUIREMENT_USAGE__CONSTRAINT_OWNING_DEFINITION:
				return isSetConstraintOwningDefinition();
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_DEFINITION:
				return isSetRequirementDefinition();
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_OWNING_USAGE:
				return isSetRequirementOwningUsage();
			case SysMLPackage.REQUIREMENT_USAGE__SUBJECT_PARAMETER:
				return basicGetSubjectParameter() != null;
			case SysMLPackage.REQUIREMENT_USAGE__REQ_ID:
				return REQ_ID_EDEFAULT == null ? reqId != null : !REQ_ID_EDEFAULT.equals(reqId);
			case SysMLPackage.REQUIREMENT_USAGE__TEXT:
				return TEXT_EDEFAULT == null ? text != null : !TEXT_EDEFAULT.equals(text);
			case SysMLPackage.REQUIREMENT_USAGE__REQUIRED_CONSTRAINT:
				return !getRequiredConstraint().isEmpty();
			case SysMLPackage.REQUIREMENT_USAGE__ASSUMED_CONSTRAINT:
				return !getAssumedConstraint().isEmpty();
			case SysMLPackage.REQUIREMENT_USAGE__REQUIREMENT_OWNING_DEFINITION:
				return isSetRequirementOwningDefinition();
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
		result.append(", text: ");
		result.append(text);
		result.append(')');
		return result.toString();
	}

} //RequirementUsageImpl
