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
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Multiplicity</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityImpl extends RelationshipImpl implements Multiplicity {
	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Expression lower;
	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' reference. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Expression upper;
	/**
	 * The cached value of the '{@link #getFeatureWithMultiplicity() <em>Feature
	 * With Multiplicity</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getFeatureWithMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Feature featureWithMultiplicity;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected MultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MULTIPLICITY;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new SubsetSupersetEObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT, null, OWNED_RELATED_ELEMENT_ESUBSETS, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedRelatedElement() <em>Owned Related Element</em>}' containment reference list.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getOwnedRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.MULTIPLICITY__LOWER, SysMLPackage.MULTIPLICITY__UPPER};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	public Expression basicGetLower() {
		EList<Expression> expressions = getOwnedRelatedElement(Expression.class);
		int n = expressions.size();
		return n < 2 ? null : expressions.get(0);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	@Override
	public void setLower(Expression newLower) {
		// TODO: implement this method to set the 'Lower' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	public Expression basicGetUpper() {
		EList<Expression> expressions = getOwnedRelatedElement(Expression.class);
		int n = expressions.size();
		return n == 0 ? null : n == 1 ? expressions.get(0) : expressions.get(1);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	@Override
	public void setUpper(Expression newUpper) {
		// TODO: implement this method to set the 'Upper' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	public Feature basicGetFeatureWithMultiplicity() {
		return getOwningRelatedElement(Feature.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithMultiplicity(Feature newFeatureWithMultiplicity,
			NotificationChain msgs) {
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	@Override
	public void setFeatureWithMultiplicity(Feature newFeatureWithMultiplicity) {
		// TODO: implement this method to set the 'Feature With Multiplicity' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureWithMultiplicity() {
		return featureWithMultiplicity != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				if (featureWithMultiplicity != null)
					msgs = ((InternalEObject)featureWithMultiplicity).eInverseRemove(this, SysMLPackage.FEATURE__MULTIPLICITY, Feature.class, msgs);
				return basicSetFeatureWithMultiplicity((Feature)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				return basicSetFeatureWithMultiplicity(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * The array of subset feature identifiers for the '{@link #getTarget()
	 * <em>Target</em>}' reference list. <!-- begin-user-doc --> <!-- end-user-doc
	 * -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.MULTIPLICITY__LOWER, SysMLPackage.MULTIPLICITY__UPPER};

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
				msgs = ((InternalEObject)newOwningRelatedElement).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
			msgs = basicSetOwningRelatedElement(newOwningRelatedElement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__LOWER:
				if (resolve) return getLower();
				return basicGetLower();
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__LOWER:
				setLower((Expression)newValue);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__LOWER:
				setLower((Expression)null);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.MULTIPLICITY__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.MULTIPLICITY__SOURCE:
				return isSetSource();
			case SysMLPackage.MULTIPLICITY__LOWER:
				return lower != null;
			case SysMLPackage.MULTIPLICITY__UPPER:
				return upper != null;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				return isSetFeatureWithMultiplicity();
		}
		return super.eIsSet(featureID);
	}

} // MultiplicityImpl
