/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionFeatureKind;
import org.omg.sysml.lang.sysml.TransitionFeatureMembership;
import org.omg.sysml.lang.sysml.TransitionStep;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class TransitionStepImpl extends StepImpl implements TransitionStep {
	
	public static final String TRANSITION_STEP_SUBSETTING_DEFAULT = "States::transitions";
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TRANSITION_STEP;
	}
	
	@Override
	public EList<Subsetting>  getOwnedSubsetting() {
		return getOwnedSubsettingWithComputedRedefinitions(TRANSITION_STEP_SUBSETTING_DEFAULT);
	}

	public Feature getTransitionFeature(TransitionFeatureKind kind) {
		return getOwnedFeatureMembership().stream().
				filter(mem->(mem instanceof TransitionFeatureMembership) && ((TransitionFeatureMembership)mem).getKind() == kind).
				map(mem->mem.getMemberFeature()).
				filter(f->f != null).
				findAny().orElse(null);
	}
	
	public Feature getTrigger() {
		return getTransitionFeature(TransitionFeatureKind.TRIGGER);
	}

	public Feature getGuard() {
		return getTransitionFeature(TransitionFeatureKind.GUARD);
	}

	public Feature getEffect() {
		return getTransitionFeature(TransitionFeatureKind.EFFECT);
	}

} //TransitionStepImpl
