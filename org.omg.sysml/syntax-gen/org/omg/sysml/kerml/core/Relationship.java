/**
 */
package org.omg.sysml.kerml.core;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A type of ElementRecord which represents a link between to other ElementRecord's. This link is optionally directional by specifying a source and target.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.core.Relationship#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.Relationship#getRelated <em>Related</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.Relationship#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.core.CorePackage#getRelationship()
 * @model
 * @generated
 */
public interface Relationship extends ElementRecord {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.ElementRecord#getSourceRelationship <em>Source Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(ElementRecord)
	 * @see org.omg.sysml.kerml.core.CorePackage#getRelationship_Source()
	 * @see org.omg.sysml.kerml.core.ElementRecord#getSourceRelationship
	 * @model opposite="sourceRelationship" ordered="false"
	 * @generated
	 */
	ElementRecord getSource();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.core.Relationship#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(ElementRecord value);

	/**
	 * Returns the value of the '<em><b>Related</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.core.ElementRecord}.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.ElementRecord#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Related</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Related</em>' reference list.
	 * @see org.omg.sysml.kerml.core.CorePackage#getRelationship_Related()
	 * @see org.omg.sysml.kerml.core.ElementRecord#getRelationship
	 * @model opposite="relationship" upper="2" derived="true" ordered="false"
	 * @generated
	 */
	EList<ElementRecord> getRelated();

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.core.ElementRecord#getTargetRelationship <em>Target Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(ElementRecord)
	 * @see org.omg.sysml.kerml.core.CorePackage#getRelationship_Target()
	 * @see org.omg.sysml.kerml.core.ElementRecord#getTargetRelationship
	 * @model opposite="targetRelationship" ordered="false"
	 * @generated
	 */
	ElementRecord getTarget();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.core.Relationship#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(ElementRecord value);

} // Relationship
