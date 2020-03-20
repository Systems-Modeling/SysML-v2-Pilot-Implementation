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
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.AssociationBlock;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getOwningConnector <em>Owning Connector</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getAssociationEnd <em>Association End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationBlockImpl extends BlockImpl implements AssociationBlock {

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
	 * The cached value of the '{@link #getOwnedRelatedElement_comp() <em>Owned Related Element comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelatedElement_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedRelatedElement_comp;
	public static final String ASSOCIATION_BLOCK_SUPERCLASS_DEFAULT = "Blocks::Connection";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSOCIATION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		if (target == null) {
			target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION_BLOCK__TARGET);
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
			source = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION_BLOCK__SOURCE);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT_COMP, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		EList<Element> ownedRelatedElements = new EObjectEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION__OWNED_RELATED_ELEMENT);
		ownedRelatedElements.addAll(getOwnedRelatedElement_comp());
		return ownedRelatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT // derived
	 */
	@Override
	public EList<Type> getRelatedType() {
		EList<Type> relatedTypes = new BasicInternalEList<Type>(Type.class);
		getAssociationEnd().stream().flatMap(end -> end.getType().stream()).forEachOrdered(relatedTypes::add);
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
	 * @generated
	 */
	@Override
	public Connector getOwningConnector() {
		Connector owningConnector = basicGetOwningConnector();
		return owningConnector != null && owningConnector.eIsProxy() ? (Connector)eResolveProxy((InternalEObject)owningConnector) : owningConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT // derived
	 */
	public Connector basicGetOwningConnector() {
		Element owner = this.getOwner();
		return owner instanceof Connector ? (Connector) owner : null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningConnector(Connector newOwningConnector) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getAssociationEnd() {
		return super.getEndFeature();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociationEnd() {
		return !getAssociationEnd().isEmpty();
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
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningRelatedElement((Element)otherEnd, msgs);
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement_comp()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT:
				return basicSetOwningRelatedElement(null, msgs);
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP_COMP, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(
				getOwnedEndFeature().size() > 2? 
					AssociationImpl.ASSOCIATION_SUPERCLASS_DEFAULT: 
					ASSOCIATION_BLOCK_SUPERCLASS_DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION_BLOCK__RELATED_ELEMENT:
				return getRelatedElement();
			case SysMLPackage.ASSOCIATION_BLOCK__TARGET:
				return getTarget();
			case SysMLPackage.ASSOCIATION_BLOCK__SOURCE:
				return getSource();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT_COMP:
				return getOwnedRelatedElement_comp();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT:
				return getOwnedRelatedElement();
			case SysMLPackage.ASSOCIATION_BLOCK__RELATED_TYPE:
				return getRelatedType();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_CONNECTOR:
				if (resolve) return getOwningConnector();
				return basicGetOwningConnector();
			case SysMLPackage.ASSOCIATION_BLOCK__ASSOCIATION_END:
				return getAssociationEnd();
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
			case SysMLPackage.ASSOCIATION_BLOCK__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT_COMP:
				getOwnedRelatedElement_comp().clear();
				getOwnedRelatedElement_comp().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				getOwnedRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__RELATED_TYPE:
				getRelatedType().clear();
				getRelatedType().addAll((Collection<? extends Type>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_CONNECTOR:
				setOwningConnector((Connector)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__ASSOCIATION_END:
				getAssociationEnd().clear();
				getAssociationEnd().addAll((Collection<? extends Feature>)newValue);
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
			case SysMLPackage.ASSOCIATION_BLOCK__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)null);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT_COMP:
				getOwnedRelatedElement_comp().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__RELATED_TYPE:
				getRelatedType().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_CONNECTOR:
				setOwningConnector((Connector)null);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__ASSOCIATION_END:
				getAssociationEnd().clear();
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
			case SysMLPackage.ASSOCIATION_BLOCK__RELATED_ELEMENT:
				return isSetRelatedElement();
			case SysMLPackage.ASSOCIATION_BLOCK__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.ASSOCIATION_BLOCK__SOURCE:
				return source != null && !source.isEmpty();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT:
				return !getOwnedRelatedElement().isEmpty();
			case SysMLPackage.ASSOCIATION_BLOCK__END_FEATURE:
				return isSetEndFeature();
			case SysMLPackage.ASSOCIATION_BLOCK__RELATED_TYPE:
				return isSetRelatedType();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNING_CONNECTOR:
				return basicGetOwningConnector() != null;
			case SysMLPackage.ASSOCIATION_BLOCK__ASSOCIATION_END:
				return isSetAssociationEnd();
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
				case SysMLPackage.ASSOCIATION_BLOCK__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.ASSOCIATION_BLOCK__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				case SysMLPackage.ASSOCIATION_BLOCK__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				case SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT_COMP: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP;
				case SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ASSOCIATION_BLOCK__RELATED_TYPE: return SysMLPackage.ASSOCIATION__RELATED_TYPE;
				case SysMLPackage.ASSOCIATION_BLOCK__OWNING_CONNECTOR: return SysMLPackage.ASSOCIATION__OWNING_CONNECTOR;
				case SysMLPackage.ASSOCIATION_BLOCK__ASSOCIATION_END: return SysMLPackage.ASSOCIATION__ASSOCIATION_END;
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
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.ASSOCIATION_BLOCK__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.ASSOCIATION_BLOCK__TARGET;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.ASSOCIATION_BLOCK__SOURCE;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT_COMP: return SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT_COMP;
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ASSOCIATION__RELATED_TYPE: return SysMLPackage.ASSOCIATION_BLOCK__RELATED_TYPE;
				case SysMLPackage.ASSOCIATION__OWNING_CONNECTOR: return SysMLPackage.ASSOCIATION_BLOCK__OWNING_CONNECTOR;
				case SysMLPackage.ASSOCIATION__ASSOCIATION_END: return SysMLPackage.ASSOCIATION_BLOCK__ASSOCIATION_END;
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
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.ASSOCIATION_BLOCK__TARGET, SysMLPackage.ASSOCIATION_BLOCK__SOURCE, SysMLPackage.ASSOCIATION_BLOCK__OWNING_RELATED_ELEMENT, SysMLPackage.ASSOCIATION_BLOCK__OWNED_RELATED_ELEMENT};

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
	@Override
	public EList<Feature> getEndFeature() {
		return getAssociationEnd();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetEndFeature() {
  		return false;
	}

} //AssociationBlockImpl
