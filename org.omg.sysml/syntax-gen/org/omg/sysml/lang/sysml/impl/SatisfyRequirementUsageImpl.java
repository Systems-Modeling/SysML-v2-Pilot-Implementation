/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.omg.sysml.lang.sysml.AssertConstraintUsage;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Invariant;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.SatisfyRequirementUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Satisfy Requirement Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SatisfyRequirementUsageImpl#getAssertionConnector <em>Assertion Connector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SatisfyRequirementUsageImpl#getSatisfiedRequirement <em>Satisfied Requirement</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SatisfyRequirementUsageImpl#getSatisfyingFeature <em>Satisfying Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SatisfyRequirementUsageImpl extends RequirementUsageImpl implements SatisfyRequirementUsage {

	private Type subsettingBaseDefault;
	private Type subsettingPartDefault;

	/**
	 * The cached value of the BindingConnector from the result of the
	 * this ConstraintUsage to the result of a LiteralBoolean true.
	 */
	protected BindingConnector assertionConnector = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SatisfyRequirementUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SATISFY_REQUIREMENT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingConnector getAssertionConnector() {
		BindingConnector assertionConnector = basicGetAssertionConnector();
		return assertionConnector != null && assertionConnector.eIsProxy() ? (BindingConnector)eResolveProxy((InternalEObject)assertionConnector) : assertionConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BindingConnector basicGetAssertionConnector() {
		return assertionConnector = InvariantImpl.getAssertionConnectorFor(this, assertionConnector, this.getResult());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setAssertionConnector(BindingConnector newAssertionConnector) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RequirementUsage getSatisfiedRequirement() {
		RequirementUsage satisfiedRequirement = basicGetSatisfiedRequirement();
		return satisfiedRequirement != null && satisfiedRequirement.eIsProxy() ? (RequirementUsage)eResolveProxy((InternalEObject)satisfiedRequirement) : satisfiedRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RequirementUsage basicGetSatisfiedRequirement() {
		Type subsettingBaseDefault = getSubsettingBaseDefault();
		Type subsettingPartDefault = getSubsettingPartDefault();
		EList<Subsetting> subsettings = getOwnedSubsetting_comp();		
		if (subsettings.stream().map(sub->sub.getSubsettedFeature()).
				allMatch(feature->feature == subsettingBaseDefault || 
				         feature == subsettingPartDefault)) {
			return this;
		} else {
			Feature subsettedFeature = subsettings.get(0).getSubsettedFeature(); 
			return subsettedFeature instanceof RequirementUsage? (RequirementUsage)subsettedFeature: this;
		}
	}
	
	protected Type getSubsettingBaseDefault() {
		if (subsettingBaseDefault == null) {
			subsettingBaseDefault = getDefaultType(REQUIREMENT_SUBSETTING_BASE_DEFAULT);
		}
		return subsettingBaseDefault;
	}

	protected Type getSubsettingPartDefault() {
		if (subsettingPartDefault == null) {
			subsettingPartDefault = getDefaultType(AssertConstraintUsageImpl.ASSERT_CONSTRAINT_SUBSETTING_PART_DEFAULT);
		}
		return subsettingPartDefault;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSatisfiedRequirement(RequirementUsage newSatisfiedRequirement) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSatisfiedRequirement() {
		return basicGetSatisfiedRequirement() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSatisfyingFeature() {
		Feature satisfyingFeature = basicGetSatisfyingFeature();
		return satisfyingFeature != null && satisfyingFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)satisfyingFeature) : satisfyingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetSatisfyingFeature() {
		BindingConnector connector = getSatisfyingFeatureConnector();		
		return connector == null? null: connector.getRelatedFeature().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSatisfyingFeature(Feature newSatisfyingFeature) {
		throw new UnsupportedOperationException();
	}
	
	public BindingConnector getSatisfyingFeatureConnector() {
		BindingConnector connector = (BindingConnector)getOwnedFeature().stream().
				filter(feature->feature instanceof BindingConnector).
				findFirst().orElse(null);
		if (connector != null) {
			((ConnectorImpl)connector).setRelatedFeature(0,getSubjectParameter());
		}
		return connector;
	}

//	@Override
//	protected Feature getNamingFeature() {
//		return getSatisfiedRequirement();
//	}

	@Override
	public void transform() {
		super.transform();
		getSatisfyingFeatureConnector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTION_CONNECTOR:
				if (resolve) return getAssertionConnector();
				return basicGetAssertionConnector();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT:
				if (resolve) return getAssertedConstraint();
				return basicGetAssertedConstraint();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT:
				if (resolve) return getSatisfiedRequirement();
				return basicGetSatisfiedRequirement();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE:
				if (resolve) return getSatisfyingFeature();
				return basicGetSatisfyingFeature();
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
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTION_CONNECTOR:
				setAssertionConnector((BindingConnector)newValue);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT:
				setAssertedConstraint((ConstraintUsage)newValue);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT:
				setSatisfiedRequirement((RequirementUsage)newValue);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE:
				setSatisfyingFeature((Feature)newValue);
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
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTION_CONNECTOR:
				setAssertionConnector((BindingConnector)null);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT:
				setAssertedConstraint((ConstraintUsage)null);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT:
				setSatisfiedRequirement((RequirementUsage)null);
				return;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE:
				setSatisfyingFeature((Feature)null);
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
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTION_CONNECTOR:
				return basicGetAssertionConnector() != null;
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT:
				return isSetAssertedConstraint();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFIED_REQUIREMENT:
				return isSetSatisfiedRequirement();
			case SysMLPackage.SATISFY_REQUIREMENT_USAGE__SATISFYING_FEATURE:
				return basicGetSatisfyingFeature() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Invariant.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTION_CONNECTOR: return SysMLPackage.INVARIANT__ASSERTION_CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == AssertConstraintUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT: return SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Invariant.class) {
			switch (baseFeatureID) {
				case SysMLPackage.INVARIANT__ASSERTION_CONNECTOR: return SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTION_CONNECTOR;
				default: return -1;
			}
		}
		if (baseClass == AssertConstraintUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ASSERT_CONSTRAINT_USAGE__ASSERTED_CONSTRAINT: return SysMLPackage.SATISFY_REQUIREMENT_USAGE__ASSERTED_CONSTRAINT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintUsage getAssertedConstraint() {
		return getSatisfiedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintUsage basicGetAssertedConstraint() {
		return basicGetSatisfiedRequirement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssertedConstraint(ConstraintUsage newAssertedConstraint) {
		if (newAssertedConstraint != null && !(newAssertedConstraint instanceof RequirementUsage)) {
			throw new IllegalArgumentException("newAssertedConstraint must be an instance of RequirementUsage");
		}
		setSatisfiedRequirement((RequirementUsage) newAssertedConstraint);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssertedConstraint() {
  		return false;
	}

} //SatisfyRequirementUsageImpl
