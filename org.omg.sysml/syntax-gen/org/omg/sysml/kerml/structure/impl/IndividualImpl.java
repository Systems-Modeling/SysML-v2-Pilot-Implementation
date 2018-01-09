/**
 */
package org.omg.sysml.kerml.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.kerml.structure.Feature;
import org.omg.sysml.kerml.structure.Individual;
import org.omg.sysml.kerml.structure.StructurePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Individual</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.IndividualImpl#getDefiningFeature <em>Defining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.IndividualImpl#getParent <em>Parent</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.IndividualImpl#getChild <em>Child</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.IndividualImpl#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IndividualImpl extends MinimalEObjectImpl.Container implements Individual {
	/**
	 * The cached value of the '{@link #getDefiningFeature() <em>Defining Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefiningFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature definingFeature;

	/**
	 * The cached value of the '{@link #getParent() <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParent()
	 * @generated
	 * @ordered
	 */
	protected Individual parent;

	/**
	 * The cached value of the '{@link #getChild() <em>Child</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChild()
	 * @generated
	 * @ordered
	 */
	protected EList<Individual> child;

	/**
	 * The cached value of the '{@link #getContext() <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContext()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.kerml.structure.Class context;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IndividualImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.INDIVIDUAL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getDefiningFeature() {
		if (definingFeature != null && definingFeature.eIsProxy()) {
			InternalEObject oldDefiningFeature = (InternalEObject)definingFeature;
			definingFeature = (Feature)eResolveProxy(oldDefiningFeature);
			if (definingFeature != oldDefiningFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.INDIVIDUAL__DEFINING_FEATURE, oldDefiningFeature, definingFeature));
			}
		}
		return definingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetDefiningFeature() {
		return definingFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefiningFeature(Feature newDefiningFeature) {
		Feature oldDefiningFeature = definingFeature;
		definingFeature = newDefiningFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.INDIVIDUAL__DEFINING_FEATURE, oldDefiningFeature, definingFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual getParent() {
		if (parent != null && parent.eIsProxy()) {
			InternalEObject oldParent = (InternalEObject)parent;
			parent = (Individual)eResolveProxy(oldParent);
			if (parent != oldParent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.INDIVIDUAL__PARENT, oldParent, parent));
			}
		}
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Individual basicGetParent() {
		return parent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(Individual newParent, NotificationChain msgs) {
		Individual oldParent = parent;
		parent = newParent;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.INDIVIDUAL__PARENT, oldParent, newParent);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(Individual newParent) {
		if (newParent != parent) {
			NotificationChain msgs = null;
			if (parent != null)
				msgs = ((InternalEObject)parent).eInverseRemove(this, StructurePackage.INDIVIDUAL__CHILD, Individual.class, msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, StructurePackage.INDIVIDUAL__CHILD, Individual.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.INDIVIDUAL__PARENT, newParent, newParent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Individual> getChild() {
		if (child == null) {
			child = new EObjectWithInverseResolvingEList<Individual>(Individual.class, this, StructurePackage.INDIVIDUAL__CHILD, StructurePackage.INDIVIDUAL__PARENT);
		}
		return child;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class getContext() {
		if (context != null && context.eIsProxy()) {
			InternalEObject oldContext = (InternalEObject)context;
			context = (org.omg.sysml.kerml.structure.Class)eResolveProxy(oldContext);
			if (context != oldContext) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.INDIVIDUAL__CONTEXT, oldContext, context));
			}
		}
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.structure.Class basicGetContext() {
		return context;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContext(org.omg.sysml.kerml.structure.Class newContext) {
		org.omg.sysml.kerml.structure.Class oldContext = context;
		context = newContext;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.INDIVIDUAL__CONTEXT, oldContext, context));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.INDIVIDUAL__PARENT:
				if (parent != null)
					msgs = ((InternalEObject)parent).eInverseRemove(this, StructurePackage.INDIVIDUAL__CHILD, Individual.class, msgs);
				return basicSetParent((Individual)otherEnd, msgs);
			case StructurePackage.INDIVIDUAL__CHILD:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChild()).basicAdd(otherEnd, msgs);
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
			case StructurePackage.INDIVIDUAL__PARENT:
				return basicSetParent(null, msgs);
			case StructurePackage.INDIVIDUAL__CHILD:
				return ((InternalEList<?>)getChild()).basicRemove(otherEnd, msgs);
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
			case StructurePackage.INDIVIDUAL__DEFINING_FEATURE:
				if (resolve) return getDefiningFeature();
				return basicGetDefiningFeature();
			case StructurePackage.INDIVIDUAL__PARENT:
				if (resolve) return getParent();
				return basicGetParent();
			case StructurePackage.INDIVIDUAL__CHILD:
				return getChild();
			case StructurePackage.INDIVIDUAL__CONTEXT:
				if (resolve) return getContext();
				return basicGetContext();
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
			case StructurePackage.INDIVIDUAL__DEFINING_FEATURE:
				setDefiningFeature((Feature)newValue);
				return;
			case StructurePackage.INDIVIDUAL__PARENT:
				setParent((Individual)newValue);
				return;
			case StructurePackage.INDIVIDUAL__CHILD:
				getChild().clear();
				getChild().addAll((Collection<? extends Individual>)newValue);
				return;
			case StructurePackage.INDIVIDUAL__CONTEXT:
				setContext((org.omg.sysml.kerml.structure.Class)newValue);
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
			case StructurePackage.INDIVIDUAL__DEFINING_FEATURE:
				setDefiningFeature((Feature)null);
				return;
			case StructurePackage.INDIVIDUAL__PARENT:
				setParent((Individual)null);
				return;
			case StructurePackage.INDIVIDUAL__CHILD:
				getChild().clear();
				return;
			case StructurePackage.INDIVIDUAL__CONTEXT:
				setContext((org.omg.sysml.kerml.structure.Class)null);
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
			case StructurePackage.INDIVIDUAL__DEFINING_FEATURE:
				return definingFeature != null;
			case StructurePackage.INDIVIDUAL__PARENT:
				return parent != null;
			case StructurePackage.INDIVIDUAL__CHILD:
				return child != null && !child.isEmpty();
			case StructurePackage.INDIVIDUAL__CONTEXT:
				return context != null;
		}
		return super.eIsSet(featureID);
	}

} //IndividualImpl
