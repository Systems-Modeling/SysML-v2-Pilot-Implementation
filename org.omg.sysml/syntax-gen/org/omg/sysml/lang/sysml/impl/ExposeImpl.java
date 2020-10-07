/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expose;
import org.omg.sysml.lang.sysml.ModelQuery;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Expose</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExposeImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExposeImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExposeImpl#getModelQuery_comp <em>Model Query comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ExposeImpl#getModelQuery <em>Model Query</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExposeImpl extends ImportImpl implements Expose {
	/**
	 * The cached value of the '{@link #getModelQuery_comp() <em>Model Query comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModelQuery_comp()
	 * @generated
	 * @ordered
	 */
	protected ModelQuery modelQuery_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.EXPOSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.EXPOSE__OWNED_RELATED_ELEMENT_COMP, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getTarget() {
		return super.getTarget();
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.EXPOSE__IMPORTED_PACKAGE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelQuery getModelQuery_comp() {
		return modelQuery_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModelQuery_comp(ModelQuery newModelQuery_comp, NotificationChain msgs) {
		ModelQuery oldModelQuery_comp = modelQuery_comp;
		modelQuery_comp = newModelQuery_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.EXPOSE__MODEL_QUERY_COMP, oldModelQuery_comp, newModelQuery_comp);
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
	public void setModelQuery_comp(ModelQuery newModelQuery_comp) {
		if (newModelQuery_comp != modelQuery_comp) {
			NotificationChain msgs = null;
			if (modelQuery_comp != null)
				msgs = ((InternalEObject)modelQuery_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.EXPOSE__MODEL_QUERY_COMP, null, msgs);
			if (newModelQuery_comp != null)
				msgs = ((InternalEObject)newModelQuery_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.EXPOSE__MODEL_QUERY_COMP, null, msgs);
			msgs = basicSetModelQuery_comp(newModelQuery_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.EXPOSE__MODEL_QUERY_COMP, newModelQuery_comp, newModelQuery_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ModelQuery getModelQuery() {
		ModelQuery modelQuery = basicGetModelQuery();
		return modelQuery != null && modelQuery.eIsProxy() ? (ModelQuery)eResolveProxy((InternalEObject)modelQuery) : modelQuery;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ModelQuery basicGetModelQuery() {
		return getModelQuery_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setModelQuery(ModelQuery newModelQuery) {
		throw new UnsupportedOperationException();
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
			case SysMLPackage.EXPOSE__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement_comp()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.EXPOSE__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.EXPOSE__MODEL_QUERY_COMP:
				return basicSetModelQuery_comp(null, msgs);
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
			case SysMLPackage.EXPOSE__MODEL_QUERY_COMP:
				return getModelQuery_comp();
			case SysMLPackage.EXPOSE__MODEL_QUERY:
				if (resolve) return getModelQuery();
				return basicGetModelQuery();
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
			case SysMLPackage.EXPOSE__MODEL_QUERY_COMP:
				setModelQuery_comp((ModelQuery)newValue);
				return;
			case SysMLPackage.EXPOSE__MODEL_QUERY:
				setModelQuery((ModelQuery)newValue);
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
			case SysMLPackage.EXPOSE__MODEL_QUERY_COMP:
				setModelQuery_comp((ModelQuery)null);
				return;
			case SysMLPackage.EXPOSE__MODEL_QUERY:
				setModelQuery((ModelQuery)null);
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
			case SysMLPackage.EXPOSE__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
			case SysMLPackage.EXPOSE__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.EXPOSE__MODEL_QUERY_COMP:
				return modelQuery_comp != null;
			case SysMLPackage.EXPOSE__MODEL_QUERY:
				return basicGetModelQuery() != null;
		}
		return super.eIsSet(featureID);
	}

} //ExposeImpl
