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
 * <p>A Classifier is a Type whose instances include individual things, such as cars, ships or people, and all relations (navigations) to those things via Features. To support this, FeatureTyping is a kind of Generalization, so every Feature typed by a Classifier is&nbsp;a specialization of that Classifier (instances of such Features are also instances of the Classifier).</p>
 * 
 * <p>Like Features, instances of a Classifier can also be interpreted as n-tuples. Unlike a Feature, however, the instances of a Classifier include the case of n=1, that is, individual entities. Ffor every n-tuple that is an instance of a Classifier, the n-th member of the n-tuple must also be an entity that is also individually an instance of the Classifier (because FeatureTyping is a kind of Generalization).</p>
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
	 * <!-- begin-model-doc -->
	 * <p>The relationship leading from the <code>subclass</code> to a more general Classifier and is owned by the <code>subclass</code>.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Superclassing</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClassifier_OwnedSuperclassing()
	 * @see org.omg.sysml.lang.sysml.Superclassing#getOwningClassifier
	 * @model opposite="owningClassifier" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="subsets"
	 * @generated
	 */
	EList<Superclassing> getOwnedSuperclassing();
} // Classifier
