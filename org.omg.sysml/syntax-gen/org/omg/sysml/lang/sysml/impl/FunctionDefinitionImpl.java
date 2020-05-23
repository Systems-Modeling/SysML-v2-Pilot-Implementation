/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.FunctionDefinition;
import org.omg.sysml.lang.sysml.FunctionUsage;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Function Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FunctionDefinitionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FunctionDefinitionImpl#getResult <em>Result</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FunctionDefinitionImpl#getFunctionInvocation <em>Function Invocation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionDefinitionImpl extends ActivityImpl implements FunctionDefinition {

	public String FUNCTION_DEFINITION_SUPERCLASS_DEFAULT = "Functions::FunctionInvocation";

	/**
	 * The cached value of the BindingConnector from the result of the last
	 * sub-Expression to the result of this FunctionDefinition.
	 */
	protected BindingConnector resultConnector = null;


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FUNCTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getExpression() {
		return new DerivedEObjectEList<Expression>(Expression.class, this, SysMLPackage.FUNCTION_DEFINITION__EXPRESSION,
				new int[] { SysMLPackage.TYPE__FEATURE });
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpression() {
		return !getExpression().isEmpty();
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
		return getResultParameter();
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
	 * @generated NOT
	 */
	@Override
	public EList<FunctionUsage> getFunctionInvocation() {
		return new DerivedEObjectEList<FunctionUsage>(FunctionUsage.class, this, SysMLPackage.FUNCTION_DEFINITION__FUNCTION_INVOCATION,
				new int[] { SysMLPackage.TYPE__FEATURE });
	}

	protected String getDefaultSupertype() {
		return FUNCTION_DEFINITION_SUPERCLASS_DEFAULT;
	}
	
	public BindingConnector getResultConnector() {
		return resultConnector = BlockExpressionImpl.getResultConnectorFor(this, resultConnector, this.getResult());
	}
	
	@Override
	public void transform() {
		super.transform();
		getResultConnector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FUNCTION_DEFINITION__EXPRESSION:
				return getExpression();
			case SysMLPackage.FUNCTION_DEFINITION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
			case SysMLPackage.FUNCTION_DEFINITION__FUNCTION_INVOCATION:
				return getFunctionInvocation();
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
			case SysMLPackage.FUNCTION_DEFINITION__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.FUNCTION_DEFINITION__RESULT:
				setResult((Parameter)newValue);
				return;
			case SysMLPackage.FUNCTION_DEFINITION__FUNCTION_INVOCATION:
				getFunctionInvocation().clear();
				getFunctionInvocation().addAll((Collection<? extends FunctionUsage>)newValue);
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
			case SysMLPackage.FUNCTION_DEFINITION__EXPRESSION:
				getExpression().clear();
				return;
			case SysMLPackage.FUNCTION_DEFINITION__RESULT:
				setResult((Parameter)null);
				return;
			case SysMLPackage.FUNCTION_DEFINITION__FUNCTION_INVOCATION:
				getFunctionInvocation().clear();
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
			case SysMLPackage.FUNCTION_DEFINITION__STEP:
				return isSetStep();
			case SysMLPackage.FUNCTION_DEFINITION__EXPRESSION:
				return isSetExpression();
			case SysMLPackage.FUNCTION_DEFINITION__RESULT:
				return basicGetResult() != null;
			case SysMLPackage.FUNCTION_DEFINITION__FUNCTION_INVOCATION:
				return !getFunctionInvocation().isEmpty();
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
		if (baseClass == Function.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FUNCTION_DEFINITION__EXPRESSION: return SysMLPackage.FUNCTION__EXPRESSION;
				case SysMLPackage.FUNCTION_DEFINITION__RESULT: return SysMLPackage.FUNCTION__RESULT;
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
		if (baseClass == Function.class) {
			switch (baseFeatureID) {
				case SysMLPackage.FUNCTION__EXPRESSION: return SysMLPackage.FUNCTION_DEFINITION__EXPRESSION;
				case SysMLPackage.FUNCTION__RESULT: return SysMLPackage.FUNCTION_DEFINITION__RESULT;
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
	public EList<Step> getStep() {
		@SuppressWarnings("unchecked")
		EList<Step> expression = (EList<Step>)((EList<?>)getExpression());
		return expression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStep() {
  		return false;
	}

} //FunctionDefinitionImpl
