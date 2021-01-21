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
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.ElementFilterMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedMembership_comp <em>Owned Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedImport_comp <em>Owned Import comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getImportedMembership <em>Imported Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedMembership <em>Owned Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.NamespaceImpl#getOwnedImport <em>Owned Import</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NamespaceImpl extends ElementImpl implements Namespace {
	/**
	 * The cached value of the '{@link #getOwnedMembership_comp() <em>Owned Membership comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> ownedMembership_comp;
	/**
	 * The cached value of the '{@link #getOwnedImport_comp() <em>Owned Import comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedImport_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> ownedImport_comp;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membership> getMembership() {
		return new DerivedUnionEObjectEList<Membership>(Membership.class, this, SysMLPackage.NAMESPACE__MEMBERSHIP, MEMBERSHIP_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembership() <em>Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBERSHIP_ESUBSETS = new int[] {SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP, SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship_comp() {
		if (ownedRelationship_comp == null) {
			ownedRelationship_comp = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP_COMP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Import> getOwnedImport_comp() {
		if (ownedImport_comp == null) {
			ownedImport_comp = new EObjectContainmentWithInverseEList<Import>(Import.class, this, SysMLPackage.NAMESPACE__OWNED_IMPORT_COMP, SysMLPackage.IMPORT__IMPORT_OWNING_NAMESPACE);
		}
		return ownedImport_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> getMember() {
		EList<Element> members = new NonNotifyingEObjectEList<>(Element.class, this, SysMLPackage.NAMESPACE__MEMBER);
		getMembership().stream().
			map(Membership::getMemberElement).
			filter(m->m != null).forEachOrdered(members::add);	
		return members;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Import> getOwnedImport() {
		EList<Import> ownedImports = new NonNotifyingEObjectEList<>(Element.class, this, SysMLPackage.NAMESPACE__OWNED_IMPORT);
		ownedImports.addAll(getOwnedImport_comp());
		return ownedImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> getOwnedMember() {
		EList<Element> ownedMembers = new NonNotifyingEObjectEList<>(Element.class, this, SysMLPackage.NAMESPACE__OWNED_MEMBER);
		for (Membership membership: this.getOwnedMembership()) {
			Element element = membership.getOwnedMemberElement();
			if (element != null) {
				ownedMembers.add(element);
			}
		}
		return ownedMembers;
	}
	
	private EList<Membership> importedMembership = null;

	@Override
	public void clearCaches() {
		importedMembership = null;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Membership> getImportedMembership() {
		if (importedMembership == null) {
			importedMembership = this.getImportedMembership(new HashSet<org.omg.sysml.lang.sysml.Namespace>(), new HashSet<Type>(), false);
//			System.out.println("Caching importedMembership for " + this);
		}
		return importedMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membership> getOwnedMembership_comp() {
		if (ownedMembership_comp == null) {
			ownedMembership_comp = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE);
		}
		return ownedMembership_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Membership> getOwnedMembership() {
		EList<Membership> ownedMemberships = new NonNotifyingEObjectEList<>(Membership.class, this, SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP);
		ownedMemberships.addAll(getOwnedMembership_comp());
		return ownedMemberships;
	}
	
	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedMembership() <em>Owned Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBERSHIP_ESUPERSETS = new int[] {SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP_COMP};
	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedImport() <em>Owned Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedImport()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_IMPORT_ESUPERSETS = new int[] {SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP_COMP};

	// Additional subsets
	
	@Override
	public EList<Relationship> getOwnedRelationship() {
		EList<Relationship> ownedRelationships = super.getOwnedRelationship();
		ownedRelationships.addAll(getOwnedImport());
		ownedRelationships.addAll(getOwnedMembership());
		return ownedRelationships;
	}

	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<String> namesOf(Element element) {
		EList<String> names = new EDataTypeEList<>(String.class, this, SysMLPackage.NAMESPACE___NAMES_OF__ELEMENT);
		getMembership().stream().
			filter(mem->mem.getMemberElement() == element).
			map(Membership::getMemberName).
			forEachOrdered(names::add);
		return names;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Membership> excludeCollisions(EList<Membership> mem) {
		for (int i = 0; i < mem.size(); i++) {
			String name1 = mem.get(i).getMemberName();
			boolean isCollision = false;
			for (int j = i + 1; j < mem.size(); j++) {
				String name2 = mem.get(j).getMemberName();
				if (name1 == null? name2 == null: name1.equals(name2)) {
					isCollision = true;
					mem.remove(j);
					j--;
				}
			}
			if (isCollision) {
				mem.remove(i);
				i--;
			}
		}
		return mem;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Membership> publicMemberships() {
		return getPublicMembership(new HashSet<org.omg.sysml.lang.sysml.Namespace>(), new HashSet<Type>());
	}
	
	/**
	 * The cached OCL expression body for the '{@link #importedMemberships() <em>Imported Memberships</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #importedMemberships()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORTED_MEMBERSHIPS__EOCL_EXP = "excludeCollisions(ownedImport.importedMembership())->"+
"    select(m1 | ownedMembership->forAll(m2 | m1.isDistinguishableFrom(m2)))";
	/**
	 * The cached OCL query for the '{@link #importedMemberships() <em>Imported Memberships</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #importedMemberships()
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IMPORTED_MEMBERSHIPS__EOCL_QRY;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> importedMemberships() {
		if (IMPORTED_MEMBERSHIPS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(SysMLPackage.Literals.NAMESPACE, SysMLPackage.Literals.NAMESPACE.getEAllOperations().get(3));
			try {
				IMPORTED_MEMBERSHIPS__EOCL_QRY = helper.createQuery(IMPORTED_MEMBERSHIPS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(IMPORTED_MEMBERSHIPS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Membership> result = (Collection<Membership>) query.evaluate(this);
		return new BasicEList.UnmodifiableEList<Membership>(result.size(), result.toArray());
	}

	// Note: The excludedTypes parameter is need when this operation is overridden in class Type.
	public EList<Membership> getPublicMembership(Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes) {
		EList<Membership> publicMembership = getVisibleOwnedMembership(VisibilityKind.PUBLIC);
		publicMembership.addAll(this.getImportedMembership(excludedNamespaces, excludedTypes, true));
		return publicMembership;
	}

	public EList<Membership> getVisibleOwnedMembership(VisibilityKind visibility) {
		EList<Membership> publicMembership = new BasicInternalEList<Membership>(Membership.class);
		publicMembership.addAll(getOwnedMembership().stream().
				filter(membership->visibility.equals(membership.getVisibility())).collect(Collectors.toList()));
		return publicMembership;
	}

	public EList<Membership> getImportedMembership(Collection<org.omg.sysml.lang.sysml.Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean onlyPublic) {
		EList<Membership> importedMembership = new NonNotifyingEObjectEList<>(Membership.class, this, SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP);
		Collection<Membership> nonpublicMembership = onlyPublic? new HashSet<Membership>(): null;
		for (Import _import: this.getOwnedImport()) {
			if (!excludedNamespaces.contains(_import.getImportOwningNamespace())) {
				((ImportImpl)_import).importMembership(importedMembership, nonpublicMembership, excludedNamespaces, excludedTypes);
			}
		}
		this.excludeCollisions(importedMembership);
		EList<Membership> ownedMembership = this.getOwnedMembership();
		for (int i = 0; i < importedMembership.size(); i++) {
			Membership m1 = importedMembership.get(i);
			for (Membership m2: ownedMembership) {
				if (!m1.isDistinguishableFrom(m2)) {
					importedMembership.remove(i);
					i--;
					break;
				}
			}
		}
		if (onlyPublic) {
			importedMembership.removeAll(nonpublicMembership);
		}
		return importedMembership;
	}
	
	// Utility Methods
	
	public Membership addOwnedMember(Element element) {
		Membership membership = SysMLFactory.eINSTANCE.createMembership();
		membership.setOwnedMemberElement_comp(element);
		getOwnedMembership_comp().add(membership);
		return membership;
	}
	
	public <M extends Membership, T> Stream<T> getOwnedMembersByMembership(Class<M> kind, Class<T> type) {
		return getOwnedMembership().stream().
				filter(kind::isInstance).
				map(Membership::getMemberElement).map(type::cast);
	}
	
	public Stream<Expression> getElementFilters() {
		return getOwnedMembersByMembership(ElementFilterMembership.class, Expression.class);
	}
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.NAMESPACE__MEMBERSHIP:
				return getMembership();
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP:
				return getOwnedMembership_comp();
			case SysMLPackage.NAMESPACE__OWNED_MEMBER:
				return getOwnedMember();
			case SysMLPackage.NAMESPACE__OWNED_IMPORT_COMP:
				return getOwnedImport_comp();
			case SysMLPackage.NAMESPACE__MEMBER:
				return getMember();
			case SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP:
				return getImportedMembership();
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
				return getOwnedMembership();
			case SysMLPackage.NAMESPACE__OWNED_IMPORT:
				return getOwnedImport();
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
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP:
				getOwnedMembership_comp().clear();
				getOwnedMembership_comp().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.NAMESPACE__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.NAMESPACE__OWNED_IMPORT_COMP:
				getOwnedImport_comp().clear();
				getOwnedImport_comp().addAll((Collection<? extends Import>)newValue);
				return;
			case SysMLPackage.NAMESPACE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				getImportedMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
				getOwnedMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.NAMESPACE__OWNED_IMPORT:
				getOwnedImport().clear();
				getOwnedImport().addAll((Collection<? extends Import>)newValue);
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
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP:
				getOwnedMembership_comp().clear();
				return;
			case SysMLPackage.NAMESPACE__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case SysMLPackage.NAMESPACE__OWNED_IMPORT_COMP:
				getOwnedImport_comp().clear();
				return;
			case SysMLPackage.NAMESPACE__MEMBER:
				getMember().clear();
				return;
			case SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				return;
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
				return;
			case SysMLPackage.NAMESPACE__OWNED_IMPORT:
				getOwnedImport().clear();
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
			case SysMLPackage.NAMESPACE__MEMBERSHIP:
				return isSetMembership();
			case SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP_COMP:
				return ownedRelationship_comp != null && !ownedRelationship_comp.isEmpty();
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP:
				return ownedMembership_comp != null && !ownedMembership_comp.isEmpty();
			case SysMLPackage.NAMESPACE__OWNED_MEMBER:
				return !getOwnedMember().isEmpty();
			case SysMLPackage.NAMESPACE__OWNED_IMPORT_COMP:
				return ownedImport_comp != null && !ownedImport_comp.isEmpty();
			case SysMLPackage.NAMESPACE__MEMBER:
				return !getMember().isEmpty();
			case SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP:
				return !getImportedMembership().isEmpty();
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
				return !getOwnedMembership().isEmpty();
			case SysMLPackage.NAMESPACE__OWNED_IMPORT:
				return !getOwnedImport().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.NAMESPACE___NAMES_OF__ELEMENT:
				return namesOf((Element)arguments.get(0));
			case SysMLPackage.NAMESPACE___EXCLUDE_COLLISIONS__ELIST:
				return excludeCollisions((EList<Membership>)arguments.get(0));
			case SysMLPackage.NAMESPACE___PUBLIC_MEMBERSHIPS:
				return publicMemberships();
			case SysMLPackage.NAMESPACE___IMPORTED_MEMBERSHIPS:
				return importedMemberships();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMembership_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.NAMESPACE__OWNED_IMPORT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedImport_comp()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.NAMESPACE__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<?>)getOwnedRelationship_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<?>)getOwnedMembership_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.NAMESPACE__OWNED_IMPORT_COMP:
				return ((InternalEList<?>)getOwnedImport_comp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembership() {
		return eIsSet(SysMLPackage.NAMESPACE__IMPORTED_MEMBERSHIP)
			|| eIsSet(SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP);
	}

} //NamespaceImpl
