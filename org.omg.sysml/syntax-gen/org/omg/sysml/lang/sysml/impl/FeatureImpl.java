/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.uml2.common.util.DerivedSubsetEObjectEList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureDirectionKind;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Function;
import org.omg.sysml.lang.sysml.InvocationExpression;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.ParameterMembership;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.ReturnParameterMembership;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningType <em>Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getEndOwningType <em>End Owning Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedSubsetting <em>Owned Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isEnd <em>Is End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedTyping <em>Owned Typing</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isNonunique <em>Is Nonunique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends TypeImpl implements Feature {
	
	public static final String FEATURE_SUBSETTING_DEFAULT = "Base::things";
	public static final String VALUE_FEATURE_SUBSETTING_DEFAULT = "Base::dataValues";
	public static final String OBJECT_FEATURE_SUBSETTING_DEFAULT = "Objects::objects";
	
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
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();
	
	/**
	 * The cached value of the BindingConnector from this Feature to the result of a value Expression.
	 */
	protected BindingConnector valueConnector = null;

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
	@Override
	public Membership getOwningMembership() {
		return super.getOwningMembership();
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
			types = new EObjectEList<Type>(Type.class, this, SysMLPackage.FEATURE__TYPE);
			getTypes(types, new HashSet<Feature>());
			removeRedundantTypes(types);
		}
		return types;
	}
	
	protected void getTypes(List<Type> types, Set<Feature> visitedFeatures) {
		visitedFeatures.add(this);
		types.addAll(getFeatureTypes(types));
		Conjugation conjugator = getOwnedConjugator();
		if (conjugator != null) {
			Type originalType = conjugator.getOriginalType();
			if (originalType instanceof Feature) {
				((FeatureImpl)originalType).getTypes(types, visitedFeatures);
			}
		}
		for (Subsetting subsetting: getOwnedSubsetting()) {
			Feature subsettedFeature = subsetting.getSubsettedFeature();
			if (subsettedFeature != null && !visitedFeatures.contains(subsettedFeature)) {
				((FeatureImpl)subsettedFeature).getTypes(types, visitedFeatures);
			}
		}		
	}
	
	protected List<Type> getFeatureTypes(List<Type> types) {
		return getOwnedTyping().stream().
				map(typing->typing.getType()).
				filter(type->type != null).
				collect(Collectors.toList());
	}
	
	protected static void removeRedundantTypes(List<Type> types) {
		for (int i = types.size() - 1; i >= 0 ; i--) {
			Type type = types.get(i);
			if (types.stream().anyMatch(otherType->otherType != type && ((TypeImpl)otherType).conformsTo(type))) {
				types.remove(i);
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Type> getReferencedType() {
		EList<Type> referencedTypes = new EObjectEList<Type>(Type.class, this, SysMLPackage.FEATURE__REFERENCED_TYPE);
		getType().stream().filter(type->type != null && type.getOwner() != this).forEachOrdered(referencedTypes::add);
		return referencedTypes;
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
		org.omg.sysml.lang.sysml.Package namespace = this.getOwningNamespace();
		return namespace instanceof Type? (Type)namespace: null;
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
			for (Subsetting subsetting: feature.getOwnedSubsetting()) {
				Feature subsettedFeature = subsetting.getSubsettedFeature();
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
	public EList<Type> getOwnedType() {
		EList<Type> ownedTypes = new EObjectEList<Type>(Type.class, this, SysMLPackage.FEATURE__OWNED_TYPE);
		getType().stream().filter(type->type != null && type.getOwner() == this).forEachOrdered(ownedTypes::add);
		return ownedTypes;
	}
	
	@Override
	protected EClass getGeneralizationEClass() {
		return SysMLPackage.eINSTANCE.getSubsetting();
	}
	
	@Override
	protected String getDefaultSupertype() {
		return hasObjectType()? OBJECT_FEATURE_SUBSETTING_DEFAULT:
			   hasValueType()? VALUE_FEATURE_SUBSETTING_DEFAULT:
			   FEATURE_SUBSETTING_DEFAULT;
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
	
	public List<Redefinition> basicGetOwnedRedefinition() {
		return basicGetOwnedGeneralization(Redefinition.class);
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Subsetting> getOwnedSubsetting() {
		return new DerivedSubsetEObjectEList<>(Subsetting.class, this, SysMLPackage.FEATURE__OWNED_SUBSETTING, new int[] {SysMLPackage.FEATURE__OWNED_GENERALIZATION});
	}
	
	public List<Subsetting> basicGetOwnedSubsetting() {
		return basicGetOwnedGeneralization(Subsetting.class);
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

	public List<FeatureTyping> basicGetOwnedTyping() {
		return basicGetOwnedGeneralization(FeatureTyping.class);
	}
	
	protected void addSubsetting(String name) {
		Type type = getDefaultType(name);
		if (type instanceof Feature && type != this &&
				!getOwnedSubsetting().stream().anyMatch(sub->sub.getSubsettedFeature() == type)) {
			Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
			subsetting.setSubsettedFeature((Feature)type);
			subsetting.setSubsettingFeature(this);
			getOwnedRelationship_comp().add(subsetting);
		}
	}
	
	public List<Feature> getRedefinedFeaturesWithComputed(Element skip) {
		List<Feature> redefinedFeatures = basicGetOwnedRedefinition().stream().
				map(r->r == skip? ((RedefinitionImpl)r).basicGetRedefinedFeature(): r.getRedefinedFeature()).
				collect(Collectors.toList());
		if (redefinedFeatures.stream().allMatch(feature->feature == null)) {
			redefinedFeatures.clear();
			Type type = getOwningType();
			if (type != null) {
				int i = ((TypeImpl)type).getOwnedEndFeatures().indexOf(this);
				if (i >= 0) {
					for (Type general: getGeneralTypes(type)) {
						List<? extends Feature> features = getRelevantFeatures(general);
						if (i < features.size()) {
							Feature redefinedFeature = features.get(i);
							if (redefinedFeature != null && redefinedFeature != this) {
								redefinedFeatures.add(redefinedFeature);
							}
						}
					}
				}
			}
		}
		return redefinedFeatures;
	}
	
	boolean isComputeRedefinitions = true;
	
	/**
	 * If this Feature has no Redefinitions, compute relevant Redefinitions, as appropriate.
	 */
	protected void addComputedRedefinitions() {
		List<Redefinition> ownedRedefinitions = basicGetOwnedRedefinition();
		if (isComputeRedefinitions && ownedRedefinitions.isEmpty() ||
				ownedRedefinitions.stream().anyMatch(r->((RedefinitionImpl)r).basicGetRedefinedFeature() == null)) {
			addRedefinitions(ownedRedefinitions);
			isComputeRedefinitions = false;
		}
	}
	
	/**
	 * Compute relevant Redefinitions and add them to this Feature. By default, if this Feature is relevant for its
	 * owning Type, then it is paired with relevant Features in the same position in Generalizations of the 
	 * owning Type. The determination of what are relevant Categories and Features can be adjusted by
	 * overriding getGeneralCategories and getRelevantFeatures.
	 */
	protected void addRedefinitions(List<Redefinition> emptyRedefinitions) {
		Type type = getOwningType();
		int i = getRelevantFeatures(type).indexOf(this);
		int j = 0;
		int n = emptyRedefinitions == null? 0: emptyRedefinitions.size();
		if (i >= 0) {
			for (Type general: getGeneralTypes(type)) {
				List<? extends Feature> features = getRelevantFeatures(general);
				if (i < features.size()) {
					Feature redefinedFeature = features.get(i);
					if (redefinedFeature != null && redefinedFeature != this) {
						Redefinition redefinition;
						if (j < n) {
							redefinition = emptyRedefinitions.get(j);
							j++;
						} else {
							redefinition = SysMLFactory.eINSTANCE.createRedefinition();
							redefinition.setRedefiningFeature(this);
							getOwnedRelationship_comp().add(redefinition);
						}
						redefinition.setRedefinedFeature(redefinedFeature);
					}
				}
			}
			if (n > 0) {
				getOwnedRelationship_comp().removeAll(emptyRedefinitions.subList(j, n));
			}
		}
	}
	
	/**
	 * Get the set of Types, more general than the given type, that may have features
	 * redefined by this feature. By default this is all general Types of the given
	 * Type (without defaults).
	 */
	protected Set<Type> getGeneralTypes(Type type) {
		return type.getOwnedGeneralization().stream().
				map(gen->((GeneralizationImpl)gen).basicGetGeneral()).
				filter(gen->gen != null).
				collect(Collectors.toSet());
	}
	
	/**
	 * Get the relevant Features that may be redefined from the given Type.
	 * If this is an end Feature, return the end Features of the Type,
	 * otherwise return the relevant features of the type.
	 */
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return isEnd()? ((TypeImpl)type).getAllEndFeatures():
			   isParameter()? getParameterRelevantFeatures(type):
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
			if (isResultParameter()) {
				Feature resultParameter = ((TypeImpl)type).getResultParameter();
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
		return type == owningType? filterIgnoredParameters(type.getOwnedParameters()): 
			   owningType instanceof InvocationExpression && 
			        type == ((InvocationExpressionImpl)owningType).getExpressionType() &&
			   		!(type instanceof Function || type instanceof Expression)? 
			   				((InvocationExpressionImpl)owningType).getTypeFeatures():
			   filterIgnoredParameters(type.getAllParameters());
	}
	
	protected List<Feature> filterIgnoredParameters(List<Feature> parameters) {
		return parameters.stream().
				filter(p -> !((FeatureImpl) p).isIgnoredParameter()).
				collect(Collectors.toList());
	}
	
	protected boolean isIgnoredParameter() {
		return isResultParameter();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public FeatureMembership getOwningFeatureMembership() {
		Membership owningMembership = getOwningMembership();
		return owningMembership instanceof FeatureMembership? (FeatureMembership)owningMembership: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public NotificationChain basicSetOwningFeatureMembership(FeatureMembership newOwningFeatureMembership, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningFeatureMembership, SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP, msgs);
//		Resource.Internal eInternalResource = eInternalResource();
//		if (eInternalResource == null || !eInternalResource.isLoading()) {
//			if (newOwningFeatureMembership != null) {
//				Membership owningMembership = getOwningMembership();
//				if (newOwningFeatureMembership != owningMembership) {
//					setOwningMembership(newOwningFeatureMembership);
//				}
//			}
//		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningFeatureMembership(FeatureMembership newOwningFeatureMembership) {
		if (newOwningFeatureMembership != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP && newOwningFeatureMembership != null)) {
			if (EcoreUtil.isAncestor(this, newOwningFeatureMembership))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningFeatureMembership != null)
				msgs = ((InternalEObject)newOwningFeatureMembership).eInverseAdd(this, SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP, FeatureMembership.class, msgs);
			msgs = basicSetOwningFeatureMembership(newOwningFeatureMembership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP, newOwningFeatureMembership, newOwningFeatureMembership));
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
	public NotificationChain basicSetOwningMembership(Membership newOwningMembership, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningMembership, SysMLPackage.FEATURE__OWNING_MEMBERSHIP, msgs);
//		Resource.Internal eInternalResource = eInternalResource();
//		if (eInternalResource == null || !eInternalResource.isLoading()) {
//			FeatureMembership owningFeatureMembership = getOwningFeatureMembership();
//			if (owningFeatureMembership != null && owningFeatureMembership != newOwningMembership) {
//				setOwningFeatureMembership(null);
//			}
//			if (newOwningMembership != null) {
//				Relationship owningRelationship = getOwningRelationship();
//				if (newOwningMembership != owningRelationship) {
//					setOwningRelationship(newOwningMembership);
//				}
//			}
//		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningMembership(Membership newOwningMembership) {
		if (newOwningMembership != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.FEATURE__OWNING_MEMBERSHIP && newOwningMembership != null)) {
			if (EcoreUtil.isAncestor(this, newOwningMembership))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwningMembership != null)
				msgs = ((InternalEObject)newOwningMembership).eInverseAdd(this, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, Membership.class, msgs);
			msgs = basicSetOwningMembership(newOwningMembership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__OWNING_MEMBERSHIP, newOwningMembership, newOwningMembership));
	}

	// Additional redefinitions and subsets
	
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
		List<Redefinition> redefinitions = this.basicGetOwnedRedefinition();
		return redefinitions.size() != 1? null:
			redefinitions.get(0).getRedefinedFeature();
	}
	
	public FeatureValue getValuation() {
		return (FeatureValue)getOwnedFeatureMembership().stream().
				filter(memb->memb instanceof FeatureValue).
				findFirst().orElse(null);
	}

	public BindingConnector getValueConnector() {
		FeatureValue valuation = getValuation();
		if (valuation != null) {
			Expression value = valuation.getValue();
			if (value != null) {
				valueConnector = makeBinding(valueConnector, ((ExpressionImpl)value).getResult(), this);
			}
		}
		return valueConnector;
	}
	
	@Override
	public Type getDefaultType(String... defaultNames) {
		Type owningType = getOwningType();
		if (owningType instanceof BindingConnector) {
			Feature relatedFeature = ((BindingConnectorImpl)owningType).getRelatedFeatureFor(this);
			if (relatedFeature != null) {
				return relatedFeature;
			}
		}
		return super.getDefaultType(defaultNames);
	}
	
	@Override
	public void computeImplicitGeneralization() {
		addComputedRedefinitions();
		super.computeImplicitGeneralization();
	}
	
	@Override
	public void transform() {
		super.transform();
		getEffectiveName();
		getValueConnector();
	}
	
	// Utility methods
	
	public BindingConnector makeBinding(BindingConnector connector, Feature source, Feature target) {
		if (connector == null) {
			connector = addOwnedBindingConnector(source, target);
		} else {
			((ConnectorImpl)connector).setRelatedFeature(0, source);
			((ConnectorImpl)connector).setRelatedFeature(1, target);
		}
		return connector;
	}
	
	public boolean isObjectFeature() {
		return getType().stream().anyMatch(type->type instanceof Class);
	}
	
	public boolean isValueFeature() {
		return getType().stream().anyMatch(type->type instanceof DataType);
	}
	
	public boolean hasObjectType() {
		return basicGetOwnedTyping().stream().anyMatch(typing->typing.getType() instanceof Class);
	}
	
	public boolean hasValueType() {
		return basicGetOwnedTyping().stream().anyMatch(typing->typing.getType() instanceof DataType);
	}
	
	public boolean isExpression() {
		return false;
	}

	public Subsetting createSubsetting() {
		Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
		subsetting.setSubsettingFeature(this);
		getOwnedRelationship_comp().add(subsetting);
		return subsetting;
	}
	
	public Optional<Subsetting> getFirstSubsetting() {
		return getOwnedSubsetting().stream().
				filter(s->!(s instanceof Redefinition)).findFirst();
	}
	
	public Optional<Feature> getFirstSubsettedFeature() {
		return getFirstSubsetting().map(Subsetting::getSubsettedFeature);
	}
	
	/**
	 * Return a set including this Feature and all Features that it redefines directly or indirectly.
	 */
	public Set<Feature> getAllRedefinedFeatures() {
		Set<Feature> redefinedFeatures = new HashSet<>();
		addAllRedefinedFeatures(redefinedFeatures, new HashSet<>());
		return redefinedFeatures;
	}
	
	protected void addAllRedefinedFeatures(Set<Feature> redefinedFeatures, Set<Feature> visited) {
		redefinedFeatures.add(this);
		getOwnedRedefinition().stream().forEach(redefinition->{
			visited.add(this);
			Feature redefinedFeature = redefinition.getRedefinedFeature();
			if (!visited.contains(redefinedFeature)) {
				((FeatureImpl)redefinedFeature).addAllRedefinedFeatures(redefinedFeatures, visited);
			}
		});
	}
	
	public boolean isParameter() {
		return getOwningMembership() instanceof ParameterMembership;
	}

	public boolean isResultParameter() {
		return getOwningMembership() instanceof ReturnParameterMembership;
	}
	
	public boolean isInput() {
		FeatureDirectionKind direction = getDirection();
		return direction == FeatureDirectionKind.IN || direction == FeatureDirectionKind.INOUT;
	}
	
	public boolean isOutputParameter() {
		FeatureDirectionKind direction = getDirection();
		return direction == FeatureDirectionKind.OUT || direction == FeatureDirectionKind.INOUT;
	}
	
	public FeatureDirectionKind getDirection() {
		Type owningType = getOwningType();
		if (owningType == null) {
			return null;
		} else {
			return directionFor(owningType);
		}
	}
	
	//
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE__OWNING_MEMBERSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningMembership((Membership)otherEnd, msgs);
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningFeatureMembership((FeatureMembership)otherEnd, msgs);
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
			case SysMLPackage.FEATURE__OWNING_MEMBERSHIP:
				return basicSetOwningMembership(null, msgs);
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return basicSetOwningFeatureMembership(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.FEATURE__OWNING_MEMBERSHIP:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, Membership.class, msgs);
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE_COMP, FeatureMembership.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return getOwningFeatureMembership();
			case SysMLPackage.FEATURE__OWNING_TYPE:
				if (resolve) return getOwningType();
				return basicGetOwningType();
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				if (resolve) return getEndOwningType();
				return basicGetEndOwningType();
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				return getReferencedType();
			case SysMLPackage.FEATURE__IS_UNIQUE:
				return isUnique();
			case SysMLPackage.FEATURE__IS_ORDERED:
				return isOrdered();
			case SysMLPackage.FEATURE__TYPE:
				return getType();
			case SysMLPackage.FEATURE__OWNED_TYPE:
				return getOwnedType();
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
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)newValue);
				return;
			case SysMLPackage.FEATURE__OWNING_TYPE:
				setOwningType((Type)newValue);
				return;
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				setEndOwningType((Type)newValue);
				return;
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				getReferencedType().clear();
				getReferencedType().addAll((Collection<? extends Type>)newValue);
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
			case SysMLPackage.FEATURE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Type>)newValue);
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
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				setOwningFeatureMembership((FeatureMembership)null);
				return;
			case SysMLPackage.FEATURE__OWNING_TYPE:
				setOwningType((Type)null);
				return;
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				setEndOwningType((Type)null);
				return;
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				getReferencedType().clear();
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
			case SysMLPackage.FEATURE__OWNED_TYPE:
				getOwnedType().clear();
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
			case SysMLPackage.FEATURE__OWNING_MEMBERSHIP:
				return getOwningMembership() != null;
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return getOwningFeatureMembership() != null;
			case SysMLPackage.FEATURE__OWNING_TYPE:
				return basicGetOwningType() != null;
			case SysMLPackage.FEATURE__END_OWNING_TYPE:
				return basicGetEndOwningType() != null;
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				return !getReferencedType().isEmpty();
			case SysMLPackage.FEATURE__IS_UNIQUE:
				return isUnique != IS_UNIQUE_EDEFAULT;
			case SysMLPackage.FEATURE__IS_ORDERED:
				return isOrdered != IS_ORDERED_EDEFAULT;
			case SysMLPackage.FEATURE__TYPE:
				return !getType().isEmpty();
			case SysMLPackage.FEATURE__OWNED_TYPE:
				return !getOwnedType().isEmpty();
			case SysMLPackage.FEATURE__OWNED_REDEFINITION:
				return !getOwnedRedefinition().isEmpty();
			case SysMLPackage.FEATURE__OWNED_SUBSETTING:
				return !getOwnedSubsetting().isEmpty();
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				return isComposite() != IS_COMPOSITE_EDEFAULT;
			case SysMLPackage.FEATURE__IS_END:
				return isEnd() != IS_END_EDEFAULT;
			case SysMLPackage.FEATURE__OWNED_TYPING:
				return !getOwnedTyping().isEmpty();
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
