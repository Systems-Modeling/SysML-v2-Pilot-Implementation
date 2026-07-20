/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port Conjugation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>PortConjugation</code> is a <code>Conjugation</code> <code>Relationship</code> between a <code>PortDefinition</code> and its corresponding <code>ConjugatedPortDefinition</code>. As a result of this <code>Relationship</code>, the <code>ConjugatedPortDefinition</code> inherits all the <code>features</code> of the original <code>PortDefinition</code>, but input <code>flows</code> of the original <code>PortDefinition</code> become outputs on the <code>ConjugatedPortDefinition</code> and output <code>flows</code> of the original <code>PortDefinition</code> become inputs on the <code>ConjugatedPortDefinition</code>.</code></p>
 * 
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.PortConjugation#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.PortConjugation#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortConjugation()
 * @model
 * @generated
 */
public interface PortConjugation extends Conjugation {
	/**
	 * Returns the value of the '<em><b>Original Port Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Conjugation#getOriginalType() <em>Original Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>PortDefinition</code> being conjugated.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Port Definition</em>' reference.
	 * @see #setOriginalPortDefinition(PortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortConjugation_OriginalPortDefinition()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='portConjugation'"
	 *        annotation="redefines"
	 * @generated
	 */
	PortDefinition getOriginalPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PortConjugation#getOriginalPortDefinition <em>Original Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Port Definition</em>' reference.
	 * @see #getOriginalPortDefinition()
	 * @generated
	 */
	void setOriginalPortDefinition(PortDefinition value);

	/**
	 * Returns the value of the '<em><b>Conjugated Port Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOwnedPortConjugator <em>Owned Port Conjugator</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Conjugation#getOwningType() <em>Owning Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>ConjugatedPortDefinition</code> that is conjugate to the <code>originalPortDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conjugated Port Definition</em>' reference.
	 * @see #setConjugatedPortDefinition(ConjugatedPortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getPortConjugation_ConjugatedPortDefinition()
	 * @see org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOwnedPortConjugator
	 * @model opposite="ownedPortConjugator" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	ConjugatedPortDefinition getConjugatedPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.PortConjugation#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugated Port Definition</em>' reference.
	 * @see #getConjugatedPortDefinition()
	 * @generated
	 */
	void setConjugatedPortDefinition(ConjugatedPortDefinition value);

} // PortConjugation
