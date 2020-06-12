/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PartUsageImpl#getPartDefinition <em>Part Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartUsageImpl extends ItemUsageImpl implements PartUsage {
	
	public static final String BLOCK_PROPERTY_SUBSETTING_DEFAULT = "Blocks::parts";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PART_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PartDefinition> getPartDefinition() {
		EList<PartDefinition> partDefinitions =
				new EObjectEList<>(PartDefinition.class, this, SysMLPackage.PART_USAGE__PART_DEFINITION);
		super.getItemDefinition().stream().
			filter(PartDefinition.class::isInstance).
			map(PartDefinition.class::cast).
			forEachOrdered(partDefinitions::add);
		return partDefinitions;
	}

	@Override
	protected String getDefaultSupertype() {
		return BLOCK_PROPERTY_SUBSETTING_DEFAULT;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PART_USAGE__PART_DEFINITION:
				return getPartDefinition();
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
			case SysMLPackage.PART_USAGE__PART_DEFINITION:
				getPartDefinition().clear();
				getPartDefinition().addAll((Collection<? extends PartDefinition>)newValue);
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
			case SysMLPackage.PART_USAGE__PART_DEFINITION:
				getPartDefinition().clear();
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
			case SysMLPackage.PART_USAGE__PART_DEFINITION:
				return !getPartDefinition().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //BlockPropertyImpl
