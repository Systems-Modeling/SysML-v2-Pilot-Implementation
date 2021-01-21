/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class StructureImpl extends ClassImpl implements Structure {
	
	public static final String STRUCTURE_SUPERCLASS_DEFAULT = "Objects::Object";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.STRUCTURE;
	}

	@Override
	protected String getDefaultSupertype() {
		return STRUCTURE_SUPERCLASS_DEFAULT;
	}

} //StructureImpl
