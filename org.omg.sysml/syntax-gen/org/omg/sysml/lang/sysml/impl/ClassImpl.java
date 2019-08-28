/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Object
 * Classifier</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class ClassImpl extends ClassifierImpl implements org.omg.sysml.lang.sysml.Class {

	public static final String CLASS_SUPERCLASS_DEFAULT = "Base::Object";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected ClassImpl() {
		super();
	}

	/**
	 * If the Class has no Superclassings, then create one whose superclass is the
	 * appropriate default library class.
	 */
	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(CLASS_SUPERCLASS_DEFAULT);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CLASS;
	}

	@Override
	public EList<Generalization> getOwnedGeneralization() {
		getOwnedSuperclassing();
		return super.getOwnedGeneralization();
	}

} // ObjectClassImpl
