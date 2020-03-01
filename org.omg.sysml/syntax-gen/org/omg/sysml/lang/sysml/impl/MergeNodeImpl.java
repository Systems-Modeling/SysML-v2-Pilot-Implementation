/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.MergeNode;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Merge Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class MergeNodeImpl extends ControlNodeImpl implements MergeNode {

	public static final String MERGE_NODE_SUBSETTING_BASE_DEFAULT = "Activities::Action::merges";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MergeNodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MERGE_NODE;
	}

	@Override
	protected String[] getDefaultGeneralizationNames() {
		return new String[] {MERGE_NODE_SUBSETTING_BASE_DEFAULT};
	}

} //MergeNodeImpl
