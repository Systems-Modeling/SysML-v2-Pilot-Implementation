/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorEnd;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Ownership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getRelatedFeature <em>Related Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getOwnedAssociationType <em>Owned Association Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#isDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorImpl#getConnectorEnd <em>Connector End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends FeatureImpl implements Connector {
	
	public static final String CONNECTOR_SUBSETTING_DEFAULT = "Base::connection";
	public static final String BINARY_CONNECTOR_SUBSETTING_DEFAULT = "Base::binaryConnection";
	
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
	 * The default value of the '{@link #isDirected() <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIRECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isDirected() <em>Is Directed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected boolean isDirected = IS_DIRECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> getRelatedElement() {
		@SuppressWarnings("unchecked")
		EList<Element> relatedFeatures = (EList<Element>)((EList<?>)getRelatedFeature());
		return relatedFeatures;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.CONNECTOR__TARGET, SysMLPackage.CONNECTOR__SOURCE, SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT, SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT, SysMLPackage.CONNECTOR__RELATED_FEATURE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
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
		if (eContainerFeatureID() != SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTOR__TARGET);
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
			source = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTOR__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getRelatedFeature() {
		EList<Feature> relatedFeatures = new BasicInternalEList<Feature>(Feature.class);
		for (ConnectorEnd connectorEnd: getConnectorEnd()) {
			Feature feature = connectorEnd.getFeature();
			if (feature != null) {
				relatedFeatures.add(feature);
			}
		}
		return relatedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getAssociation() {
		Association association = basicGetAssociation();
		return association != null && association.eIsProxy() ? (Association)eResolveProxy((InternalEObject)association) : association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Association basicGetAssociation() {
		EList<Category> types = super.getType();
		if (types.isEmpty()) {
			return null;
		} else {
			Category type = types.get(0);
			return type instanceof Association? (Association)type: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setAssociation(Association newAssociation) {
		EList<FeatureTyping> typings = getTyping();
		if (typings.isEmpty()) {
			FeatureTyping typing = SysMLFactory.eINSTANCE.createFeatureTyping();
			getOwnedRelationship().add(typing);
			typings.add(typing);
		} else {
			typings.get(0).setType(newAssociation);
		}
		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociation() {
		return basicGetAssociation() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getRelatedFeatures() {
		EList<Feature> features = new BasicInternalEList<Feature>(Feature.class);
		for (ConnectorEnd connectorEnd: this.getConnectorEnd()) {
			features.add(connectorEnd.getFeature());
		}
		return features;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDirected() {
		return isDirected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDirected(boolean newIsDirected) {
		boolean oldIsDirected = isDirected;
		isDirected = newIsDirected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR__IS_DIRECTED, oldIsDirected, isDirected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConnectorEnd> getConnectorEnd() {
		return new DerivedEObjectEList<ConnectorEnd>(
				ConnectorEnd.class, this, SysMLPackage.CONNECTOR__CONNECTOR_END, 
				new int[]{SysMLPackage.ELEMENT__OWNED_RELATIONSHIP});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getOwnedAssociationType() {
		Association ownedAssociationType = basicGetOwnedAssociationType();
		return ownedAssociationType != null && ownedAssociationType.eIsProxy() ? (Association)eResolveProxy((InternalEObject)ownedAssociationType) : ownedAssociationType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Association basicGetOwnedAssociationType() {
		Association association = this.getAssociation();
		return association != null && getOwnedElement().contains(association)? association: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwnedAssociationType(Association newOwnedAssociationType) {
		this.setAssociation(newOwnedAssociationType);
		FeatureTyping typing = getTyping().get(0);
		if (this.equals(typing.getOwningRelatedElement())) {
			typing.getOwnedRelatedElement().add(newOwnedAssociationType);
		} else {
			Ownership ownership = SysMLFactory.eINSTANCE.createOwnership();
			ownership.setOwningRelatedElement(this);
			ownership.getOwnedRelatedElement().add(newOwnedAssociationType);
		}
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedAssociationType() {
		return basicGetOwnedAssociationType() != null;
	}
	
	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(
				getConnectorEnd().size() > 2? 
					CONNECTOR_SUBSETTING_DEFAULT:
					BINARY_CONNECTOR_SUBSETTING_DEFAULT);
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
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.CONNECTOR__RELATED_ELEMENT:
				return getRelatedElement();
			case SysMLPackage.CONNECTOR__TARGET:
				return getTarget();
			case SysMLPackage.CONNECTOR__SOURCE:
				return getSource();
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement();
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				return getOwnedRelatedElement();
			case SysMLPackage.CONNECTOR__RELATED_FEATURE:
				return getRelatedFeature();
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				if (resolve) return getAssociation();
				return basicGetAssociation();
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				if (resolve) return getOwnedAssociationType();
				return basicGetOwnedAssociationType();
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				return isDirected();
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				return getConnectorEnd();
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
			case SysMLPackage.CONNECTOR__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				getOwnedRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR__RELATED_FEATURE:
				getRelatedFeature().clear();
				getRelatedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				setAssociation((Association)newValue);
				return;
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				setOwnedAssociationType((Association)newValue);
				return;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				setIsDirected((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				getConnectorEnd().clear();
				getConnectorEnd().addAll((Collection<? extends ConnectorEnd>)newValue);
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
			case SysMLPackage.CONNECTOR__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.CONNECTOR__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)null);
				return;
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				return;
			case SysMLPackage.CONNECTOR__RELATED_FEATURE:
				getRelatedFeature().clear();
				return;
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				setAssociation((Association)null);
				return;
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				setOwnedAssociationType((Association)null);
				return;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				setIsDirected(IS_DIRECTED_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				getConnectorEnd().clear();
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
			case SysMLPackage.CONNECTOR__RELATED_ELEMENT:
				return isSetRelatedElement();
			case SysMLPackage.CONNECTOR__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.CONNECTOR__SOURCE:
				return source != null && !source.isEmpty();
			case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.CONNECTOR__TYPE:
				return isSetType();
			case SysMLPackage.CONNECTOR__OWNED_TYPE:
				return isSetOwnedType();
			case SysMLPackage.CONNECTOR__RELATED_FEATURE:
				return !getRelatedFeature().isEmpty();
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				return isSetAssociation();
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				return isSetOwnedAssociationType();
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				return isDirected != IS_DIRECTED_EDEFAULT;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				return !getConnectorEnd().isEmpty();
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
				case SysMLPackage.CONNECTOR__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				case SysMLPackage.CONNECTOR__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
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
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.CONNECTOR__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.CONNECTOR__TARGET;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.CONNECTOR__SOURCE;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isDirected: ");
		result.append(isDirected);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElement() {
		return eIsSet(SysMLPackage.CONNECTOR__TARGET)
			|| eIsSet(SysMLPackage.CONNECTOR__SOURCE)
			|| eIsSet(SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT)
			|| eIsSet(SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT)
			|| eIsSet(SysMLPackage.CONNECTOR__RELATED_FEATURE);
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getType() {
		EList<Category> type = new UniqueEList<Category>();
		Association association = getAssociation();
		if (association != null) {
			type.add(association);
		}
		return new UnionEObjectEList<Category>(this, SysMLPackage.Literals.FEATURE__TYPE, type.size(), type.toArray());
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT
//	 */
//	@Override
//	public EList<Category> getType() {
//		EList<Category> type = new EObjectResolvingEList<Category>(Category.class, this, SysMLPackage.CONNECTOR__TYPE);
//		// NOTE: The "association" object must NOT be resolved here, in order to avoid Xtext lazy linking errors.
//		Category association = basicGetAssociation();
//		if (association != null) {
//			type.add(association);
//		}
//		return type;
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Category> getOwnedType() {
		EList<Category> ownedType = new UniqueEList<Category>();
		Association ownedAssociationType = getOwnedAssociationType();
		if (ownedAssociationType != null) {
			ownedType.add(ownedAssociationType);
		}
		return new UnionEObjectEList<Category>(this, SysMLPackage.Literals.FEATURE__OWNED_TYPE, ownedType.size(), ownedType.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedType() {
  		return false;
	}

} //ConnectorImpl
