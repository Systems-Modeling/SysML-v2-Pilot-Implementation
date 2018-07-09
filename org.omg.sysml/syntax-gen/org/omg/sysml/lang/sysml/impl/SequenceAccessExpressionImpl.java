/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.SequenceAccessExpression;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Access Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SequenceAccessExpressionImpl#getPrimary <em>Primary</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.SequenceAccessExpressionImpl#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SequenceAccessExpressionImpl extends ExpressionImpl implements SequenceAccessExpression {
	/**
	 * The cached value of the '{@link #getPrimary() <em>Primary</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimary()
	 * @generated
	 * @ordered
	 */
	protected Expression primary;

	/**
	 * The cached value of the '{@link #getIndex() <em>Index</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIndex()
	 * @generated
	 * @ordered
	 */
	protected Expression index;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceAccessExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.SEQUENCE_ACCESS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getPrimary() {
		return primary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrimary(Expression newPrimary, NotificationChain msgs) {
		Expression oldPrimary = primary;
		primary = newPrimary;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__PRIMARY, oldPrimary, newPrimary);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrimary(Expression newPrimary) {
		if (newPrimary != primary) {
			NotificationChain msgs = null;
			if (primary != null)
				msgs = ((InternalEObject)primary).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__PRIMARY, null, msgs);
			if (newPrimary != null)
				msgs = ((InternalEObject)newPrimary).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__PRIMARY, null, msgs);
			msgs = basicSetPrimary(newPrimary, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__PRIMARY, newPrimary, newPrimary));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getIndex() {
		return index;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIndex(Expression newIndex, NotificationChain msgs) {
		Expression oldIndex = index;
		index = newIndex;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__INDEX, oldIndex, newIndex);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIndex(Expression newIndex) {
		if (newIndex != index) {
			NotificationChain msgs = null;
			if (index != null)
				msgs = ((InternalEObject)index).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__INDEX, null, msgs);
			if (newIndex != null)
				msgs = ((InternalEObject)newIndex).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__INDEX, null, msgs);
			msgs = basicSetIndex(newIndex, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__INDEX, newIndex, newIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__PRIMARY:
				return basicSetPrimary(null, msgs);
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__INDEX:
				return basicSetIndex(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__PRIMARY:
				return getPrimary();
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__INDEX:
				return getIndex();
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
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__PRIMARY:
				setPrimary((Expression)newValue);
				return;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__INDEX:
				setIndex((Expression)newValue);
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
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__PRIMARY:
				setPrimary((Expression)null);
				return;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__INDEX:
				setIndex((Expression)null);
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
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__PRIMARY:
				return primary != null;
			case SysMLPackage.SEQUENCE_ACCESS_EXPRESSION__INDEX:
				return index != null;
		}
		return super.eIsSet(featureID);
	}

} //SequenceAccessExpressionImpl
