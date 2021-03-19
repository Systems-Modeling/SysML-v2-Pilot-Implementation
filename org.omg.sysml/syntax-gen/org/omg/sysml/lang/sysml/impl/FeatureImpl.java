/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.TypeFeaturing;
import org.omg.sysml.util.ExpressionUtil;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedSubsetting <em>Owned Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isEnd <em>Is End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getEndOwningType <em>End Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedTyping <em>Owned Typing</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getFeaturingType <em>Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedTypeFeaturing <em>Owned Type Featuring</em>}</li>
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
	 * The default value of the '{@link #isEnd() <em>Is End</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_END_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isNonunique() <em>Is Nonunique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonunique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NONUNIQUE_EDEFAULT = false;

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

	EList<Type> types = null;
	
	@Override
	public void clearCaches() {
		super.clearCaches();
		types = null;
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
		if (types == null) {
			types = new NonNotifyingEObjectEList<Type>(Type.class, this, SysMLPackage.FEATURE__TYPE);
			getTypes(types, new HashSet<Feature>());
			removeRedundantTypes(types);
		}
		return types;
	}
	
	protected void getTypes(List<Type> types, Set<Feature> visitedFeatures) {
		visitedFeatures.add(this);
		types.addAll(getFeatureTypes());
		
		
		Conjugation conjugator = getOwnedConjugator();
		if (conjugator != null) {
			Type originalType = conjugator.getOriginalType();
			if (originalType instanceof Feature) {
				((FeatureImpl)originalType).getTypes(types, visitedFeatures);
			}
		}
		for (Feature subsettedFeature: FeatureUtil.getSubsettedFeaturesOf(this)) {
			if (subsettedFeature != null && !visitedFeatures.contains(subsettedFeature)) {
				((FeatureImpl)subsettedFeature).getTypes(types, visitedFeatures);
			}
		}		
	}
	
	protected List<Type> getFeatureTypes() {
		List<Type> types = getOwnedTyping().stream().
				map(typing->typing.getType()).
				filter(type->type != null).
				collect(Collectors.toList());
		types.addAll(TypeUtil.getImplicitGeneralTypesFor(this, SysMLPackage.eINSTANCE.getFeatureTyping()));
		return types;
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
		return new DerivedSubsetEObjectEList<>(Redefinition.class, this, SysMLPackage.FEATURE__OWNED_REDEFINITION, new int[] {SysMLPackage.FEATURE__OWNED_GENERALIZATION});
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Subsetting> getOwnedSubsetting() {
		return new DerivedSubsetEObjectEList<>(Subsetting.class, this, SysMLPackage.FEATURE__OWNED_SUBSETTING, new int[] {SysMLPackage.FEATURE__OWNED_GENERALIZATION});
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<FeatureTyping> getOwnedTyping() {
		return new DerivedSubsetEObjectEList<>(FeatureTyping.class, this, SysMLPackage.FEATURE__OWNED_TYPING, new int[] {SysMLPackage.FEATURE__OWNED_GENERALIZATION});
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
		return featuringTypes;
	}
	
	public List<Feature> getRedefinedFeaturesWithComputed(Element skip) {
		addComputedRedefinitions(skip);
		EList<Redefinition> redefinitions = getOwnedRedefinition();
		
		List<Feature> redefinedFeatures = new ArrayList<>();
		redefinitions.stream().
			map(r->r == skip? ((RedefinitionImpl)r).basicGetRedefinedFeature(): r.getRedefinedFeature()).
			forEachOrdered(redefinedFeatures::add);
		
		TypeUtil.getImplicitGeneralTypesOnly(this, SysMLPackage.eINSTANCE.getRedefinition())
				.stream().
				map(Feature.class::cast).
				forEachOrdered(redefinedFeatures::add);
		
		return redefinedFeatures; 
	}
	
	private boolean isComputeRedefinitions = true;
	
	public void forceComputeRedefinitions() {
		isComputeRedefinitions = true;
	}
	
	/**
	 * If this Feature has no Redefinitions, compute relevant Redefinitions, as appropriate.
	 */
	public void addComputedRedefinitions(Element skip) {
		EList<Redefinition> ownedRedefinitions = getOwnedRedefinition();
		if (isComputeRedefinitions && ownedRedefinitions.isEmpty()) {
			TypeUtil.removeImplicitGeneralTypeFrom(this, SysMLPackage.eINSTANCE.getRedefinition());
			addRedefinitions(skip);
			isComputeRedefinitions = false;
		}
	}
	
	/**
	 * Compute relevant Redefinitions and add them to this Feature. By default, if this Feature is relevant for its
	 * owning Type, then it is paired with relevant Features in the same position in Generalizations of the 
	 * owning Type. The determination of what are relevant Categories and Features can be adjusted by
	 * overriding getGeneralCategories and getRelevantFeatures.
	 */
	protected void addRedefinitions(Element skip) {
		Namespace owner = getOwningNamespace();
		if (owner instanceof Type) {
			Type type = getOwningType();
			int i = getRelevantFeatures(type).indexOf(this);
			if (i >= 0) {
				for (Type general: getGeneralTypes(type, skip)) {
					List<? extends Feature> features = getRelevantFeatures(general);
					if (i < features.size()) {
						Feature redefinedFeature = features.get(i);
						if (redefinedFeature != null && redefinedFeature != this) {
							TypeUtil.addImplicitGeneralTypeTo(this, SysMLPackage.eINSTANCE.getRedefinition(), redefinedFeature);
						}
					}
				}
			}
		}
	}
	
	/**
	 * Get the (ordered) set of Types, more general than the given type, that may have 
	 * features redefined by this feature. By default this is all general Types of the
	 * given Type.
	 */
	protected List<Type> getGeneralTypes(Type type, Element skip) {
		List<Type> generalTypes = new ArrayList<>();
		for (Type generalType: TypeUtil.getSupertypesOf(type, skip)) {
			if (!generalTypes.contains(generalType)) {
				generalTypes.add(generalType);
			}
		}
		return generalTypes;
	}
	
	/**
	 * Get the relevant Features that may be redefined from the given Type.
	 * If this is an end Feature, return the end Features of the Type,
	 * otherwise return the relevant features of the type.
	 */
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return isEnd()? TypeUtil.getAllEndFeaturesOf(type):
			   FeatureUtil.isParameter(this)? getParameterRelevantFeatures(type):
			   type != null? ((TypeImpl)type).getRelevantFeatures():
			   Collections.emptyList();
	}
	
	/**
	 * Parameters redefine (owned) Parameters of general Types, with a result
	 * Parameter always redefining the result Parameter of a general Function or
	 * Expression.
	 */
	public List<? extends Feature> getParameterRelevantFeatures(Type type) {
		if (type != null) {
			if (FeatureUtil.isResultParameter(this)) {
				Feature resultParameter = TypeUtil.getResultParameterOf(type);
				if (resultParameter != null) {
					return Collections.singletonList(resultParameter);
				}
			} else {
				return  getRelevantParameters((TypeImpl)type);
			}
		}
		return Collections.emptyList();
	}
	
	protected List<Feature> getRelevantParameters(TypeImpl type) {
		Type owningType = getOwningType();
		return type == owningType? filterIgnoredParameters(TypeUtil.getOwnedParametersOf(type)): 
			   owningType instanceof InvocationExpression && 
			        type == ExpressionUtil.getExpressionTypeOf((InvocationExpression)owningType) &&
			   		!(type instanceof Function || type instanceof Expression)? 
			   				ExpressionUtil.getTypeFeaturesOf((InvocationExpression)owningType):
			   filterIgnoredParameters(TypeUtil.getAllParametersOf(type));
	}
	
	protected List<Feature> filterIgnoredParameters(List<Feature> parameters) {
		return parameters.stream().
				filter(p -> !((FeatureImpl) p).isIgnoredParameter()).
				collect(Collectors.toList());
	}
	
	protected boolean isIgnoredParameter() {
		return FeatureUtil.isResultParameter(this);
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
	 * Locally cached value for isComposite. This allows isComposite to be set directly
	 * on a Feature, and then propagated back to the owningFeatureMembership, once this
	 * is set.
	 */
	protected boolean isComposite = false;
	
	public boolean basicIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isComposite() {
		FeatureMembership featureMembership = this.getOwningFeatureMembership();
		return featureMembership != null && featureMembership.isComposite();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsComposite(boolean newIsComposite) {
		isComposite = newIsComposite;
		FeatureMembership featureMembership = this.getOwningFeatureMembership();
		if (featureMembership != null) {
			featureMembership.setIsComposite(newIsComposite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isEnd() {
		return getOwningFeatureMembership() instanceof EndFeatureMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIsEnd(boolean newIsEnd) {
		throw new UnsupportedOperationException();
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
		return featuringTypes.isEmpty() ||
			   type != null && featuringTypes.contains(type) ||
			   featuringTypes.stream().anyMatch(featuringType->
					   featuringType instanceof Feature &&
					   ((Feature)featuringType).isFeaturedWithin(type));
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
	 * The cached OCL expression body for the '{@link #directionFor(org.omg.sysml.lang.sysml.Type) <em>Direction For</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #directionFor(org.omg.sysml.lang.sysml.Type)
	 * @generated
	 * @ordered
	 */
	protected static final String DIRECTION_FOR__TYPE__EOCL_EXP = "type.directionOf(self)";
	/**
	 * The cached OCL query for the '{@link #directionFor(org.omg.sysml.lang.sysml.Type) <em>Direction For</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #directionFor(org.omg.sysml.lang.sysml.Type)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> DIRECTION_FOR__TYPE__EOCL_QRY;
	/**
	 * The cached OCL expression body for the '{@link #isFeaturedWithin(org.omg.sysml.lang.sysml.Type) <em>Is Featured Within</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFeaturedWithin(org.omg.sysml.lang.sysml.Type)
	 * @generated
	 * @ordered
	 */
	protected static final String IS_FEATURED_WITHIN__TYPE__EOCL_EXP = "type = null and feature.featuringType->isEmpty() or"+
"    type <> null and feature.featuringType->includes(type) or"+
"    feature.featuringType->exists(t |"+
"        t.oclIsKindOf(Feature) and"+
"        t.oclAsType(Feature).isFeaturedWithin(type)) ";
	/**
	 * The cached OCL query for the '{@link #isFeaturedWithin(org.omg.sysml.lang.sysml.Type) <em>Is Featured Within</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFeaturedWithin(org.omg.sysml.lang.sysml.Type)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> IS_FEATURED_WITHIN__TYPE__EOCL_QRY;

	// Additional derivations and overrides
	
	protected String effectiveName = null;
	
	public String getEffectiveName() {
		return getEffectiveName(new HashSet<Feature>());
	}
	
	public String getEffectiveName(Set<Feature> visited) {
		String name = getName();
		if (name == null) {
			if (effectiveName == null) {
				visited.add(this);
				Feature namingFeature = getNamingFeature();
				if (namingFeature != null && !visited.contains(namingFeature)) {
					effectiveName = ((FeatureImpl)namingFeature).getEffectiveName(visited);
				}
			}
			name = effectiveName;
		}
		return name;
	}
	
	protected Feature getNamingFeature() {
		List<Feature> redefinedFeatures = getRedefinedFeaturesWithComputed(null);
		return redefinedFeatures.isEmpty()? null:
			redefinedFeatures.get(0);
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
			case SysMLPackage.FEATURE__OWNING_TYPE:
				if (resolve) return getOwningType();
				return basicGetOwningType();
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
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				if (resolve) return getOwningFeatureMembership();
				return basicGetOwningFeatureMembership();
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				return isComposite();
			case SysMLPackage.FEATURE__IS_END:
				return isEnd();
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				if (resolve) return getEndOwningType();
				return basicGetEndOwningType();
			case SysMLPackage.FEATURE__OWNED_TYPING:
				return getOwnedTyping();
			case SysMLPackage.FEATURE__FEATURING_TYPE:
				return getFeaturingType();
			case SysMLPackage.FEATURE__OWNED_TYPE_FEATURING:
				return getOwnedTypeFeaturing();
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
			case SysMLPackage.FEATURE__OWNING_TYPE:
				setOwningType((Type)newValue);
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
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)newValue);
				return;
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				setIsComposite((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__IS_END:
				setIsEnd((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				setEndOwningType((Type)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_TYPING:
				getOwnedTyping().clear();
				getOwnedTyping().addAll((Collection<? extends FeatureTyping>)newValue);
				return;
			case SysMLPackage.FEATURE__FEATURING_TYPE:
				getFeaturingType().clear();
				getFeaturingType().addAll((Collection<? extends Type>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_TYPE_FEATURING:
				getOwnedTypeFeaturing().clear();
				getOwnedTypeFeaturing().addAll((Collection<? extends TypeFeaturing>)newValue);
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
			case SysMLPackage.FEATURE__OWNING_TYPE:
				setOwningType((Type)null);
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
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)null);
				return;
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__IS_END:
				setIsEnd(IS_END_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				setEndOwningType((Type)null);
				return;
			case SysMLPackage.FEATURE__OWNED_TYPING:
				getOwnedTyping().clear();
				return;
			case SysMLPackage.FEATURE__FEATURING_TYPE:
				getFeaturingType().clear();
				return;
			case SysMLPackage.FEATURE__OWNED_TYPE_FEATURING:
				getOwnedTypeFeaturing().clear();
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
			case SysMLPackage.FEATURE__OWNING_TYPE:
				return basicGetOwningType() != null;
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
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return basicGetOwningFeatureMembership() != null;
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case SysMLPackage.FEATURE__IS_END:
				return isEnd() != IS_END_EDEFAULT;
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				return basicGetEndOwningType() != null;
			case SysMLPackage.FEATURE__OWNED_TYPING:
				return !getOwnedTyping().isEmpty();
			case SysMLPackage.FEATURE__FEATURING_TYPE:
				return !getFeaturingType().isEmpty();
			case SysMLPackage.FEATURE__OWNED_TYPE_FEATURING:
				return !getOwnedTypeFeaturing().isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
