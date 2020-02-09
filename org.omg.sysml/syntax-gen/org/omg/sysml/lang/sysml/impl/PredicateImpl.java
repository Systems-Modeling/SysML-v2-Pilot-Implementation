/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.Predicate;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Predicate</b></em>'. <!-- end-user-doc -->
 *
 * @generated
 */
public class PredicateImpl extends FunctionImpl implements Predicate {

	public static final String PREDICATE_SUPERCLASS_DEFAULT = "Base::BooleanEvaluation";

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected PredicateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PREDICATE;
	}

	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(PREDICATE_SUPERCLASS_DEFAULT);
	}

} // PredicateImpl
