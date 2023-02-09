/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.lang.sysml.NamespaceExpose;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace Expose</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class NamespaceExposeImpl extends NamespaceImportImpl implements NamespaceExpose {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NamespaceExposeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.NAMESPACE_EXPOSE;
	}

	// Additional overrides
	
	@Override
	public boolean isImportAll() {
		return true;
	}

} //NamespaceExposeImpl
