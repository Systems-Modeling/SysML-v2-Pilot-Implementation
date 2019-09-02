/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.PerformActionUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PerformActionUsageImpl extends ActionUsageImpl implements PerformActionUsage {

	public static final String PERFORM_ACTION_SUBSETTING_PART_DEFAULT = "Blocks::Part::performedActions";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PERFORM_ACTION_USAGE;
	}

	@Override
	protected void checkSubsetting() {
		super.checkSubsetting();
		if (isEnactedPerformance()) {
			addSubsetting(PERFORM_ACTION_SUBSETTING_PART_DEFAULT);
		}
	}
	
	@Override
	protected String getActionSubsettingDefault() {
		return isEnactedPerformance()? 
				PERFORM_ACTION_SUBSETTING_PART_DEFAULT:
				super.getActionSubsettingDefault();
	}
	
	public boolean isEnactedPerformance() {
		return StepImpl.isEnactedPerformance(this);
	}
	
} //PerformActionUsageImpl
