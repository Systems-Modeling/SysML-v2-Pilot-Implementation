/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Ownership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ownership</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class OwnershipImpl extends RelationshipImpl implements Ownership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwnershipImpl() {
		super();
	}
	
	// Additional redefinitions
	
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new EObjectEList<Element>(Element.class, this, SysMLPackage.OWNERSHIP__SOURCE);
		source.add(getOwningRelatedElement());
		return source;
	}
	
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new EObjectEList<Element>(Element.class, this, SysMLPackage.OWNERSHIP__TARGET);
		target.addAll(getOwnedRelatedElement());
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OWNERSHIP;
	}

} //OwnershipImpl
