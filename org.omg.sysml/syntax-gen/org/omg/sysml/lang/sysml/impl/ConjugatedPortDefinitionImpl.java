/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.PortConjugation;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjugated Port Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortDefinitionImpl#getOwnedPortConjugator <em>Owned Port Conjugator</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortDefinitionImpl#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjugatedPortDefinitionImpl extends PortDefinitionImpl implements ConjugatedPortDefinition {
	/**
	 * The cached value of the '{@link #getOwnedPortConjugator() <em>Owned Port Conjugator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPortConjugator()
	 * @generated
	 * @ordered
	 */
	protected PortConjugation ownedPortConjugator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjugatedPortDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONJUGATED_PORT_DEFINITION;
	}
	
	@Override
	public PortConjugation getOwnedPortConjugator() {
		return ownedPortConjugator == null? basicGetOwnedPortConjugator(): getOwnedPortConjugatorGen();
	}	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortConjugation getOwnedPortConjugatorGen() {
		if (ownedPortConjugator != null && ownedPortConjugator.eIsProxy()) {
			InternalEObject oldOwnedPortConjugator = (InternalEObject)ownedPortConjugator;
			ownedPortConjugator = (PortConjugation)eResolveProxy(oldOwnedPortConjugator);
			if (ownedPortConjugator != oldOwnedPortConjugator) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR, oldOwnedPortConjugator, ownedPortConjugator));
			}
		}
		return ownedPortConjugator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortConjugation basicGetOwnedPortConjugator() {
		if (ownedPortConjugator == null) {
			ownedPortConjugator = (PortConjugation) getOwnedRelationship().stream().
					filter(r->r instanceof PortConjugation).
					findFirst().orElse(null);
		}
		return ownedPortConjugator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwnedPortConjugator(PortConjugation newOwnedPortConjugator, NotificationChain msgs) {
		PortConjugation oldOwnedPortConjugator = ownedPortConjugator;
		ownedPortConjugator = newOwnedPortConjugator;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR, oldOwnedPortConjugator, newOwnedPortConjugator);
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
	public void setOwnedPortConjugator(PortConjugation newOwnedPortConjugator) {
		if (newOwnedPortConjugator != ownedPortConjugator) {
			NotificationChain msgs = null;
			if (ownedPortConjugator != null)
				msgs = ((InternalEObject)ownedPortConjugator).eInverseRemove(this, SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION, PortConjugation.class, msgs);
			if (newOwnedPortConjugator != null)
				msgs = ((InternalEObject)newOwnedPortConjugator).eInverseAdd(this, SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION, PortConjugation.class, msgs);
			msgs = basicSetOwnedPortConjugator(newOwnedPortConjugator, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR, newOwnedPortConjugator, newOwnedPortConjugator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedPortConjugator() {
		return ownedPortConjugator != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortDefinition getOriginalPortDefinition() {
		PortDefinition originalPortDefinition = basicGetOriginalPortDefinition();
		return originalPortDefinition != null && originalPortDefinition.eIsProxy() ? (PortDefinition)eResolveProxy((InternalEObject)originalPortDefinition) : originalPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortDefinition basicGetOriginalPortDefinition() {
		PortConjugation conjugator = getOwnedPortConjugator();
		return conjugator != null? conjugator.getOriginalPortDefinition(): null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOriginalPortDefinition(PortDefinition newOriginalPortDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOriginalPortDefinition() {
		return basicGetOriginalPortDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package getOwningNamespace() {
		return getOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package basicGetOwningNamespace() {
		return basicGetOriginalPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningNamespace(org.omg.sysml.lang.sysml.Package newOwningNamespace) {
		if (newOwningNamespace != null && !(newOwningNamespace instanceof PortDefinition)) {
			throw new IllegalArgumentException("newOwningNamespace must be an instance of PortDefinition");
		}
		setOriginalPortDefinition((PortDefinition) newOwningNamespace);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningNamespace() {
  		return false;
	}
	
	// Additional subsets/redefinitions
	
	@Override
	public String basicGetName() {
		String name = super.basicGetName();
		if (name == null) {
			PortDefinition originalPortDefinition = getOriginalPortDefinition();
			if (originalPortDefinition != null) {
				name = originalPortDefinition.getName();
				if (name != null) {
					name = "~" + name;
				}
			}
		}
		return name;
	}
	
	@Override
	public Conjugation getOwnedConjugator() {
		return getOwnedPortConjugator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Conjugation basicGetOwnedConjugator() {
		return basicGetOwnedPortConjugator();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnedConjugator(Conjugation newOwnedConjugator) {
		if (newOwnedConjugator != null && !(newOwnedConjugator instanceof PortConjugation)) {
			throw new IllegalArgumentException("newOwnedConjugator must be an instance of PortConjugation");
		}
		setOwnedPortConjugator((PortConjugation) newOwnedConjugator);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedConjugator() {
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				if (ownedPortConjugator != null)
					msgs = ((InternalEObject)ownedPortConjugator).eInverseRemove(this, SysMLPackage.PORT_CONJUGATION__CONJUGATED_PORT_DEFINITION, PortConjugation.class, msgs);
				return basicSetOwnedPortConjugator((PortConjugation)otherEnd, msgs);
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				return basicSetOwnedPortConjugator(null, msgs);
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				if (resolve) return getOwnedPortConjugator();
				return basicGetOwnedPortConjugator();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				if (resolve) return getOriginalPortDefinition();
				return basicGetOriginalPortDefinition();
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				setOwnedPortConjugator((PortConjugation)newValue);
				return;
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)newValue);
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				setOwnedPortConjugator((PortConjugation)null);
				return;
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)null);
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
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_CONJUGATOR:
				return isSetOwnedConjugator();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNING_NAMESPACE:
				return isSetOwningNamespace();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__OWNED_PORT_CONJUGATOR:
				return isSetOwnedPortConjugator();
			case SysMLPackage.CONJUGATED_PORT_DEFINITION__ORIGINAL_PORT_DEFINITION:
				return isSetOriginalPortDefinition();
		}
		return super.eIsSet(featureID);
	}

} //ConjugatedPortDefinitionImpl
