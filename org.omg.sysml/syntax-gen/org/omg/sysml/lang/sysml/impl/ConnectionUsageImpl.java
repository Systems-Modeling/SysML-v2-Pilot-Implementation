/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEList.UnmodifiableEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Connector Usage</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getTarget
 * <em>Target</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getSource
 * <em>Source</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getOwningRelatedElement
 * <em>Owning Related Element</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getOwnedRelatedElement_comp
 * <em>Owned Related Element comp</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getOwnedRelatedElement
 * <em>Owned Related Element</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getRelatedFeature
 * <em>Related Feature</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getAssociation
 * <em>Association</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#isDirected
 * <em>Is Directed</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getConnectorEnd
 * <em>Connector End</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getOwnedAssociationType
 * <em>Owned Association Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionUsageImpl extends PartUsageImpl implements ConnectionUsage {

	public static final String CONNECTOR_USAGE_SUBSETTING_DEFAULT = "Connections::connections";

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> target;
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> source;
	/**
	 * The cached value of the '{@link #getOwnedRelatedElement_comp() <em>Owned
	 * Related Element comp</em>}' containment reference list. <!-- begin-user-doc
	 * --> <!-- end-user-doc -->
	 * 
	 * @see #getOwnedRelatedElement_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedRelatedElement_comp;
	/**
	 * The default value of the '{@link #isDirected() <em>Is Directed</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DIRECTED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDirected() <em>Is Directed</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isDirected()
	 * @generated
	 * @ordered
	 */
	protected boolean isDirected = IS_DIRECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ConnectionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTION_USAGE__TARGET);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		if (source == null) {
			source = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTION_USAGE__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT)
			return null;
		return (Element) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningRelatedElement,
				SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer()
				|| (eContainerFeatureID() != SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT
						&& newOwningRelatedElement != null)) {
			if (EcoreUtil.isAncestor(this, newOwningRelatedElement))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningRelatedElement != null)
				msgs = ((InternalEObject) newOwningRelatedElement).eInverseAdd(this,
						SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP, Element.class, msgs);
			msgs = basicSetOwningRelatedElement(newOwningRelatedElement, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT,
					newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this,
					SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT_COMP,
					SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		EList<Element> ownedRelatedElements = new EObjectEList<Element>(Element.class, this,
				SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT);
		ownedRelatedElements.addAll(getOwnedRelatedElement_comp());
		return ownedRelatedElements;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getRelatedFeature() {
		EList<Feature> relatedFeatures = new BasicInternalEList<Feature>(Feature.class);
		new ArrayList<Feature>(getConnectorEnd()).stream()
				.forEach(end -> ((FeatureImpl) end).getFirstSubsettedFeature().ifPresent(relatedFeatures::add));
		return relatedFeatures;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetRelatedFeature() {
		return !getRelatedFeature().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Association> getAssociation() {
		List<Association> associations = new ArrayList<Association>();
		super.getType().stream().filter(type -> type instanceof Association).map(type -> (Association) type)
				.forEachOrdered(associations::add);
		return new UnmodifiableEList<Association>(this, SysMLPackage.eINSTANCE.getConnector_Association(),
				associations.size(), associations.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetAssociation() {
		return !getAssociation().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Association> getOwnedAssociationType() {
		EList<Association> associations = new EObjectEList<Association>(Association.class, this,
				SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE);
		getAssociation().stream().filter(a -> a.getOwner() == this).forEachOrdered(associations::add);
		return associations;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetOwnedAssociationType() {
		return !getOwnedAssociationType().isEmpty();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isDirected() {
		return isDirected;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsDirected(boolean newIsDirected) {
		boolean oldIsDirected = isDirected;
		isDirected = newIsDirected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTION_USAGE__IS_DIRECTED,
					oldIsDirected, isDirected));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getConnectorEnd() {
		return new ConnectorImpl.DerivedConnectorEndList(this);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public EList<Feature> path(Feature relatedFeature) {
		EList<Feature> path = new BasicInternalEList<Feature>(Feature.class);
		ConnectorImpl.getPath(path, getOwningNamespace(), relatedFeature);
		return path;
	}

	@Override
	protected String getDefaultSupertype() {
		return getConnectorEnd().size() > 2 ? ConnectorImpl.CONNECTOR_SUBSETTING_DEFAULT
				: CONNECTOR_USAGE_SUBSETTING_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		@SuppressWarnings("unchecked")
		EList<Element> relatedFeature = (EList<Element>) ((EList<?>) getRelatedFeature());
		return relatedFeature;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElement()
	 * <em>Related Element</em>}' reference list. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] { SysMLPackage.CONNECTION_USAGE__TARGET,
			SysMLPackage.CONNECTION_USAGE__SOURCE, SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT,
			SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT };

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetRelatedElement() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> itemDefinition = (EList<Type>) ((EList<?>) getItemDefinition());
		return itemDefinition;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetType() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Type> getOwnedType() {
		@SuppressWarnings("unchecked")
		EList<Type> ownedAssociationType = (EList<Type>) ((EList<?>) getOwnedAssociationType());
		return ownedAssociationType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetOwnedType() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwningRelatedElement((Element) otherEnd, msgs);
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT_COMP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRelatedElement_comp())
					.basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT:
			return basicSetOwningRelatedElement(null, msgs);
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT_COMP:
			return ((InternalEList<?>) getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT:
			return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP,
					Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SysMLPackage.CONNECTION_USAGE__RELATED_ELEMENT:
			return getRelatedElement();
		case SysMLPackage.CONNECTION_USAGE__TARGET:
			return getTarget();
		case SysMLPackage.CONNECTION_USAGE__SOURCE:
			return getSource();
		case SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT:
			return getOwningRelatedElement();
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT_COMP:
			return getOwnedRelatedElement_comp();
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT:
			return getOwnedRelatedElement();
		case SysMLPackage.CONNECTION_USAGE__RELATED_FEATURE:
			return getRelatedFeature();
		case SysMLPackage.CONNECTION_USAGE__ASSOCIATION:
			return getAssociation();
		case SysMLPackage.CONNECTION_USAGE__IS_DIRECTED:
			return isDirected();
		case SysMLPackage.CONNECTION_USAGE__CONNECTOR_END:
			return getConnectorEnd();
		case SysMLPackage.CONNECTION_USAGE__OWNED_ASSOCIATION_TYPE:
			return getOwnedAssociationType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SysMLPackage.CONNECTION_USAGE__TARGET:
			getTarget().clear();
			getTarget().addAll((Collection<? extends Element>) newValue);
			return;
		case SysMLPackage.CONNECTION_USAGE__SOURCE:
			getSource().clear();
			getSource().addAll((Collection<? extends Element>) newValue);
			return;
		case SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT:
			setOwningRelatedElement((Element) newValue);
			return;
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT_COMP:
			getOwnedRelatedElement_comp().clear();
			getOwnedRelatedElement_comp().addAll((Collection<? extends Element>) newValue);
			return;
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT:
			getOwnedRelatedElement().clear();
			getOwnedRelatedElement().addAll((Collection<? extends Element>) newValue);
			return;
		case SysMLPackage.CONNECTION_USAGE__RELATED_FEATURE:
			getRelatedFeature().clear();
			getRelatedFeature().addAll((Collection<? extends Feature>) newValue);
			return;
		case SysMLPackage.CONNECTION_USAGE__ASSOCIATION:
			getAssociation().clear();
			getAssociation().addAll((Collection<? extends Association>) newValue);
			return;
		case SysMLPackage.CONNECTION_USAGE__IS_DIRECTED:
			setIsDirected((Boolean) newValue);
			return;
		case SysMLPackage.CONNECTION_USAGE__CONNECTOR_END:
			getConnectorEnd().clear();
			getConnectorEnd().addAll((Collection<? extends Feature>) newValue);
			return;
		case SysMLPackage.CONNECTION_USAGE__OWNED_ASSOCIATION_TYPE:
			getOwnedAssociationType().clear();
			getOwnedAssociationType().addAll((Collection<? extends Association>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SysMLPackage.CONNECTION_USAGE__TARGET:
			getTarget().clear();
			return;
		case SysMLPackage.CONNECTION_USAGE__SOURCE:
			getSource().clear();
			return;
		case SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT:
			setOwningRelatedElement((Element) null);
			return;
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT_COMP:
			getOwnedRelatedElement_comp().clear();
			return;
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT:
			getOwnedRelatedElement().clear();
			return;
		case SysMLPackage.CONNECTION_USAGE__RELATED_FEATURE:
			getRelatedFeature().clear();
			return;
		case SysMLPackage.CONNECTION_USAGE__ASSOCIATION:
			getAssociation().clear();
			return;
		case SysMLPackage.CONNECTION_USAGE__IS_DIRECTED:
			setIsDirected(IS_DIRECTED_EDEFAULT);
			return;
		case SysMLPackage.CONNECTION_USAGE__CONNECTOR_END:
			getConnectorEnd().clear();
			return;
		case SysMLPackage.CONNECTION_USAGE__OWNED_ASSOCIATION_TYPE:
			getOwnedAssociationType().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SysMLPackage.CONNECTION_USAGE__RELATED_ELEMENT:
			return isSetRelatedElement();
		case SysMLPackage.CONNECTION_USAGE__TARGET:
			return target != null && !target.isEmpty();
		case SysMLPackage.CONNECTION_USAGE__SOURCE:
			return source != null && !source.isEmpty();
		case SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT:
			return getOwningRelatedElement() != null;
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT_COMP:
			return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
		case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT:
			return !getOwnedRelatedElement().isEmpty();
		case SysMLPackage.CONNECTION_USAGE__TYPE:
			return isSetType();
		case SysMLPackage.CONNECTION_USAGE__OWNED_TYPE:
			return isSetOwnedType();
		case SysMLPackage.CONNECTION_USAGE__RELATED_FEATURE:
			return isSetRelatedFeature();
		case SysMLPackage.CONNECTION_USAGE__ASSOCIATION:
			return isSetAssociation();
		case SysMLPackage.CONNECTION_USAGE__IS_DIRECTED:
			return isDirected != IS_DIRECTED_EDEFAULT;
		case SysMLPackage.CONNECTION_USAGE__CONNECTOR_END:
			return !getConnectorEnd().isEmpty();
		case SysMLPackage.CONNECTION_USAGE__OWNED_ASSOCIATION_TYPE:
			return isSetOwnedAssociationType();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
			case SysMLPackage.CONNECTION_USAGE__RELATED_ELEMENT:
				return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
			case SysMLPackage.CONNECTION_USAGE__TARGET:
				return SysMLPackage.RELATIONSHIP__TARGET;
			case SysMLPackage.CONNECTION_USAGE__SOURCE:
				return SysMLPackage.RELATIONSHIP__SOURCE;
			case SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT:
				return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
			case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT_COMP:
				return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP;
			case SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT:
				return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
			default:
				return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (derivedFeatureID) {
			case SysMLPackage.CONNECTION_USAGE__RELATED_FEATURE:
				return SysMLPackage.CONNECTOR__RELATED_FEATURE;
			case SysMLPackage.CONNECTION_USAGE__ASSOCIATION:
				return SysMLPackage.CONNECTOR__ASSOCIATION;
			case SysMLPackage.CONNECTION_USAGE__IS_DIRECTED:
				return SysMLPackage.CONNECTOR__IS_DIRECTED;
			case SysMLPackage.CONNECTION_USAGE__CONNECTOR_END:
				return SysMLPackage.CONNECTOR__CONNECTOR_END;
			case SysMLPackage.CONNECTION_USAGE__OWNED_ASSOCIATION_TYPE:
				return SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
			case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT:
				return SysMLPackage.CONNECTION_USAGE__RELATED_ELEMENT;
			case SysMLPackage.RELATIONSHIP__TARGET:
				return SysMLPackage.CONNECTION_USAGE__TARGET;
			case SysMLPackage.RELATIONSHIP__SOURCE:
				return SysMLPackage.CONNECTION_USAGE__SOURCE;
			case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT:
				return SysMLPackage.CONNECTION_USAGE__OWNING_RELATED_ELEMENT;
			case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP:
				return SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT_COMP;
			case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT:
				return SysMLPackage.CONNECTION_USAGE__OWNED_RELATED_ELEMENT;
			default:
				return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (baseFeatureID) {
			case SysMLPackage.CONNECTOR__RELATED_FEATURE:
				return SysMLPackage.CONNECTION_USAGE__RELATED_FEATURE;
			case SysMLPackage.CONNECTOR__ASSOCIATION:
				return SysMLPackage.CONNECTION_USAGE__ASSOCIATION;
			case SysMLPackage.CONNECTOR__IS_DIRECTED:
				return SysMLPackage.CONNECTION_USAGE__IS_DIRECTED;
			case SysMLPackage.CONNECTOR__CONNECTOR_END:
				return SysMLPackage.CONNECTION_USAGE__CONNECTOR_END;
			case SysMLPackage.CONNECTOR__OWNED_ASSOCIATION_TYPE:
				return SysMLPackage.CONNECTION_USAGE__OWNED_ASSOCIATION_TYPE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (baseOperationID) {
			default:
				return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (baseOperationID) {
			case SysMLPackage.CONNECTOR___PATH__FEATURE:
				return SysMLPackage.CONNECTION_USAGE___PATH__FEATURE;
			default:
				return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case SysMLPackage.CONNECTION_USAGE___PATH__FEATURE:
			return path((Feature) arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isDirected: ");
		result.append(isDirected);
		result.append(')');
		return result.toString();
	}

} // ConnectUsageImpl
