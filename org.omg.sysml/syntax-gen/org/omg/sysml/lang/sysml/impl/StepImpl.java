/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Behavior;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ObjectClass;
import org.omg.sysml.lang.sysml.Step;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StepImpl extends FeatureImpl implements Step {
	
	public static final String STEP_SUBSETTING_BASE_DEFAULT = "Base::performances";
	public static final String STEP_SUBSETTING_PERFORMANCE_DEFAULT = "Base::Performance::subperformances";
	public static final String STEP_SUBSETTING_OBJECT_DEFAULT = "Base::Object::enactedPerformances";
	
	protected boolean isCheckSubsetting = true;
	
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
		if (isCheckSubsetting) {
			if (isSubperformance()) {
				addSubsetting(STEP_SUBSETTING_PERFORMANCE_DEFAULT);
			} 
			if (isEnactedPerformance()) {
				addSubsetting(STEP_SUBSETTING_OBJECT_DEFAULT);
			}
			isCheckSubsetting = false;
		}
		return getOwnedSubsettingWithComputedRedefinitions(
				isSubperformance()? 
					STEP_SUBSETTING_PERFORMANCE_DEFAULT:
				isEnactedPerformance()?
					STEP_SUBSETTING_OBJECT_DEFAULT:
					STEP_SUBSETTING_BASE_DEFAULT);
	}
	
	protected void addSubsetting(String name) {
		Category category = getDefaultCategory(name);
		if (category instanceof Feature) {
			Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
			subsetting.setSubsettedFeature((Feature)category);
			subsetting.setSubsettingFeature(this);
			getOwnedRelationship().add(subsetting);
		}
	}
	
	// Utility methods
	
	public boolean isSubperformance() {
		return isPerformanceFeature(this);
	}
	
	public boolean isEnactedPerformance() {
		Category owningCategory = getOwningCategory();
		return owningCategory instanceof ObjectClass ||
				owningCategory instanceof Feature && 
					((FeatureImpl)owningCategory).isObjectFeature();
	}
	
	public static boolean isPerformanceFeature(Feature step) {
		Category owningCategory = step.getOwningCategory();
		return owningCategory instanceof Behavior || owningCategory instanceof Step;
	}
	
	public List<Step> getSubsteps() {
		return getOwnedFeature().stream().filter(f->f instanceof Step).
				map(f->(Step)f).collect(Collectors.toList());
	}
	
} //StepImpl
