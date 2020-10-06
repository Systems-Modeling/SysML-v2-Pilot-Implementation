/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.BooleanExpression;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.RequirementUsage;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constraint Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#getParameter <em>Parameter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#getConstraintDefinition <em>Constraint Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstraintUsageImpl extends UsageImpl implements ConstraintUsage {
	
	public static final String CONSTRAINT_SUBSETTING_BASE_DEFAULT = "Constraints::constraintChecks";
	public static final String CONSTRAINT_SUBSETTING_ASSUMPTION_FEATURE = "Requirements::RequirementCheck::assumptions";
	public static final String CONSTRAINT_SUBSETTING_REQUIREMENT_FEATURE = "Requirements::RequirementCheck::constraints";
	
	/**
	 * The cached value of the BindingConnector from the result of the last
	 * sub-Expression to the result of this ConstraintUsage.
	 */
	protected BindingConnector resultConnector = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConstraintUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONSTRAINT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getParameter() {
		EList<Feature> parameters = new EObjectEList<>(Feature.class, this, SysMLPackage.CONSTRAINT_USAGE__PARAMETER);
		parameters.addAll(getAllParameters());
		return parameters;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getConstraintDefinition() {
		Predicate constraintDefinition = basicGetConstraintDefinition();
		return constraintDefinition != null && constraintDefinition.eIsProxy() ? (Predicate)eResolveProxy((InternalEObject)constraintDefinition) : constraintDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Predicate basicGetConstraintDefinition() {
		return (Predicate)super.getType().stream().
				filter(type->type instanceof Predicate).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConstraintDefinition(Predicate newConstraintDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintDefinition() {
		return basicGetConstraintDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> behavior = (EList<Type>)((EList<?>)getBehavior());
		return behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Behavior> getBehavior() {
		EList<Behavior> behavior = new UniqueEList<Behavior>();
		Function function = getFunction();
		if (function != null) {
			behavior.add(function);
		}
		return new UnionEObjectEList<Behavior>(this, SysMLPackage.Literals.STEP__BEHAVIOR, behavior.size(), behavior.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBehavior() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function getFunction() {
		return getPredicate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetFunction() {
		return basicGetPredicate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		if (newFunction != null && !(newFunction instanceof Predicate)) {
			throw new IllegalArgumentException("newFunction must be an instance of Predicate");
		}
		setPredicate((Predicate) newFunction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunction() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getPredicate() {
		return getConstraintDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate basicGetPredicate() {
		return basicGetConstraintDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPredicate(Predicate newPredicate) {
		setConstraintDefinition(newPredicate);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredicate() {
  		return false;
	}

	// Additional redefinitions and subsets
	
	@Override
	public void computeImplicitGeneralization() {
		if (isAssumptionConstraint()) {
			addSubsetting(CONSTRAINT_SUBSETTING_ASSUMPTION_FEATURE);
		} else if (isRequirementConstraint()){
			addSubsetting(CONSTRAINT_SUBSETTING_REQUIREMENT_FEATURE);
		}
		super.computeImplicitGeneralization();
	}
	
	protected void addSubsetting(String subsettedFeatureName) {
		Feature feature = (Feature)getDefaultType(subsettedFeatureName);
		if (feature != null) {
			addImplicitGeneralType(SysMLPackage.eINSTANCE.getSubsetting(), feature);
		}
	}

	@Override
	protected String getDefaultSupertype() {
		return CONSTRAINT_SUBSETTING_BASE_DEFAULT;
	}
	
	public boolean isAssumptionConstraint() {
		return getRequirementConstraintKind() == RequirementConstraintKind.ASSUMPTION;
	}
	
	public boolean isRequirementConstraint() {
		return getRequirementConstraintKind() == RequirementConstraintKind.REQUIREMENT;
	}
	
	public RequirementConstraintKind getRequirementConstraintKind() {
		FeatureMembership owningMembership = getOwningFeatureMembership();
		return owningMembership instanceof RequirementConstraintMembership? 
				((RequirementConstraintMembership)owningMembership).getKind(): null;
	}
	
	@Override
	public EList<Feature> getFeature() {
		getResultConnector();
		return super.getFeature();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getResult() {
		Feature result = basicGetResult();
		return result != null && result.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)result) : result;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetResult() {
		return getResultParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setResult(Feature newResult) {
		throw new UnsupportedOperationException();
	}

	public BindingConnector getResultConnector() {
		return resultConnector = BlockExpressionImpl.getResultConnectorFor(this, resultConnector, this.getResult());
	}
	
	// Additional Overrides
	
	@Override
	protected boolean hasRelevantSubjectParameter() {
		Type owningType = getOwningType();
		return isRequirement() && 
			   (owningType instanceof RequirementDefinition || owningType instanceof RequirementUsage);
	}
	
	public boolean isRequirement() {
		return getType().stream().anyMatch(RequirementDefinition.class::isInstance);
	}
	
	@Override
	public Usage getSubjectParameter() {
		return basicGetSubjectParameter();
	}
	
	protected Usage basicGetSubjectParameter() {
		return isRequirement()? basicGetSubjectParameterOf(this): null;
	}
	
	@Override
	public List<Feature> getOwnedParameters() {
		// Note: "Basic" version is used to avoid proxy resolution in RequirementUsageImpl.
		basicGetSubjectParameter();
		CalculationDefinitionImpl.addResultParameter(this);
		return super.getOwnedParameters();
	}
	
	@Override
	public void transform() {
		super.transform();
		basicGetSubjectParameter();
		CalculationDefinitionImpl.addResultParameter(this);
		getResultConnector();
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
			case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR:
				return getBehavior();
			case SysMLPackage.CONSTRAINT_USAGE__PARAMETER:
				return getParameter();
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SysMLPackage.CONSTRAINT_USAGE__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				if (resolve) return getConstraintDefinition();
				return basicGetConstraintDefinition();
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
			case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR:
				getBehavior().clear();
				getBehavior().addAll((Collection<? extends Behavior>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PARAMETER:
				getParameter().clear();
				getParameter().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__RESULT:
				setResult((Feature)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				setPredicate((Predicate)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				setConstraintDefinition((Predicate)newValue);
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
			case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR:
				getBehavior().clear();
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PARAMETER:
				getParameter().clear();
				return;
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				setFunction((Function)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__RESULT:
				setResult((Feature)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				setPredicate((Predicate)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				setConstraintDefinition((Predicate)null);
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
			case SysMLPackage.CONSTRAINT_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.CONSTRAINT_USAGE__PARAMETER:
				return !getParameter().isEmpty();
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				return isSetFunction();
			case SysMLPackage.CONSTRAINT_USAGE__RESULT:
				return basicGetResult() != null;
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				return isSetPredicate();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				return isSetConstraintDefinition();
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
		if (baseClass == Step.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR: return SysMLPackage.STEP__BEHAVIOR;
				case SysMLPackage.CONSTRAINT_USAGE__PARAMETER: return SysMLPackage.STEP__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_USAGE__FUNCTION: return SysMLPackage.EXPRESSION__FUNCTION;
				case SysMLPackage.CONSTRAINT_USAGE__RESULT: return SysMLPackage.EXPRESSION__RESULT;
				default: return -1;
			}
		}
		if (baseClass == BooleanExpression.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_USAGE__PREDICATE: return SysMLPackage.BOOLEAN_EXPRESSION__PREDICATE;
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
		if (baseClass == Step.class) {
			switch (baseFeatureID) {
				case SysMLPackage.STEP__BEHAVIOR: return SysMLPackage.CONSTRAINT_USAGE__BEHAVIOR;
				case SysMLPackage.STEP__PARAMETER: return SysMLPackage.CONSTRAINT_USAGE__PARAMETER;
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				case SysMLPackage.EXPRESSION__FUNCTION: return SysMLPackage.CONSTRAINT_USAGE__FUNCTION;
				case SysMLPackage.EXPRESSION__RESULT: return SysMLPackage.CONSTRAINT_USAGE__RESULT;
				default: return -1;
			}
		}
		if (baseClass == BooleanExpression.class) {
			switch (baseFeatureID) {
				case SysMLPackage.BOOLEAN_EXPRESSION__PREDICATE: return SysMLPackage.CONSTRAINT_USAGE__PREDICATE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConstraintUsageImpl
