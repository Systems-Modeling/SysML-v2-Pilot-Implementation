/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.ObjectClass;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ObjectClassImpl extends ClassImpl implements ObjectClass {
	
	public String OBJECT_CLASS_SUPERCLASS_DEFAULT = "Base::Object";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectClassImpl() {
		super();
	}
	
	/**
	 * If the ObjectClass has no Superclassings, then create one whose superclass is the appropriate default library class.
	 */
	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(OBJECT_CLASS_SUPERCLASS_DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OBJECT_CLASS;
	}

} //ObjectClassImpl
