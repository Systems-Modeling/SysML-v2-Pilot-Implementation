/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureChaining;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureInverting;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedTypeFeaturing <em>Owned Type Featuring</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getEndOwningType <em>End Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedSubsetting <em>Owned Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isEnd <em>Is End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedTyping <em>Owned Typing</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getFeaturingType <em>Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isDerived <em>Is Derived</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getChainingFeature <em>Chaining Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedFeatureInverting <em>Owned Feature Inverting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedFeatureChaining <em>Owned Feature Chaining</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isReadOnly <em>Is Read Only</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isPortion <em>Is Portion</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isNonunique <em>Is Nonunique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends TypeImpl implements Feature {
	
	public static final String FEATURE_TRANSFER_SOURCE_OUTPUT = "Transfers::Transfer::transferSource::sourceOutput";
	public static final String FEATURE_TRANSFER_TARGET_INPUT = "Transfers::Transfer::transferTarget::targetInput";
	
	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;
	/**
	 * The cached value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;
	/**
	 * The default value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;
	/**
	 * The default value of the '{@link #isComposite() <em>Is Composite</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;
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
	 * @generated NOT
	 */
	public EList<Type> getType() {
		return getAllTypes();
	}
	
	public EList<Type> getAllTypes() {
		return FeatureUtil.cacheTypesOf(this, ()->{
			EList<Type> types = new NonNotifyingEObjectEList<Type>(Type.class, this, SysMLPackage.FEATURE__TYPE);
			getTypes(types, new HashSet<Feature>());
			removeRedundantTypes(types);
			return types;
		});
	}
	
	protected void getTypes(List<Type> types, Set<Feature> visitedFeatures) {
		visitedFeatures.add(this);
		getFeatureTypes(types, visitedFeatures);		
		Conjugation conjugator = getOwnedConjugator();
		if (conjugator != null) {
			Type originalType = conjugator.getOriginalType();
			if (originalType instanceof Feature && !visitedFeatures.contains(originalType)) {
				((FeatureImpl)originalType).getTypes(types, visitedFeatures);
			}
		}
		for (Feature subsettedFeature: FeatureUtil.getSubsettedFeaturesOf(this)) {
			if (subsettedFeature != null && !visitedFeatures.contains(subsettedFeature)) {
				((FeatureImpl)subsettedFeature).getTypes(types, visitedFeatures);
			}
		}		
	}
	
	protected void getFeatureTypes(List<Type> types, Set<Feature> visitedFeatures) {
		getOwnedTyping().stream().
				map(typing->typing.getType()).
				filter(type->type != null).
				forEachOrdered(types::add);
		types.addAll(TypeUtil.getImplicitGeneralTypesFor(this, SysMLPackage.eINSTANCE.getFeatureTyping()));
		Feature lastChainingFeature = FeatureUtil.getLastChainingFeatureOf(this);
		if (lastChainingFeature != null && !visitedFeatures.contains(lastChainingFeature)) {
			((FeatureImpl)lastChainingFeature).getTypes(types, visitedFeatures);
		}
	}
	
	protected static void removeRedundantTypes(List<Type> types) {
		for (int i = types.size() - 1; i >= 0 ; i--) {
			Type type = types.get(i);
			if (types.stream().anyMatch(otherType->otherType != type && TypeUtil.conforms(otherType, type))) {
				types.remove(i);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		Type owningType = basicGetOwningType();
		return owningType != null && owningType.eIsProxy() ? (Type)eResolveProxy((InternalEObject)owningType) : owningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetOwningType() {
		FeatureMembership membership = getOwningFeatureMembership();
		return membership == null? null: membership.getOwningType();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningType(Type newOwningType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_UNIQUE, oldIsUnique, isUnique));
	}
	
	private boolean isOrderChecked = false;

	/**
	 * <!-- begin-user-doc -->
	 * Force the Feature to be ordered if any subsetted Feature is ordered.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isOrdered() {
		return checkIsOrdered(this, new HashSet<Feature>());
	}
	
	public static boolean checkIsOrdered(FeatureImpl feature, Set<Feature> visited) {
		if (feature.isOrdered || feature.isOrderChecked) {
			return feature.isOrdered;
		} else {
			visited.add(feature);
			for (Feature subsettedFeature: FeatureUtil.getSubsettedFeaturesOf(feature)) {
				if (subsettedFeature != null && !visited.contains(subsettedFeature) && 
						checkIsOrdered(((FeatureImpl)subsettedFeature), visited)) {
					return true;
				}
			}
			return false;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_ORDERED, oldIsOrdered, isOrdered));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Redefinition> getOwnedRedefinition() {
		return new DerivedSubsetEObjectEList<>(Redefinition.class, this, SysMLPackage.FEATURE__OWNED_REDEFINITION, new int[] {SysMLPackage.FEATURE__OWNED_SPECIALIZATION});
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Subsetting> getOwnedSubsetting() {
		return new DerivedSubsetEObjectEList<>(Subsetting.class, this, SysMLPackage.FEATURE__OWNED_SUBSETTING, new int[] {SysMLPackage.FEATURE__OWNED_SPECIALIZATION});
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<FeatureTyping> getOwnedTyping() {
		return new DerivedSubsetEObjectEList<>(FeatureTyping.class, this, SysMLPackage.FEATURE__OWNED_TYPING, new int[] {SysMLPackage.FEATURE__OWNED_SPECIALIZATION});
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Type> getFeaturingType() {
		EList<Type> featuringTypes = new NonNotifyingEObjectEList<>(Type.class, this, SysMLPackage.FEATURE__FEATURING_TYPE);
		getOwnedTypeFeaturing().stream().
			map(TypeFeaturing::getFeaturingType).
			filter(featuring->featuring != null).
			forEachOrdered(featuringTypes::add);
		Type owningType = getOwningType();
		if (owningType != null) {
			featuringTypes.add(getOwningType());
		}
		FeatureUtil.forEachImplicitFeaturingTypeOf(this, featuringTypes::add);
		Feature firstChainingFeature = FeatureUtil.getFirstChainingFeatureOf(this);
		if (firstChainingFeature != null) {
			featuringTypes.addAll(firstChainingFeature.getFeaturingType());
		}
		return featuringTypes;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMembership getOwningFeatureMembership() {
		FeatureMembership owningFeatureMembership = basicGetOwningFeatureMembership();
		return owningFeatureMembership != null && owningFeatureMembership.eIsProxy() ? (FeatureMembership)eResolveProxy((InternalEObject)owningFeatureMembership) : owningFeatureMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FeatureMembership basicGetOwningFeatureMembership() {
		Membership owningMembership = super.basicGetOwningMembership();
		return owningMembership instanceof FeatureMembership? (FeatureMembership)owningMembership: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningFeatureMembership(FeatureMembership newOwningFeatureMembership) {
		super.setOwningMembership(newOwningFeatureMembership);;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsComposite(boolean newIsComposite) {
		boolean oldIsComposite = isComposite;
		isComposite = newIsComposite;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_COMPOSITE, oldIsComposite, isComposite));
	}

	/**
	 * Locally cached value for isComposite. This allows isComposite to be set directly
	 * on a Feature, and then propagated back to the owningFeatureMembership, once this
	 * is set.
	 */
	protected boolean isComposite = false;
	
	/**
	 * The default value of the '{@link #isEnd() <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_END_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isEnd() <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnd()
	 * @generated
	 * @ordered
	 */
	protected boolean isEnd = IS_END_EDEFAULT;
	/**
	 * The default value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DERIVED_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isDerived() <em>Is Derived</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDerived()
	 * @generated
	 * @ordered
	 */
	protected boolean isDerived = IS_DERIVED_EDEFAULT;
	/**
	 * The default value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_READ_ONLY_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isReadOnly() <em>Is Read Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReadOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean isReadOnly = IS_READ_ONLY_EDEFAULT;
	/**
	 * The default value of the '{@link #isPortion() <em>Is Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPortion()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PORTION_EDEFAULT = false;
	/**
	 * The cached value of the '{@link #isPortion() <em>Is Portion</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPortion()
	 * @generated
	 * @ordered
	 */
	protected boolean isPortion = IS_PORTION_EDEFAULT;
	/**
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated NOT
	 * @ordered
	 */
	protected static final FeatureDirectionKind DIRECTION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected FeatureDirectionKind direction = DIRECTION_EDEFAULT;
	/**
	 * The default value of the '{@link #isNonunique() <em>Is Nonunique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonunique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NONUNIQUE_EDEFAULT = false;

	public boolean basicIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isPortion() {
		return isPortion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsPortion(boolean newIsPortion) {
		boolean oldIsPortion = isPortion;
		isPortion = newIsPortion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_PORTION, oldIsPortion, isPortion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isEnd() {
		if (getOwningMembership() instanceof EndFeatureMembership) {
			isEnd = true;
		}
		return isEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsEnd(boolean newIsEnd) {
		boolean oldIsEnd = isEnd;
		isEnd = newIsEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_END, oldIsEnd, isEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public FeatureDirectionKind getDirection() {
		if (direction == null) {
			Membership owningMembership = getOwningMembership();
			if (owningMembership instanceof ReturnParameterMembership) {
				direction = FeatureDirectionKind.OUT;
			} else if (owningMembership instanceof ParameterMembership) {
				direction = FeatureDirectionKind.IN;
			}
		}
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDirection(FeatureDirectionKind newDirection) {
		FeatureDirectionKind oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__DIRECTION, oldDirection, direction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getEndOwningType() {
		Type endOwningType = basicGetEndOwningType();
		return endOwningType != null && endOwningType.eIsProxy() ? (Type)eResolveProxy((InternalEObject)endOwningType) : endOwningType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Type basicGetEndOwningType() {
		return isEnd()? basicGetOwningType(): null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setEndOwningType(Type newEndOwningType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isNonunique() {
		return !isUnique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsNonunique(boolean newIsNonunique) {
		this.setIsUnique(!newIsNonunique);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.FEATURE__OWNED_RELATIONSHIP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TypeFeaturing> getOwnedTypeFeaturing() {
		EList<TypeFeaturing> featurings = new NonNotifyingEObjectEList<>(TypeFeaturing.class, this, SysMLPackage.FEATURE__OWNED_TYPE_FEATURING);
		getOwnedRelationship().stream().
			filter(rel->(rel instanceof TypeFeaturing) && ((TypeFeaturing)rel).getFeatureOfType() == this).
			map(TypeFeaturing.class::cast).
			forEachOrdered(featurings::add);
		return featurings;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedTypeFeaturing() <em>Owned Type Featuring</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedTypeFeaturing()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_TYPE_FEATURING_ESUPERSETS = new int[] {SysMLPackage.FEATURE__OWNED_RELATIONSHIP};
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getChainingFeature() {
		EList<Feature> chainingFeatures = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.FEATURE__CHAINING_FEATURE, false);
		getOwnedFeatureChaining().stream().
			map(FeatureChaining::getChainingFeature).
			forEachOrdered(chainingFeatures::add);
		return chainingFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<FeatureInverting> getOwnedFeatureInverting() {
		EList<FeatureInverting> invertings = new NonNotifyingEObjectEList<>(FeatureInverting.class, this, SysMLPackage.FEATURE__OWNED_FEATURE_INVERTING);
		getOwnedRelationship().stream().
			filter(rel->(rel instanceof FeatureInverting) && ((FeatureInverting)rel).getFeatureInverted() == this).
			map(FeatureInverting.class::cast).
			forEachOrdered(invertings::add);
		return invertings;
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedFeatureInverting() <em>Owned Feature Inverting</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureInverting()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_FEATURE_INVERTING_ESUPERSETS = new int[] {SysMLPackage.FEATURE__OWNED_RELATIONSHIP};
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<FeatureChaining> getOwnedFeatureChaining() {
		return new DerivedSubsetEObjectEList<>(FeatureChaining.class, this, SysMLPackage.FEATURE__OWNED_FEATURE_CHAINING, new int[] {SysMLPackage.FEATURE__OWNED_RELATIONSHIP});
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedFeatureChaining() <em>Owned Feature Chaining</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureChaining()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_FEATURE_CHAINING_ESUPERSETS = new int[] {SysMLPackage.FEATURE__OWNED_RELATIONSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDerived() {
		return isDerived;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsDerived(boolean newIsDerived) {
		boolean oldIsDerived = isDerived;
		isDerived = newIsDerived;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_DERIVED, oldIsDerived, isDerived));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReadOnly() {
		return isReadOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsReadOnly(boolean newIsReadOnly) {
		boolean oldIsReadOnly = isReadOnly;
		isReadOnly = newIsReadOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_READ_ONLY, oldIsReadOnly, isReadOnly));
	}

	// Operations

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public FeatureDirectionKind directionFor(Type type) {
		return type.directionOf(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isFeaturedWithin(Type type) {
		List<Type> featuringTypes = getFeaturingType();
		return featuringTypes.stream().anyMatch(featuringType->
			   		type != null && TypeUtil.conforms(featuringType, type) ||
					featuringType instanceof Feature &&
					((Feature)featuringType).isFeaturedWithin(type));
	}

	protected String effectiveName = null;
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String effectiveName() {
		return effectiveName(new HashSet<Feature>());
	}
	
	public String effectiveName(Set<Feature> visited) {
		String name = super.effectiveName();
		if (name == null) {
			if (effectiveName == null) {
				visited.add(this);
				Feature namingFeature = namingFeature();
				if (namingFeature != null && !visited.contains(namingFeature)) {
					effectiveName = ((FeatureImpl)namingFeature).effectiveName(visited);
				}
			}
			name = effectiveName;
		}
		return name;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature namingFeature() {
		return firstRedefinedFeature();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature firstSubsettedFeature() {
		return FeatureUtil.getSubsettedNotRedefinedFeaturesOf(this).stream().
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature firstRedefinedFeature() {
		return FeatureUtil.getRedefinedFeaturesWithComputedOf(this, null).stream().
				findFirst().orElse(null);
	}
	
	// Additional overrides
	
	@Override
	protected void addInheritedMemberships(EList<Membership> inheritedMemberships, Collection<Namespace> excludedNamespaces, Collection<Type> excludedTypes, boolean includeProtected) {
		super.addInheritedMemberships(inheritedMemberships, excludedNamespaces, excludedTypes, includeProtected);
		EList<FeatureChaining> featureChainings = getOwnedFeatureChaining();
		if (!featureChainings.isEmpty()) {
			Feature chainingFeature = featureChainings.get(featureChainings.size()-1).getChainingFeature();
			if (chainingFeature != null && !excludedTypes.contains(chainingFeature)) {
				inheritedMemberships.addAll(((TypeImpl)chainingFeature).getNonPrivateMembership(excludedNamespaces, excludedTypes, includeProtected));
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE__OWNED_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE__OWNED_RELATIONSHIP:
				return ((InternalEList<?>)getOwnedRelationship()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FEATURE__OWNED_TYPE_FEATURING:
				return getOwnedTypeFeaturing();
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				if (resolve) return getOwningFeatureMembership();
				return basicGetOwningFeatureMembership();
			case SysMLPackage.FEATURE__OWNING_TYPE:
				if (resolve) return getOwningType();
				return basicGetOwningType();
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				if (resolve) return getEndOwningType();
				return basicGetEndOwningType();
			case SysMLPackage.FEATURE__IS_UNIQUE:
				return isUnique();
			case SysMLPackage.FEATURE__IS_ORDERED:
				return isOrdered();
			case SysMLPackage.FEATURE__TYPE:
				return getType();
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				return getOwnedRedefinition();
			case SysMLPackage.FEATURE__OWNED_SUBSETTING:
				return getOwnedSubsetting();
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				return isComposite();
			case SysMLPackage.FEATURE__IS_END:
				return isEnd();
			case SysMLPackage.FEATURE__OWNED_TYPING:
				return getOwnedTyping();
			case SysMLPackage.FEATURE__FEATURING_TYPE:
				return getFeaturingType();
			case SysMLPackage.FEATURE__IS_DERIVED:
				return isDerived();
			case SysMLPackage.FEATURE__CHAINING_FEATURE:
				return getChainingFeature();
			case SysMLPackage.FEATURE__OWNED_FEATURE_INVERTING:
				return getOwnedFeatureInverting();
			case SysMLPackage.FEATURE__OWNED_FEATURE_CHAINING:
				return getOwnedFeatureChaining();
			case SysMLPackage.FEATURE__IS_READ_ONLY:
				return isReadOnly();
			case SysMLPackage.FEATURE__IS_PORTION:
				return isPortion();
			case SysMLPackage.FEATURE__DIRECTION:
				return getDirection();
			case SysMLPackage.FEATURE__IS_NONUNIQUE:
				return isNonunique();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.FEATURE__OWNED_TYPE_FEATURING:
				getOwnedTypeFeaturing().clear();
				getOwnedTypeFeaturing().addAll((Collection<? extends TypeFeaturing>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)newValue);
				return;
			case SysMLPackage.FEATURE__OWNING_TYPE:
				setOwningType((Type)newValue);
				return;
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				setEndOwningType((Type)newValue);
				return;
			case SysMLPackage.FEATURE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Type>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				getOwnedRedefinition().clear();
				getOwnedRedefinition().addAll((Collection<? extends Redefinition>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_SUBSETTING:
				getOwnedSubsetting().clear();
				getOwnedSubsetting().addAll((Collection<? extends Subsetting>)newValue);
				return;
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__IS_END:
				setIsEnd((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_TYPING:
				getOwnedTyping().clear();
				getOwnedTyping().addAll((Collection<? extends FeatureTyping>)newValue);
				return;
			case SysMLPackage.FEATURE__FEATURING_TYPE:
				getFeaturingType().clear();
				getFeaturingType().addAll((Collection<? extends Type>)newValue);
				return;
			case SysMLPackage.FEATURE__IS_DERIVED:
				setIsDerived((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__CHAINING_FEATURE:
				getChainingFeature().clear();
				getChainingFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_FEATURE_INVERTING:
				getOwnedFeatureInverting().clear();
				getOwnedFeatureInverting().addAll((Collection<? extends FeatureInverting>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_FEATURE_CHAINING:
				getOwnedFeatureChaining().clear();
				getOwnedFeatureChaining().addAll((Collection<? extends FeatureChaining>)newValue);
				return;
			case SysMLPackage.FEATURE__IS_READ_ONLY:
				setIsReadOnly((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__IS_PORTION:
				setIsPortion((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__DIRECTION:
				setDirection((FeatureDirectionKind)newValue);
				return;
			case SysMLPackage.FEATURE__IS_NONUNIQUE:
				setIsNonunique((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.FEATURE__OWNED_TYPE_FEATURING:
				getOwnedTypeFeaturing().clear();
				return;
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)null);
				return;
			case SysMLPackage.FEATURE__OWNING_TYPE:
				setOwningType((Type)null);
				return;
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				setEndOwningType((Type)null);
				return;
			case SysMLPackage.FEATURE__IS_UNIQUE:
				setIsUnique(IS_UNIQUE_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__IS_ORDERED:
				setIsOrdered(IS_ORDERED_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__TYPE:
				getType().clear();
				return;
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				getOwnedRedefinition().clear();
				return;
			case SysMLPackage.FEATURE__OWNED_SUBSETTING:
				getOwnedSubsetting().clear();
				return;
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__IS_END:
				setIsEnd(IS_END_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__OWNED_TYPING:
				getOwnedTyping().clear();
				return;
			case SysMLPackage.FEATURE__FEATURING_TYPE:
				getFeaturingType().clear();
				return;
			case SysMLPackage.FEATURE__IS_DERIVED:
				setIsDerived(IS_DERIVED_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__CHAINING_FEATURE:
				getChainingFeature().clear();
				return;
			case SysMLPackage.FEATURE__OWNED_FEATURE_INVERTING:
				getOwnedFeatureInverting().clear();
				return;
			case SysMLPackage.FEATURE__OWNED_FEATURE_CHAINING:
				getOwnedFeatureChaining().clear();
				return;
			case SysMLPackage.FEATURE__IS_READ_ONLY:
				setIsReadOnly(IS_READ_ONLY_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__IS_PORTION:
				setIsPortion(IS_PORTION_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__IS_NONUNIQUE:
				setIsNonunique(IS_NONUNIQUE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.FEATURE__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
			case SysMLPackage.FEATURE__OWNED_TYPE_FEATURING:
				return !getOwnedTypeFeaturing().isEmpty();
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return basicGetOwningFeatureMembership() != null;
			case SysMLPackage.FEATURE__OWNING_TYPE:
				return basicGetOwningType() != null;
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				return basicGetEndOwningType() != null;
			case SysMLPackage.FEATURE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case SysMLPackage.FEATURE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case SysMLPackage.FEATURE__TYPE:
				return !getType().isEmpty();
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				return !getOwnedRedefinition().isEmpty();
			case SysMLPackage.FEATURE__OWNED_SUBSETTING:
				return !getOwnedSubsetting().isEmpty();
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				return isComposite != IS_COMPOSITE_EDEFAULT;
			case SysMLPackage.FEATURE__IS_END:
				return isEnd != IS_END_EDEFAULT;
			case SysMLPackage.FEATURE__OWNED_TYPING:
				return !getOwnedTyping().isEmpty();
			case SysMLPackage.FEATURE__FEATURING_TYPE:
				return !getFeaturingType().isEmpty();
			case SysMLPackage.FEATURE__IS_DERIVED:
				return isDerived != IS_DERIVED_EDEFAULT;
			case SysMLPackage.FEATURE__CHAINING_FEATURE:
				return !getChainingFeature().isEmpty();
			case SysMLPackage.FEATURE__OWNED_FEATURE_INVERTING:
				return !getOwnedFeatureInverting().isEmpty();
			case SysMLPackage.FEATURE__OWNED_FEATURE_CHAINING:
				return !getOwnedFeatureChaining().isEmpty();
			case SysMLPackage.FEATURE__IS_READ_ONLY:
				return isReadOnly != IS_READ_ONLY_EDEFAULT;
			case SysMLPackage.FEATURE__IS_PORTION:
				return isPortion != IS_PORTION_EDEFAULT;
			case SysMLPackage.FEATURE__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case SysMLPackage.FEATURE__IS_NONUNIQUE:
				return isNonunique() != IS_NONUNIQUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.FEATURE___DIRECTION_FOR__TYPE:
				return directionFor((Type)arguments.get(0));
			case SysMLPackage.FEATURE___IS_FEATURED_WITHIN__TYPE:
				return isFeaturedWithin((Type)arguments.get(0));
			case SysMLPackage.FEATURE___NAMING_FEATURE:
				return namingFeature();
			case SysMLPackage.FEATURE___FIRST_REDEFINED_FEATURE:
				return firstRedefinedFeature();
			case SysMLPackage.FEATURE___FIRST_SUBSETTED_FEATURE:
				return firstSubsettedFeature();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isUnique: ");
		result.append(isUnique);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(", isComposite: ");
		result.append(isComposite);
		result.append(", isEnd: ");
		result.append(isEnd);
		result.append(", isDerived: ");
		result.append(isDerived);
		result.append(", isReadOnly: ");
		result.append(isReadOnly);
		result.append(", isPortion: ");
		result.append(isPortion);
		result.append(", direction: ");
		result.append(direction);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
