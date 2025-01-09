/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FlowConnectionDefinition;
import org.omg.sysml.lang.sysml.Interaction;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Connection Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#isImplied <em>Is Implied</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FlowConnectionDefinitionImpl#getFlowConnectionEnd <em>Flow Connection End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowConnectionDefinitionImpl extends ActionDefinitionImpl implements FlowConnectionDefinition {
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
	 * The default value of the '{@link #isImplied() <em>Is Implied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplied()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMPLIED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImplied() <em>Is Implied</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImplied()
	 * @generated
	 * @ordered
	 */
	protected boolean isImplied = IS_IMPLIED_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getRelatedType() <em>Related Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RELATED_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSourceType() <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ASSOCIATION__SOURCE_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTargetType() <em>Target Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_TYPE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ASSOCIATION__TARGET_TYPE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getFlowConnectionEnd() <em>Flow Connection End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlowConnectionEnd()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate FLOW_CONNECTION_END__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.FLOW_CONNECTION_DEFINITION__FLOW_CONNECTION_END).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowConnectionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FLOW_CONNECTION_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement() {
		if (ownedRelatedElement == null) {
			ownedRelatedElement = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isImplied() {
		return isImplied;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsImplied(boolean newIsImplied) {
		boolean oldIsImplied = isImplied;
		isImplied = newIsImplied;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FLOW_CONNECTION_DEFINITION__IS_IMPLIED, oldIsImplied, isImplied));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getRelatedType() {
		return (EList<Type>)RELATED_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	public Type getSourceType() {
		return (Type)SOURCE_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetSourceType() {
		return (Type)SOURCE_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceType(Type newSourceType) {
		SOURCE_TYPE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSourceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSourceType() {
		return basicGetSourceType() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getTargetType() {
		return (EList<Type>)TARGET_TYPE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTargetType() {
		return !getTargetType().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getFlowConnectionEnd() {
		return (EList<Usage>)FLOW_CONNECTION_END__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFlowConnectionEnd() {
		return !getFlowConnectionEnd().isEmpty();
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement()).basicAdd(otherEnd, msgs);
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT:
				return ((InternalEList<?>)getOwnedRelatedElement()).basicRemove(otherEnd, msgs);
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT:
				return getOwnedRelatedElement();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_ELEMENT:
				return getRelatedElement();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET:
				return getTarget();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE:
				return getSource();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__IS_IMPLIED:
				return isImplied();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_TYPE:
				return getRelatedType();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET_TYPE:
				return getTargetType();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__ASSOCIATION_END:
				return getAssociationEnd();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__FLOW_CONNECTION_END:
				return getFlowConnectionEnd();
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				getOwnedRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_ELEMENT:
				getRelatedElement().clear();
				getRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__IS_IMPLIED:
				setIsImplied((Boolean)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_TYPE:
				getRelatedType().clear();
				getRelatedType().addAll((Collection<? extends Type>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE_TYPE:
				setSourceType((Type)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET_TYPE:
				getTargetType().clear();
				getTargetType().addAll((Collection<? extends Type>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__ASSOCIATION_END:
				getAssociationEnd().clear();
				getAssociationEnd().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__FLOW_CONNECTION_END:
				getFlowConnectionEnd().clear();
				getFlowConnectionEnd().addAll((Collection<? extends Usage>)newValue);
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT:
				getOwnedRelatedElement().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT:
				setOwningRelatedElement((Element)null);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_ELEMENT:
				getRelatedElement().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__IS_IMPLIED:
				setIsImplied(IS_IMPLIED_EDEFAULT);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_TYPE:
				getRelatedType().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE_TYPE:
				setSourceType((Type)null);
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET_TYPE:
				getTargetType().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__ASSOCIATION_END:
				getAssociationEnd().clear();
				return;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__FLOW_CONNECTION_END:
				getFlowConnectionEnd().clear();
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
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_ELEMENT:
				return isSetRelatedElement();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET:
				return isSetTarget();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE:
				return isSetSource();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__IS_IMPLIED:
				return isImplied != IS_IMPLIED_EDEFAULT;
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__END_FEATURE:
				return isSetEndFeature();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_TYPE:
				return isSetRelatedType();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE_TYPE:
				return isSetSourceType();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET_TYPE:
				return isSetTargetType();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__ASSOCIATION_END:
				return isSetAssociationEnd();
			case SysMLPackage.FLOW_CONNECTION_DEFINITION__FLOW_CONNECTION_END:
				return isSetFlowConnectionEnd();
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
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__IS_IMPLIED: return SysMLPackage.RELATIONSHIP__IS_IMPLIED;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_TYPE: return SysMLPackage.ASSOCIATION__RELATED_TYPE;
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE_TYPE: return SysMLPackage.ASSOCIATION__SOURCE_TYPE;
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET_TYPE: return SysMLPackage.ASSOCIATION__TARGET_TYPE;
				case SysMLPackage.FLOW_CONNECTION_DEFINITION__ASSOCIATION_END: return SysMLPackage.ASSOCIATION__ASSOCIATION_END;
				default: return -1;
			}
		}
		if (baseClass == Interaction.class) {
			switch (derivedFeatureID) {
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
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE;
				case SysMLPackage.RELATIONSHIP__IS_IMPLIED: return SysMLPackage.FLOW_CONNECTION_DEFINITION__IS_IMPLIED;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ASSOCIATION__RELATED_TYPE: return SysMLPackage.FLOW_CONNECTION_DEFINITION__RELATED_TYPE;
				case SysMLPackage.ASSOCIATION__SOURCE_TYPE: return SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE_TYPE;
				case SysMLPackage.ASSOCIATION__TARGET_TYPE: return SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET_TYPE;
				case SysMLPackage.ASSOCIATION__ASSOCIATION_END: return SysMLPackage.FLOW_CONNECTION_DEFINITION__ASSOCIATION_END;
				default: return -1;
			}
		}
		if (baseClass == Interaction.class) {
			switch (baseFeatureID) {
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
		result.append(" (isImplied: ");
		result.append(isImplied);
		result.append(')');
		return result.toString();
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
	protected static final int[] RELATED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT, SysMLPackage.FLOW_CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT, SysMLPackage.FLOW_CONNECTION_DEFINITION__TARGET, SysMLPackage.FLOW_CONNECTION_DEFINITION__SOURCE};

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
		EList<Element> targetType = (EList<Element>)((EList<?>)getTargetType());
		return targetType;
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
		Type sourceType = getSourceType();
		if (sourceType != null) {
			source.add(sourceType);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getAssociationEnd() {
		@SuppressWarnings("unchecked")
		EList<Feature> flowConnectionEnd = (EList<Feature>)((EList<?>)getFlowConnectionEnd());
		return flowConnectionEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociationEnd() {
  		return false;
	}

} //FlowConnectionDefinitionImpl
