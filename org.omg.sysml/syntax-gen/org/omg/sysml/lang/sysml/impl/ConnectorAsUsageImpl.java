/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2022 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *******************************************************************************/
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
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorAsUsage;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#isImplied <em>Is Implied</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#getRelatedFeature <em>Related Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorAsUsageImpl#getAssociation <em>Association</em>}</li>
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
	 * The cached setting delegate for the '{@link #getRelatedFeature() <em>Related Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate RELATED_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getAssociation() <em>Association</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ASSOCIATION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CONNECTOR__ASSOCIATION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectorEnd() <em>Connector End</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectorEnd()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTOR_END__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CONNECTOR__CONNECTOR_END).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getSourceFeature() <em>Source Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate SOURCE_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CONNECTOR__SOURCE_FEATURE).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getTargetFeature() <em>Target Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate TARGET_FEATURE__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CONNECTOR__TARGET_FEATURE).getSettingDelegate();

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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_AS_USAGE__IS_IMPLIED, oldIsImplied, isImplied));
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getRelatedFeature() {
		return (EList<Feature>)RELATED_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Association> getAssociation() {
		return (EList<Association>)ASSOCIATION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getConnectorEnd() {
		return (EList<Feature>)CONNECTOR_END__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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
		return (Feature)SOURCE_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSourceFeature() {
		return (Feature)SOURCE_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceFeature(Feature newSourceFeature) {
		SOURCE_FEATURE__ESETTING_DELEGATE.dynamicSet(this, null, 0, newSourceFeature);
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
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getTargetFeature() {
		return (EList<Feature>)TARGET_FEATURE__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
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

	// Additional overrides	
	
	@Override
	public boolean isComposite() {
		return false;
	}
	
	//

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
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT:
				return getOwnedRelatedElement();
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement();
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT:
				return getRelatedElement();
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET:
				return getTarget();
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE:
				return getSource();
			case SysMLPackage.CONNECTOR_AS_USAGE__IS_IMPLIED:
				return isImplied();
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE:
				return getRelatedFeature();
			case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION:
				return getAssociation();
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
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT:
				getRelatedElement().clear();
				getRelatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET:
				getTarget().clear();
				getTarget().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__IS_IMPLIED:
				setIsImplied((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE:
				getRelatedFeature().clear();
				getRelatedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION:
				getAssociation().clear();
				getAssociation().addAll((Collection<? extends Association>)newValue);
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
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT:
				getRelatedElement().clear();
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET:
				getTarget().clear();
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE:
				getSource().clear();
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__IS_IMPLIED:
				setIsImplied(IS_IMPLIED_EDEFAULT);
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE:
				getRelatedFeature().clear();
				return;
			case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION:
				getAssociation().clear();
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
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT:
				return ownedRelatedElement != null && !ownedRelatedElement.isEmpty();
			case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT:
				return isSetRelatedElement();
			case SysMLPackage.CONNECTOR_AS_USAGE__TARGET:
				return isSetTarget();
			case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE:
				return isSetSource();
			case SysMLPackage.CONNECTOR_AS_USAGE__IS_IMPLIED:
				return isImplied != IS_IMPLIED_EDEFAULT;
			case SysMLPackage.CONNECTOR_AS_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.CONNECTOR_AS_USAGE__END_FEATURE:
				return isSetEndFeature();
			case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE:
				return isSetRelatedFeature();
			case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION:
				return isSetAssociation();
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
				case SysMLPackage.CONNECTOR_AS_USAGE__IS_IMPLIED: return SysMLPackage.RELATIONSHIP__IS_IMPLIED;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE: return SysMLPackage.CONNECTOR__RELATED_FEATURE;
				case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION: return SysMLPackage.CONNECTOR__ASSOCIATION;
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
				case SysMLPackage.RELATIONSHIP__IS_IMPLIED: return SysMLPackage.CONNECTOR_AS_USAGE__IS_IMPLIED;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (baseFeatureID) {
				case SysMLPackage.CONNECTOR__RELATED_FEATURE: return SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE;
				case SysMLPackage.CONNECTOR__ASSOCIATION: return SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION;
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
		result.append(" (isImplied: ");
		result.append(isImplied);
		result.append(')');
		return result.toString();
	}

} //ConnectorAsUsageImpl
