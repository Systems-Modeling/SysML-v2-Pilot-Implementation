/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.AttributeDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AttributeDefinitionImpl extends DefinitionImpl implements AttributeDefinition {
	
	public static final String VALUE_TYPE_SUPERCLASS_DEFAULT = "Base::DataValue";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ATTRIBUTE_DEFINITION;
	}

	@Override
	protected String getDefaultSupertype() {
		return VALUE_TYPE_SUPERCLASS_DEFAULT;
	}

} //AttributeDefinitionImpl
