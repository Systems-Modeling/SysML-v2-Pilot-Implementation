/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.ItemDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Item Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ItemDefinitionImpl extends DefinitionImpl implements ItemDefinition {

	public static final String ITEM_DEFINITION_SUPERCLASS_DEFAULT = "Blocks::Part";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ItemDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ITEM_DEFINITION;
	}

	@Override
	protected String getDefaultSupertype() {
		return ITEM_DEFINITION_SUPERCLASS_DEFAULT;
	}

} //ItemDefinitionImpl
