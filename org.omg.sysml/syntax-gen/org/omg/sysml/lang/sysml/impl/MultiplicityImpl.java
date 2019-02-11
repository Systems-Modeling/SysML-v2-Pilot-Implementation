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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MultiplicityImpl#getFeatureWithMultiplicity <em>Feature With Multiplicity</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MultiplicityImpl extends RelationshipImpl implements Multiplicity {
	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Expression lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Expression upper;

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
	public Expression getLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLower(Expression newLower, NotificationChain msgs) {
		Expression oldLower = lower;
		lower = newLower;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__LOWER, oldLower, newLower);
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
	public void setLower(Expression newLower) {
		if (newLower != lower) {
			NotificationChain msgs = null;
			if (lower != null)
				msgs = ((InternalEObject)lower).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.MULTIPLICITY__LOWER, null, msgs);
			if (newLower != null)
				msgs = ((InternalEObject)newLower).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.MULTIPLICITY__LOWER, null, msgs);
			msgs = basicSetLower(newLower, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__LOWER, newLower, newLower));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Expression getUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUpper(Expression newUpper, NotificationChain msgs) {
		Expression oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__UPPER, oldUpper, newUpper);
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
	public void setUpper(Expression newUpper) {
		if (newUpper != upper) {
			NotificationChain msgs = null;
			if (upper != null)
				msgs = ((InternalEObject)upper).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.MULTIPLICITY__UPPER, null, msgs);
			if (newUpper != null)
				msgs = ((InternalEObject)newUpper).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.MULTIPLICITY__UPPER, null, msgs);
			msgs = basicSetUpper(newUpper, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.MULTIPLICITY__UPPER, newUpper, newUpper));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeatureWithMultiplicity() {
		if (eContainerFeatureID() != SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY) return null;
		return (Feature)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFeatureWithMultiplicity(Feature newFeatureWithMultiplicity, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newFeatureWithMultiplicity, SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
				msgs = ((InternalEObject)newFeatureWithMultiplicity).eInverseAdd(this, SysMLPackage.FEATURE__MULTIPLICITY, Feature.class, msgs);
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
		return getFeatureWithMultiplicity() != null;
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
	 * The array of subset feature identifiers for the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[] {SysMLPackage.MULTIPLICITY__OWNING_RELATED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

	// Additional subsets
	
	@Override
	public EList<Element> getAllOwnedRelatedElements() {
		EList<Element> ownedRelatedElements = super.getAllOwnedRelatedElements();
		Element upper = getUpper();
		if (upper != null) {
			ownedRelatedElements.add(upper);
		}
		Element lower = getLower();
		if (lower != null) {
			ownedRelatedElements.add(lower);
		}
		return ownedRelatedElements;
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
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
			case SysMLPackage.MULTIPLICITY__LOWER:
				return basicSetLower(null, msgs);
			case SysMLPackage.MULTIPLICITY__UPPER:
				return basicSetUpper(null, msgs);
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
				return eInternalContainer().eInverseRemove(this, SysMLPackage.FEATURE__MULTIPLICITY, Feature.class, msgs);
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
			case SysMLPackage.MULTIPLICITY__LOWER:
				return getLower();
			case SysMLPackage.MULTIPLICITY__UPPER:
				return getUpper();
			case SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY:
				return getFeatureWithMultiplicity();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
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

} //MultiplicityImpl
