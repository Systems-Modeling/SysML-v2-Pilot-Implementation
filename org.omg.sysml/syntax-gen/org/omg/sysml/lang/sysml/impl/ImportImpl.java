/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ImportImpl#getOwnedElement <em>Owned Element</em>}</li>
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
	 * The cached value of the '{@link #getSelecter() <em>Selecter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelecter()
	 * @generated
	 * @ordered
	 */
	protected Predicate selecter;

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
	public EList<Element> getOwnedElement() {
		if (ownedElement == null) {
			ownedElement = new SubsetSupersetEObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.IMPORT__OWNED_ELEMENT, null, OWNED_ELEMENT_ESUBSETS, SysMLPackage.ELEMENT__OWNER);
		}
		return ownedElement;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.IMPORT__SELECTER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public void setImportedPackage(org.omg.sysml.lang.sysml.Package newImportedPackage) {
		org.omg.sysml.lang.sysml.Package oldImportedPackage = importedPackage;
		importedPackage = newImportedPackage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__IMPORTED_PACKAGE, oldImportedPackage, importedPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportedPackage() {
		return importedPackage != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate getSelecter() {
		if (selecter != null && selecter.eIsProxy()) {
			InternalEObject oldSelecter = (InternalEObject)selecter;
			selecter = (Predicate)eResolveProxy(oldSelecter);
			if (selecter != oldSelecter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.IMPORT__SELECTER, oldSelecter, selecter));
			}
		}
		return selecter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Predicate basicGetSelecter() {
		return selecter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelecter(Predicate newSelecter) {
		Predicate oldSelecter = selecter;
		selecter = newSelecter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__SELECTER, oldSelecter, selecter));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newSelecter != null) {
				EList<Element> ownedElement = getOwnedElement();
				if (!ownedElement.contains(newSelecter)) {
					ownedElement.add(newSelecter);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VisibilityKind getVisibility() {
		return visibility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
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
	public org.omg.sysml.lang.sysml.Package getImportOwningPackage() {
		if (eContainerFeatureID() != SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE) return null;
		return (org.omg.sysml.lang.sysml.Package)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetImportOwningPackage(org.omg.sysml.lang.sysml.Package newImportOwningPackage, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newImportOwningPackage, SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportOwningPackage(org.omg.sysml.lang.sysml.Package newImportOwningPackage) {
		if (newImportOwningPackage != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE && newImportOwningPackage != null)) {
			if (EcoreUtil.isAncestor(this, newImportOwningPackage))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newImportOwningPackage != null)
				msgs = ((InternalEObject)newImportOwningPackage).eInverseAdd(this, SysMLPackage.PACKAGE__OWNED_IMPORT, org.omg.sysml.lang.sysml.Package.class, msgs);
			msgs = basicSetImportOwningPackage(newImportOwningPackage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE, newImportOwningPackage, newImportOwningPackage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetImportOwningPackage() {
		return getImportOwningPackage() != null;
	}
	
	// Additional redefinitions
	
	@Override
	public Element getOwner() {
		org.omg.sysml.lang.sysml.Package owningPackage = this.getImportOwningPackage();
		return owningPackage == null? super.getOwner(): owningPackage;
	}
	
	@Override
	public void setOwner(Element newElement) {
		if (newElement instanceof org.omg.sysml.lang.sysml.Package) {
			this.setImportOwningPackage((org.omg.sysml.lang.sysml.Package)newElement);
		}
	}
	
	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Membership> importedMembership() {
		// TODO Implement predicate-based selection of importMembership.
		EList<Membership> importedMembership = new BasicInternalEList<Membership>(Membership.class);
		org.omg.sysml.lang.sysml.Package importedPackage = this.getImportedPackage();
		if (importedPackage != null) {
			for (Membership membership: this.getImportedPackage().getMembership()) {
				if (VisibilityKind.PUBLIC.equals(membership.getVisibility())) {
					importedMembership.add(membership);
				}
			}
		}
		return importedMembership;
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
			case SysMLPackage.IMPORT__OWNED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElement()).basicAdd(otherEnd, msgs);
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetImportOwningPackage((org.omg.sysml.lang.sysml.Package)otherEnd, msgs);
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
			case SysMLPackage.IMPORT__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
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
				return eInternalContainer().eInverseRemove(this, SysMLPackage.PACKAGE__OWNED_IMPORT, org.omg.sysml.lang.sysml.Package.class, msgs);
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
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				if (resolve) return getImportedPackage();
				return basicGetImportedPackage();
			case SysMLPackage.IMPORT__SELECTER:
				if (resolve) return getSelecter();
				return basicGetSelecter();
			case SysMLPackage.IMPORT__VISIBILITY:
				return getVisibility();
			case SysMLPackage.IMPORT__IMPORT_OWNING_PACKAGE:
				return getImportOwningPackage();
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
			case SysMLPackage.IMPORT__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case SysMLPackage.IMPORT__TARGET:
				return isSetTarget();
			case SysMLPackage.IMPORT__SOURCE:
				return isSetSource();
			case SysMLPackage.IMPORT__IMPORTED_PACKAGE:
				return isSetImportedPackage();
			case SysMLPackage.IMPORT__SELECTER:
				return selecter != null;
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (visibility: ");
		result.append(visibility);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		org.omg.sysml.lang.sysml.Package importedPackage = getImportedPackage();
		if (importedPackage != null) {
			target.add(importedPackage);
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
