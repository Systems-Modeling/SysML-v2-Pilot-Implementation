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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getLower_comp <em>Lower comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getUpper_comp <em>Upper comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getUpper <em>Upper</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityImpl extends RelationshipImpl implements Multiplicity {
	/**
	 * The cached value of the '{@link #getLower_comp() <em>Lower comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower_comp()
	 * @generated
	 * @ordered
	 */
	protected Expression lower_comp;
	/**
	 * The cached value of the '{@link #getUpper_comp() <em>Upper comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper_comp()
	 * @generated
	 * @ordered
	 */
	protected Expression upper_comp;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT_COMP, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLower() {
		Expression lower = basicGetLower();
		return lower != null && lower.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)lower) : lower;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetLower() {
		return getLower_comp();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setLower(Expression newLower) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUpper() {
		Expression upper = basicGetUpper();
		return upper != null && upper.eIsProxy() ? (Expression)eResolveProxy((InternalEObject)upper) : upper;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Expression basicGetUpper() {
		return getUpper_comp();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setUpper(Expression newUpper) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeatureWithMultiplicity() {
		if (eContainerFeatureID() != SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithMultiplicity(Feature newFeatureWithMultiplicity,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFeatureWithMultiplicity, SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureWithMultiplicity(Feature newFeatureWithMultiplicity) {
		if (newFeatureWithMultiplicity != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY && newFeatureWithMultiplicity != null)) {
			if (EcoreUtil.isAncestor(this, newFeatureWithMultiplicity))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newFeatureWithMultiplicity != null)
				msgs = ((InternalEObject)newFeatureWithMultiplicity).eInverseAdd(this, SysMLPackage.FEATURE__MULTIPLICITY_COMP, Feature.class, msgs);
			msgs = basicSetFeatureWithMultiplicity(newFeatureWithMultiplicity, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, newFeatureWithMultiplicity, newFeatureWithMultiplicity));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeatureWithMultiplicity() {
		return getFeatureWithMultiplicity() != null;
	}
	
	// Additional subsets
	
	@Override
	public EList<Element> getOwnedRelatedElement() {
		EList<Element> relatedElements = super.getOwnedRelatedElement();
		relatedElements.add(getUpper());
		Element lower = getLower();
		if (lower != null) {
			relatedElements.add(lower);
		}
		return relatedElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.MULTIPLICITY__LOWER_COMP:
				return basicSetLower_comp(null, msgs);
			case SysMLPackage.MULTIPLICITY__UPPER_COMP:
				return basicSetUpper_comp(null, msgs);
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
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.FEATURE__MULTIPLICITY_COMP, Feature.class, msgs);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getLower_comp() {
		return lower_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower_comp(Expression newLower_comp, NotificationChain msgs) {
		Expression oldLower_comp = lower_comp;
		lower_comp = newLower_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__LOWER_COMP, oldLower_comp, newLower_comp);
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
	public void setLower_comp(Expression newLower_comp) {
		if (newLower_comp != lower_comp) {
			NotificationChain msgs = null;
			if (lower_comp != null)
				msgs = ((InternalEObject)lower_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.MULTIPLICITY__LOWER_COMP, null, msgs);
			if (newLower_comp != null)
				msgs = ((InternalEObject)newLower_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.MULTIPLICITY__LOWER_COMP, null, msgs);
			msgs = basicSetLower_comp(newLower_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__LOWER_COMP, newLower_comp, newLower_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUpper_comp() {
		return upper_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpper_comp(Expression newUpper_comp, NotificationChain msgs) {
		Expression oldUpper_comp = upper_comp;
		upper_comp = newUpper_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__UPPER_COMP, oldUpper_comp, newUpper_comp);
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
	public void setUpper_comp(Expression newUpper_comp) {
		if (newUpper_comp != upper_comp) {
			NotificationChain msgs = null;
			if (upper_comp != null)
				msgs = ((InternalEObject)upper_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.MULTIPLICITY__UPPER_COMP, null, msgs);
			if (newUpper_comp != null)
				msgs = ((InternalEObject)newUpper_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.MULTIPLICITY__UPPER_COMP, null, msgs);
			msgs = basicSetUpper_comp(newUpper_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__UPPER_COMP, newUpper_comp, newUpper_comp));
	}

	/**
	 * <!-- begin-user-doc --> 
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		return getFeatureWithMultiplicity();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof Feature)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of Feature");
		}
		return basicSetFeatureWithMultiplicity((Feature) newOwningRelatedElement, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof Feature)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of Feature");
		}
		setFeatureWithMultiplicity((Feature) newOwningRelatedElement);
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__LOWER_COMP:
				return getLower_comp();
			case SysMLPackage.MULTIPLICITY__UPPER_COMP:
				return getUpper_comp();
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				return getFeatureWithMultiplicity();
			case SysMLPackage.MULTIPLICITY__LOWER:
				if (resolve) return getLower();
				return basicGetLower();
			case SysMLPackage.MULTIPLICITY__UPPER:
				if (resolve) return getUpper();
				return basicGetUpper();
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
			case SysMLPackage.MULTIPLICITY__LOWER_COMP:
				setLower_comp((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER_COMP:
				setUpper_comp((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				setFeatureWithMultiplicity((Feature)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__LOWER:
				setLower((Expression)newValue);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER:
				setUpper((Expression)newValue);
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
			case SysMLPackage.MULTIPLICITY__LOWER_COMP:
				setLower_comp((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER_COMP:
				setUpper_comp((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				setFeatureWithMultiplicity((Feature)null);
				return;
			case SysMLPackage.MULTIPLICITY__LOWER:
				setLower((Expression)null);
				return;
			case SysMLPackage.MULTIPLICITY__UPPER:
				setUpper((Expression)null);
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
			case SysMLPackage.MULTIPLICITY__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
			case SysMLPackage.MULTIPLICITY__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.MULTIPLICITY__SOURCE:
				return isSetSource();
			case SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT:
				return isSetOwningRelatedElement();
			case SysMLPackage.MULTIPLICITY__LOWER_COMP:
				return lower_comp != null;
			case SysMLPackage.MULTIPLICITY__UPPER_COMP:
				return upper_comp != null;
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				return isSetFeatureWithMultiplicity();
			case SysMLPackage.MULTIPLICITY__LOWER:
				return basicGetLower() != null;
			case SysMLPackage.MULTIPLICITY__UPPER:
				return basicGetUpper() != null;
		}
		return super.eIsSet(featureID);
	}

} // MultiplicityImpl
