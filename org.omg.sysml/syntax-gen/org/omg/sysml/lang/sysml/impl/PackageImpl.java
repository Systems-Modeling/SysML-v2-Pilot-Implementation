/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.ElementFilter;
import org.omg.sysml.lang.sysml.MetadataCondition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Package</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getFilterCondition <em>Filter Condition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getFilter_comp <em>Filter comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PackageImpl#getFilter <em>Filter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PackageImpl extends NamespaceImpl implements org.omg.sysml.lang.sysml.Package {
	/**
	 * The cached value of the '{@link #getFilter_comp() <em>Filter comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter_comp()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementFilter> filter_comp;

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
	public EList<Relationship> getOwnedRelationship_comp() {
		if (ownedRelationship_comp == null) {
			ownedRelationship_comp = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.PACKAGE__OWNED_RELATIONSHIP_COMP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<MetadataCondition> getFilterCondition() {
		EList<MetadataCondition> filterConditions = new NonNotifyingEObjectEList<>(MetadataCondition.class, this, SysMLPackage.PACKAGE__FILTER_CONDITION);
		getFilter().stream().map(ElementFilter::getCondition).forEachOrdered(filterConditions::add);
		return filterConditions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ElementFilter> getFilter_comp() {
		if (filter_comp == null) {
			filter_comp = new EObjectContainmentWithInverseEList<ElementFilter>(ElementFilter.class, this, SysMLPackage.PACKAGE__FILTER_COMP, SysMLPackage.ELEMENT_FILTER__FILTERED_PACKAGE);
		}
		return filter_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ElementFilter> getFilter() {
		return getFilter_comp();
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getFilter() <em>Filter</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilter()
	 * @generated
	 * @ordered
	 */
	protected static final int[] FILTER_ESUPERSETS = new int[] {SysMLPackage.PACKAGE__OWNED_RELATIONSHIP_COMP};

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
			case SysMLPackage.PACKAGE__FILTER_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getFilter_comp()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.PACKAGE__FILTER_COMP:
				return ((InternalEList<?>)getFilter_comp()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				return getFilterCondition();
			case SysMLPackage.PACKAGE__FILTER_COMP:
				return getFilter_comp();
			case SysMLPackage.PACKAGE__FILTER:
				return getFilter();
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
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				getFilterCondition().clear();
				getFilterCondition().addAll((Collection<? extends MetadataCondition>)newValue);
				return;
			case SysMLPackage.PACKAGE__FILTER_COMP:
				getFilter_comp().clear();
				getFilter_comp().addAll((Collection<? extends ElementFilter>)newValue);
				return;
			case SysMLPackage.PACKAGE__FILTER:
				getFilter().clear();
				getFilter().addAll((Collection<? extends ElementFilter>)newValue);
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
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				getFilterCondition().clear();
				return;
			case SysMLPackage.PACKAGE__FILTER_COMP:
				getFilter_comp().clear();
				return;
			case SysMLPackage.PACKAGE__FILTER:
				getFilter().clear();
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
			case SysMLPackage.PACKAGE__OWNED_RELATIONSHIP_COMP:
				return ownedRelationship_comp != null && !ownedRelationship_comp.isEmpty();
			case SysMLPackage.PACKAGE__FILTER_CONDITION:
				return !getFilterCondition().isEmpty();
			case SysMLPackage.PACKAGE__FILTER_COMP:
				return filter_comp != null && !filter_comp.isEmpty();
			case SysMLPackage.PACKAGE__FILTER:
				return !getFilter().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PackageImpl
