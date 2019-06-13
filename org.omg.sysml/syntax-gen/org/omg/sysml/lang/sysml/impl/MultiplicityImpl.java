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
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getLower_comp <em>Lower comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getUpper_comp <em>Upper comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityImpl extends RelationshipImpl implements Multiplicity {
	/**
	 * The cached value of the '{@link #getLower_comp() <em>Lower comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_comp()
	 * @generated
	 * @ordered
	 */
	protected Expression lower_comp;
	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Expression lower;
	/**
	 * The cached value of the '{@link #getUpper_comp() <em>Upper comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper_comp()
	 * @generated
	 * @ordered
	 */
	protected Expression upper_comp;
	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Expression upper;
	/**
	 * The cached value of the '{@link #getFeatureWithMultiplicity() <em>Feature With Multiplicity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeatureWithMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Feature featureWithMultiplicity;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MULTIPLICITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@Override
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new SubsetSupersetEObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT_COMP, null, OWNED_RELATED_ELEMENT_COMP_ESUBSETS, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelatedElement_comp()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RELATED_ELEMENT_COMP_ESUBSETS = new int[] {SysMLPackage.MULTIPLICITY__LOWER_COMP, SysMLPackage.MULTIPLICITY__UPPER_COMP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLower() {
		if (lower != null && lower.eIsProxy()) {
			InternalEObject oldLower = (InternalEObject)lower;
			lower = (Expression)eResolveProxy(oldLower);
			if (lower != oldLower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.MULTIPLICITY__LOWER, oldLower, lower));
			}
		}
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLower(Expression newLower) {
		Expression oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__LOWER, oldLower, lower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUpper_comp() {
		if (upper_comp != null && upper_comp.eIsProxy()) {
			InternalEObject oldUpper_comp = (InternalEObject)upper_comp;
			upper_comp = (Expression)eResolveProxy(oldUpper_comp);
			if (upper_comp != oldUpper_comp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.MULTIPLICITY__UPPER_COMP, oldUpper_comp, upper_comp));
			}
		}
		return upper_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetUpper_comp() {
		return upper_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpper_comp(Expression newUpper_comp) {
		Expression oldUpper_comp = upper_comp;
		upper_comp = newUpper_comp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__UPPER_COMP, oldUpper_comp, upper_comp));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newUpper_comp != null) {
				EList<Element> ownedRelatedElement_comp = getOwnedRelatedElement_comp();
				if (!ownedRelatedElement_comp.contains(newUpper_comp)) {
					ownedRelatedElement_comp.add(newUpper_comp);
				}
			}
			if (newUpper_comp != null) {
				EList<Element> target = getTarget();
				if (!target.contains(newUpper_comp)) {
					target.add(newUpper_comp);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUpper() {
		if (upper != null && upper.eIsProxy()) {
			InternalEObject oldUpper = (InternalEObject)upper;
			upper = (Expression)eResolveProxy(oldUpper);
			if (upper != oldUpper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.MULTIPLICITY__UPPER, oldUpper, upper));
			}
		}
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUpper(Expression newUpper) {
		Expression oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__UPPER, oldUpper, upper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeatureWithMultiplicity() {
		if (featureWithMultiplicity != null && featureWithMultiplicity.eIsProxy()) {
			InternalEObject oldFeatureWithMultiplicity = (InternalEObject)featureWithMultiplicity;
			featureWithMultiplicity = (Feature)eResolveProxy(oldFeatureWithMultiplicity);
			if (featureWithMultiplicity != oldFeatureWithMultiplicity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, oldFeatureWithMultiplicity, featureWithMultiplicity));
			}
		}
		return featureWithMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeatureWithMultiplicity() {
		return featureWithMultiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithMultiplicity(Feature newFeatureWithMultiplicity, NotificationChain msgs) {
		Feature oldFeatureWithMultiplicity = featureWithMultiplicity;
		featureWithMultiplicity = newFeatureWithMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, oldFeatureWithMultiplicity, newFeatureWithMultiplicity);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newFeatureWithMultiplicity != null) {
				Element owningRelatedElement = getOwningRelatedElement();
				if (newFeatureWithMultiplicity != owningRelatedElement) {
					setOwningRelatedElement(newFeatureWithMultiplicity);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureWithMultiplicity(Feature newFeatureWithMultiplicity) {
		if (newFeatureWithMultiplicity != featureWithMultiplicity) {
			NotificationChain msgs = null;
			if (featureWithMultiplicity != null)
				msgs = ((InternalEObject)featureWithMultiplicity).eInverseRemove(this, SysMLPackage.FEATURE__MULTIPLICITY_COMP, Feature.class, msgs);
			if (newFeatureWithMultiplicity != null)
				msgs = ((InternalEObject)newFeatureWithMultiplicity).eInverseAdd(this, SysMLPackage.FEATURE__MULTIPLICITY_COMP, Feature.class, msgs);
			msgs = basicSetFeatureWithMultiplicity(newFeatureWithMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, newFeatureWithMultiplicity, newFeatureWithMultiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureWithMultiplicity() {
		return featureWithMultiplicity != null;
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
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				if (featureWithMultiplicity != null)
					msgs = ((InternalEObject)featureWithMultiplicity).eInverseRemove(this, SysMLPackage.FEATURE__MULTIPLICITY_COMP, Feature.class, msgs);
				return basicSetFeatureWithMultiplicity((Feature)otherEnd, msgs);
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
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				return basicSetFeatureWithMultiplicity(null, msgs);
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
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Feature featureWithMultiplicity = getFeatureWithMultiplicity();
		if (featureWithMultiplicity != null) {
			source.add(featureWithMultiplicity);
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

	@Override
	public EList<Element> getTarget() {
		EList<Element> target = super.getTarget();
		Expression upper = getUpper();
		if (upper != null) {
			target.add(upper);
		}
		Expression lower = getLower();
		if (lower != null) {
			target.add(lower);
		}
		return target;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.MULTIPLICITY__LOWER_COMP, SysMLPackage.MULTIPLICITY__UPPER_COMP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@Override
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (featureWithMultiplicity != null && featureWithMultiplicity != newOwningRelatedElement) {
				setFeatureWithMultiplicity(null);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelatedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelatedElement != null)
				msgs = ((InternalEObject)newOwningRelatedElement).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP, Element.class, msgs);
			msgs = basicSetOwningRelatedElement(newOwningRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLower_comp() {
		if (lower_comp != null && lower_comp.eIsProxy()) {
			InternalEObject oldLower_comp = (InternalEObject)lower_comp;
			lower_comp = (Expression)eResolveProxy(oldLower_comp);
			if (lower_comp != oldLower_comp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.MULTIPLICITY__LOWER_COMP, oldLower_comp, lower_comp));
			}
		}
		return lower_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetLower_comp() {
		return lower_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setLower_comp(Expression newLower_comp) {
		Expression oldLower_comp = lower_comp;
		lower_comp = newLower_comp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__LOWER_COMP, oldLower_comp, lower_comp));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newLower_comp != null) {
				EList<Element> ownedRelatedElement_comp = getOwnedRelatedElement_comp();
				if (!ownedRelatedElement_comp.contains(newLower_comp)) {
					ownedRelatedElement_comp.add(newLower_comp);
				}
			}
			if (newLower_comp != null) {
				EList<Element> target = getTarget();
				if (!target.contains(newLower_comp)) {
					target.add(newLower_comp);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__LOWER_COMP:
				if (resolve) return getLower_comp();
				return basicGetLower_comp();
			case SysMLPackage.MULTIPLICITY__LOWER:
				if (resolve) return getLower();
				return basicGetLower();
			case SysMLPackage.MULTIPLICITY__UPPER_COMP:
				if (resolve) return getUpper_comp();
				return basicGetUpper_comp();
			case SysMLPackage.MULTIPLICITY__UPPER:
				if (resolve) return getUpper();
				return basicGetUpper();
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				if (resolve) return getFeatureWithMultiplicity();
				return basicGetFeatureWithMultiplicity();
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
			case SysMLPackage.MULTIPLICITY__LOWER_COMP:
				setLower_comp((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__LOWER:
				setLower((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER_COMP:
				setUpper_comp((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER:
				setUpper((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				setFeatureWithMultiplicity((Feature)newValue);
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
			case SysMLPackage.MULTIPLICITY__LOWER_COMP:
				setLower_comp((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY__LOWER:
				setLower((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER_COMP:
				setUpper_comp((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER:
				setUpper((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				setFeatureWithMultiplicity((Feature)null);
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
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
			case SysMLPackage.MULTIPLICITY__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.MULTIPLICITY__SOURCE:
				return isSetSource();
			case SysMLPackage.MULTIPLICITY__LOWER_COMP:
				return lower_comp != null;
			case SysMLPackage.MULTIPLICITY__LOWER:
				return lower != null;
			case SysMLPackage.MULTIPLICITY__UPPER_COMP:
				return upper_comp != null;
			case SysMLPackage.MULTIPLICITY__UPPER:
				return upper != null;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				return isSetFeatureWithMultiplicity();
		}
		return super.eIsSet(featureID);
	}

} //MultiplicityImpl
