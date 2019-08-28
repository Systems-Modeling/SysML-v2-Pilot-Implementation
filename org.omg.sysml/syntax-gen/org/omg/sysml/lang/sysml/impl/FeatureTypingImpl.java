/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Feature
 * Typing</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureTypingImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureTypingImpl#getTypedFeature
 * <em>Typed Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureTypingImpl extends GeneralizationImpl implements FeatureTyping {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type;

	/**
	 * The cached value of the '{@link #getTypedFeature() <em>Typed Feature</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTypedFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature typedFeature;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FeatureTypingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE_TYPING;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getType() {
		if (type != null && type.eIsProxy()) {
			InternalEObject oldType = (InternalEObject) type;
			type = (Type) eResolveProxy(oldType);
			if (type != oldType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE_TYPING__TYPE,
							oldType, type));
			}
		}
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Type basicGetType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE_TYPING__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetType() {
		return type != null;
	}

	@Override
	public Feature getTypedFeature() {
		return typedFeature == null ? basicGetTypedFeature() : getTypedFeatureGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Feature getTypedFeatureGen() {
		if (typedFeature != null && typedFeature.eIsProxy()) {
			InternalEObject oldTypedFeature = (InternalEObject) typedFeature;
			typedFeature = (Feature) eResolveProxy(oldTypedFeature);
			if (typedFeature != oldTypedFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SysMLPackage.FEATURE_TYPING__TYPED_FEATURE, oldTypedFeature, typedFeature));
			}
		}
		return typedFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Feature basicGetTypedFeature() {
		if (typedFeature == null) {
			Element owningRelatedElement = getOwningRelatedElement();
			if (owningRelatedElement instanceof Feature) {
				typedFeature = (Feature) owningRelatedElement;
			}
		}
		return typedFeature;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetTypedFeature(Feature newTypedFeature, NotificationChain msgs) {
		Feature oldTypedFeature = typedFeature;
		typedFeature = newTypedFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SysMLPackage.FEATURE_TYPING__TYPED_FEATURE, oldTypedFeature, newTypedFeature);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setTypedFeature(Feature newTypedFeature) {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetTypedFeature() {
		return typedFeature != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SysMLPackage.FEATURE_TYPING__TYPED_FEATURE:
			if (typedFeature != null)
				msgs = ((InternalEObject) typedFeature).eInverseRemove(this, SysMLPackage.FEATURE__TYPING,
						Feature.class, msgs);
			return basicSetTypedFeature((Feature) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SysMLPackage.FEATURE_TYPING__TYPED_FEATURE:
			return basicSetTypedFeature(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SysMLPackage.FEATURE_TYPING__TYPE:
			if (resolve)
				return getType();
			return basicGetType();
		case SysMLPackage.FEATURE_TYPING__TYPED_FEATURE:
			if (resolve)
				return getTypedFeature();
			return basicGetTypedFeature();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SysMLPackage.FEATURE_TYPING__TYPE:
			setType((Type) newValue);
			return;
		case SysMLPackage.FEATURE_TYPING__TYPED_FEATURE:
			setTypedFeature((Feature) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SysMLPackage.FEATURE_TYPING__TYPE:
			setType((Type) null);
			return;
		case SysMLPackage.FEATURE_TYPING__TYPED_FEATURE:
			setTypedFeature((Feature) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SysMLPackage.FEATURE_TYPING__GENERAL:
			return isSetGeneral();
		case SysMLPackage.FEATURE_TYPING__SPECIFIC:
			return isSetSpecific();
		case SysMLPackage.FEATURE_TYPING__TYPE:
			return isSetType();
		case SysMLPackage.FEATURE_TYPING__TYPED_FEATURE:
			return isSetTypedFeature();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getGeneral() {
		return getType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type basicGetGeneral() {
		return basicGetType();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setGeneral(Type newGeneral) {
		setType(newGeneral);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetGeneral() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getSpecific() {
		return getTypedFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type basicGetSpecific() {
		return basicGetTypedFeature();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public void setSpecific(Type newSpecific) {
		if (newSpecific != null && !(newSpecific instanceof Feature)) {
			throw new IllegalArgumentException("newSpecific must be an instance of Feature");
		}
		setTypedFeature((Feature) newSpecific);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetSpecific() {
		return false;
	}

} // FeatureTypingImpl
