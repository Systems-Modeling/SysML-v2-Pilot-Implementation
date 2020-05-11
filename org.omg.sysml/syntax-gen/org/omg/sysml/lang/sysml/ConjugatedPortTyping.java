/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Conjugated Port Typing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A ConjugatedPortTyping is a FeatureTyping in which the <tt>type</tt> is derived as the <tt>conjugatedPortDefinition</tt> of a given PortDefinition. A ConjugatedPortTyping allows a PortUsage to by related directly to a PortDefinition, but to be effectively typed by the conjugation of the referenced PortDefinition.</p>
 * 
 * <p>Note that ConjugatedPortTyping is a <em>ternary</em> Relationship, with <tt>portDefinition</tt> being a third <tt>relatedElement</tt>, in addition to <tt>typed</tt> and <tt>typedFeature</tt> from FeatureTyping.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortTyping#getPortDefinition <em>Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.ConjugatedPortTyping#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortTyping()
 * @model
 * @generated
 */
public interface ConjugatedPortTyping extends FeatureTyping {
	/**
	 * Returns the value of the '<em><b>Port Definition</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Relationship#getTarget() <em>Target</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Port Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The PortDefinition whose <tt>conjugatedPortDefinition</tt> is to be the derived <tt>type</tt> of this ConjugatedPortTyping.<p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Port Definition</em>' reference.
	 * @see #setPortDefinition(PortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortTyping_PortDefinition()
	 * @model required="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='conjugatedPortTyping'"
	 *        annotation="subsets"
	 * @generated
	 */
	PortDefinition getPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConjugatedPortTyping#getPortDefinition <em>Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Port Definition</em>' reference.
	 * @see #getPortDefinition()
	 * @generated
	 */
	void setPortDefinition(PortDefinition value);

	/**
	 * Returns the value of the '<em><b>Conjugated Port Definition</b></em>' reference.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.FeatureTyping#getType() <em>Type</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Conjugated Port Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The <tt>conjugatedPortDefinition</tt> of the <tt>portDefinition</tt> of this ConjugatedPortTyping, which is the derived <tt>type</tt> of the ConjugatedPortTyping considered as a FeatureTyping.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Conjugated Port Definition</em>' reference.
	 * @see #setConjugatedPortDefinition(ConjugatedPortDefinition)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConjugatedPortTyping_ConjugatedPortDefinition()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='typingByConjugatedPort'"
	 *        annotation="redefines"
	 * @generated
	 */
	ConjugatedPortDefinition getConjugatedPortDefinition();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.ConjugatedPortTyping#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Conjugated Port Definition</em>' reference.
	 * @see #getConjugatedPortDefinition()
	 * @generated
	 */
	void setConjugatedPortDefinition(ConjugatedPortDefinition value);

} // ConjugatedPortTyping
