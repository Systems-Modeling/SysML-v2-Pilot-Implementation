/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>End
 * Feature Membership</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>An EndFeatureMembership is a FeatureMembership that specifies the memberFeature as an <em>end</em> Feature of the owningType of the EndFeatureMembership. EndFeatureMembership has exactly the same meaning as FeatureMembership, except that the semantics of Multiplicity is different for end Features.</p>
 * 
 * <p>An end Feature is always considered to map each domain entity to a single range entity, whether or not a Multiplicity is given for it. If a Multiplicity constraint <em>is</em> given for an end Feature, rather than giving the range cardinality for the Feature as usual, it specifies a cardinality constraint for <em>navigating</em> across the end Features of the featuringType of the end Feature. That is, if a Type has n end Features, then the Multiplicity of any one of those end Features constrains the cardinality of the set of values of that Feature when the values of the other n-1 end Features are held fixed.</p>
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
