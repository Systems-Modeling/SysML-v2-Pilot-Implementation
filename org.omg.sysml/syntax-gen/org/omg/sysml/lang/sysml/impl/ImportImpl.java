/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Import</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getSelecter <em>Selecter</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getImportOwningPackage <em>Import Owning Package</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends RelationshipImpl implements Import {
	/**
	 * The cached value of the '{@link #getImportedPackage() <em>Imported Package</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedPackage()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Package importedPackage;

	/**
	 * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected static final VisibilityKind VISIBILITY_EDEFAULT = VisibilityKind.PUBLIC;

	/**
	 * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVisibility()
	 * @generated
	 * @ordered
	 */
	protected VisibilityKind visibility = VISIBILITY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ImportImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.IMPORT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package getImportedPackage() {
		if (importedPackage != null && importedPackage.eIsProxy()) {
			InternalEObject oldImportedPackage = (InternalEObject)importedPackage;
			importedPackage = (org.omg.sysml.lang.sysml.Package)eResolveProxy(oldImportedPackage);
			if (importedPackage != oldImportedPackage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
			}
		}
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Package basicGetImportedPackage() {
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportedPackage(org.omg.sysml.lang.sysml.Package newImportedPackage) {
		org.omg.sysml.lang.sysml.Package oldImportedPackage = importedPackage;
		importedPackage = newImportedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newImportedPackage != null) {
				EList<Element> target = getTarget();
				if (!target.contains(newImportedPackage)) {
					target.add(newImportedPackage);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getSelecter() {
		Predicate selecter = basicGetSelecter();
		return selecter != null && selecter.eIsProxy() ? (Predicate)eResolveProxy((InternalEObject)selecter) : selecter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Predicate basicGetSelecter() {
		return getFirstOwnedRelatedElement(Predicate.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSelecter(Predicate newSelecter) {
		// TODO: implement this method to set the 'Selecter' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	public org.omg.sysml.lang.sysml.Package getImportOwningPackage() {
		org.omg.sysml.lang.sysml.Package importOwningPackage = basicGetImportOwningPackage();
		return importOwningPackage != null && importOwningPackage.eIsProxy() ? (org.omg.sysml.lang.sysml.Package)eResolveProxy((InternalEObject)importOwningPackage) : importOwningPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public org.omg.sysml.lang.sysml.Package basicGetImportOwningPackage() {
		return getOwningRelatedElement(org.omg.sysml.lang.sysml.Package.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setImportOwningPackage(org.omg.sysml.lang.sysml.Package newImportOwningPackage) {
		// TODO: implement this method to set the 'Import Owning Package' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportOwningPackage() {
		return basicGetImportOwningPackage() != null;
	}
	
	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Membership> importedMembership() {
		return this.importMembership(new BasicInternalEList<Membership>(Membership.class), null, new HashSet<org.omg.sysml.lang.sysml.Package>(), new HashSet<Category>());
	}
	
	// Note: The excludedCategories parameter is needed in case the imported Package is a Category that has one or more Generalizations.
	public EList<Membership> importMembership(EList<Membership> importedMembership, Collection<Membership> nonpublicMembership, Collection<org.omg.sysml.lang.sysml.Package> excludedPackages, Collection<Category> excludedCategories) {
		// TODO Implement predicate-based selection of importMembership.
		org.omg.sysml.lang.sysml.Package importedPackage = this.getImportedPackage();
		if (importedPackage != null && !excludedPackages.contains(importedPackage)) {
			org.omg.sysml.lang.sysml.Package owningPackage = this.getImportOwningPackage();
			excludedPackages.add(owningPackage);
			EList<Membership> packageMembership = ((PackageImpl)importedPackage).getPublicMembership(excludedPackages, excludedCategories);
			importedMembership.addAll(packageMembership);
			if (nonpublicMembership != null && !VisibilityKind.PUBLIC.equals(this.getVisibility())) {
				nonpublicMembership.addAll(packageMembership);
			}
			excludedPackages.remove(owningPackage);
		}
		return importedMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				if (resolve) return getImportedPackage();
				return basicGetImportedPackage();
			case SysMLPackage.IMPORT__SELECTER:
				if (resolve) return getSelecter();
				return basicGetSelecter();
			case SysMLPackage.IMPORT__VISIBILITY:
				return getVisibility();
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				if (resolve) return getImportOwningPackage();
				return basicGetImportOwningPackage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((org.omg.sysml.lang.sysml.Package)newValue);
				return;
			case SysMLPackage.IMPORT__SELECTER:
				setSelecter((Predicate)newValue);
				return;
			case SysMLPackage.IMPORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				setImportOwningPackage((org.omg.sysml.lang.sysml.Package)newValue);
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
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((org.omg.sysml.lang.sysml.Package)null);
				return;
			case SysMLPackage.IMPORT__SELECTER:
				setSelecter((Predicate)null);
				return;
			case SysMLPackage.IMPORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				setImportOwningPackage((org.omg.sysml.lang.sysml.Package)null);
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
			case SysMLPackage.IMPORT__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.IMPORT__SOURCE:
				return isSetSource();
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				return importedPackage != null;
			case SysMLPackage.IMPORT__SELECTER:
				return basicGetSelecter() != null;
			case SysMLPackage.IMPORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				return isSetImportOwningPackage();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.IMPORT__TARGET);
		// NOTE: The "importedPackage" object must NOT be resolved here, in order to avoid Xtext lazy linking errors.
		Element importedPackage = basicGetImportedPackage();
		if (importedPackage != null) {
			target.add(importedPackage);
		}
		return target;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.IMPORT__IMPORTED_PACKAGE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		org.omg.sysml.lang.sysml.Package importOwningPackage = getImportOwningPackage();
		if (importOwningPackage != null) {
			source.add(importOwningPackage);
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

} //ImportImpl
