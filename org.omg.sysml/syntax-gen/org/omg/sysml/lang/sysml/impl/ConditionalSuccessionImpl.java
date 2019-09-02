/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.ConditionalSuccession;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conditional Succession</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ConditionalSuccessionImpl extends SuccessionImpl implements ConditionalSuccession {

	public static final String CONDITIONAL_SUCCESSION_SUBSETTING_DEFAULT = "ControlNodes::conditionalSuccessions";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConditionalSuccessionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONDITIONAL_SUCCESSION;
	}
	
	public Expression getGuard() {
		EList<Feature> features = getOwnedFeature();
		if (features.isEmpty()) {
			return null;
		} else {
			Feature guard = features.get(0);
			return guard instanceof Expression? (Expression)guard: null;
		}
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(CONDITIONAL_SUCCESSION_SUBSETTING_DEFAULT);
	}

	@Override
	public List<? extends Feature> getRelevantFeatures() {
		return Collections.singletonList(getGuard());
	}
	
} //ConditionalSuccessionImpl
