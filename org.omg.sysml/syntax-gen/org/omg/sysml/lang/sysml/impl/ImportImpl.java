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
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.lang.sysml.util.SysMLScopeUtil;
import org.omg.sysml.util.ElementUtil;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Import</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getImportedMemberName <em>Imported Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#isRecursive <em>Is Recursive</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#isImportAll <em>Is Import All</em>}</li>
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
	 * The default value of the '{@link #getImportedMemberName() <em>Imported Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMemberName()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_MEMBER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportedMemberName() <em>Imported Member Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMemberName()
	 * @generated
	 * @ordered
	 */
	protected String importedMemberName = IMPORTED_MEMBER_NAME_EDEFAULT;

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
	 * The default value of the '{@link #isImportAll() <em>Is Import All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImportAll()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMPORT_ALL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImportAll() <em>Is Import All</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImportAll()
	 * @generated
	 * @ordered
	 */
	protected boolean isImportAll = IS_IMPORT_ALL_EDEFAULT;

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
	public String getImportedMemberName() {
		return importedMemberName;
	}
	
	@Override
	public void setImportedMemberName(String newImportedMemberName) {
		setImportedMemberNameGen(ElementUtil.unescapeString(newImportedMemberName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportedMemberNameGen(String newImportedMemberName) {
		String oldImportedMemberName = importedMemberName;
		importedMemberName = newImportedMemberName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__IMPORTED_MEMBER_NAME, oldImportedMemberName, importedMemberName));
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
	public boolean isImportAll() {
		return isImportAll;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsImportAll(boolean newIsImportAll) {
		boolean oldIsImportAll = isImportAll;
		isImportAll = newIsImportAll;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__IS_IMPORT_ALL, oldIsImportAll, isImportAll));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getImportOwningNamespace() {
		Namespace importOwningNamespace = basicGetImportOwningNamespace();
		return importOwningNamespace != null && importOwningNamespace.eIsProxy() ? (Namespace)eResolveProxy((InternalEObject)importOwningNamespace) : importOwningNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Namespace basicGetImportOwningNamespace() {
		Element owningRelatedElement = super.getOwningRelatedElement();
		return owningRelatedElement instanceof Namespace? (Namespace)owningRelatedElement: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setImportOwningNamespace(Namespace newImportOwningNamespace) {
		super.basicSetOwningRelatedElement(newImportOwningNamespace, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportOwningNamespace() {
		return basicGetImportOwningNamespace() != null;
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

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
				importedNamespace = getImportOwningNamespace();
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportedNamespace() {
		return importedNamespace != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		if (eContainerFeatureID() != SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningRelatedElement, SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT && newOwningRelatedElement != null)) {
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
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT, newOwningRelatedElement, newOwningRelatedElement));
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Membership> importedMembership(EList<Namespace> excluded) {
		return this.importMembership(new BasicInternalEList<Membership>(Membership.class), null,
				excluded, new HashSet<Type>());
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
			importMembershipFrom(importedNamespace, importedMemberName, importedMembership, nonpublicMembership, 
					excludedNamespaces, excludedTypes, isRecursive);
			excludedNamespaces.remove(owningNamespace);
		}
		return importedMembership;
	}
	
	protected void importMembershipFrom(Namespace importedNamespace, String importedMemberName, EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<Namespace> excludedNamespaces,
			Collection<Type> excludedTypes, boolean isRecursive) {
		Collection<Membership> namespaceMembership = importedMemberName == null? 
				((NamespaceImpl) importedNamespace).getVisibleMembership(excludedNamespaces, excludedTypes, isImportAll):
				SysMLScopeUtil.getMembershipsFor(this, SysMLPackage.eINSTANCE.getImport_ImportOwningNamespace(), importedMemberName);
		importedMembership.addAll(namespaceMembership);
		if (nonpublicMembership != null && !VisibilityKind.PUBLIC.equals(this.getVisibility())) {
			nonpublicMembership.addAll(namespaceMembership);
		}
		if (isRecursive) {
			excludedNamespaces.add(importedNamespace);
			for (Membership membership: namespaceMembership) {
				Element member = importedMemberName == null? membership.getOwnedMemberElement(): membership.getMemberElement();
				if (member instanceof Namespace) {
					importMembershipFrom((Namespace)member, null, importedMembership, nonpublicMembership, 
							excludedNamespaces, excludedTypes, true);
				}
			}
			excludedNamespaces.remove(importedNamespace);
		}
	}
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT:
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
			case SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_RELATIONSHIP, Element.class, msgs);
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
			case SysMLPackage.IMPORT__IMPORTED_MEMBER_NAME:
				return getImportedMemberName();
			case SysMLPackage.IMPORT__IS_RECURSIVE:
				return isRecursive();
			case SysMLPackage.IMPORT__IS_IMPORT_ALL:
				return isImportAll();
			case SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE:
				if (resolve) return getImportOwningNamespace();
				return basicGetImportOwningNamespace();
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
			case SysMLPackage.IMPORT__IMPORTED_MEMBER_NAME:
				setImportedMemberName((String)newValue);
				return;
			case SysMLPackage.IMPORT__IS_RECURSIVE:
				setIsRecursive((Boolean)newValue);
				return;
			case SysMLPackage.IMPORT__IS_IMPORT_ALL:
				setIsImportAll((Boolean)newValue);
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
			case SysMLPackage.IMPORT__IMPORTED_MEMBER_NAME:
				setImportedMemberName(IMPORTED_MEMBER_NAME_EDEFAULT);
				return;
			case SysMLPackage.IMPORT__IS_RECURSIVE:
				setIsRecursive(IS_RECURSIVE_EDEFAULT);
				return;
			case SysMLPackage.IMPORT__IS_IMPORT_ALL:
				setIsImportAll(IS_IMPORT_ALL_EDEFAULT);
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
			case SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT:
				return getOwningRelatedElement() != null;
			case SysMLPackage.IMPORT__TARGET:
				return isSetTarget();
			case SysMLPackage.IMPORT__SOURCE:
				return isSetSource();
			case SysMLPackage.IMPORT__IMPORTED_NAMESPACE:
				return isSetImportedNamespace();
			case SysMLPackage.IMPORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SysMLPackage.IMPORT__IMPORTED_MEMBER_NAME:
				return IMPORTED_MEMBER_NAME_EDEFAULT == null ? importedMemberName != null : !IMPORTED_MEMBER_NAME_EDEFAULT.equals(importedMemberName);
			case SysMLPackage.IMPORT__IS_RECURSIVE:
				return isRecursive != IS_RECURSIVE_EDEFAULT;
			case SysMLPackage.IMPORT__IS_IMPORT_ALL:
				return isImportAll != IS_IMPORT_ALL_EDEFAULT;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.IMPORT___IMPORTED_MEMBERSHIP__ELIST:
				return importedMembership((EList<Namespace>)arguments.get(0));
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
		result.append(", importedMemberName: ");
		result.append(importedMemberName);
		result.append(", isRecursive: ");
		result.append(isRecursive);
		result.append(", isImportAll: ");
		result.append(isImportAll);
		result.append(')');
		return result.toString();
	}

} // ImportImpl
