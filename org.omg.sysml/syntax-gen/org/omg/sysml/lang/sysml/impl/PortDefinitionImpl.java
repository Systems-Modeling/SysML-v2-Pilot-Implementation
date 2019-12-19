/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class PortDefinitionImpl extends DefinitionImpl implements PortDefinition {

	public String PORT_DEFINITION_SUPERCLASS_DEFAULT = "Blocks::Port";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PORT_DEFINITION;
	}

	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(PORT_DEFINITION_SUPERCLASS_DEFAULT);
	}
	
} //PortDefinitionImpl
