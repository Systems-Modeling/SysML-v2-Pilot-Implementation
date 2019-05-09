/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.BlockExpression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Parameter Membership</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ParameterMembershipImpl extends FeatureMembershipImpl implements ParameterMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParameterMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PARAMETER_MEMBERSHIP;
	}

	@Override
	public FeatureDirectionKind getDirection() {
		if (direction == null) {
			Feature member = getMemberFeature();
			if (member instanceof Parameter) {
				direction = FeatureDirectionKind.IN;
			}
		}
		return direction;
	}
	
	@Override
	public Feature basicGetOwnedMemberFeature() {
		Feature feature = getFirstOwnedRelatedElement(Feature.class);
		if (feature instanceof Parameter && getOwningCategory() instanceof BlockExpression) {
			((ParameterImpl)feature).addInheritedFeatureRedefinitions();
		}
		return feature;
	}

} //ParameterMembershipImpl
