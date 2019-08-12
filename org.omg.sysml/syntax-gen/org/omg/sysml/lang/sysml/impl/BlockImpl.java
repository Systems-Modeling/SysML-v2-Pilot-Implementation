/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.Block;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Block</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class BlockImpl extends DefinitionImpl implements Block {
	public static final String BLOCK_SUPERCLASS_DEFAULT = "Base::Object";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.BLOCK;
	}

	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(BLOCK_SUPERCLASS_DEFAULT);
	}

	@Override
	public EList<Generalization> getOwnedGeneralization() {
		getOwnedSuperclassing();
		return super.getOwnedGeneralization();
	}

} //BlockImpl
