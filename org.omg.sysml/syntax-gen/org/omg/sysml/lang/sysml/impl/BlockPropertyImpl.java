/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.BlockProperty;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.BlockPropertyImpl#getBlock <em>Block</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class BlockPropertyImpl extends PropertyImpl implements BlockProperty {
	
	public static final String BLOCK_PROPERTY_SUBSETTING_DEFAULT = "Blocks::parts";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BLOCK_PROPERTY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<org.omg.sysml.lang.sysml.Class> getBlock() {
		EList<org.omg.sysml.lang.sysml.Class> classes = 
				new EObjectEList<>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.BLOCK_PROPERTY__BLOCK);
		super.getType().stream().
			filter(type->type instanceof org.omg.sysml.lang.sysml.Class).
			map(type->(org.omg.sysml.lang.sysml.Class)type).
			forEachOrdered(classes::add);
		return classes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetBlock() {
		return !getBlock().isEmpty();
	}

	@Override
	protected String getDefaultSupertype() {
		return BLOCK_PROPERTY_SUBSETTING_DEFAULT;
	}
	
//	public EList<Subsetting> getOwnedSubsetting() {
//		return getOwnedSubsettingWithComputedRedefinitions(BLOCK_PROPERTY_SUBSETTING_DEFAULT);
//	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.BLOCK_PROPERTY__BLOCK:
				return getBlock();
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
			case SysMLPackage.BLOCK_PROPERTY__BLOCK:
				getBlock().clear();
				getBlock().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
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
			case SysMLPackage.BLOCK_PROPERTY__BLOCK:
				getBlock().clear();
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
			case SysMLPackage.BLOCK_PROPERTY__TYPE:
				return isSetType();
			case SysMLPackage.BLOCK_PROPERTY__BLOCK:
				return isSetBlock();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> block = (EList<Type>)((EList<?>)getBlock());
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

} //BlockPropertyImpl
