/**
 */
package org.omg.sysml.lang.sysml;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Constructor Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>A <code>ConstructorExpression</code> is an <code>InstantiationExpression</code> whose <code>result</code> specializes its <code>instantiatedType</code>, binding some or all of the <code>features</code> of the <code>instantiatedType</code> to the <code>results</code> of its <code>argument</code> <code>Expressions</code>.</p>
 * instantiatedType.feature->collect(f | 
 *     result.ownedFeatures->select(redefines(f)).valuation->
 *     select(v | v <> null).value
 * )
 * let features : OrderedSet(Feature) = instantiatedType.feature->
 *     select(visibility = VisibilityKind::public) in
 * result.ownedFeature->forAll(f1 | result.ownedFeature->forAll(f2 |
 *     f1 <> f2 implies
 *         f1.ownedRedefinition.redefinedFeature->
 *             intersection(f2.ownedRedefinition.redefinedFeature)->
 *             intersection(features)->isEmpty()))
 * let features : OrderedSet(Feature) = instantiatedType.feature->
 *     select(owningMembership.visibility = VisibilityKind::public) in
 * result.ownedFeature->forAll(f | 
 *     f.ownedRedefinition.redefinedFeature->
 *         intersection(features)->size() = 1)
 * TBD
 * specializes('Performances::constructorEvaluations')
 * result.specializes(instantiatedType)
 * ownedFeatures->excluding(result)->isEmpty()
 * <!-- end-model-doc -->
 *
 *
 * @see org.omg.sysml.lang.sysml.SysMLPackage#getConstructorExpression()
 * @model
 * @generated
 */
public interface ConstructorExpression extends InstantiationExpression {
} // ConstructorExpression
