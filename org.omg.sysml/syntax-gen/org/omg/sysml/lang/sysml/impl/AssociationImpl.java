/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwningConnector <em>Owning Connector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedEndFeatureMembership <em>Owned End Feature Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends ClassImpl implements Association {
	
	public String ASSOCIATION_SUPERCLASS_DEFAULT = "Base::Link";
	public String BINARY_ASSOCIATION_SUPERCLASS_DEFAULT = "Base::BinaryLink";

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> source;

	/**
	 * The cached value of the '{@link #getOwnedRelatedElement() <em>Owned Related Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedRelatedElement;

	/**
	 * The cached value of the '{@link #getOwnedEndFeatureMembership() <em>Owned End Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEndFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<EndFeatureMembership> ownedEndFeatureMembership;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new SubsetSupersetEObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT, OWNED_RELATED_ELEMENT_ESUPERSETS, null, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningRelatedElement != null) {
				EList<Element> source = getSource();
				if (!source.contains(newOwningRelatedElement)) {
					source.add(newOwningRelatedElement);
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
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		if (target == null) {
			target = new SubsetSupersetEObjectResolvingEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION__TARGET, null, TARGET_ESUBSETS);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		if (source == null) {
			source = new SubsetSupersetEObjectResolvingEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION__SOURCE, null, SOURCE_ESUBSETS);
		}
		return source;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT};

	/**
	 * The array of subset feature identifiers for the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[] {SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT};

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedRelatedElement() <em>Owned Related Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RELATED_ELEMENT_ESUPERSETS = new int[] {SysMLPackage.ASSOCIATION__TARGET};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Category> getRelatedType() {
		EList<Category> relatedTypes = new BasicInternalEList<Category>(Category.class);
		for (FeatureMembership membership: this.getOwnedEndFeatureMembership()) {
			Feature feature = membership.getMemberFeature();
			if (feature != null) {
				for (Category type: feature.getType()) {
					relatedTypes.add(type);
				}
			}
		}
		return relatedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedType() {
		return !getRelatedType().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<EndFeatureMembership> getOwnedEndFeatureMembership() {
		EList<EndFeatureMembership> ownedEndFeatureMemberships = 
				new EObjectEList<EndFeatureMembership>(EndFeatureMembership.class, this, SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP);
		for (FeatureMembership featureMembership: getOwnedFeatureMembership()) {
			if (featureMembership instanceof EndFeatureMembership) {
				ownedEndFeatureMemberships.add((EndFeatureMembership)featureMembership);
			}
		}
		return ownedEndFeatureMemberships;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Connector getOwningConnector() {
		Connector owningConnector = basicGetOwningConnector();
		return owningConnector != null && owningConnector.eIsProxy() ? (Connector)eResolveProxy((InternalEObject)owningConnector) : owningConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Connector basicGetOwningConnector() {
		Element owner = this.getOwner();
		return owner instanceof Connector? (Connector)owner: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningConnector(Connector newOwningConnector) {
		this.setOwner(newOwningConnector);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		@SuppressWarnings("unchecked")
		EList<Element> relatedType = (EList<Element>)((EList<?>)getRelatedType());
		return relatedType;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.ASSOCIATION__TARGET, SysMLPackage.ASSOCIATION__SOURCE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElement() {
  		return false;
	}

	/**
	 * If the Association has no Superclassings, then create one whose superclass is the appropriate default library class.
	 */
	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(
				getOwnedEndFeatureMembership().size() > 2? 
					ASSOCIATION_SUPERCLASS_DEFAULT: 
					BINARY_ASSOCIATION_SUPERCLASS_DEFAULT);
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
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEndFeatureMembership()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedEndFeatureMembership()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
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
			case SysMLPackage.ASSOCIATION__RELATED_ELEMENT:
				return getRelatedElement();
			case SysMLPackage.ASSOCIATION__TARGET:
				return getTarget();
			case SysMLPackage.ASSOCIATION__SOURCE:
				return getSource();
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				return getOwnedRelatedElement();
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement();
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				return getRelatedType();
			case SysMLPackage.ASSOCIATION__OWNING_CONNECTOR:
				if (resolve) return getOwningConnector();
				return basicGetOwningConnector();
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return getOwnedEndFeatureMembership();
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
			case SysMLPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				getOwnedRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)newValue);
				return;
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				getRelatedType().clear();
				getRelatedType().addAll((Collection<? extends Category>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNING_CONNECTOR:
				setOwningConnector((Connector)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				getOwnedEndFeatureMembership().clear();
				getOwnedEndFeatureMembership().addAll((Collection<? extends EndFeatureMembership>)newValue);
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
			case SysMLPackage.ASSOCIATION__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.ASSOCIATION__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)null);
				return;
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				getRelatedType().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNING_CONNECTOR:
				setOwningConnector((Connector)null);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				getOwnedEndFeatureMembership().clear();
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
			case SysMLPackage.ASSOCIATION__RELATED_ELEMENT:
				return isSetRelatedElement();
			case SysMLPackage.ASSOCIATION__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.ASSOCIATION__SOURCE:
				return source != null && !source.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				return isSetRelatedType();
			case SysMLPackage.ASSOCIATION__OWNING_CONNECTOR:
				return basicGetOwningConnector() != null;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return ownedEndFeatureMembership != null && !ownedEndFeatureMembership.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
				case SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.ASSOCIATION__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.ASSOCIATION__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				case SysMLPackage.ASSOCIATION__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.ASSOCIATION__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.ASSOCIATION__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.ASSOCIATION__TARGET;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.ASSOCIATION__SOURCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AssociationImpl
