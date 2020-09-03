/**
 */
package org.omg.sysml.lang.sysml;

/**
 * <!-- begin-user-doc --> A representation of the model object '<em><b>Object
 * Classifier</b></em>'. <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>Classes are&nbsp;Classifiers of things (in the universe) that can be distinguished without regard to how they are related to other things (via Features). This means multiple things classified by the same Class can be distinguished, even&nbsp;when they are related&nbsp;other things in exactly the same way.</p>
 * 
 * <p>Classes serve to subdivide Classifiers into two kinds of objects: those that have some definition beyond their property values and those that are defined entirely by their values. Classes are the first kind. Two objects that are classified by a given Class can have entirely identical descriptions and properties and still be treated as separate. Classes are intended for the construction of models representing real world things which can be separate entities even if all measurable properties are the same.</p>
 * 
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getClass_()
 * @model
 * @generated
 */
public interface Class extends Classifier {
} // Class
