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

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorAsUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector As Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#getRelatedFeature <em>Related Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#isDirected <em>Is Directed</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#getConnectorEnd <em>Connector End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectorAsUsageImpl extends UsageImpl implements ConnectorAsUsage {
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
	protected ConnectorAsUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTOR_AS_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
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
		if (eContainerFeatureID() != SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	// Additional overrides	
	
	@Override
	public boolean isReference() {
		return true;
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getRelatedFeature() {
		return new DerivedUnionEObjectEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE, RELATED_FEATURE_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedFeature() <em>Related Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedFeature()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_FEATURE_ESUBSETS = new int[] {SysMLPackage.CONNECTOR_AS_USAGE__SOURCE_FEATURE, SysMLPackage.CONNECTOR_AS_USAGE__TARGET_FEATURE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedFeature() {
		return !getRelatedFeature().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Association> getAssociation() {
		EList<Association> associations = 
				new NonNotifyingEObjectEList<>(Association.class, this, SysMLPackage.CONNECTOR__ASSOCIATION);
		super.getType().stream().
			filter(type->type instanceof Association).
			map(type->(Association)type).
			forEachOrdered(associations::add);
		return associations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociation() {
		return !getAssociation().isEmpty();
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_AS_USAGE__IS_DIRECTED, oldIsDirected, isDirected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getConnectorEnd() {
		EList<Feature> connectorEnds = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.CONNECTOR__CONNECTOR_END);
		getOwnedFeature().stream().filter(f->f.isEnd()).forEachOrdered(connectorEnds::add);
		return connectorEnds;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectorEnd() {
		return !getConnectorEnd().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSourceFeature() {
		Feature sourceFeature = basicGetSourceFeature();
		return sourceFeature != null && sourceFeature.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)sourceFeature) : sourceFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSourceFeature() {
		return ConnectorUtil.getSourceFeatureOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSourceFeature(Feature newSourceFeature) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceFeature() {
		return basicGetSourceFeature() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getTargetFeature() {
		EList<Feature> targetFeatures = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.CONNECTOR__TARGET_FEATURE);
		ConnectorUtil.addTargetFeatures(this, targetFeatures);
		return targetFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetFeature() {
		return !getTargetFeature().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getRelatedElement() {
		@SuppressWarnings("unchecked")
		EList<Element> relatedFeature = (EList<Element>)((EList<?>)getRelatedFeature());
		return relatedFeature;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getRelatedElement() <em>Related Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT, SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT, SysMLPackage.CONNECTOR_AS_USAGE__TARGET, SysMLPackage.CONNECTOR_AS_USAGE__SOURCE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRelatedElement() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTarget() {
		@SuppressWarnings("unchecked")
		EList<Element> targetFeature = (EList<Element>)((EList<?>)getTargetFeature());
		return targetFeature;
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
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Feature sourceFeature = getSourceFeature();
		if (sourceFeature != null) {
			source.add(sourceFeature);
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
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> definition = (EList<Type>)((EList<?>)getDefinition());
		return definition;
	}

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
	public EList<Feature> getEndFeature() {
		return getConnectorEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndFeature() {
  		return false;
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
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
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
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
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
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT:
				return getRelatedElement();
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT:
				return getOwnedRelatedElement();
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement();
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET:
				return getTarget();
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE:
				return getSource();
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE:
				return getRelatedFeature();
			case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION:
				return getAssociation();
			case SysMLPackage.CONNECTOR_AS_USAGE__IS_DIRECTED:
				return isDirected();
			case SysMLPackage.CONNECTOR_AS_USAGE__CONNECTOR_END:
				return getConnectorEnd();
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE_FEATURE:
				if (resolve) return getSourceFeature();
				return basicGetSourceFeature();
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET_FEATURE:
				return getTargetFeature();
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
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				getOwnedRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__IS_DIRECTED:
				setIsDirected((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__CONNECTOR_END:
				getConnectorEnd().clear();
				getConnectorEnd().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE_FEATURE:
				setSourceFeature((Feature)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET_FEATURE:
				getTargetFeature().clear();
				getTargetFeature().addAll((Collection<? extends Feature>)newValue);
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
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)null);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION:
				getAssociation().clear();
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__IS_DIRECTED:
				setIsDirected(IS_DIRECTED_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__CONNECTOR_END:
				getConnectorEnd().clear();
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE_FEATURE:
				setSourceFeature((Feature)null);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET_FEATURE:
				getTargetFeature().clear();
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
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT:
				return isSetRelatedElement();
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET:
				return isSetTarget();
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE:
				return isSetSource();
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE:
				return isSetRelatedFeature();
			case SysMLPackage.CONNECTOR_AS_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.CONNECTOR_AS_USAGE__END_FEATURE:
				return isSetEndFeature();
			case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION:
				return isSetAssociation();
			case SysMLPackage.CONNECTOR_AS_USAGE__IS_DIRECTED:
				return isDirected != IS_DIRECTED_EDEFAULT;
			case SysMLPackage.CONNECTOR_AS_USAGE__CONNECTOR_END:
				return isSetConnectorEnd();
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE_FEATURE:
				return isSetSourceFeature();
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET_FEATURE:
				return isSetTargetFeature();
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
				case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR_AS_USAGE__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE: return SysMLPackage.CONNECTOR__RELATED_FEATURE;
				case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION: return SysMLPackage.CONNECTOR__ASSOCIATION;
				case SysMLPackage.CONNECTOR_AS_USAGE__IS_DIRECTED: return SysMLPackage.CONNECTOR__IS_DIRECTED;
				case SysMLPackage.CONNECTOR_AS_USAGE__CONNECTOR_END: return SysMLPackage.CONNECTOR__CONNECTOR_END;
				case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE_FEATURE: return SysMLPackage.CONNECTOR__SOURCE_FEATURE;
				case SysMLPackage.CONNECTOR_AS_USAGE__TARGET_FEATURE: return SysMLPackage.CONNECTOR__TARGET_FEATURE;
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
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.CONNECTOR_AS_USAGE__TARGET;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.CONNECTOR_AS_USAGE__SOURCE;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (baseFeatureID) {
				case SysMLPackage.CONNECTOR__RELATED_FEATURE: return SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE;
				case SysMLPackage.CONNECTOR__ASSOCIATION: return SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION;
				case SysMLPackage.CONNECTOR__IS_DIRECTED: return SysMLPackage.CONNECTOR_AS_USAGE__IS_DIRECTED;
				case SysMLPackage.CONNECTOR__CONNECTOR_END: return SysMLPackage.CONNECTOR_AS_USAGE__CONNECTOR_END;
				case SysMLPackage.CONNECTOR__SOURCE_FEATURE: return SysMLPackage.CONNECTOR_AS_USAGE__SOURCE_FEATURE;
				case SysMLPackage.CONNECTOR__TARGET_FEATURE: return SysMLPackage.CONNECTOR_AS_USAGE__TARGET_FEATURE;
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

} //ConnectorAsUsageImpl
