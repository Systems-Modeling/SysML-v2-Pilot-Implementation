/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TargetEnd;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Target
 * End</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class TargetEndImpl extends FeatureImpl implements TargetEnd {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected TargetEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TARGET_END;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		clearCaches();
		getOwnedSubsettingWithDefault();
		getComputedRedefinitions();
		return getOwnedSubsettingWithoutDefault();
	}

	@Override
	public Type getDefaultType(String... defaultNames) {
		Type type = getOwningType();
		type = type == null ? null : ((Feature) type).getOwningType();
		return type instanceof Feature ? type : null;
	}

} // TargetEndImpl
