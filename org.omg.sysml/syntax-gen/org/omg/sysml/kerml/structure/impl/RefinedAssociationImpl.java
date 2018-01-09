/**
 */
package org.omg.sysml.kerml.structure.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.omg.sysml.kerml.structure.Association;
import org.omg.sysml.kerml.structure.Connector;
import org.omg.sysml.kerml.structure.RefinedAssociation;
import org.omg.sysml.kerml.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Refined Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.RefinedAssociationImpl#getDefiningConnector <em>Defining Connector</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.RefinedAssociationImpl#getInstanceOf <em>Instance Of</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RefinedAssociationImpl extends MinimalEObjectImpl.Container implements RefinedAssociation {
	/**
	 * The cached value of the '{@link #getDefiningConnector() <em>Defining Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector definingConnector;

	/**
	 * The cached value of the '{@link #getInstanceOf() <em>Instance Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstanceOf()
	 * @generated
	 * @ordered
	 */
	protected Association instanceOf;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefinedAssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.REFINED_ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getDefiningConnector() {
		if (definingConnector != null && definingConnector.eIsProxy()) {
			InternalEObject oldDefiningConnector = (InternalEObject)definingConnector;
			definingConnector = (Connector)eResolveProxy(oldDefiningConnector);
			if (definingConnector != oldDefiningConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR, oldDefiningConnector, definingConnector));
			}
		}
		return definingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetDefiningConnector() {
		return definingConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDefiningConnector(Connector newDefiningConnector, NotificationChain msgs) {
		Connector oldDefiningConnector = definingConnector;
		definingConnector = newDefiningConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR, oldDefiningConnector, newDefiningConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningConnector(Connector newDefiningConnector) {
		if (newDefiningConnector != definingConnector) {
			NotificationChain msgs = null;
			if (definingConnector != null)
				msgs = ((InternalEObject)definingConnector).eInverseRemove(this, StructurePackage.CONNECTOR__VALUE, Connector.class, msgs);
			if (newDefiningConnector != null)
				msgs = ((InternalEObject)newDefiningConnector).eInverseAdd(this, StructurePackage.CONNECTOR__VALUE, Connector.class, msgs);
			msgs = basicSetDefiningConnector(newDefiningConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR, newDefiningConnector, newDefiningConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getInstanceOf() {
		if (instanceOf != null && instanceOf.eIsProxy()) {
			InternalEObject oldInstanceOf = (InternalEObject)instanceOf;
			instanceOf = (Association)eResolveProxy(oldInstanceOf);
			if (instanceOf != oldInstanceOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.REFINED_ASSOCIATION__INSTANCE_OF, oldInstanceOf, instanceOf));
			}
		}
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetInstanceOf() {
		return instanceOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstanceOf(Association newInstanceOf) {
		Association oldInstanceOf = instanceOf;
		instanceOf = newInstanceOf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.REFINED_ASSOCIATION__INSTANCE_OF, oldInstanceOf, instanceOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR:
				if (definingConnector != null)
					msgs = ((InternalEObject)definingConnector).eInverseRemove(this, StructurePackage.CONNECTOR__VALUE, Connector.class, msgs);
				return basicSetDefiningConnector((Connector)otherEnd, msgs);
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
			case StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR:
				return basicSetDefiningConnector(null, msgs);
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
			case StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR:
				if (resolve) return getDefiningConnector();
				return basicGetDefiningConnector();
			case StructurePackage.REFINED_ASSOCIATION__INSTANCE_OF:
				if (resolve) return getInstanceOf();
				return basicGetInstanceOf();
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
			case StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR:
				setDefiningConnector((Connector)newValue);
				return;
			case StructurePackage.REFINED_ASSOCIATION__INSTANCE_OF:
				setInstanceOf((Association)newValue);
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
			case StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR:
				setDefiningConnector((Connector)null);
				return;
			case StructurePackage.REFINED_ASSOCIATION__INSTANCE_OF:
				setInstanceOf((Association)null);
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
			case StructurePackage.REFINED_ASSOCIATION__DEFINING_CONNECTOR:
				return definingConnector != null;
			case StructurePackage.REFINED_ASSOCIATION__INSTANCE_OF:
				return instanceOf != null;
		}
		return super.eIsSet(featureID);
	}

} //RefinedAssociationImpl
