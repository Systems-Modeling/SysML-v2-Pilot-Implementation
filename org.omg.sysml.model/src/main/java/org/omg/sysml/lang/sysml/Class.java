/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>Class</code> is a <code>Classifier</code> of things (in the universe) that can be distinguished without regard to how they are related to other things (via <code>Features</code>). This means multiple things classified by the same <code>Class</code> can be distinguished, even when they are related other things in exactly the same way.</p>
 * 
 * specializesFromLibrary('Occurrences::Occurrence')
 * ownedSpecialization.general->
 *     forAll(not oclIsKindOf(DataType)) and
 * not oclIsKindOf(Association) implies
 *     ownedSpecialization.general->
 *         forAll(not oclIsKindOf(Association))
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
} // Class
