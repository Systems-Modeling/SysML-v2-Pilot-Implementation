/**
 */
package org.omg.sysml.lang.sysml;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Multiplicity Range</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A MultiplicityRange is a Multiplicity whose value is defined to be the (inclusive) range of natural numbers given by the result of a lowerBound Expression and the result of an upperBoundExpression. The result of the lowerBound Expression shall be of type Natural, while the result of the upperBound Expression shall be of type UnlimitedNatural. If the result of the upperBound Expression is the "unbounded" value *, then the specified range includes all natural numbers greater than or equal to the lowerBound value.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.MultiplicityRange#getLowerBound <em>Lower Bound</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.MultiplicityRange#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.MultiplicityRange#getBound <em>Bound</em>}</li>
 * </ul>
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicityRange()
 * @model
 * @generated
 */
public interface MultiplicityRange extends Multiplicity {
	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.MultiplicityRange#getBound() <em>Bound</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Expression whose result provides the lower bound of MultiplicityRange. If no lowerBound Expression is given, then the lower bound shall have the same value as the upper bound, unless the upper bound is unbounded (*), in which case the lower bound shall be 0.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lower Bound</em>' reference.
	 * @see #setLowerBound(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicityRange_LowerBound()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='multiplicity'"
	 *        annotation="subsets"
	 * @generated
	 */
	Expression getLowerBound();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MultiplicityRange#getLowerBound <em>Lower Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' reference.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(Expression value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' reference.
	 * <p>
	 * This feature subsets the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.MultiplicityRange#getBound() <em>Bound</em>}'</li>
	 * </ul>
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The Expression whose result is the upper bound of the MultiplicityRange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Upper Bound</em>' reference.
	 * @see #setUpperBound(Expression)
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicityRange_UpperBound()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='multiplicity'"
	 *        annotation="subsets"
	 * @generated
	 */
	Expression getUpperBound();

	/**
	 * Sets the value of the '{@link org.omg.sysml.lang.sysml.MultiplicityRange#getUpperBound <em>Upper Bound</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' reference.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(Expression value);

	/**
	 * Returns the value of the '<em><b>Bound</b></em>' reference list.
	 * The list contents are of type {@link org.omg.sysml.lang.sysml.Expression}.
	 * <p>
	 * This feature redefines the following features:
	 * </p>
	 * <ul>
	 *   <li>'{@link org.omg.sysml.lang.sysml.Type#getOwnedFeature() <em>Owned Feature</em>}'</li>
	 * </ul>
	 * This feature is a derived union.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bound</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The bound Expressions of the MultiplicityRange. These shall be the only ownedFeatures of the MultiplicityRange.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bound</em>' reference list.
	 * @see org.omg.sysml.lang.sysml.SysMLPackage#getMultiplicityRange_Bound()
	 * @model required="true" upper="2" transient="true" changeable="false" volatile="true" derived="true"
	 *        annotation="http://schema.omg.org/spec/MOF/2.0/emof.xml#Property.oppositeRoleName body='multiplicity'"
	 *        annotation="union"
	 *        annotation="redefines"
	 * @generated
	 */
	EList<Expression> getBound();

} // MultiplicityRange
