/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>End
 * Feature Membership</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An EndFeatureMembership is a FeatureMembership that specifies the <code>memberFeature</code> as an <code>endFeature</code> of the <code>owningType</code> of the EndFeatureMembership. EndFeatureMembership has exactly the same meaning as FeatureMembership, except that the semantics of Multiplicity is different for <code>endFeatures</code>.</p>
 * 
 * <p>An <code>endFeature</code> is always considered to map each domain entity to a single co-domain entity, whether or not a Multiplicity is given for it. If a Multiplicity is given for an <code>endFeature</code>, rather than giving the co-domain cardinality for the Feature as usual, it specifies a cardinality constraint for <em>navigating</em> across the <code>endFeatures</code> of the <code>featuringType</code> of the end Feature. That is, if a Type has <em>n</em> <code>endFeatures</code>, then the Multiplicity of any one of those end Features constrains the cardinality of the set of values of that Feature when the values of the other <em>n-1</em> end Features are held fixed.</p>
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getEndFeatureMembership()
 * @model
 * @generated
 */
public interface EndFeatureMembership extends FeatureMembership {

} // EndFeatureMembership
