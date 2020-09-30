/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.DelegatingEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Operator Expression</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl#getOperator <em>Operator</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl#getOperand_comp <em>Operand comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.OperatorExpressionImpl#getOperand <em>Operand</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OperatorExpressionImpl extends InvocationExpressionImpl implements OperatorExpression {

	// TODO: Replace with single library package when global scope supports public
	// re-export.
	public static final String[] LIBRARY_PACKAGE_NAMES = { "BaseFunctions", "ScalarFunctions", "ControlFunctions" };

	/**
	 * The default value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected static final String OPERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOperator() <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOperator()
	 * @generated
	 * @ordered
	 */
	protected String operator = OPERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOperand_comp() <em>Operand comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperand_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Expression> operand_comp;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected OperatorExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OPERATOR_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOperator() {
		return operator;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOperator(String newOperator) {
		String oldOperator = operator;
		operator = newOperator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.OPERATOR_EXPRESSION__OPERATOR, oldOperator, operator));
	}

	/**
	 * Use a special OperandEList so that operands inserted into the list are automatically actually added
	 * as owned features.
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getOperand_comp() {
		if (operand_comp == null) {
			operand_comp = new OperandEList();
		}
		return operand_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOperand_comp() {
		return operand_comp != null && !operand_comp.isEmpty();
	}

	protected String[] getOperatorQualifiedNames(String op) {
		return Stream.of(LIBRARY_PACKAGE_NAMES).map(pack -> pack + "::'" + op + "'").toArray(String[]::new);
	}

	/**
	 * @generated NOT
	 */
	@Override
	public EList<Expression> getOperand() {
		EList<Expression> operands = new EObjectEList<Expression>(Expression.class, this, SysMLPackage.OPERATOR_EXPRESSION__OPERAND);
		operands.addAll(getOperand_comp());
		return operands;
	}
	
	@Override
	public Function getFunction() {
		return (Function)getDefaultType(getOperatorQualifiedNames(getOperator()));
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Expression> getArgument() {
		return getOperand_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetArgument() {
  		return false;
	}
	
	@Override
	public List<FeatureTyping> basicGetOwnedTyping() {
		String operator = getOperator();
		if (operator != null) {
			addImplicitGeneralType(
					SysMLPackage.eINSTANCE.getFeatureTyping(), getOperatorQualifiedNames(operator));
		}
		return Collections.emptyList();
	}

	@Override
	public void computeImplicitGeneralization() {
		getOwnedTyping();
		super.computeImplicitGeneralization();
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.OPERATOR_EXPRESSION__OPERAND_COMP:
				return ((InternalEList<?>)getOperand_comp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.OPERATOR_EXPRESSION__OPERATOR:
				return getOperator();
			case SysMLPackage.OPERATOR_EXPRESSION__OPERAND_COMP:
				return getOperand_comp();
			case SysMLPackage.OPERATOR_EXPRESSION__OPERAND:
				return getOperand();
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
			case SysMLPackage.OPERATOR_EXPRESSION__OPERATOR:
				setOperator((String)newValue);
				return;
			case SysMLPackage.OPERATOR_EXPRESSION__OPERAND_COMP:
				getOperand_comp().clear();
				getOperand_comp().addAll((Collection<? extends Expression>)newValue);
				return;
			case SysMLPackage.OPERATOR_EXPRESSION__OPERAND:
				getOperand().clear();
				getOperand().addAll((Collection<? extends Expression>)newValue);
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
			case SysMLPackage.OPERATOR_EXPRESSION__OPERATOR:
				setOperator(OPERATOR_EDEFAULT);
				return;
			case SysMLPackage.OPERATOR_EXPRESSION__OPERAND_COMP:
				getOperand_comp().clear();
				return;
			case SysMLPackage.OPERATOR_EXPRESSION__OPERAND:
				getOperand().clear();
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
			case SysMLPackage.OPERATOR_EXPRESSION__ARGUMENT:
				return isSetArgument();
			case SysMLPackage.OPERATOR_EXPRESSION__OPERATOR:
				return OPERATOR_EDEFAULT == null ? operator != null : !OPERATOR_EDEFAULT.equals(operator);
			case SysMLPackage.OPERATOR_EXPRESSION__OPERAND_COMP:
				return isSetOperand_comp();
			case SysMLPackage.OPERATOR_EXPRESSION__OPERAND:
				return !getOperand().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (operator: ");
		result.append(operator);
		result.append(')');
		return result.toString();
	}

	private class OperandEList extends DelegatingEList<Expression> implements InternalEList<Expression> {
		private static final long serialVersionUID = 1L;

		@Override
		protected List<Expression> delegateList() {
			return getOwnedFeature().stream().filter(f -> f instanceof Expression).map(f -> (Expression) f)
					.collect(Collectors.toList());
		}

		@Override
		protected void delegateAdd(Expression object) {
			addOwnedFeature(object);
		}

		@Override
		protected void delegateAdd(int i, Expression object) {
			throw new UnsupportedOperationException();
		}

		@Override
		public Expression remove(int i) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean remove(Object object) {
			throw new UnsupportedOperationException();
		}

		@Override
		public void clear() {

		}

		@Override
		public Object[] basicToArray() {
			return delegateToArray();
		}

		@Override
		public <T> T[] basicToArray(T[] array) {
			return delegateToArray(array);
		}

		@Override
		public int basicIndexOf(Object object) {
			return delegateIndexOf(object);
		}

		@Override
		public int basicLastIndexOf(Object object) {
			return delegateLastIndexOf(object);
		}

		@Override
		public boolean basicContains(Object object) {
			return delegateContains(object);
		}

		@Override
		public boolean basicContainsAll(Collection<?> collection) {
			return delegateContainsAll(collection);
		}

		@Override
		public NotificationChain basicRemove(Object object, NotificationChain notifications) {
			remove(object);
			return notifications;
		}

		@Override
		public NotificationChain basicAdd(Expression object, NotificationChain notifications) {
			add(object);
			return notifications;
		}

		@Override
		public Expression basicGet(int i) {
			return super.basicGet(i);
		}

		@Override
		public List<Expression> basicList() {
			return super.basicList();
		}

		@Override
		public Iterator<Expression> basicIterator() {
			return super.basicIterator();
		}

		@Override
		public ListIterator<Expression> basicListIterator() {
			return super.basicListIterator();
		}

		@Override
		public ListIterator<Expression> basicListIterator(int i) {
			return super.basicListIterator(i);
		}
	}

} // OperatorExpressionImpl
