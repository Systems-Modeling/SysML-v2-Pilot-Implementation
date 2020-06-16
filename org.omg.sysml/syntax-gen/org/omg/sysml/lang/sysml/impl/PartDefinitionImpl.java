/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PartDefinitionImpl extends ItemDefinitionImpl implements PartDefinition {
	
	public static final String PART_DEFINITION_SUPERCLASS_DEFAULT = "Parts::Part";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PART_DEFINITION;
	}

	@Override
	protected String getDefaultSupertype() {
		return PART_DEFINITION_SUPERCLASS_DEFAULT;
	}

} //BlockImpl
