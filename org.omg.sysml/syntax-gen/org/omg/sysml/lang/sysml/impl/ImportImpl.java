/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectResolvingEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.VisibilityKind;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Import</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getOwnedRelatedElement_comp <em>Owned Related Element comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getImportedPackage <em>Imported Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getSelecter_comp <em>Selecter comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getImportOwningPackage <em>Import Owning Package</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getSelecter <em>Selecter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ImportImpl extends RelationshipImpl implements Import {
	/**
	 * The cached value of the '{@link #getImportedPackage() <em>Imported Package</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getImportedPackage()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Package importedPackage;

	/**
	 * The cached value of the '{@link #getSelecter_comp() <em>Selecter comp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelecter_comp()
	 * @generated
	 * @ordered
	 */
	protected Predicate selecter_comp;

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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Package basicGetImportedPackage() {
		return importedPackage;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
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
	public Predicate getSelecter_comp() {
		return selecter_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSelecter_comp(Predicate newSelecter_comp, NotificationChain msgs) {
		Predicate oldSelecter_comp = selecter_comp;
		selecter_comp = newSelecter_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__SELECTER_COMP, oldSelecter_comp, newSelecter_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSelecter_comp(Predicate newSelecter_comp) {
		if (newSelecter_comp != selecter_comp) {
			NotificationChain msgs = null;
			if (selecter_comp != null)
				msgs = ((InternalEObject)selecter_comp).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.IMPORT__SELECTER_COMP, null, msgs);
			if (newSelecter_comp != null)
				msgs = ((InternalEObject)newSelecter_comp).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SysMLPackage.IMPORT__SELECTER_COMP, null, msgs);
			msgs = basicSetSelecter_comp(newSelecter_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__SELECTER_COMP, newSelecter_comp, newSelecter_comp));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Predicate getSelecter() {
		Predicate selecter = basicGetSelecter();
		return selecter != null && selecter.eIsProxy() ? (Predicate)eResolveProxy((InternalEObject)selecter) : selecter;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Predicate basicGetSelecter() {
		return this.getSelecter_comp();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSelecter(Predicate newSelecter) {
		throw new UnsupportedOperationException();
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
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public org.omg.sysml.lang.sysml.Package getImportOwningPackage() {
		if (eContainerFeatureID() != SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE) return null;
		return (org.omg.sysml.lang.sysml.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportOwningPackage(org.omg.sysml.lang.sysml.Package newImportOwningPackage,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportOwningPackage, SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setImportOwningPackage(org.omg.sysml.lang.sysml.Package newImportOwningPackage) {
		if (newImportOwningPackage != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE && newImportOwningPackage != null)) {
			if (EcoreUtil.isAncestor(this, newImportOwningPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportOwningPackage != null)
				msgs = ((InternalEObject)newImportOwningPackage).eInverseAdd(this, SysMLPackage.PACKAGE__OWNED_IMPORT_COMP, org.omg.sysml.lang.sysml.Package.class, msgs);
			msgs = basicSetImportOwningPackage(newImportOwningPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE, newImportOwningPackage, newImportOwningPackage));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportOwningPackage() {
		return getImportOwningPackage() != null;
	}
	
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = getTargetGen();
		org.omg.sysml.lang.sysml.Package importedPackage = getImportedPackage();
		if (importedPackage != null && !target.contains(importedPackage)) {
			target.add(importedPackage);
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getTargetGen() {
		if (target == null) {
			target = new SubsetSupersetEObjectResolvingEList<Element>(Element.class, this, SysMLPackage.IMPORT__TARGET, null, TARGET_ESUBSETS);
		}
		return target;
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
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.IMPORT__IMPORTED_PACKAGE};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedRelatedElement_comp() {
		if (ownedRelatedElement_comp == null) {
			ownedRelatedElement_comp = new EObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.IMPORT__OWNED_RELATED_ELEMENT_COMP, SysMLPackage.ELEMENT__OWNING_RELATIONSHIP);
		}
		return ownedRelatedElement_comp;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		return getImportOwningPackage();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningRelatedElement(Element newOwningRelatedElement, NotificationChain msgs) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof org.omg.sysml.lang.sysml.Package)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of org.omg.sysml.lang.sysml.Package");
		}
		return basicSetImportOwningPackage((org.omg.sysml.lang.sysml.Package) newOwningRelatedElement, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		if (newOwningRelatedElement != null && !(newOwningRelatedElement instanceof org.omg.sysml.lang.sysml.Package)) {
			throw new IllegalArgumentException("newOwningRelatedElement must be an instance of org.omg.sysml.lang.sysml.Package");
		}
		setImportOwningPackage((org.omg.sysml.lang.sysml.Package) newOwningRelatedElement);
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
		org.omg.sysml.lang.sysml.Package importOwningPackage = getImportOwningPackage();
		if (importOwningPackage != null) {
			source.add(importOwningPackage);
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

	// Additional subsets
	
	@Override
	public EList<Element> getOwnedRelatedElement() {
		EList<Element> relatedElements = super.getOwnedRelatedElement();
		Element selecter = getSelecter();
		if (selecter != null) {
			relatedElements.add(selecter);
		}
		return relatedElements;
	}

	// Operations

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // EOperation
	 */
	public EList<Membership> importedMembership() {
		return this.importMembership(new BasicInternalEList<Membership>(Membership.class), null,
				new HashSet<org.omg.sysml.lang.sysml.Package>(), new HashSet<Type>());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.IMPORT__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelatedElement_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportOwningPackage((org.omg.sysml.lang.sysml.Package)otherEnd, msgs);
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
			case SysMLPackage.IMPORT__OWNED_RELATED_ELEMENT_COMP:
				return ((InternalEList<?>)getOwnedRelatedElement_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.IMPORT__SELECTER_COMP:
				return basicSetSelecter_comp(null, msgs);
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				return basicSetImportOwningPackage(null, msgs);
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
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.PACKAGE__OWNED_IMPORT_COMP, org.omg.sysml.lang.sysml.Package.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	// Note: The excludedCategories parameter is needed in case the imported Package
	// is a Type that has one or more Generalizations.
	public EList<Membership> importMembership(EList<Membership> importedMembership,
			Collection<Membership> nonpublicMembership, Collection<org.omg.sysml.lang.sysml.Package> excludedPackages,
			Collection<Type> excludedTypes) {
		// TODO Implement predicate-based selection of importMembership.
		org.omg.sysml.lang.sysml.Package importedPackage = this.getImportedPackage();
		if (importedPackage != null && !excludedPackages.contains(importedPackage)) {
			org.omg.sysml.lang.sysml.Package owningPackage = this.getImportOwningPackage();
			excludedPackages.add(owningPackage);
			EList<Membership> packageMembership = ((PackageImpl) importedPackage).getPublicMembership(excludedPackages,
					excludedTypes);
			importedMembership.addAll(packageMembership);
			if (nonpublicMembership != null && !VisibilityKind.PUBLIC.equals(this.getVisibility())) {
				nonpublicMembership.addAll(packageMembership);
			}
			excludedPackages.remove(owningPackage);
		}
		return importedMembership;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				if (resolve) return getImportedPackage();
				return basicGetImportedPackage();
			case SysMLPackage.IMPORT__SELECTER_COMP:
				return getSelecter_comp();
			case SysMLPackage.IMPORT__VISIBILITY:
				return getVisibility();
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				return getImportOwningPackage();
			case SysMLPackage.IMPORT__SELECTER:
				if (resolve) return getSelecter();
				return basicGetSelecter();
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
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((org.omg.sysml.lang.sysml.Package)newValue);
				return;
			case SysMLPackage.IMPORT__SELECTER_COMP:
				setSelecter_comp((Predicate)newValue);
				return;
			case SysMLPackage.IMPORT__VISIBILITY:
				setVisibility((VisibilityKind)newValue);
				return;
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				setImportOwningPackage((org.omg.sysml.lang.sysml.Package)newValue);
				return;
			case SysMLPackage.IMPORT__SELECTER:
				setSelecter((Predicate)newValue);
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
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				setImportedPackage((org.omg.sysml.lang.sysml.Package)null);
				return;
			case SysMLPackage.IMPORT__SELECTER_COMP:
				setSelecter_comp((Predicate)null);
				return;
			case SysMLPackage.IMPORT__VISIBILITY:
				setVisibility(VISIBILITY_EDEFAULT);
				return;
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				setImportOwningPackage((org.omg.sysml.lang.sysml.Package)null);
				return;
			case SysMLPackage.IMPORT__SELECTER:
				setSelecter((Predicate)null);
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
			case SysMLPackage.IMPORT__OWNED_RELATED_ELEMENT_COMP:
				return ownedRelatedElement_comp != null && !ownedRelatedElement_comp.isEmpty();
			case SysMLPackage.IMPORT__SOURCE:
				return isSetSource();
			case SysMLPackage.IMPORT__OWNING_RELATED_ELEMENT:
				return isSetOwningRelatedElement();
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				return importedPackage != null;
			case SysMLPackage.IMPORT__SELECTER_COMP:
				return selecter_comp != null;
			case SysMLPackage.IMPORT__VISIBILITY:
				return visibility != VISIBILITY_EDEFAULT;
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				return isSetImportOwningPackage();
			case SysMLPackage.IMPORT__SELECTER:
				return basicGetSelecter() != null;
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
		result.append(')');
		return result.toString();
	}

} // ImportImpl
