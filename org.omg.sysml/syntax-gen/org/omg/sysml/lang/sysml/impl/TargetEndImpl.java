/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
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
	public Type getDefaultType(String... defaultNames) {
		Type type = this.getOwningType();
		if (type instanceof Feature) {
			Feature feature = (Feature)type;
			type = feature.getOwningType();
			if (type != null) {
				EList<FeatureMembership> memberships = type.getOwnedFeatureMembership();
				int i = memberships.indexOf(feature.getOwningFeatureMembership()) + 1;
				return i < memberships.size()? memberships.get(i).getMemberFeature(): null;
			}
		}
		return null;
	}

} // TargetEndImpl
