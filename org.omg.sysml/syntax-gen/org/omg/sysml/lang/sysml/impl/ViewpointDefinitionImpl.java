/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.ViewpointDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Viewpoint Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ViewpointDefinitionImpl extends RequirementDefinitionImpl implements ViewpointDefinition {
	
	public static final String VIEWPOINT_DEFINITION_SUPERCLASS_DEFAULT = "Views::ViewpointCheck";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ViewpointDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VIEWPOINT_DEFINITION;
	}

	@Override
	protected String getDefaultSupertype() {
		return VIEWPOINT_DEFINITION_SUPERCLASS_DEFAULT;
	}

} //ViewpointDefinitionImpl
