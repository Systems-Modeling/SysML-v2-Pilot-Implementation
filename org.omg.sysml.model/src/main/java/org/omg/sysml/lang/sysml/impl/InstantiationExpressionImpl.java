/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.InstantiationExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Instantiation Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InstantiationExpressionImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.InstantiationExpressionImpl#getInstantiatedType <em>Instantiated Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class InstantiationExpressionImpl extends ExpressionImpl implements InstantiationExpression {
	/**
	 * The cached setting delegate for the '{@link #getArgument() <em>Argument</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArgument()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ARGUMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.INSTANTIATION_EXPRESSION__ARGUMENT).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getInstantiatedType() <em>Instantiated Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstantiatedType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate INSTANTIATED_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.INSTANTIATION_EXPRESSION__INSTANTIATED_TYPE).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InstantiationExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.INSTANTIATION_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Expression> getArgument() {
		return (EList<Expression>)ARGUMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getInstantiatedType() {
		return (Type)INSTANTIATED_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetInstantiatedType() {
		return (Type)INSTANTIATED_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInstantiatedType(Type newInstantiatedType) {
		INSTANTIATED_TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newInstantiatedType);
	}

	/**
	 * The cached invocation delegate for the '{@link #instantiatedType() <em>Instantiated Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #instantiatedType()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate INSTANTIATED_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.INSTANTIATION_EXPRESSION___INSTANTIATED_TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type instantiatedType() {
		try {
			return (Type)INSTANTIATED_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.INSTANTIATION_EXPRESSION__ARGUMENT:
				return getArgument();
			case SysMLPackage.INSTANTIATION_EXPRESSION__INSTANTIATED_TYPE:
				if (resolve) return getInstantiatedType();
				return basicGetInstantiatedType();
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
			case SysMLPackage.INSTANTIATION_EXPRESSION__ARGUMENT:
				getArgument().clear();
				getArgument().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.INSTANTIATION_EXPRESSION__INSTANTIATED_TYPE:
				setInstantiatedType((Type)newValue);
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
			case SysMLPackage.INSTANTIATION_EXPRESSION__ARGUMENT:
				getArgument().clear();
				return;
			case SysMLPackage.INSTANTIATION_EXPRESSION__INSTANTIATED_TYPE:
				setInstantiatedType((Type)null);
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
			case SysMLPackage.INSTANTIATION_EXPRESSION__ARGUMENT:
				return ARGUMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.INSTANTIATION_EXPRESSION__INSTANTIATED_TYPE:
				return INSTANTIATED_TYPE__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.INSTANTIATION_EXPRESSION___INSTANTIATED_TYPE:
				return instantiatedType();
		}
		return super.eInvoke(operationID, arguments);
	}

} //InstantiationExpressionImpl
