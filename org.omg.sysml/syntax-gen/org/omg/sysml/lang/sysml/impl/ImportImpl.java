/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.VisibilityKind;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Import</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#isRecursive <em>Is Recursive</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getImportOwningNamespace <em>Import Owning Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends RelationshipImpl implements Import {
	/**
	 * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedNamespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace importedNamespace;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRecursive() <em>Is Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecursive()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_RECURSIVE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRecursive() <em>Is Recursive</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRecursive()
	 * @generated
	 * @ordered
	 */
	protected boolean isRecursive = IS_RECURSIVE_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.IMPORT;
	}
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(VisibilityKind newVisibility) {
		VisibilityKind oldVisibility = visibility;
		visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__VISIBILITY, oldVisibility, visibility));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRecursive() {
		return isRecursive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsRecursive(boolean newIsRecursive) {
		boolean oldIsRecursive = isRecursive;
		isRecursive = newIsRecursive;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__IS_RECURSIVE, oldIsRecursive, isRecursive));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getImportOwningNamespace() {
		if (eContainerFeatureID() != SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE) return null;
		return (Namespace)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportOwningNamespace(Namespace newImportOwningNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportOwningNamespace, SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportOwningNamespace(Namespace newImportOwningNamespace) {
		if (newImportOwningNamespace != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE && newImportOwningNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newImportOwningNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportOwningNamespace != null)
				msgs = ((InternalEObject)newImportOwningNamespace).eInverseAdd(this, SysMLPackage.NAMESPACE__OWNED_IMPORT_COMP, Namespace.class, msgs);
			msgs = basicSetImportOwningNamespace(newImportOwningNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE, newImportOwningNamespace, newImportOwningNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportOwningNamespace() {
		return getImportOwningNamespace() != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Namespace importedNamespace = getImportedNamespace();
		if (importedNamespace != null) {
			target.add(importedNamespace);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(), target.toArray());
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
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.IMPORT__IMPORTED_NAMESPACE};

	@Override
	public Namespace getImportedNamespace() {
		return importedNamespace == null? basicGetImportedNamespace(): getImportedNamespaceGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getImportedNamespaceGen() {
		if (importedNamespace != null && importedNamespace.eIsProxy()) {
			InternalEObject oldImportedNamespace = (InternalEObject)importedNamespace;
			importedNamespace = (Namespace)eResolveProxy(oldImportedNamespace);
			if (importedNamespace != oldImportedNamespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
			}
		}
		return importedNamespace;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Namespace basicGetImportedNamespace() {
		if (importedNamespace == null) {
			EList<Element> ownedRelatedElement = getOwnedRelatedElement();
			if (!ownedRelatedElement.isEmpty() && ownedRelatedElement.get(0) instanceof Namespace) {
				// Fill in the implicit import for a filter package.
				importedNamespace = (Namespace)ownedRelatedElement.get(0);
			} else {
				Namespace owningNamespace = getImportOwningNamespace();
				if (owningNamespace instanceof TransitionUsage) {
					// Fill in the empty import inserted into a trigger usage in order to make the namespace
					// of the trigger action visible.
					EList<? extends Namespace> triggers = ((TransitionUsage)owningNamespace).getTriggerAction();
					if (!triggers.isEmpty()) {
						importedNamespace = triggers.get(0);
					}
				}
			}
		}
		return importedNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setImportedNamespace(Namespace newImportedNamespace) {
		Namespace oldImportedNamespace = importedNamespace;
		importedNamespace = newImportedNamespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__IMPORTED_NAMESPACE, oldImportedNamespace, importedNamespace));
//		Resource.Internal eInternalResource = eInternalResource();
//		if (eInternalResource == null || !eInternalResource.isLoading()) {
//			if (newImportedNamespace != null) {
//				EList<Element> target = getTarget();
//				if (!target.contains(newImportedNamespace)) {
//					target.add(newImportedNamespace);
//				}
//			}
//		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		return getImportOwningNamespace();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof Namespace)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of Namespace");
		}
		return basicSetImportOwningNamespace((Namespace) newOwningRelatedElement, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof Namespace)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of Namespace");
		}
		setImportOwningNamespace((Namespace) newOwningRelatedElement);
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
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Namespace importOwningNamespace = getImportOwningNamespace();
		if (importOwningNamespace != null) {
			source.add(importOwningNamespace);
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

	// Operations

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	@Override
	public EList<Membership> importedMembership() {
		return this.importMembership(new BasicInternalEList<Membership>(Membership.class), null,
				new HashSet<Namespace>(), new HashSet<Type>());
	}

	// Note: The excludedType parameter is needed in case the imported Namespace
	// is a Type that has one or more Generalizations.
	public EList<Membership> importMembership(EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes) {
		Namespace importedNamespace = this.getImportedNamespace();
		if (importedNamespace != null && !excludedNamespaces.contains(importedNamespace)) {
			Namespace owningNamespace = this.getImportOwningNamespace();
			excludedNamespaces.add(owningNamespace);
			importMembershipFrom(importedNamespace, importedMembership, nonpublicMembership, 
					excludedNamespaces, excludedTypes, this.isRecursive);
			excludedNamespaces.remove(owningNamespace);
		}
		return importedMembership;
	}
	
	protected void importMembershipFrom(Namespace importedNamespace, EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes, boolean isRecursive) {
		EList<Membership> namespaceMembership = 
				((NamespaceImpl) importedNamespace).getPublicMembership(excludedNamespaces, excludedTypes);
		importedMembership.addAll(namespaceMembership);
		if (nonpublicMembership != null && !VisibilityKind.PUBLIC.equals(this.getVisibility())) {
			nonpublicMembership.addAll(namespaceMembership);
		}
		if (isRecursive) {
			excludedNamespaces.add(importedNamespace);
			for (Membership membership: namespaceMembership) {
				Element ownedMember = membership.getOwnedMemberElement();
				if (ownedMember instanceof Namespace) {
					importMembershipFrom((Namespace)ownedMember, importedMembership, nonpublicMembership, 
							excludedNamespaces, excludedTypes, true);
				}
			}
			excludedNamespaces.remove(importedNamespace);
		}
	}

	//
	
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportOwningNamespace((Namespace)otherEnd, msgs);
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
			case SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE:
				return basicSetImportOwningNamespace(null, msgs);
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
			case SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.NAMESPACE__OWNED_IMPORT_COMP, Namespace.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.IMPORT__IMPORTED_NAMESPACE:
				if (resolve) return getImportedNamespace();
				return basicGetImportedNamespace();
			case SysMLPackage.IMPORT__VISIBILITY:
				return getVisibility();
			case SysMLPackage.IMPORT__IS_RECURSIVE:
				return isRecursive();
			case SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE:
				return getImportOwningNamespace();
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
			case SysMLPackage.IMPORT__IMPORTED_NAMESPACE:
				setImportedNamespace((Namespace)newValue);
				return;
			case SysMLPackage.IMPORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case SysMLPackage.IMPORT__IS_RECURSIVE:
				setIsRecursive((Boolean)newValue);
				return;
			case SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE:
				setImportOwningNamespace((Namespace)newValue);
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
			case SysMLPackage.IMPORT__IMPORTED_NAMESPACE:
				setImportedNamespace((Namespace)null);
				return;
			case SysMLPackage.IMPORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SysMLPackage.IMPORT__IS_RECURSIVE:
				setIsRecursive(IS_RECURSIVE_EDEFAULT);
				return;
			case SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE:
				setImportOwningNamespace((Namespace)null);
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
			case SysMLPackage.IMPORT__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.IMPORT__SOURCE:
				return isSetSource();
			case SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT:
				return isSetOwningRelatedElement();
			case SysMLPackage.IMPORT__IMPORTED_NAMESPACE:
				return importedNamespace != null;
			case SysMLPackage.IMPORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SysMLPackage.IMPORT__IS_RECURSIVE:
				return isRecursive != IS_RECURSIVE_EDEFAULT;
			case SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE:
				return isSetImportOwningNamespace();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.IMPORT___IMPORTED_MEMBERSHIP:
				return importedMembership();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(", isRecursive: ");
		result.append(isRecursive);
		result.append(')');
		return result.toString();
	}

} // ImportImpl
