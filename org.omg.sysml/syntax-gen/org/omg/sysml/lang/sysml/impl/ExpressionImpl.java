/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.ConditionalSuccession;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExpressionImpl#getFunction <em>Function</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExpressionImpl extends StepImpl implements Expression {
	
	public static final String EXPRESSION_SUBSETTING_BASE_DEFAULT = "Base::evaluations";
	public static final String EXPRESSION_SUBSETTING_PERFORMANCE_DEFAULT = "Base::Performance::subevaluations";
	public static final String EXPRESSION_GUARD_FEATURE_NAME = "guard";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getFunction() {
		Function function = basicGetFunction();
		return function != null && function.eIsProxy() ? (Function)eResolveProxy((InternalEObject)function) : function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Function basicGetFunction() {
		EList<Behavior> behaviors = super.getBehavior();
		if (behaviors.isEmpty()) {
			return null;
		} else {
			Behavior behavior = behaviors.get(0);
			return behavior instanceof Function? (Function)behavior: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFunction(Function newFunction) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunction() {
		return basicGetFunction() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.EXPRESSION__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
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
			case SysMLPackage.EXPRESSION__FUNCTION:
				setFunction((Function)newValue);
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
			case SysMLPackage.EXPRESSION__FUNCTION:
				setFunction((Function)null);
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
			case SysMLPackage.EXPRESSION__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.EXPRESSION__FUNCTION:
				return isSetFunction();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
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

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithComputedRedefinitions(
				isSubperformance()?
					EXPRESSION_SUBSETTING_PERFORMANCE_DEFAULT:
					EXPRESSION_SUBSETTING_BASE_DEFAULT);
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return getOwningType() instanceof ConditionalSuccession &&
			   !(type instanceof ConditionalSuccession)?
				   type.getFeature().stream().
						filter(feature->EXPRESSION_GUARD_FEATURE_NAME.equals(feature.getName())).
						collect(Collectors.toList()):
			   super.getRelevantFeatures(type);
	}
	
	
	@Override 
	public EList<Feature> getInput() {
		EList<Feature> inputs = super.getInput();
		if (!inputs.stream().anyMatch(feature->feature.getOwner() == this)) {
			Function function = getFunction();
			if (function != null) {
				int i = 0;
				for (Feature parameter: function.getInput()) {
					if (parameter instanceof Parameter && parameter.getOwner() == function) {
						inputs.remove(parameter);
						Feature input = createFeatureForParameter(parameter, i);
						inputs.add(input);
						i++;
					}
				}
			}
		}
		return inputs;
	}
	
	@Override
	public EList<Feature> getOutput() {
		EList<Feature> outputs = super.getOutput();
		if (!outputs.stream().anyMatch(feature->feature.getOwner() == this)) {
			Parameter parameter = SysMLFactory.eINSTANCE.createParameter();
			ParameterMembership membership = SysMLFactory.eINSTANCE.createReturnParameterMembership();
			membership.setOwnedMemberParameter_comp(parameter);
			membership.setMemberName("$result");
			getOwnedFeatureMembership_comp().add(membership);
			outputs.add(parameter);
		}
		return outputs;
	}
			
	protected Feature createFeatureForParameter(Feature parameter, int i) {
		if (parameter == null) {
			return null;
		} else {
			Feature feature = SysMLFactory.eINSTANCE.createParameter();
			
			Redefinition redefinition = SysMLFactory.eINSTANCE.createRedefinition();
			redefinition.setRedefinedFeature(parameter);
			feature.getOwnedRelationship_comp().add(redefinition);
			
			FeatureMembership membership = SysMLFactory.eINSTANCE.createParameterMembership();
			membership.setOwnedMemberFeature_comp(feature);
			membership.setMemberName("$" + parameter.getName());
			getOwnedFeatureMembership_comp().add(membership);
			FeatureMembership parameterMembership = parameter.getOwningFeatureMembership();
			if (parameterMembership != null) {
				membership.setDirection(parameterMembership.getDirection());
			}
			
			return feature;
		}
	}
	
	@Override
	public Feature getResult() {
		List<Feature> outputs = getOutput().stream().
				filter(feature->feature.getOwner() == this).collect(Collectors.toList());;
		return outputs.isEmpty()? null: outputs.get(outputs.size() - 1);
	}
	
	@Override
	public List<Parameter> getOwnedParameters() {
		getResult();
		return super.getOwnedParameters();
	}
		
} //ExpressionImpl
