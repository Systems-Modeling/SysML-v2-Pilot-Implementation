/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.MetadataExpression;
import org.omg.sysml.lang.sysml.MetadataFeatureValue;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Feature Value</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureValueImpl#getMetadataValue_comp <em>Metadata Value comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureValueImpl#getMetadataValue <em>Metadata Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataFeatureValueImpl extends FeatureValueImpl implements MetadataFeatureValue {
	/**
	 * The cached value of the '{@link #getMetadataValue_comp() <em>Metadata Value comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetadataValue_comp()
	 * @generated
	 * @ordered
	 */
	protected MetadataExpression metadataValue_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataFeatureValueImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.METADATA_FEATURE_VALUE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataExpression getMetadataValue_comp() {
		return metadataValue_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMetadataValue_comp(MetadataExpression newMetadataValue_comp, NotificationChain msgs) {
		MetadataExpression oldMetadataValue_comp = metadataValue_comp;
		metadataValue_comp = newMetadataValue_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP, oldMetadataValue_comp, newMetadataValue_comp);
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
	public void setMetadataValue_comp(MetadataExpression newMetadataValue_comp) {
		if (newMetadataValue_comp != metadataValue_comp) {
			NotificationChain msgs = null;
			if (metadataValue_comp != null)
				msgs = ((InternalEObject)metadataValue_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP, null, msgs);
			if (newMetadataValue_comp != null)
				msgs = ((InternalEObject)newMetadataValue_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP, null, msgs);
			msgs = basicSetMetadataValue_comp(newMetadataValue_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP, newMetadataValue_comp, newMetadataValue_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataValue_comp() {
		return metadataValue_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataExpression getMetadataValue() {
		MetadataExpression metadataValue = basicGetMetadataValue();
		return metadataValue != null && metadataValue.eIsProxy() ? (MetadataExpression)eResolveProxy((InternalEObject)metadataValue) : metadataValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MetadataExpression basicGetMetadataValue() {
		Expression value = super.getValue();
		return value instanceof MetadataExpression? (MetadataExpression)value: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMetadataValue(MetadataExpression newMetadataValue) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				return basicSetMetadataValue_comp(null, msgs);
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
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				return getMetadataValue_comp();
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				if (resolve) return getMetadataValue();
				return basicGetMetadataValue();
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
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				setMetadataValue_comp((MetadataExpression)newValue);
				return;
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				setMetadataValue((MetadataExpression)newValue);
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
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				setMetadataValue_comp((MetadataExpression)null);
				return;
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				setMetadataValue((MetadataExpression)null);
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
			case SysMLPackage.METADATA_FEATURE_VALUE__VALUE_COMP:
				return isSetValue_comp();
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE_COMP:
				return isSetMetadataValue_comp();
			case SysMLPackage.METADATA_FEATURE_VALUE__METADATA_VALUE:
				return basicGetMetadataValue() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getValue_comp() {
		return getMetadataValue_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValue_comp(Expression newValue_comp, NotificationChain msgs) {
		if (newValue_comp != null && !(newValue_comp instanceof MetadataExpression)) {
			throw new IllegalArgumentException("newValue_comp must be an instance of MetadataExpression");
		}
		return basicSetMetadataValue_comp((MetadataExpression) newValue_comp, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue_comp(Expression newValue_comp) {
		if (newValue_comp != null && !(newValue_comp instanceof MetadataExpression)) {
			throw new IllegalArgumentException("newValue_comp must be an instance of MetadataExpression");
		}
		setMetadataValue_comp((MetadataExpression) newValue_comp);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetValue_comp() {
  		return false;
	}

} //MetadataFeatureValueImpl
