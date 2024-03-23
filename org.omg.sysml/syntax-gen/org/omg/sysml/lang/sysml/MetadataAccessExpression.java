/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metadata Access Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>MetadataAccessExpression</code> is an <code>Expression</code> whose <code>result</code> is a sequence of instances of <code>Metaclasses</code> representing all the <code>MetadataFeature</code> annotations of the <code>referencedElement</code>. In addition, the sequence includes an instance of the reflective <code>Metaclass</code> corresponding to the MOF class of the <code>referencedElement</code>, with values for all the abstract syntax properties of the <code>referencedElement</code>.</p>
 * specializesFromLibrary('Performances::metadataAccessEvaluations')
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MetadataAccessExpression#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataAccessExpression()
 * @model
 * @generated
 */
public interface MetadataAccessExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Referenced Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p> The <code>Element</code> whose metadata is being accessed.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Referenced Element</em>' reference.
	 * @see #setReferencedElement(Element)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMetadataAccessExpression_ReferencedElement()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='accessExpression'"
	 * @generated
	 */
	Element getReferencedElement();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MetadataAccessExpression#getReferencedElement <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Referenced Element</em>' reference.
	 * @see #getReferencedElement()
	 * @generated
	 */
	void setReferencedElement(Element value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>Return a <code>MetadataFeature</code> whose <code>annotatedElement</code> is the <code>referencedElement</code>, whose <code>metaclass</code> is the reflective <code>Metaclass</code> corresponding to the MOF class of the <code>referencedElement</code> and whose <code>ownedFeatures</code> are bound to the MOF properties of the <code>referencedElement</code>.</p>
	 * <!-- end-model-doc -->
	 * @model required="true" ordered="false"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	MetadataFeature metaclassFeature();

} // MetadataAccessExpression
