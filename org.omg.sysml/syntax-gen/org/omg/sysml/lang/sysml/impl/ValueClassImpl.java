/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.ValueClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Value Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ValueClassImpl extends ClassImpl implements ValueClass {
	public String VALUE_CLASS_SUPERCLASS_DEFAULT = "Base::Value";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ValueClassImpl() {
		super();
	}

	/**
	 * If the ObjectClass has no Superclassings, then create one whose superclass is the appropriate default library class.
	 */
	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(VALUE_CLASS_SUPERCLASS_DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.VALUE_CLASS;
	}

} //ValueClassImpl
