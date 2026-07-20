/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjugated Port Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ConjugatedPortDefinition</code> is a <code>PortDefinition</code> that is a <code>PortDefinition</code> of its original <code>PortDefinition</code>. That is, a <code>ConjugatedPortDefinition</code> inherits all the <code>features</code> of the original <code>PortDefinition</code>, but input <code>flows</code> of the original <code>PortDefinition</code> become outputs on the <code>ConjugatedPortDefinition</code> and output <code>flows</code> of the original <code>PortDefinition</code> become inputs on the <code>ConjugatedPortDefinition</code>. Every <code>PortDefinition</code> (that is not itself a <code><code>ConjugatedPortDefinition</code></code>) has exactly one corresponding <code>ConjugatedPortDefinition</code>, whose effective name is the name of the <code>originalPortDefinition</code>, with the character <code>~</code> prepended.</p>
 * ownedPortConjugator.originalPortDefinition = originalPortDefinition
 * conjugatedPortDefinition = null
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOwnedPortConjugator <em>Owned Port Conjugator</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortDefinition()
 * @model
 * @generated
 */
public interface ConjugatedPortDefinition extends PortDefinition {
	/**
	 * Returns the value of the '<em><b>Owned Port Conjugator</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.PortConjugation#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedConjugator() <em>Owned Conjugator</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <code>PortConjugation</code> that is the <code>ownedConjugator</code> of this <code>ConjugatedPortDefinition</code>, linking it to its <code>originalPortDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port Conjugator</em>' reference.
	 * @see #setOwnedPortConjugator(PortConjugation)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortDefinition_OwnedPortConjugator()
	 * @see org.omg.sysml.lang.sysml.PortConjugation#getConjugatedPortDefinition
	 * @model opposite="conjugatedPortDefinition" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	PortConjugation getOwnedPortConjugator();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOwnedPortConjugator <em>Owned Port Conjugator</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owned Port Conjugator</em>' reference.
	 * @see #getOwnedPortConjugator()
	 * @generated
	 */
	void setOwnedPortConjugator(PortConjugation value);

	/**
	 * Returns the value of the '<em><b>Original Port Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.PortDefinition#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}'.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Element#getOwningNamespace() <em>Owning Namespace</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The original <code>PortDefinition</code> for this <code>ConjugatedPortDefinition</code>, which is the <code>owningNamespace</code> of the <code>ConjugatedPortDefinition</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Port Definition</em>' reference.
	 * @see #setOriginalPortDefinition(PortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortDefinition_OriginalPortDefinition()
	 * @see org.omg.sysml.lang.sysml.PortDefinition#getConjugatedPortDefinition
	 * @model opposite="conjugatedPortDefinition" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
	 *        annotation="http://www.omg.org/spec/SysML"
	 * @generated
	 */
	PortDefinition getOriginalPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOriginalPortDefinition <em>Original Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Original Port Definition</em>' reference.
	 * @see #getOriginalPortDefinition()
	 * @generated
	 */
	void setOriginalPortDefinition(PortDefinition value);

} // ConjugatedPortDefinition
