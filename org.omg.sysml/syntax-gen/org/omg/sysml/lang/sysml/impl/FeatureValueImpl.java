/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Feature
 * Value</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getFeatureWithValue <em>Feature With Value</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getValueConnector <em>Value Connector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getValue_comp <em>Value comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureValueImpl#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureValueImpl extends FeatureMembershipImpl implements FeatureValue {
	/**
	 * The cached value of the '{@link #getValue_comp() <em>Value comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue_comp()
	 * @generated
	 * @ordered
	 */
	protected Expression value_comp;
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		if (eContainerFeatureID() != SysMLPackage.FEATURE_VALUE__OWNING_TYPE) return null;
		return (Type)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningType(Type newOwningType, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningType, SysMLPackage.FEATURE_VALUE__OWNING_TYPE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningType(Type newOwningType) {
		if (newOwningType != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.FEATURE_VALUE__OWNING_TYPE && newOwningType != null)) {
			if (EcoreUtil.isAncestor(this, newOwningType))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningType != null)
				msgs = ((InternalEObject)newOwningType).eInverseAdd(this, SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP_COMP, Type.class, msgs);
			msgs = basicSetOwningType(newOwningType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_VALUE__OWNING_TYPE, newOwningType, newOwningType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningType() {
		return getOwningType() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValue_comp() {
		return value_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue_comp(Expression newValue_comp, NotificationChain msgs) {
		Expression oldValue_comp = value_comp;
		value_comp = newValue_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_VALUE__VALUE_COMP, oldValue_comp, newValue_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValue_comp(Expression newValue_comp) {
		if (newValue_comp != value_comp) {
			NotificationChain msgs = null;
			if (value_comp != null)
				msgs = ((InternalEObject)value_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE_VALUE__VALUE_COMP, null, msgs);
			if (newValue_comp != null)
				msgs = ((InternalEObject)newValue_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.FEATURE_VALUE__VALUE_COMP, null, msgs);
			msgs = basicSetValue_comp(newValue_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_VALUE__VALUE_COMP, newValue_comp, newValue_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue_comp() {
		return value_comp != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValue() {
		Expression value = basicGetValue();
		return value != null && value.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)value) : value;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetValue() {
		return getValue_comp();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValue(Expression newValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__OWNING_TYPE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningType((Type)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeatureWithValue() {
		Feature featureWithValue = basicGetFeatureWithValue();
		return featureWithValue != null && featureWithValue.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)featureWithValue) : featureWithValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetFeatureWithValue() {
		Type owningType = getOwningType();
		return owningType instanceof Feature? (Feature)owningType: null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setFeatureWithValue(Feature newFeatureWithValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BindingConnector getValueConnector() {
		BindingConnector valueConnector = basicGetValueConnector();
		return valueConnector != null && valueConnector.eIsProxy() ? (BindingConnector)eResolveProxy((InternalEObject)valueConnector) : valueConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BindingConnector basicGetValueConnector() {
		Feature feature = getFeatureWithValue();
		return feature == null? null: ((FeatureImpl)feature).getValueConnector();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setValueConnector(BindingConnector newValueConnector) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getOwnedMemberFeature_comp() {
		return getValue_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp, NotificationChain msgs) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof Expression)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of Expression");
		}
		return basicSetValue_comp((Expression) newOwnedMemberFeature_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedMemberFeature_comp(Feature newOwnedMemberFeature_comp) {
		if (newOwnedMemberFeature_comp != null && !(newOwnedMemberFeature_comp instanceof Expression)) {
			throw new IllegalArgumentException("newOwnedMemberFeature_comp must be an instance of Expression");
		}
		setValue_comp((Expression) newOwnedMemberFeature_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMemberFeature_comp() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__OWNING_TYPE:
				return basicSetOwningType(null, msgs);
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				return basicSetValue_comp(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.FEATURE_VALUE__OWNING_TYPE:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.TYPE__OWNED_FEATURE_MEMBERSHIP_COMP, Type.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE:
				if (resolve) return getFeatureWithValue();
				return basicGetFeatureWithValue();
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				if (resolve) return getValueConnector();
				return basicGetValueConnector();
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				return getValue_comp();
			case SysMLPackage.FEATURE_VALUE__VALUE:
				if (resolve) return getValue();
				return basicGetValue();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE:
				setFeatureWithValue((Feature)newValue);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				setValueConnector((BindingConnector)newValue);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				setValue_comp((Expression)newValue);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE:
				setValue((Expression)newValue);
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
			case SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE:
				setFeatureWithValue((Feature)null);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				setValueConnector((BindingConnector)null);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				setValue_comp((Expression)null);
				return;
			case SysMLPackage.FEATURE_VALUE__VALUE:
				setValue((Expression)null);
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
			case SysMLPackage.FEATURE_VALUE__OWNING_TYPE:
				return isSetOwningType();
			case SysMLPackage.FEATURE_VALUE__OWNED_MEMBER_FEATURE_COMP:
				return isSetOwnedMemberFeature_comp();
			case SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE:
				return basicGetFeatureWithValue() != null;
			case SysMLPackage.FEATURE_VALUE__VALUE_CONNECTOR:
				return basicGetValueConnector() != null;
			case SysMLPackage.FEATURE_VALUE__VALUE_COMP:
				return isSetValue_comp();
			case SysMLPackage.FEATURE_VALUE__VALUE:
				return basicGetValue() != null;
		}
		return super.eIsSet(featureID);
	}

} // FeatureValueImpl
