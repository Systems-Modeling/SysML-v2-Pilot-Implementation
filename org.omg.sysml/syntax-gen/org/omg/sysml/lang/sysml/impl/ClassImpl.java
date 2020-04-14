/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements org.omg.sysml.lang.sysml.Class {
	
	public static final String CLASS_SUPERCLASS_DEFAULT = "Base::Object";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CLASS;
	}
	
	@Override
	protected String getDefaultSupertype() {
		return CLASS_SUPERCLASS_DEFAULT;
	}

}
