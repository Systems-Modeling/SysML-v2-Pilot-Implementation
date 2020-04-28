/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.AcceptActionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accept Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AcceptActionUsageImpl extends TransferActionUsageImpl implements AcceptActionUsage {
	
	public static final String ACCEPT_ACTION_USAGE_CONTEXT_FEATURE_NAME = "Activities::Action::self";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AcceptActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ACCEPT_ACTION_USAGE;
	}
	
	@Override
	protected Feature getContextFeature() {
		EObject element = SysMLLibraryUtil.getLibraryElement(
				this, ACCEPT_ACTION_USAGE_CONTEXT_FEATURE_NAME);
		return (Feature)element;
	}

} //AcceptActionUsageImpl
