/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Of
 * Succession</b></em>'. <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 * <li>{@link org.omg.sysml.lang.sysml.OfSuccession#getTo <em>To</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.OfSuccession#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOfSuccession()
 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML
 *        originalName='OFSuccession'"
 * @generated
 */
public interface OfSuccession extends EObject {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference. <!-- begin-user-doc
	 * -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(OrderedFeature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOfSuccession_To()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OrderedFeature getTo();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OfSuccession#getTo
	 * <em>To</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(OrderedFeature value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' reference. <!--
	 * begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' reference isn't clear, there really
	 * should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * 
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(OrderedFeature)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getOfSuccession_From()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	OrderedFeature getFrom();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.OfSuccession#getFrom
	 * <em>From</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(OrderedFeature value);

} // OfSuccession
