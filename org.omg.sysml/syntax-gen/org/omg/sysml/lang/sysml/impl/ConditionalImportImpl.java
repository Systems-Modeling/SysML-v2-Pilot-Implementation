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

import org.omg.sysml.lang.sysml.ConditionalImport;
import org.omg.sysml.lang.sysml.ImportCondition;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConditionalImportImpl#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConditionalImportImpl#getCondition_comp <em>Condition comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConditionalImportImpl#getSelector <em>Selector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConditionalImportImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConditionalImportImpl extends ImportImpl implements ConditionalImport {
	/**
	 * The cached value of the '{@link #getCondition_comp() <em>Condition comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition_comp()
	 * @generated
	 * @ordered
	 */
	protected ImportCondition condition_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONDITIONAL_IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship_comp() {
		if (ownedRelationship_comp == null) {
			ownedRelationship_comp = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.CONDITIONAL_IMPORT__OWNED_RELATIONSHIP_COMP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getSelector() {
		Predicate selector = basicGetSelector();
		return selector != null && selector.eIsProxy() ? (Predicate)eResolveProxy((InternalEObject)selector) : selector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Predicate basicGetSelector() {
		ImportCondition condition = getCondition();
		return condition == null? null: condition.getPredicate();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSelector(Predicate newSelector) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportCondition getCondition_comp() {
		return condition_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition_comp(ImportCondition newCondition_comp, NotificationChain msgs) {
		ImportCondition oldCondition_comp = condition_comp;
		condition_comp = newCondition_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP, oldCondition_comp, newCondition_comp);
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
	public void setCondition_comp(ImportCondition newCondition_comp) {
		if (newCondition_comp != condition_comp) {
			NotificationChain msgs = null;
			if (condition_comp != null)
				msgs = ((InternalEObject)condition_comp).eInverseRemove(this, SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT, ImportCondition.class, msgs);
			if (newCondition_comp != null)
				msgs = ((InternalEObject)newCondition_comp).eInverseAdd(this, SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT, ImportCondition.class, msgs);
			msgs = basicSetCondition_comp(newCondition_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP, newCondition_comp, newCondition_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ImportCondition getCondition() {
		ImportCondition condition = basicGetCondition();
		return condition != null && condition.eIsProxy() ? (ImportCondition)eResolveProxy((InternalEObject)condition) : condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ImportCondition basicGetCondition() {
		return getCondition_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setCondition(ImportCondition newCondition) {
		throw new UnsupportedOperationException();
	}
	
	// Additional subsets
	
	@Override
	public EList<Relationship> getOwnedRelationship() {
		EList<Relationship> ownedRelationships = super.getOwnedRelationship();
		ImportCondition condition = getCondition();
		if (condition != null) {
			ownedRelationships.add(condition);
		}
		return ownedRelationships;
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
			case SysMLPackage.CONDITIONAL_IMPORT__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP:
				if (condition_comp != null)
					msgs = ((InternalEObject)condition_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP, null, msgs);
				return basicSetCondition_comp((ImportCondition)otherEnd, msgs);
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
			case SysMLPackage.CONDITIONAL_IMPORT__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<?>)getOwnedRelationship_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP:
				return basicSetCondition_comp(null, msgs);
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
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP:
				return getCondition_comp();
			case SysMLPackage.CONDITIONAL_IMPORT__SELECTOR:
				if (resolve) return getSelector();
				return basicGetSelector();
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
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
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP:
				setCondition_comp((ImportCondition)newValue);
				return;
			case SysMLPackage.CONDITIONAL_IMPORT__SELECTOR:
				setSelector((Predicate)newValue);
				return;
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION:
				setCondition((ImportCondition)newValue);
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
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP:
				setCondition_comp((ImportCondition)null);
				return;
			case SysMLPackage.CONDITIONAL_IMPORT__SELECTOR:
				setSelector((Predicate)null);
				return;
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION:
				setCondition((ImportCondition)null);
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
			case SysMLPackage.CONDITIONAL_IMPORT__OWNED_RELATIONSHIP_COMP:
				return ownedRelationship_comp != null && !ownedRelationship_comp.isEmpty();
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP:
				return condition_comp != null;
			case SysMLPackage.CONDITIONAL_IMPORT__SELECTOR:
				return basicGetSelector() != null;
			case SysMLPackage.CONDITIONAL_IMPORT__CONDITION:
				return basicGetCondition() != null;
		}
		return super.eIsSet(featureID);
	}

} //ConditionalImportImpl
