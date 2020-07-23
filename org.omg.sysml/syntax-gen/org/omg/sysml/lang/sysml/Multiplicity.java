/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object
 * '<em><b>Multiplicity</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Multiplicity is a Feature whose co-domain is a set of natural numbers that includes the number&nbsp;of sequences determined below, based on the kind of&nbsp;typeWithMultiplicity (featuringType):</p>
 * 
 * <ul>
 * 	<li>Classifiers: minimal sequences (the single length sequences of the Classifier).</li>
 * 	<li>Features: sequences with the same feature-pair head.&nbsp; In the case of Features with Classifiers as domain and co-domain, these sequences are pairs, with the first element in&nbsp;a single-length sequence of the domain Classifier (head of the pair), and the number of pairs with the same first element being among the Multiplicity co-domain numbers.</li>
 * </ul>
 * 
 * <p>Multiplicity co-domains (in models) can be specified by expressions&nbsp;that might vary in their results depending on the sequence of the&nbsp;typeWithMultiplicity on which the expression is evaluated.</p>
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicity()
 * @model
 * @generated
 */
public interface Multiplicity extends Feature {

} // Multiplicity
