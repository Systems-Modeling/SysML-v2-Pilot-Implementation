/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.ValueType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValueTypeImpl extends DefinitionImpl implements ValueType {
	
	public static final String VALUE_TYPE_SUPERCLASS_DEFAULT = "Blocks::Value";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VALUE_TYPE;
	}

	@Override
	protected String[] getDefaultGeneralizationNames() {
		return new String[] {VALUE_TYPE_SUPERCLASS_DEFAULT};
	}

} //ValueTypeImpl
