/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Action Usage</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A LoopActionUsage is an ActionUsage that is typed, directly or indirectly, by the ActionDefinition <em>LoopAction</em> from the Systems model library. It specifies that its <code>bodyAction</code> should be performed repeatedly. Its subclasses WhileLoopAction and ForLoopAction provide different ways to determine how many times the <code>bodyAction should be performed.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.LoopActionUsage#getBodyAction <em>Body Action</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLoopActionUsage()
 * @model abstract="true"
 * @generated
 */
public interface LoopActionUsage extends ActionUsage {
	/**
	 * Returns the value of the '<em><b>Body Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>The ActionUsage to be performed repeatedly by the LoopActionUsage. Derived as the FeatureValue for the redefined <em><code>body</code><em> parameter of the LoopActionUsage.</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Body Action</em>' reference.
	 * @see #setBodyAction(ActionUsage)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getLoopActionUsage_BodyAction()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='loopAction'"
	 * @generated
	 */
	ActionUsage getBodyAction();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.LoopActionUsage#getBodyAction <em>Body Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Body Action</em>' reference.
	 * @see #getBodyAction()
	 * @generated
	 */
	void setBodyAction(ActionUsage value);

} // LoopActionUsage
