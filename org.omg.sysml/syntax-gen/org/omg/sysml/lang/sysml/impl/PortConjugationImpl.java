/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Conjugation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortConjugationImpl#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortConjugationImpl#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortConjugationImpl extends ConjugationImpl implements PortConjugation {
	/**
	 * The cached value of the '{@link #getOriginalPortDefinition() <em>Original Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPortDefinition()
	 * @generated
	 * @ordered
	 */
	protected PortDefinition originalPortDefinition;

	/**
	 * The cached value of the '{@link #getConjugatedPortDefinition() <em>Conjugated Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjugatedPortDefinition()
	 * @generated
	 * @ordered
	 */
	protected ConjugatedPortDefinition conjugatedPortDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortConjugationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PORT_CONJUGATION;
	}
	
	@Override
	public PortDefinition getOriginalPortDefinition() {
		return originalPortDefinition == null? basicGetOriginalPortDefinition(): getOriginalPortDefinitionGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition getOriginalPortDefinitionGen() {
		if (originalPortDefinition != null && originalPortDefinition.eIsProxy()) {
			InternalEObject oldOriginalPortDefinition = (InternalEObject)originalPortDefinition;
			originalPortDefinition = (PortDefinition)eResolveProxy(oldOriginalPortDefinition);
			if (originalPortDefinition != oldOriginalPortDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION, oldOriginalPortDefinition, originalPortDefinition));
			}
		}
		return originalPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortDefinition basicGetOriginalPortDefinition() {
		if (originalPortDefinition == null) {
			ConjugatedPortDefinition conjugatedPortDefinition = getConjugatedPortDefinition();
			if (conjugatedPortDefinition != null) {
				Element conjugatedPortDefinitionOwner = conjugatedPortDefinition.getOwner();
				if (conjugatedPortDefinitionOwner instanceof PortDefinition) {
					originalPortDefinition = (PortDefinition)conjugatedPortDefinitionOwner;
				}
			}
		}
		return originalPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalPortDefinition(PortDefinition newOriginalPortDefinition) {
		PortDefinition oldOriginalPortDefinition = originalPortDefinition;
		originalPortDefinition = newOriginalPortDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION, oldOriginalPortDefinition, originalPortDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOriginalPortDefinition() {
		return originalPortDefinition != null;
	}

	@Override
	public ConjugatedPortDefinition getConjugatedPortDefinition() {
		return conjugatedPortDefinition == null? basicGetConjugatedPortDefinition(): getConjugatedPortDefinitionGen();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjugatedPortDefinition getConjugatedPortDefinitionGen() {
		if (conjugatedPortDefinition != null && conjugatedPortDefinition.eIsProxy()) {
			InternalEObject oldConjugatedPortDefinition = (InternalEObject)conjugatedPortDefinition;
			conjugatedPortDefinition = (ConjugatedPortDefinition)eResolveProxy(oldConjugatedPortDefinition);
			if (conjugatedPortDefinition != oldConjugatedPortDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION, oldConjugatedPortDefinition, conjugatedPortDefinition));
			}
		}
		return conjugatedPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConjugatedPortDefinition basicGetConjugatedPortDefinition() {
		if (conjugatedPortDefinition == null) {
			Type owningType = super.basicGetOwningType();
			if (owningType instanceof ConjugatedPortDefinition) {
				conjugatedPortDefinition = (ConjugatedPortDefinition)owningType;
			}
		}
		return conjugatedPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConjugatedPortDefinition(ConjugatedPortDefinition newConjugatedPortDefinition, NotificationChain msgs) {
		ConjugatedPortDefinition oldConjugatedPortDefinition = conjugatedPortDefinition;
		conjugatedPortDefinition = newConjugatedPortDefinition;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION, oldConjugatedPortDefinition, newConjugatedPortDefinition);
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
	public void setConjugatedPortDefinition(ConjugatedPortDefinition newConjugatedPortDefinition) {
		if (newConjugatedPortDefinition != conjugatedPortDefinition) {
			NotificationChain msgs = null;
			if (conjugatedPortDefinition != null)
				msgs = ((InternalEObject)conjugatedPortDefinition).eInverseRemove(this, SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR, ConjugatedPortDefinition.class, msgs);
			if (newConjugatedPortDefinition != null)
				msgs = ((InternalEObject)newConjugatedPortDefinition).eInverseAdd(this, SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR, ConjugatedPortDefinition.class, msgs);
			msgs = basicSetConjugatedPortDefinition(newConjugatedPortDefinition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION, newConjugatedPortDefinition, newConjugatedPortDefinition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConjugatedPortDefinition() {
		return conjugatedPortDefinition != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOriginalType() {
		return getOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetOriginalType() {
		return basicGetOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOriginalType(Type newOriginalType) {
		if (newOriginalType != null && !(newOriginalType instanceof PortDefinition)) {
			throw new IllegalArgumentException("newOriginalType must be an instance of PortDefinition");
		}
		setOriginalPortDefinition((PortDefinition) newOriginalType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOriginalType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		return getConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetOwningType() {
		return basicGetConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningType(Type newOwningType) {
		if (newOwningType != null && !(newOwningType instanceof ConjugatedPortDefinition)) {
			throw new IllegalArgumentException("newOwningType must be an instance of ConjugatedPortDefinition");
		}
		setConjugatedPortDefinition((ConjugatedPortDefinition) newOwningType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				if (conjugatedPortDefinition != null)
					msgs = ((InternalEObject)conjugatedPortDefinition).eInverseRemove(this, SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR, ConjugatedPortDefinition.class, msgs);
				return basicSetConjugatedPortDefinition((ConjugatedPortDefinition)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				return basicSetConjugatedPortDefinition(null, msgs);
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
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION:
				if (resolve) return getOriginalPortDefinition();
				return basicGetOriginalPortDefinition();
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				if (resolve) return getConjugatedPortDefinition();
				return basicGetConjugatedPortDefinition();
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
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)newValue);
				return;
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				setConjugatedPortDefinition((ConjugatedPortDefinition)newValue);
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
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)null);
				return;
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				setConjugatedPortDefinition((ConjugatedPortDefinition)null);
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
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_TYPE:
				return isSetOriginalType();
			case SysMLPackage.PORT_CONJUGATION__OWNING_TYPE:
				return isSetOwningType();
			case SysMLPackage.PORT_CONJUGATION__ORIGINAL_PORT_DEFINITION:
				return isSetOriginalPortDefinition();
			case SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION:
				return isSetConjugatedPortDefinition();
		}
		return super.eIsSet(featureID);
	}

} //PortConjugationImpl
