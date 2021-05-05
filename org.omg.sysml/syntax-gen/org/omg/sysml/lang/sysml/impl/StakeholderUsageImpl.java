/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.StakeholderDefinition;
import org.omg.sysml.lang.sysml.StakeholderUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Stakeholder Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.StakeholderUsageImpl#getStakeholderDefinition <em>Stakeholder Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StakeholderUsageImpl extends PartUsageImpl implements StakeholderUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StakeholderUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STAKEHOLDER_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<StakeholderDefinition> getStakeholderDefinition() {
		EList<StakeholderDefinition> stakeholderDefinitions =
				new NonNotifyingEObjectEList<>(StakeholderDefinition.class, this, SysMLPackage.STAKEHOLDER_USAGE__STAKEHOLDER_DEFINITION);
		super.getPartDefinition().stream().
			filter(StakeholderDefinition.class::isInstance).
			map(StakeholderDefinition.class::cast).
			forEachOrdered(stakeholderDefinitions::add);
		return stakeholderDefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.STAKEHOLDER_USAGE__STAKEHOLDER_DEFINITION:
				return getStakeholderDefinition();
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
			case SysMLPackage.STAKEHOLDER_USAGE__STAKEHOLDER_DEFINITION:
				getStakeholderDefinition().clear();
				getStakeholderDefinition().addAll((Collection<? extends StakeholderDefinition>)newValue);
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
			case SysMLPackage.STAKEHOLDER_USAGE__STAKEHOLDER_DEFINITION:
				getStakeholderDefinition().clear();
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
			case SysMLPackage.STAKEHOLDER_USAGE__STAKEHOLDER_DEFINITION:
				return !getStakeholderDefinition().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //StakeholderUsageImpl
