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
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Function</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FunctionImpl#getExpression <em>Expression</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FunctionImpl#getResult <em>Result</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FunctionImpl extends BehaviorImpl implements Function {

	public static final String FUNCTION_SUPERCLASS_DEFAULT = "Performances::Evaluation";

	/**
	 * The cached value of the BindingConnector from the result of the last
	 * sub-Expression to the result of this Function.
	 */
	protected BindingConnector resultConnector = null;


	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FunctionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FUNCTION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	@Override
	public EList<Expression> getExpression() {
		return new DerivedEObjectEList<Expression>(Expression.class, this, SysMLPackage.FUNCTION__EXPRESSION,
				new int[] { SysMLPackage.TYPE__FEATURE });
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetExpression() {
		return !getExpression().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getResult() {
		Feature result = basicGetResult();
		return result != null && result.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)result) : result;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public Feature basicGetResult() {
		return super.getResultParameter();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	@Override
	public void setResult(Feature newResult) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Step> getStep() {
		@SuppressWarnings("unchecked")
		EList<Step> expression = (EList<Step>)((EList<?>)getExpression());
		return expression;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetStep() {
  		return false;
	}

	@Override
	protected String getDefaultSupertype() {
		return FUNCTION_SUPERCLASS_DEFAULT;
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FUNCTION__EXPRESSION:
				return getExpression();
			case SysMLPackage.FUNCTION__RESULT:
				if (resolve) return getResult();
				return basicGetResult();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.FUNCTION__EXPRESSION:
				getExpression().clear();
				getExpression().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.FUNCTION__RESULT:
				setResult((Feature)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.FUNCTION__EXPRESSION:
				getExpression().clear();
				return;
			case SysMLPackage.FUNCTION__RESULT:
				setResult((Feature)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.FUNCTION__STEP:
				return isSetStep();
			case SysMLPackage.FUNCTION__EXPRESSION:
				return isSetExpression();
			case SysMLPackage.FUNCTION__RESULT:
				return basicGetResult() != null;
		}
		return super.eIsSet(featureID);
	}

} // FunctionImpl
