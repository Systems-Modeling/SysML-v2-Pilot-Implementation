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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementFilter;
import org.omg.sysml.lang.sysml.MetadataCondition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Filter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementFilterImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementFilterImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementFilterImpl#getCondition_comp <em>Condition comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementFilterImpl#getFilteredPackage <em>Filtered Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ElementFilterImpl#getCondition <em>Condition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementFilterImpl extends RelationshipImpl implements ElementFilter {
	/**
	 * The cached value of the '{@link #getCondition_comp() <em>Condition comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition_comp()
	 * @generated
	 * @ordered
	 */
	protected MetadataCondition condition_comp;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementFilterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ELEMENT_FILTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		org.omg.sysml.lang.sysml.Package filteredPackage = getFilteredPackage();
		if (filteredPackage != null) {
			source.add(filteredPackage);
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
	public Element getOwningRelatedElement() {
		return getFilteredPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof org.omg.sysml.lang.sysml.Package)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of org.omg.sysml.lang.sysml.Package");
		}
		return basicSetFilteredPackage((org.omg.sysml.lang.sysml.Package) newOwningRelatedElement, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof org.omg.sysml.lang.sysml.Package)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of org.omg.sysml.lang.sysml.Package");
		}
		setFilteredPackage((org.omg.sysml.lang.sysml.Package) newOwningRelatedElement);
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
	 * @generated NOT
	 */
	@Override
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.ELEMENT_FILTER__TARGET);
			target.add(getCondition_comp());
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.ELEMENT_FILTER__OWNED_RELATED_ELEMENT_COMP, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataCondition getCondition_comp() {
		return condition_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCondition_comp(MetadataCondition newCondition_comp) {
		if (newCondition_comp != condition_comp) {
			NotificationChain msgs = null;
			if (condition_comp != null)
				msgs = ((InternalEObject)condition_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.ELEMENT_FILTER__CONDITION_COMP, null, msgs);
			if (newCondition_comp != null)
				msgs = ((InternalEObject)newCondition_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.ELEMENT_FILTER__CONDITION_COMP, null, msgs);
			msgs = basicSetCondition_comp(newCondition_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT_FILTER__CONDITION_COMP, newCondition_comp, newCondition_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCondition_comp(MetadataCondition newCondition_comp, NotificationChain msgs) {
		MetadataCondition oldCondition_comp = condition_comp;
		condition_comp = newCondition_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT_FILTER__CONDITION_COMP, oldCondition_comp, newCondition_comp);
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
	public org.omg.sysml.lang.sysml.Package getFilteredPackage() {
		if (eContainerFeatureID() != SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE) return null;
		return (org.omg.sysml.lang.sysml.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFilteredPackage(org.omg.sysml.lang.sysml.Package newFilteredPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFilteredPackage, SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFilteredPackage(org.omg.sysml.lang.sysml.Package newFilteredPackage) {
		if (newFilteredPackage != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE && newFilteredPackage != null)) {
			if (EcoreUtil.isAncestor(this, newFilteredPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFilteredPackage != null)
				msgs = ((InternalEObject)newFilteredPackage).eInverseAdd(this, SysMLPackage.PACKAGE__FILTER_COMP, org.omg.sysml.lang.sysml.Package.class, msgs);
			msgs = basicSetFilteredPackage(newFilteredPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE, newFilteredPackage, newFilteredPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFilteredPackage() {
		return getFilteredPackage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public MetadataCondition getCondition() {
		MetadataCondition condition = basicGetCondition();
		return condition != null && condition.eIsProxy() ? (MetadataCondition)eResolveProxy((InternalEObject)condition) : condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public MetadataCondition basicGetCondition() {
		return getCondition_comp();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setCondition(MetadataCondition newCondition) {
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
			case SysMLPackage.ELEMENT_FILTER__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetFilteredPackage((org.omg.sysml.lang.sysml.Package)otherEnd, msgs);
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
			case SysMLPackage.ELEMENT_FILTER__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ELEMENT_FILTER__CONDITION_COMP:
				return basicSetCondition_comp(null, msgs);
			case SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE:
				return basicSetFilteredPackage(null, msgs);
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
			case SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.PACKAGE__FILTER_COMP, org.omg.sysml.lang.sysml.Package.class, msgs);
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
			case SysMLPackage.ELEMENT_FILTER__CONDITION_COMP:
				return getCondition_comp();
			case SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE:
				return getFilteredPackage();
			case SysMLPackage.ELEMENT_FILTER__CONDITION:
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
			case SysMLPackage.ELEMENT_FILTER__CONDITION_COMP:
				setCondition_comp((MetadataCondition)newValue);
				return;
			case SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE:
				setFilteredPackage((org.omg.sysml.lang.sysml.Package)newValue);
				return;
			case SysMLPackage.ELEMENT_FILTER__CONDITION:
				setCondition((MetadataCondition)newValue);
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
			case SysMLPackage.ELEMENT_FILTER__CONDITION_COMP:
				setCondition_comp((MetadataCondition)null);
				return;
			case SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE:
				setFilteredPackage((org.omg.sysml.lang.sysml.Package)null);
				return;
			case SysMLPackage.ELEMENT_FILTER__CONDITION:
				setCondition((MetadataCondition)null);
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
			case SysMLPackage.ELEMENT_FILTER__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.ELEMENT_FILTER__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
			case SysMLPackage.ELEMENT_FILTER__SOURCE:
				return isSetSource();
			case SysMLPackage.ELEMENT_FILTER__OWNING_RELATED_ELEMENT:
				return isSetOwningRelatedElement();
			case SysMLPackage.ELEMENT_FILTER__CONDITION_COMP:
				return condition_comp != null;
			case SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE:
				return isSetFilteredPackage();
			case SysMLPackage.ELEMENT_FILTER__CONDITION:
				return basicGetCondition() != null;
		}
		return super.eIsSet(featureID);
	}

} //ElementFilterImpl
