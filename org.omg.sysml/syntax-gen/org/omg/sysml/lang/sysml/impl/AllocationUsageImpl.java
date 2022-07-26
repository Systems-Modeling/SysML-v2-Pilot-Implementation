/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.sysml.lang.sysml.AllocationDefinition;
import org.omg.sysml.lang.sysml.AllocationUsage;
import org.omg.sysml.lang.sysml.AssociationStructure;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Allocation Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AllocationUsageImpl#getAllocationDefinition <em>Allocation Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AllocationUsageImpl extends ConnectionUsageImpl implements AllocationUsage {

	/**
	 * The cached setting delegate for the '{@link #getAllocationDefinition() <em>Allocation Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllocationDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ALLOCATION_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ALLOCATION_USAGE__ALLOCATION_DEFINITION).getSettingDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AllocationUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ALLOCATION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AllocationDefinition> getAllocationDefinition() {
		return (EList<AllocationDefinition>)ALLOCATION_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAllocationDefinition() {
		return !getAllocationDefinition().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ALLOCATION_USAGE__ALLOCATION_DEFINITION:
				return getAllocationDefinition();
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
			case SysMLPackage.ALLOCATION_USAGE__ALLOCATION_DEFINITION:
				getAllocationDefinition().clear();
				getAllocationDefinition().addAll((Collection<? extends AllocationDefinition>)newValue);
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
			case SysMLPackage.ALLOCATION_USAGE__ALLOCATION_DEFINITION:
				getAllocationDefinition().clear();
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
			case SysMLPackage.ALLOCATION_USAGE__CONNECTION_DEFINITION:
				return isSetConnectionDefinition();
			case SysMLPackage.ALLOCATION_USAGE__ALLOCATION_DEFINITION:
				return isSetAllocationDefinition();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<AssociationStructure> getConnectionDefinition() {
		@SuppressWarnings("unchecked")
		EList<AssociationStructure> allocationDefinition = (EList<AssociationStructure>)((EList<?>)getAllocationDefinition());
		return allocationDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionDefinition() {
  		return false;
	}

} //AllocationUsageImpl
