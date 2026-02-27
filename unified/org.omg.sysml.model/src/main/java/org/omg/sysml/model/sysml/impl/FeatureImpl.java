/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.omg.sysml.model.sysml.CrossSubsetting;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FeatureChaining;
import org.omg.sysml.model.sysml.FeatureDirectionKind;
import org.omg.sysml.model.sysml.FeatureInverting;
import org.omg.sysml.model.sysml.FeatureMembership;
import org.omg.sysml.model.sysml.FeatureTyping;
import org.omg.sysml.model.sysml.Redefinition;
import org.omg.sysml.model.sysml.ReferenceSubsetting;
import org.omg.sysml.model.sysml.Subsetting;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Type;
import org.omg.sysml.model.sysml.TypeFeaturing;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#isIsComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#isIsConstant <em>Is Constant</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#isIsDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#isIsEnd <em>Is End</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#isIsNonunique <em>Is Nonunique</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#isIsOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#isIsPortion <em>Is Portion</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#isIsUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#isIsVariable <em>Is Variable</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getChainingFeature <em>Chaining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getCrossFeature <em>Cross Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getEndOwningType <em>End Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getFeatureTarget <em>Feature Target</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getFeaturingType <em>Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwnedCrossSubsetting <em>Owned Cross Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwnedFeatureChaining <em>Owned Feature Chaining</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwnedFeatureInverting <em>Owned Feature Inverting</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwnedReferenceSubsetting <em>Owned Reference Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwnedSubsetting <em>Owned Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwnedTypeFeaturing <em>Owned Type Featuring</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwnedTyping <em>Owned Typing</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FeatureImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends TypeImpl implements Feature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureDirectionKind getDirection() {
		return (FeatureDirectionKind)eGet(SysMLPackage.Literals.FEATURE__DIRECTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(FeatureDirectionKind newDirection) {
		eSet(SysMLPackage.Literals.FEATURE__DIRECTION, newDirection);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsComposite() {
		return (Boolean)eGet(SysMLPackage.Literals.FEATURE__IS_COMPOSITE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsComposite(boolean newIsComposite) {
		eSet(SysMLPackage.Literals.FEATURE__IS_COMPOSITE, newIsComposite);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsConstant() {
		return (Boolean)eGet(SysMLPackage.Literals.FEATURE__IS_CONSTANT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsConstant(boolean newIsConstant) {
		eSet(SysMLPackage.Literals.FEATURE__IS_CONSTANT, newIsConstant);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsDerived() {
		return (Boolean)eGet(SysMLPackage.Literals.FEATURE__IS_DERIVED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDerived(boolean newIsDerived) {
		eSet(SysMLPackage.Literals.FEATURE__IS_DERIVED, newIsDerived);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsEnd() {
		return (Boolean)eGet(SysMLPackage.Literals.FEATURE__IS_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEnd(boolean newIsEnd) {
		eSet(SysMLPackage.Literals.FEATURE__IS_END, newIsEnd);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsNonunique() {
		return (Boolean)eGet(SysMLPackage.Literals.FEATURE__IS_NONUNIQUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsNonunique(boolean newIsNonunique) {
		eSet(SysMLPackage.Literals.FEATURE__IS_NONUNIQUE, newIsNonunique);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsOrdered() {
		return (Boolean)eGet(SysMLPackage.Literals.FEATURE__IS_ORDERED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOrdered(boolean newIsOrdered) {
		eSet(SysMLPackage.Literals.FEATURE__IS_ORDERED, newIsOrdered);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsPortion() {
		return (Boolean)eGet(SysMLPackage.Literals.FEATURE__IS_PORTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPortion(boolean newIsPortion) {
		eSet(SysMLPackage.Literals.FEATURE__IS_PORTION, newIsPortion);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsUnique() {
		return (Boolean)eGet(SysMLPackage.Literals.FEATURE__IS_UNIQUE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnique(boolean newIsUnique) {
		eSet(SysMLPackage.Literals.FEATURE__IS_UNIQUE, newIsUnique);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsVariable() {
		return (Boolean)eGet(SysMLPackage.Literals.FEATURE__IS_VARIABLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsVariable(boolean newIsVariable) {
		eSet(SysMLPackage.Literals.FEATURE__IS_VARIABLE, newIsVariable);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getChainingFeature() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.FEATURE__CHAINING_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getCrossFeature() {
		return (Feature)eGet(SysMLPackage.Literals.FEATURE__CROSS_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setCrossFeature(Feature newCrossFeature) {
		eSet(SysMLPackage.Literals.FEATURE__CROSS_FEATURE, newCrossFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getEndOwningType() {
		return (Type)eGet(SysMLPackage.Literals.FEATURE__END_OWNING_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEndOwningType(Type newEndOwningType) {
		eSet(SysMLPackage.Literals.FEATURE__END_OWNING_TYPE, newEndOwningType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getFeatureTarget() {
		return (Feature)eGet(SysMLPackage.Literals.FEATURE__FEATURE_TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeatureTarget(Feature newFeatureTarget) {
		eSet(SysMLPackage.Literals.FEATURE__FEATURE_TARGET, newFeatureTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getFeaturingType() {
		return (EList<Type>)eGet(SysMLPackage.Literals.FEATURE__FEATURING_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CrossSubsetting getOwnedCrossSubsetting() {
		return (CrossSubsetting)eGet(SysMLPackage.Literals.FEATURE__OWNED_CROSS_SUBSETTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedCrossSubsetting(CrossSubsetting newOwnedCrossSubsetting) {
		eSet(SysMLPackage.Literals.FEATURE__OWNED_CROSS_SUBSETTING, newOwnedCrossSubsetting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FeatureChaining> getOwnedFeatureChaining() {
		return (EList<FeatureChaining>)eGet(SysMLPackage.Literals.FEATURE__OWNED_FEATURE_CHAINING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FeatureInverting> getOwnedFeatureInverting() {
		return (EList<FeatureInverting>)eGet(SysMLPackage.Literals.FEATURE__OWNED_FEATURE_INVERTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Redefinition> getOwnedRedefinition() {
		return (EList<Redefinition>)eGet(SysMLPackage.Literals.FEATURE__OWNED_REDEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReferenceSubsetting getOwnedReferenceSubsetting() {
		return (ReferenceSubsetting)eGet(SysMLPackage.Literals.FEATURE__OWNED_REFERENCE_SUBSETTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedReferenceSubsetting(ReferenceSubsetting newOwnedReferenceSubsetting) {
		eSet(SysMLPackage.Literals.FEATURE__OWNED_REFERENCE_SUBSETTING, newOwnedReferenceSubsetting);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return (EList<Subsetting>)eGet(SysMLPackage.Literals.FEATURE__OWNED_SUBSETTING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<TypeFeaturing> getOwnedTypeFeaturing() {
		return (EList<TypeFeaturing>)eGet(SysMLPackage.Literals.FEATURE__OWNED_TYPE_FEATURING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<FeatureTyping> getOwnedTyping() {
		return (EList<FeatureTyping>)eGet(SysMLPackage.Literals.FEATURE__OWNED_TYPING, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMembership getOwningFeatureMembership() {
		return (FeatureMembership)eGet(SysMLPackage.Literals.FEATURE__OWNING_FEATURE_MEMBERSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningFeatureMembership(FeatureMembership newOwningFeatureMembership) {
		eSet(SysMLPackage.Literals.FEATURE__OWNING_FEATURE_MEMBERSHIP, newOwningFeatureMembership);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		return (Type)eGet(SysMLPackage.Literals.FEATURE__OWNING_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningType(Type newOwningType) {
		eSet(SysMLPackage.Literals.FEATURE__OWNING_TYPE, newOwningType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getType() {
		return (EList<Type>)eGet(SysMLPackage.Literals.FEATURE__TYPE, true);
	}

	/**
	 * The cached invocation delegate for the '{@link #allRedefinedFeatures() <em>All Redefined Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #allRedefinedFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate ALL_REDEFINED_FEATURES__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___ALL_REDEFINED_FEATURES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> allRedefinedFeatures() {
		try {
			return (EList<Feature>)ALL_REDEFINED_FEATURES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #asCartesianProduct() <em>As Cartesian Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #asCartesianProduct()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate AS_CARTESIAN_PRODUCT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___AS_CARTESIAN_PRODUCT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> asCartesianProduct() {
		try {
			return (EList<Type>)AS_CARTESIAN_PRODUCT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #canAccess(org.omg.sysml.model.sysml.Feature) <em>Can Access</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #canAccess(org.omg.sysml.model.sysml.Feature)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate CAN_ACCESS_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___CAN_ACCESS__FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean canAccess(Feature feature) {
		try {
			return (Boolean)CAN_ACCESS_FEATURE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{feature}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #directionFor(org.omg.sysml.model.sysml.Type) <em>Direction For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #directionFor(org.omg.sysml.model.sysml.Type)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate DIRECTION_FOR_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___DIRECTION_FOR__TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureDirectionKind directionFor(Type type) {
		try {
			return (FeatureDirectionKind)DIRECTION_FOR_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isCartesianProduct() <em>Is Cartesian Product</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCartesianProduct()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_CARTESIAN_PRODUCT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___IS_CARTESIAN_PRODUCT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isCartesianProduct() {
		try {
			return (Boolean)IS_CARTESIAN_PRODUCT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isFeaturedWithin(org.omg.sysml.model.sysml.Type) <em>Is Featured Within</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFeaturedWithin(org.omg.sysml.model.sysml.Type)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FEATURED_WITHIN_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___IS_FEATURED_WITHIN__TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFeaturedWithin(Type type) {
		try {
			return (Boolean)IS_FEATURED_WITHIN_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isFeaturingType(org.omg.sysml.model.sysml.Type) <em>Is Featuring Type</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFeaturingType(org.omg.sysml.model.sysml.Type)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_FEATURING_TYPE_TYPE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___IS_FEATURING_TYPE__TYPE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFeaturingType(Type type) {
		try {
			return (Boolean)IS_FEATURING_TYPE_TYPE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{type}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isOwnedCrossFeature() <em>Is Owned Cross Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOwnedCrossFeature()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_OWNED_CROSS_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___IS_OWNED_CROSS_FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOwnedCrossFeature() {
		try {
			return (Boolean)IS_OWNED_CROSS_FEATURE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #namingFeature() <em>Naming Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #namingFeature()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate NAMING_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___NAMING_FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature namingFeature() {
		try {
			return (Feature)NAMING_FEATURE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #ownedCrossFeature() <em>Owned Cross Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ownedCrossFeature()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate OWNED_CROSS_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___OWNED_CROSS_FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature ownedCrossFeature() {
		try {
			return (Feature)OWNED_CROSS_FEATURE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #redefines(org.omg.sysml.model.sysml.Feature) <em>Redefines</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #redefines(org.omg.sysml.model.sysml.Feature)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REDEFINES_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___REDEFINES__FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean redefines(Feature redefinedFeature) {
		try {
			return (Boolean)REDEFINES_FEATURE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{redefinedFeature}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #redefinesFromLibrary(java.lang.String) <em>Redefines From Library</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #redefinesFromLibrary(java.lang.String)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate REDEFINES_FROM_LIBRARY_STRING__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___REDEFINES_FROM_LIBRARY__STRING).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean redefinesFromLibrary(String libraryFeatureName) {
		try {
			return (Boolean)REDEFINES_FROM_LIBRARY_STRING__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{libraryFeatureName}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #subsetsChain(org.omg.sysml.model.sysml.Feature, org.omg.sysml.model.sysml.Feature) <em>Subsets Chain</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #subsetsChain(org.omg.sysml.model.sysml.Feature, org.omg.sysml.model.sysml.Feature)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SUBSETS_CHAIN_FEATURE_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___SUBSETS_CHAIN__FEATURE_FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean subsetsChain(Feature first, Feature second) {
		try {
			return (Boolean)SUBSETS_CHAIN_FEATURE_FEATURE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(2, new Object[]{first, second}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #typingFeatures() <em>Typing Features</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #typingFeatures()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate TYPING_FEATURES__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.FEATURE___TYPING_FEATURES).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> typingFeatures() {
		try {
			return (EList<Feature>)TYPING_FEATURES__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.FEATURE___ALL_REDEFINED_FEATURES:
				return allRedefinedFeatures();
			case SysMLPackage.FEATURE___AS_CARTESIAN_PRODUCT:
				return asCartesianProduct();
			case SysMLPackage.FEATURE___CAN_ACCESS__FEATURE:
				return canAccess((Feature)arguments.get(0));
			case SysMLPackage.FEATURE___DIRECTION_FOR__TYPE:
				return directionFor((Type)arguments.get(0));
			case SysMLPackage.FEATURE___IS_CARTESIAN_PRODUCT:
				return isCartesianProduct();
			case SysMLPackage.FEATURE___IS_FEATURED_WITHIN__TYPE:
				return isFeaturedWithin((Type)arguments.get(0));
			case SysMLPackage.FEATURE___IS_FEATURING_TYPE__TYPE:
				return isFeaturingType((Type)arguments.get(0));
			case SysMLPackage.FEATURE___IS_OWNED_CROSS_FEATURE:
				return isOwnedCrossFeature();
			case SysMLPackage.FEATURE___NAMING_FEATURE:
				return namingFeature();
			case SysMLPackage.FEATURE___OWNED_CROSS_FEATURE:
				return ownedCrossFeature();
			case SysMLPackage.FEATURE___REDEFINES__FEATURE:
				return redefines((Feature)arguments.get(0));
			case SysMLPackage.FEATURE___REDEFINES_FROM_LIBRARY__STRING:
				return redefinesFromLibrary((String)arguments.get(0));
			case SysMLPackage.FEATURE___SUBSETS_CHAIN__FEATURE_FEATURE:
				return subsetsChain((Feature)arguments.get(0), (Feature)arguments.get(1));
			case SysMLPackage.FEATURE___TYPING_FEATURES:
				return typingFeatures();
		}
		return super.eInvoke(operationID, arguments);
	}

} //FeatureImpl
