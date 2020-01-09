/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
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

} //TransitionStepImpl
