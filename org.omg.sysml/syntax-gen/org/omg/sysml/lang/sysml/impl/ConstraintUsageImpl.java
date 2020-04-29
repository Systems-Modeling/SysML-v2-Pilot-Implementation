/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.BooleanExpression;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.RequirementConstraintKind;
import org.omg.sysml.lang.sysml.RequirementConstraintMembership;
import org.omg.sysml.lang.sysml.RequirementDefinition;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLFactory;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#getConstraintDefinition <em>Constraint Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#getConstraintOwningUsage <em>Constraint Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConstraintUsageImpl#getConstraintOwningDefinition <em>Constraint Owning Definition</em>}</li>
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
	public Usage getConstraintOwningUsage() {
		Usage constraintOwningUsage = basicGetConstraintOwningUsage();
		return constraintOwningUsage != null && constraintOwningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)constraintOwningUsage) : constraintOwningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetConstraintOwningUsage() {
		return super.basicGetOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConstraintOwningUsage(Usage newConstraintOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintOwningUsage() {
		return basicGetConstraintOwningUsage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getConstraintOwningDefinition() {
		Definition constraintOwningDefinition = basicGetConstraintOwningDefinition();
		return constraintOwningDefinition != null && constraintOwningDefinition.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)constraintOwningDefinition) : constraintOwningDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Definition basicGetConstraintOwningDefinition() {
		return super.basicGetOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConstraintOwningDefinition(Definition newConstraintOwningDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConstraintOwningDefinition() {
		return basicGetConstraintOwningDefinition() != null;
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwningUsage() {
		return getConstraintOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage basicGetOwningUsage() {
		return basicGetConstraintOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUsage(Usage newOwningUsage) {
		setConstraintOwningUsage(newOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningUsage() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getOwningDefinition() {
		return getConstraintOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition basicGetOwningDefinition() {
		return basicGetConstraintOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningDefinition(Definition newOwningDefinition) {
		setConstraintOwningDefinition(newOwningDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningDefinition() {
  		return false;
	}

	// Additional redefinitions and subsets

	@Override
	protected String getDefaultSupertype() {
		return 
			isAssumptionConstraint()? CONSTRAINT_SUBSETTING_ASSUMPTION_FEATURE:
			isRequirementConstraint()? CONSTRAINT_SUBSETTING_REQUIREMENT_FEATURE:
			CONSTRAINT_SUBSETTING_BASE_DEFAULT;
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
	 * If this ConstraintUsage has a RequirementDefinition as a type, then ensure that it has
	 * at least one owned Parameter (to redefine the requirement subject parameter).
	 */
	@Override
	public List<Parameter> getOwnedParameters() {
		List<Parameter> parameters = super.getOwnedParameters();
		// Note: A ConstraintUsage will always have at least a return Parameter.
		if (parameters.size() < 2 && isRequirement() ) {
			Parameter parameter = SysMLFactory.eINSTANCE.createParameter();
			ParameterMembership membership = SysMLFactory.eINSTANCE.createParameterMembership();
			membership.setOwnedMemberParameter_comp(parameter);
			getOwnedFeatureMembership_comp().add(0, membership);
			parameters.add(0, parameter);
		}
		return parameters;
	}
	
	public boolean isRequirement() {
		return getType().stream().anyMatch(RequirementDefinition.class::isInstance);
	}
	
	@Override 
	public Feature getResult() {
		return getOwnedFeatureMembership().stream().
				filter(mem->mem instanceof ReturnParameterMembership).
				map(mem->mem.getMemberFeature()).
				findFirst().orElse(null);
	}
	
	public BindingConnector getResultConnector() {
		return resultConnector = BlockExpressionImpl.getResultConnectorFor(this, resultConnector, this.getResult());
	}
	
	@Override
	public void transform() {
		super.transform();
		getOwnedParameters();
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
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				if (resolve) return getConstraintDefinition();
				return basicGetConstraintDefinition();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_OWNING_USAGE:
				if (resolve) return getConstraintOwningUsage();
				return basicGetConstraintOwningUsage();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_OWNING_DEFINITION:
				if (resolve) return getConstraintOwningDefinition();
				return basicGetConstraintOwningDefinition();
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
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				setPredicate((Predicate)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				setConstraintDefinition((Predicate)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_OWNING_USAGE:
				setConstraintOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_OWNING_DEFINITION:
				setConstraintOwningDefinition((Definition)newValue);
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
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				setFunction((Function)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				setPredicate((Predicate)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				setConstraintDefinition((Predicate)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_OWNING_USAGE:
				setConstraintOwningUsage((Usage)null);
				return;
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_OWNING_DEFINITION:
				setConstraintOwningDefinition((Definition)null);
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
			case SysMLPackage.CONSTRAINT_USAGE__FUNCTION:
				return isSetFunction();
			case SysMLPackage.CONSTRAINT_USAGE__PREDICATE:
				return isSetPredicate();
			case SysMLPackage.CONSTRAINT_USAGE__OWNING_USAGE:
				return isSetOwningUsage();
			case SysMLPackage.CONSTRAINT_USAGE__OWNING_DEFINITION:
				return isSetOwningDefinition();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_DEFINITION:
				return isSetConstraintDefinition();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_OWNING_USAGE:
				return isSetConstraintOwningUsage();
			case SysMLPackage.CONSTRAINT_USAGE__CONSTRAINT_OWNING_DEFINITION:
				return isSetConstraintOwningDefinition();
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
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONSTRAINT_USAGE__FUNCTION: return SysMLPackage.EXPRESSION__FUNCTION;
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
				default: return -1;
			}
		}
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				case SysMLPackage.EXPRESSION__FUNCTION: return SysMLPackage.CONSTRAINT_USAGE__FUNCTION;
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
