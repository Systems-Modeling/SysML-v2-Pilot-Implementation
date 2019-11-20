/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.DerivedUnionEObjectEList;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getOwnedImport_comp <em>Owned Import comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getOwnedMembership_comp <em>Owned Membership comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getImportedMembership <em>Imported Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getOwnedMembership <em>Owned Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends ElementImpl implements org.omg.sysml.lang.sysml.Package {
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
	 * The cached value of the '{@link #getOwnedMembership_comp() <em>Owned Membership comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> ownedMembership_comp;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PackageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PACKAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Membership> getMembership() {
		return new DerivedUnionEObjectEList<Membership>(Membership.class, this, SysMLPackage.PACKAGE__MEMBERSHIP, MEMBERSHIP_ESUBSETS);
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getMembership() <em>Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] MEMBERSHIP_ESUBSETS = new int[] {SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP, SysMLPackage.PACKAGE__OWNED_MEMBERSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship_comp() {
		if (ownedRelationship_comp == null) {
			ownedRelationship_comp = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.PACKAGE__OWNED_RELATIONSHIP_COMP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
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
			ownedImport_comp = new EObjectContainmentWithInverseEList<Import>(Import.class, this, SysMLPackage.PACKAGE__OWNED_IMPORT_COMP, SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE);
		}
		return ownedImport_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> getMember() {
		EList<Element> members = new EObjectEList<Element>(Element.class, this, SysMLPackage.PACKAGE__MEMBER);
		getMembership().stream().
			map(m->((MembershipImpl)m).getMemberElement()).
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
		EList<Import> ownedImports = new EObjectEList<Import>(Element.class, this, SysMLPackage.PACKAGE__OWNED_IMPORT);
		ownedImports.addAll(getOwnedImport_comp());
		return ownedImports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> getOwnedMember() {
		EList<Element> ownedMembers = new EObjectEList<Element>(Element.class, this, SysMLPackage.PACKAGE__OWNED_MEMBER);
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
			importedMembership = this.getImportedMembership(new HashSet<org.omg.sysml.lang.sysml.Package>(), new HashSet<Type>(), false);
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
			ownedMembership_comp = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP, SysMLPackage.MEMBERSHIP__MEMBERSHIP_OWNING_PACKAGE);
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
		EList<Membership> ownedMemberships = new EObjectEList<Membership>(Membership.class, this, SysMLPackage.PACKAGE__OWNED_MEMBERSHIP);
		ownedMemberships.addAll(getOwnedMembership_comp());
		return ownedMemberships;
	}
	
	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedImport() <em>Owned Import</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedImport()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_IMPORT_ESUPERSETS = new int[] {SysMLPackage.PACKAGE__OWNED_RELATIONSHIP_COMP};
	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedMembership() <em>Owned Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_MEMBERSHIP_ESUPERSETS = new int[] {SysMLPackage.PACKAGE__OWNED_RELATIONSHIP_COMP};

	// Additional subsets
	
	@Override
	public EList<Relationship> getOwnedRelationship() {
		EList<Relationship> ownedRelationships = super.getOwnedRelationship();
		ownedRelationships.addAll(getOwnedMembership());
		ownedRelationships.addAll(getOwnedImport());
		return ownedRelationships;
	}

	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String nameOf(Element element) {
		for (Membership membership: this.getMembership()) {
			if (membership.getMemberElement() == element) {
				return membership.getMemberName();
			}
		}
		return null;
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
		return getPublicMembership(new HashSet<org.omg.sysml.lang.sysml.Package>(), new HashSet<Type>());
	}
	
	// Note: The excludedCategories parameter is need when this operation is overridden in class Type.
	public EList<Membership> getPublicMembership(Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Type> excludedTypes) {
		EList<Membership> publicMembership = this.getImportedMembership(excludedPackages, excludedTypes, true);
		publicMembership.addAll(getVisibleOwnedMembership(VisibilityKind.PUBLIC));
		return publicMembership;
	}

	public EList<Membership> getVisibleOwnedMembership(VisibilityKind visibility) {
		EList<Membership> publicMembership = new BasicInternalEList<Membership>(Membership.class);
		publicMembership.addAll(getOwnedMembership().stream().
				filter(membership->visibility.equals(membership.getVisibility())).collect(Collectors.toList()));
		return publicMembership;
	}

	public EList<Membership> getImportedMembership(Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Type> excludedTypes, boolean onlyPublic) {
		EList<Membership> importedMembership = new EObjectEList<Membership>(Membership.class, this, SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP);
		Collection<Membership> nonpublicMembership = onlyPublic? new HashSet<Membership>(): null;
		for (Import _import: this.getOwnedImport()) {
			if (!excludedPackages.contains(_import.getImportedPackage())) {
				((ImportImpl)_import).importMembership(importedMembership, nonpublicMembership, excludedPackages, excludedTypes);
			}
		}
		this.excludeCollisions(importedMembership);
		EList<Membership> ownedMembership = this.getOwnedMembership();
		for (int i = 0; i < importedMembership.size(); i++) {
			Membership m1 = importedMembership.get(i);
			for (Membership m2: ownedMembership ) {
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
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PACKAGE__MEMBERSHIP:
				return getMembership();
			case SysMLPackage.PACKAGE__OWNED_IMPORT_COMP:
				return getOwnedImport_comp();
			case SysMLPackage.PACKAGE__MEMBER:
				return getMember();
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP:
				return getOwnedMembership_comp();
			case SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP:
				return getImportedMembership();
			case SysMLPackage.PACKAGE__OWNED_MEMBER:
				return getOwnedMember();
			case SysMLPackage.PACKAGE__OWNED_IMPORT:
				return getOwnedImport();
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP:
				return getOwnedMembership();
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
			case SysMLPackage.PACKAGE__OWNED_IMPORT_COMP:
				getOwnedImport_comp().clear();
				getOwnedImport_comp().addAll((Collection<? extends Import>)newValue);
				return;
			case SysMLPackage.PACKAGE__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP:
				getOwnedMembership_comp().clear();
				getOwnedMembership_comp().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				getImportedMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.PACKAGE__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.PACKAGE__OWNED_IMPORT:
				getOwnedImport().clear();
				getOwnedImport().addAll((Collection<? extends Import>)newValue);
				return;
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
				getOwnedMembership().addAll((Collection<? extends Membership>)newValue);
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
			case SysMLPackage.PACKAGE__OWNED_IMPORT_COMP:
				getOwnedImport_comp().clear();
				return;
			case SysMLPackage.PACKAGE__MEMBER:
				getMember().clear();
				return;
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP:
				getOwnedMembership_comp().clear();
				return;
			case SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				return;
			case SysMLPackage.PACKAGE__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case SysMLPackage.PACKAGE__OWNED_IMPORT:
				getOwnedImport().clear();
				return;
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
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
			case SysMLPackage.PACKAGE__MEMBERSHIP:
				return isSetMembership();
			case SysMLPackage.PACKAGE__OWNED_RELATIONSHIP_COMP:
				return ownedRelationship_comp != null && !ownedRelationship_comp.isEmpty();
			case SysMLPackage.PACKAGE__OWNED_IMPORT_COMP:
				return ownedImport_comp != null && !ownedImport_comp.isEmpty();
			case SysMLPackage.PACKAGE__MEMBER:
				return !getMember().isEmpty();
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP:
				return ownedMembership_comp != null && !ownedMembership_comp.isEmpty();
			case SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP:
				return !getImportedMembership().isEmpty();
			case SysMLPackage.PACKAGE__OWNED_MEMBER:
				return !getOwnedMember().isEmpty();
			case SysMLPackage.PACKAGE__OWNED_IMPORT:
				return !getOwnedImport().isEmpty();
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP:
				return !getOwnedMembership().isEmpty();
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
			case SysMLPackage.PACKAGE___NAME_OF__ELEMENT:
				return nameOf((Element)arguments.get(0));
			case SysMLPackage.PACKAGE___EXCLUDE_COLLISIONS__ELIST:
				return excludeCollisions((EList<Membership>)arguments.get(0));
			case SysMLPackage.PACKAGE___PUBLIC_MEMBERSHIPS:
				return publicMemberships();
		}
		return super.eInvoke(operationID, arguments);
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
			case SysMLPackage.PACKAGE__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.PACKAGE__OWNED_IMPORT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedImport_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMembership_comp()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.PACKAGE__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<?>)getOwnedRelationship_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.PACKAGE__OWNED_IMPORT_COMP:
				return ((InternalEList<?>)getOwnedImport_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP_COMP:
				return ((InternalEList<?>)getOwnedMembership_comp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMembership() {
		return eIsSet(SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP)
			|| eIsSet(SysMLPackage.PACKAGE__OWNED_MEMBERSHIP);
	}

} //PackageImpl
