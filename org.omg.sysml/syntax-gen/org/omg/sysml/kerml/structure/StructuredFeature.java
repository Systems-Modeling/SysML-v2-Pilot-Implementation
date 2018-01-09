/**
 */
package org.omg.sysml.kerml.structure;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Structured Feature</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#getOutsideAccess <em>Outside Access</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#getInsideAccess <em>Inside Access</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#getUnion <em>Union</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#getOption <em>Option</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#getEndOf <em>End Of</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#getParticipatesIn <em>Participates In</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsOutput <em>Is Output</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature()
 * @model
 * @generated
 */
public interface StructuredFeature extends Feature {
	/**
	 * Returns the value of the '<em><b>Is Port</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Port</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Port</em>' attribute.
	 * @see #setIsPort(boolean)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_IsPort()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsPort();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsPort <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Port</em>' attribute.
	 * @see #isIsPort()
	 * @generated
	 */
	void setIsPort(boolean value);

	/**
	 * Returns the value of the '<em><b>Outside Access</b></em>' attribute list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.PropertyAccessKind}.
	 * The literals are from the enumeration {@link org.omg.sysml.kerml.structure.PropertyAccessKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outside Access</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outside Access</em>' attribute list.
	 * @see org.omg.sysml.kerml.structure.PropertyAccessKind
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_OutsideAccess()
	 * @model upper="2" ordered="false"
	 * @generated
	 */
	EList<PropertyAccessKind> getOutsideAccess();

	/**
	 * Returns the value of the '<em><b>Inside Access</b></em>' attribute list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.PropertyAccessKind}.
	 * The literals are from the enumeration {@link org.omg.sysml.kerml.structure.PropertyAccessKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Inside Access</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Inside Access</em>' attribute list.
	 * @see org.omg.sysml.kerml.structure.PropertyAccessKind
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_InsideAccess()
	 * @model upper="2" ordered="false"
	 * @generated
	 */
	EList<PropertyAccessKind> getInsideAccess();

	/**
	 * Returns the value of the '<em><b>Union</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.kerml.structure.StructuredFeature}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union</em>' reference list.
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_Union()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	EList<StructuredFeature> getUnion();

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.ValueOption#getOptionOfProperty <em>Option Of Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference.
	 * @see #setOption(ValueOption)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_Option()
	 * @see org.omg.sysml.kerml.structure.ValueOption#getOptionOfProperty
	 * @model opposite="optionOfProperty" containment="true" required="true" derived="true" ordered="false"
	 * @generated
	 */
	ValueOption getOption();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredFeature#getOption <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Option</em>' containment reference.
	 * @see #getOption()
	 * @generated
	 */
	void setOption(ValueOption value);

	/**
	 * Returns the value of the '<em><b>Is Navigable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Navigable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Navigable</em>' attribute.
	 * @see #setIsNavigable(boolean)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_IsNavigable()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsNavigable();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsNavigable <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Navigable</em>' attribute.
	 * @see #isIsNavigable()
	 * @generated
	 */
	void setIsNavigable(boolean value);

	/**
	 * Returns the value of the '<em><b>Aggregation</b></em>' attribute.
	 * The literals are from the enumeration {@link org.omg.sysml.kerml.structure.AggregationKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Aggregation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Aggregation</em>' attribute.
	 * @see org.omg.sysml.kerml.structure.AggregationKind
	 * @see #setAggregation(AggregationKind)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_Aggregation()
	 * @model ordered="false"
	 * @generated
	 */
	AggregationKind getAggregation();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredFeature#getAggregation <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Aggregation</em>' attribute.
	 * @see org.omg.sysml.kerml.structure.AggregationKind
	 * @see #getAggregation()
	 * @generated
	 */
	void setAggregation(AggregationKind value);

	/**
	 * Returns the value of the '<em><b>End Of</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Association#getEndProperty <em>End Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>End Of</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>End Of</em>' reference.
	 * @see #setEndOf(Association)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_EndOf()
	 * @see org.omg.sysml.kerml.structure.Association#getEndProperty
	 * @model opposite="endProperty" derived="true" ordered="false"
	 * @generated
	 */
	Association getEndOf();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredFeature#getEndOf <em>End Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>End Of</em>' reference.
	 * @see #getEndOf()
	 * @generated
	 */
	void setEndOf(Association value);

	/**
	 * Returns the value of the '<em><b>Participates In</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.omg.sysml.kerml.structure.Association#getParticipantProperty <em>Participant Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participates In</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participates In</em>' reference.
	 * @see #setParticipatesIn(Association)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_ParticipatesIn()
	 * @see org.omg.sysml.kerml.structure.Association#getParticipantProperty
	 * @model opposite="participantProperty" derived="true" ordered="false"
	 * @generated
	 */
	Association getParticipatesIn();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredFeature#getParticipatesIn <em>Participates In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participates In</em>' reference.
	 * @see #getParticipatesIn()
	 * @generated
	 */
	void setParticipatesIn(Association value);

	/**
	 * Returns the value of the '<em><b>Is Input</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Input</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Input</em>' attribute.
	 * @see #setIsInput(boolean)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_IsInput()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsInput();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsInput <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Input</em>' attribute.
	 * @see #isIsInput()
	 * @generated
	 */
	void setIsInput(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Output</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Output</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Output</em>' attribute.
	 * @see #setIsOutput(boolean)
	 * @see org.omg.sysml.kerml.structure.StructurePackage#getStructuredFeature_IsOutput()
	 * @model derived="true" ordered="false"
	 * @generated
	 */
	boolean isIsOutput();

	/**
	 * Sets the value of the '{@link org.omg.sysml.kerml.structure.StructuredFeature#isIsOutput <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Output</em>' attribute.
	 * @see #isIsOutput()
	 * @generated
	 */
	void setIsOutput(boolean value);

} // StructuredFeature
