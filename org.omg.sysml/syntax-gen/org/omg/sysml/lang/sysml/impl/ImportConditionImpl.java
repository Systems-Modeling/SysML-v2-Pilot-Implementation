/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.ConditionalImport;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ImportCondition;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportConditionImpl#getConditionalImport <em>Conditional Import</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportConditionImpl#getPredicate_comp <em>Predicate comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportConditionImpl#getPredicate <em>Predicate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportConditionImpl extends RelationshipImpl implements ImportCondition {
	/**
	 * The cached value of the '{@link #getPredicate_comp() <em>Predicate comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPredicate_comp()
	 * @generated
	 * @ordered
	 */
	protected Predicate predicate_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.IMPORT_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConditionalImport getConditionalImport() {
		if (eContainerFeatureID() != SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT) return null;
		return (ConditionalImport)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionalImport(ConditionalImport newConditionalImport, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newConditionalImport, SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setConditionalImport(ConditionalImport newConditionalImport) {
		if (newConditionalImport != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT && newConditionalImport != null)) {
			if (EcoreUtil.isAncestor(this, newConditionalImport))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newConditionalImport != null)
				msgs = ((InternalEObject)newConditionalImport).eInverseAdd(this, SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP, ConditionalImport.class, msgs);
			msgs = basicSetConditionalImport(newConditionalImport, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT, newConditionalImport, newConditionalImport));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConditionalImport() {
		return getConditionalImport() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getPredicate_comp() {
		return predicate_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPredicate_comp(Predicate newPredicate_comp, NotificationChain msgs) {
		Predicate oldPredicate_comp = predicate_comp;
		predicate_comp = newPredicate_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT_CONDITION__PREDICATE_COMP, oldPredicate_comp, newPredicate_comp);
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
	public void setPredicate_comp(Predicate newPredicate_comp) {
		if (newPredicate_comp != predicate_comp) {
			NotificationChain msgs = null;
			if (predicate_comp != null)
				msgs = ((InternalEObject)predicate_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.IMPORT_CONDITION__PREDICATE_COMP, null, msgs);
			if (newPredicate_comp != null)
				msgs = ((InternalEObject)newPredicate_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.IMPORT_CONDITION__PREDICATE_COMP, null, msgs);
			msgs = basicSetPredicate_comp(newPredicate_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT_CONDITION__PREDICATE_COMP, newPredicate_comp, newPredicate_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPredicate_comp() {
		return predicate_comp != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getPredicate() {
		Predicate predicate = basicGetPredicate();
		return predicate != null && predicate.eIsProxy() ? (Predicate)eResolveProxy((InternalEObject)predicate) : predicate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Predicate basicGetPredicate() {
		return getPredicate_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPredicate(Predicate newPredicate) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		return getConditionalImport();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof ConditionalImport)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of ConditionalImport");
		}
		return basicSetConditionalImport((ConditionalImport) newOwningRelatedElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof ConditionalImport)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of ConditionalImport");
		}
		setConditionalImport((ConditionalImport) newOwningRelatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningRelatedElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		ConditionalImport conditionalImport = getConditionalImport();
		if (conditionalImport != null) {
			source.add(conditionalImport);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__SOURCE, source.size(), source.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Predicate predicate_comp = getPredicate_comp();
		if (predicate_comp != null) {
			target.add(predicate_comp);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(), target.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		EList<Element> ownedRelatedElement_comp = new UniqueEList<Element>();
		Predicate predicate_comp = getPredicate_comp();
		if (predicate_comp != null) {
			ownedRelatedElement_comp.add(predicate_comp);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP, ownedRelatedElement_comp.size(), ownedRelatedElement_comp.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedRelatedElement_comp() {
  		return false;
	}

	// Additional subsets
	
	@Override
	public EList<Element> getOwnedRelatedElement() {
		EList<Element> relatedElements = super.getOwnedRelatedElement();
		Element predicate = getPredicate();
		if (predicate != null) {
			relatedElements.add(predicate);
		}
		return relatedElements;
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetConditionalImport((ConditionalImport)otherEnd, msgs);
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
			case SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT:
				return basicSetConditionalImport(null, msgs);
			case SysMLPackage.IMPORT_CONDITION__PREDICATE_COMP:
				return basicSetPredicate_comp(null, msgs);
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
			case SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.CONDITIONAL_IMPORT__CONDITION_COMP, ConditionalImport.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT:
				return getConditionalImport();
			case SysMLPackage.IMPORT_CONDITION__PREDICATE_COMP:
				return getPredicate_comp();
			case SysMLPackage.IMPORT_CONDITION__PREDICATE:
				if (resolve) return getPredicate();
				return basicGetPredicate();
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
			case SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT:
				setConditionalImport((ConditionalImport)newValue);
				return;
			case SysMLPackage.IMPORT_CONDITION__PREDICATE_COMP:
				setPredicate_comp((Predicate)newValue);
				return;
			case SysMLPackage.IMPORT_CONDITION__PREDICATE:
				setPredicate((Predicate)newValue);
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
			case SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT:
				setConditionalImport((ConditionalImport)null);
				return;
			case SysMLPackage.IMPORT_CONDITION__PREDICATE_COMP:
				setPredicate_comp((Predicate)null);
				return;
			case SysMLPackage.IMPORT_CONDITION__PREDICATE:
				setPredicate((Predicate)null);
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
			case SysMLPackage.IMPORT_CONDITION__OWNING_RELATED_ELEMENT:
				return isSetOwningRelatedElement();
			case SysMLPackage.IMPORT_CONDITION__SOURCE:
				return isSetSource();
			case SysMLPackage.IMPORT_CONDITION__OWNED_RELATED_ELEMENT_COMP:
				return isSetOwnedRelatedElement_comp();
			case SysMLPackage.IMPORT_CONDITION__TARGET:
				return isSetTarget();
			case SysMLPackage.IMPORT_CONDITION__CONDITIONAL_IMPORT:
				return isSetConditionalImport();
			case SysMLPackage.IMPORT_CONDITION__PREDICATE_COMP:
				return isSetPredicate_comp();
			case SysMLPackage.IMPORT_CONDITION__PREDICATE:
				return basicGetPredicate() != null;
		}
		return super.eIsSet(featureID);
	}

} //ImportConditionImpl
