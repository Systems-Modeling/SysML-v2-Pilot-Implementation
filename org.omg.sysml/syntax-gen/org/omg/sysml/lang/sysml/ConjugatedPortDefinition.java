/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjugated Port Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A ConjugatedPortDefinition is a PortDefinition that is a PortConjugation of its original PortDefinition. That is, a ConjugatedPortDefinition inherits all the features of the original PortDefinition, but input flowProperties of the original PortDefinition become outputs on the ConjugatedPortDefinition and output flowProperties of the original PortDefinition become inputs on the ConjugatedPortDefinition. Every PortDefinition has exactly one corresponding ConjugatedPortDefinition, whose name is the same as that of the originalPortDefinition, with the character "~" prepended.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOwnedPortConjugator <em>Owned Port Conjugator</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortDefinition#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
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
	 * <p>
	 * If the meaning of the '<em>Owned Port Conjugator</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Port Conjugator</em>' reference.
	 * @see #setOwnedPortConjugator(PortConjugation)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortDefinition_OwnedPortConjugator()
	 * @see org.omg.sysml.lang.sysml.PortConjugation#getConjugatedPortDefinition
	 * @model opposite="conjugatedPortDefinition" ordered="false"
	 *        annotation="redefines"
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
	 * The original PortDefinition for this ConjugatedPortDefinition.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Original Port Definition</em>' reference.
	 * @see #setOriginalPortDefinition(PortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortDefinition_OriginalPortDefinition()
	 * @see org.omg.sysml.lang.sysml.PortDefinition#getConjugatedPortDefinition
	 * @model opposite="conjugatedPortDefinition" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="redefines"
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
