/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.FunctionUsage;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FunctionUsageImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FunctionUsageImpl#getFunctionDefinition <em>Function Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FunctionUsageImpl#getFunctionOwningUsage <em>Function Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FunctionUsageImpl#getFunctionOwningDefinition <em>Function Owning Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionUsageImpl extends ActionUsageImpl implements FunctionUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FUNCTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Parameter getResult() {
		Parameter result = basicGetResult();
		return result != null && result.eIsProxy() ? (Parameter)eResolveProxy((InternalEObject)result) : result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Parameter basicGetResult() {
		return super.getResultParameter();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setResult(Parameter newResult) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Function getFunctionDefinition() {
		Function functionDefinition = basicGetFunctionDefinition();
		return functionDefinition != null && functionDefinition.eIsProxy() ? (Function)eResolveProxy((InternalEObject)functionDefinition) : functionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Function basicGetFunctionDefinition() {
		EList<Behavior> behaviors = super.getActivity();
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
	public void setFunctionDefinition(Function newFunctionDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunctionDefinition() {
		return basicGetFunctionDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getFunctionOwningUsage() {
		Usage functionOwningUsage = basicGetFunctionOwningUsage();
		return functionOwningUsage != null && functionOwningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)functionOwningUsage) : functionOwningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetFunctionOwningUsage() {
		return super.basicGetActionOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFunctionOwningUsage(Usage newFunctionOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunctionOwningUsage() {
		return basicGetFunctionOwningUsage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getFunctionOwningDefinition() {
		Definition functionOwningDefinition = basicGetFunctionOwningDefinition();
		return functionOwningDefinition != null && functionOwningDefinition.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)functionOwningDefinition) : functionOwningDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Definition basicGetFunctionOwningDefinition() {
		return super.basicGetOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFunctionOwningDefinition(Definition newFunctionOwningDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFunctionOwningDefinition() {
		return basicGetFunctionOwningDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FUNCTION_USAGE__FUNCTION:
				if (resolve) return getFunction();
				return basicGetFunction();
			case SysMLPackage.FUNCTION_USAGE__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_DEFINITION:
				if (resolve) return getFunctionDefinition();
				return basicGetFunctionDefinition();
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_OWNING_USAGE:
				if (resolve) return getFunctionOwningUsage();
				return basicGetFunctionOwningUsage();
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_OWNING_DEFINITION:
				if (resolve) return getFunctionOwningDefinition();
				return basicGetFunctionOwningDefinition();
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
			case SysMLPackage.FUNCTION_USAGE__FUNCTION:
				setFunction((Function)newValue);
				return;
			case SysMLPackage.FUNCTION_USAGE__RESULT:
				setResult((Parameter)newValue);
				return;
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_DEFINITION:
				setFunctionDefinition((Function)newValue);
				return;
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_OWNING_USAGE:
				setFunctionOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_OWNING_DEFINITION:
				setFunctionOwningDefinition((Definition)newValue);
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
			case SysMLPackage.FUNCTION_USAGE__FUNCTION:
				setFunction((Function)null);
				return;
			case SysMLPackage.FUNCTION_USAGE__RESULT:
				setResult((Parameter)null);
				return;
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_DEFINITION:
				setFunctionDefinition((Function)null);
				return;
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_OWNING_USAGE:
				setFunctionOwningUsage((Usage)null);
				return;
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_OWNING_DEFINITION:
				setFunctionOwningDefinition((Definition)null);
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
			case SysMLPackage.FUNCTION_USAGE__BEHAVIOR:
				return isSetBehavior();
			case SysMLPackage.FUNCTION_USAGE__FUNCTION:
				return isSetFunction();
			case SysMLPackage.FUNCTION_USAGE__RESULT:
				return basicGetResult() != null;
			case SysMLPackage.FUNCTION_USAGE__ACTIVITY:
				return isSetActivity();
			case SysMLPackage.FUNCTION_USAGE__ACTION_OWNING_USAGE:
				return isSetActionOwningUsage();
			case SysMLPackage.FUNCTION_USAGE__ACTION_OWNING_DEFINITION:
				return isSetActionOwningDefinition();
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_DEFINITION:
				return isSetFunctionDefinition();
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_OWNING_USAGE:
				return isSetFunctionOwningUsage();
			case SysMLPackage.FUNCTION_USAGE__FUNCTION_OWNING_DEFINITION:
				return isSetFunctionOwningDefinition();
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
		if (baseClass == Expression.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FUNCTION_USAGE__FUNCTION: return SysMLPackage.EXPRESSION__FUNCTION;
				case SysMLPackage.FUNCTION_USAGE__RESULT: return SysMLPackage.EXPRESSION__RESULT;
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
		if (baseClass == Expression.class) {
			switch (baseFeatureID) {
				case SysMLPackage.EXPRESSION__FUNCTION: return SysMLPackage.FUNCTION_USAGE__FUNCTION;
				case SysMLPackage.EXPRESSION__RESULT: return SysMLPackage.FUNCTION_USAGE__RESULT;
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
	@Override
	public EList<Behavior> getBehavior() {
		return getActivity();
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
		return getFunctionDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function basicGetFunction() {
		return basicGetFunctionDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFunction(Function newFunction) {
		setFunctionDefinition(newFunction);
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
	@Override
	public EList<Behavior> getActivity() {
		EList<Behavior> activity = new UniqueEList<Behavior>();
		Function functionDefinition = getFunctionDefinition();
		if (functionDefinition != null) {
			activity.add(functionDefinition);
		}
		return new UnionEObjectEList<Behavior>(this, SysMLPackage.Literals.ACTION_USAGE__ACTIVITY, activity.size(), activity.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActivity() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getActionOwningUsage() {
		return getFunctionOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage basicGetActionOwningUsage() {
		return basicGetFunctionOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionOwningUsage(Usage newActionOwningUsage) {
		setFunctionOwningUsage(newActionOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionOwningUsage() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getActionOwningDefinition() {
		return getFunctionOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition basicGetActionOwningDefinition() {
		return basicGetFunctionOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionOwningDefinition(Definition newActionOwningDefinition) {
		setFunctionOwningDefinition(newActionOwningDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetActionOwningDefinition() {
  		return false;
	}

} //FunctionUsageImpl
