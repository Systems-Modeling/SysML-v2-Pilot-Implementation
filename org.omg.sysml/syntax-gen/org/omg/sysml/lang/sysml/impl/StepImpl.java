/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StepImpl extends FeatureImpl implements Step {
	
	public static final String STEP_SUBSETTING_DEFAULT = "Base::performances";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STEP;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithComputedRedefinitions(STEP_SUBSETTING_DEFAULT);
	}
	
	public List<Step> getSubsteps() {
		return getOwnedFeature().stream().filter(f->f instanceof Step).
				map(f->(Step)f).collect(Collectors.toList());
	}
	
} //StepImpl
