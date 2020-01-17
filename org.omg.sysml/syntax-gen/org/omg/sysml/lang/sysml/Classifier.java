/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Classifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A Classifier is a Type whose instances include individual entities from the universe of discourse, such as cars, ships or people. However, since FeatureTyping is a kind of Generalization, every Feature typed by a Classifier (directly or indirectly) is semantically a subtype of that Classifier. Therefore, instances of such Features are also instances of the Classifier.</p>
 *     
 * <p>Thus, like Features, instances of a Classifier can also, in general, be interpreted as n-tuples. Unlike a Feature, however, the instances of a Classifier include the case of n=1, that is, individual entities. Indeed, for every n-tuple that is an instance of a Classifier, the n-th member of the n-tuple must also be an entity that is also individually an instance of the Classifier (essentially due to the semantics of FeatureTyping).</p>
 * 
 * ownedSuperclassings = ownedGeneralizations->intersection(superclassing)
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.Classifier#getOwnedSuperclassing <em>Owned Superclassing</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClassifier()
 * @model
 * @generated
 */
public interface Classifier extends Type {

	/**
	 * Returns the value of the '<em><b>Owned Superclassing</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Superclassing}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier <em>Owning Classifier</em>}'.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedGeneralization() <em>Owned Generalization</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owned Superclassing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Superclassing</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClassifier_OwnedSuperclassing()
	 * @see org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier
	 * @model opposite="owningClassifier" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Superclassing> getOwnedSuperclassing();
} // Classifier
