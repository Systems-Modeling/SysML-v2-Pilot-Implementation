/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.AssociationStructure;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Structure</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AssociationStructureImpl extends AssociationImpl implements AssociationStructure {

	public static final String ASSOCIATION_STRUCTURE_SUPERCLASS_DEFAULT = "Objects::LinkObject";
	public static final String BINARY_ASSOCIATION_STRUCTURE_SUPERCLASS_DEFAULT = "Objects::BinaryLinkObject";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationStructureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSOCIATION_STRUCTURE;
	}
	
	@Override
	protected String getDefaultSupertype() {
		return getOwnedEndFeature().size() > 2 ? ASSOCIATION_STRUCTURE_SUPERCLASS_DEFAULT
				: BINARY_ASSOCIATION_STRUCTURE_SUPERCLASS_DEFAULT;
	}


} //AssociationStructureImpl
