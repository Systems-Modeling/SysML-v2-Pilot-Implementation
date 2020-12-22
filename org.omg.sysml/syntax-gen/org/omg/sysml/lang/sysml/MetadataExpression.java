/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataExpression()
 * @model
 * @generated
 */
public interface MetadataExpression extends Expression {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" targetRequired="true" targetOrdered="false"
	 * @generated
	 */
	EList<Element> evaluate(Element target);

} // MetadataExpression
