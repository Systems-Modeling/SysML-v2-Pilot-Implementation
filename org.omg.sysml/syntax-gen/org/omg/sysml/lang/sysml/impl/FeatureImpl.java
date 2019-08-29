/**
 */
package org.omg.sysml.lang.sysml.impl;

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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.Class;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.DataType;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Feature</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningMembership
 * <em>Owning Membership</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRelationship
 * <em>Owned Relationship</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getReferencedType
 * <em>Referenced Type</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningType <em>Owning
 * Type</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isUnique <em>Is
 * Unique</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isOrdered <em>Is
 * Ordered</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getType
 * <em>Type</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedType <em>Owned
 * Type</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRedefinition
 * <em>Owned Redefinition</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedSubsetting
 * <em>Owned Subsetting</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningFeatureMembership
 * <em>Owning Feature Membership</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isComposite <em>Is
 * Composite</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getValuation
 * <em>Valuation</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getMultiplicity
 * <em>Multiplicity</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getTyping
 * <em>Typing</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isEnd <em>Is
 * End</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getEndOwningType <em>End
 * Owning Type</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isNonunique <em>Is
 * Nonunique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends TypeImpl implements Feature {

	public static final String FEATURE_SUBSETTING_DEFAULT = "Base::things";
	public static final String OBJECT_FEATURE_SUBSETTING_DEFAULT = "Base::objects";
	public static final String VALUE_FEATURE_SUBSETTING_DEFAULT = "Base::values";

	public static final String FEATURE_TRANSFER_SOURCE_OUTPUT = "Transfers::Transfer::transferSource::sourceOutput";
	public static final String FEATURE_TRANSFER_TARGET_INPUT = "Transfers::Transfer::transferTarget::targetInput";

	/**
	 * The default value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_UNIQUE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isUnique() <em>Is Unique</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isUnique()
	 * @generated
	 * @ordered
	 */
	protected boolean isUnique = IS_UNIQUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isOrdered() <em>Is Ordered</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ORDERED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOrdered() <em>Is Ordered</em>}' attribute.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isOrdered()
	 * @generated
	 * @ordered
	 */
	protected boolean isOrdered = IS_ORDERED_EDEFAULT;

	/**
	 * The default value of the '{@link #isComposite() <em>Is Composite</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isComposite()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #getValuation() <em>Valuation</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getValuation()
	 * @generated
	 * @ordered
	 */
	protected FeatureValue valuation;
	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}'
	 * reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity;
	/**
	 * The cached value of the '{@link #getTyping() <em>Typing</em>}' reference
	 * list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getTyping()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureTyping> typing;

	/**
	 * The default value of the '{@link #isEnd() <em>Is End</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isEnd()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_END_EDEFAULT = false;
	/**
	 * The default value of the '{@link #isNonunique() <em>Is Nonunique</em>}'
	 * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #isNonunique()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NONUNIQUE_EDEFAULT = false;
	/**
	 * The cached value of the BindingConnector from this Feature to the result of a
	 * value Expression.
	 */
	protected BindingConnector valueConnector = null;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected FeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FEATURE;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public EList<Type> getType() {
		return getTypes(true);
	}

	public EList<Type> getTypes(boolean isWithDefaults) {
		EList<Type> types = new EObjectEList<Type>(Type.class, this, SysMLPackage.FEATURE__TYPE);
		getTypes(this, types, new HashSet<Feature>(), isWithDefaults);
		return types;
	}

	public static void getTypes(Feature feature, List<Type> types, Set<Feature> visitedFeatures,
			boolean isWithDefaults) {
		visitedFeatures.add(feature);
		getFeatureTypes(feature, types);
		EList<Subsetting> subsettings = isWithDefaults ? feature.getOwnedSubsetting()
				: ((FeatureImpl) feature).getOwnedSubsettingWithoutDefault();
		for (Subsetting subsetting : subsettings) {
			Feature subsettedFeature = subsetting.getSubsettedFeature();
			if (subsettedFeature != null && !visitedFeatures.contains(subsettedFeature)) {
				getTypes(subsettedFeature, types, visitedFeatures, isWithDefaults);
			}
		}
	}

	public static void getFeatureTypes(Feature feature, List<Type> types) {
		types.addAll(feature.getTyping().stream().map(typing -> typing.getType()).filter(type -> type != null)
				.collect(Collectors.toList()));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public EList<Type> getReferencedType() {
		EList<Type> referencedTypes = new EObjectEList<Type>(Type.class, this, SysMLPackage.FEATURE__REFERENCED_TYPE);
		referencedTypes.addAll(this.getType());
		referencedTypes.removeAll(this.getOwnedElement());
		return referencedTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getOwningType() {
		Type owningType = basicGetOwningType();
		return owningType != null && owningType.eIsProxy() ? (Type) eResolveProxy((InternalEObject) owningType)
				: owningType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public Type basicGetOwningType() {
		org.omg.sysml.lang.sysml.Package namespace = this.getOwningNamespace();
		return namespace instanceof Type ? (Type) namespace : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public void setOwningType(Type newOwningType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isUnique() {
		return isUnique;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsUnique(boolean newIsUnique) {
		boolean oldIsUnique = isUnique;
		isUnique = newIsUnique;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_UNIQUE, oldIsUnique,
					isUnique));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean isOrdered() {
		return isOrdered;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setIsOrdered(boolean newIsOrdered) {
		boolean oldIsOrdered = isOrdered;
		isOrdered = newIsOrdered;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__IS_ORDERED, oldIsOrdered,
					isOrdered));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public EList<Type> getOwnedType() {
		EList<Type> ownedTypes = new EObjectEList<Type>(Type.class, this, SysMLPackage.FEATURE__OWNED_TYPE);
		ownedTypes.addAll(this.getType());
		ownedTypes.removeAll(this.getReferencedType());
		return ownedTypes;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public EList<Redefinition> getOwnedRedefinition() {
		EList<Redefinition> redefinitions = new EObjectEList<Redefinition>(Redefinition.class, this,
				SysMLPackage.FEATURE__OWNED_REDEFINITION);
		for (Subsetting subset : this.getOwnedSubsetting()) {
			if (subset instanceof Redefinition) {
				redefinitions.add((Redefinition) subset);
			}
		}
		return redefinitions;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithComputedRedefinitions(hasObjectType() ? OBJECT_FEATURE_SUBSETTING_DEFAULT
				: hasValueType() ? VALUE_FEATURE_SUBSETTING_DEFAULT : FEATURE_SUBSETTING_DEFAULT);
	}

	public EList<Subsetting> getOwnedSubsettingWithComputedRedefinitions(String... subsettingDefault) {
		clearCaches();
		getComputedRedefinitions();
		return getOwnedSubsettingWithDefault(subsettingDefault);
	}

	public EList<Subsetting> getOwnedSubsettingWithDefault(String... subsettingDefault) {
		return getOwnedGeneralizationWithDefault(Subsetting.class, SysMLPackage.FEATURE__OWNED_SUBSETTING,
				SysMLPackage.eINSTANCE.getSubsetting(), subsettingDefault);
	}

	public EList<Subsetting> getOwnedSubsettingWithoutDefault() {
		return getOwnedGeneralizationWithoutDefault(Subsetting.class, SysMLPackage.FEATURE__OWNED_SUBSETTING);
	}

	public EList<Redefinition> getOwnedRedefinitionsWithoutDefault() {
		return getOwnedGeneralizationWithoutDefault(Redefinition.class, SysMLPackage.FEATURE__OWNED_REDEFINITION);
	}

	/**
	 * If this Feature has no Redefinitions, compute relevant Redefinitions, as
	 * appropriate.
	 */
	protected EList<Subsetting> getComputedRedefinitions() {
		EList<Subsetting> redefinitions = new EObjectEList<Subsetting>(Subsetting.class, this,
				SysMLPackage.FEATURE__OWNED_SUBSETTING);
		EList<Redefinition> ownedRedefinitions = getOwnedRedefinitionsWithoutDefault();
		if (ownedRedefinitions.stream().allMatch(r -> r.getRedefinedFeature() == null)) {
			addRedefinitions(redefinitions, ownedRedefinitions);
		}
		return redefinitions;
	}

//	protected boolean isRedefinitionsNeeded(List<Redefinition> ownedRedefinitions) {
//		return ownedRedefinitions.stream().allMatch(r->r.getRedefinedFeature() == null);
//	}

	/**
	 * Compute relevant Redefinitions and add them to this Feature. By default, if
	 * this Feature is relevant for its owning Type, then it is paired with relevant
	 * Features in the same position in Generalizations of the owning Type. The
	 * determination of what are relevant Categories and Features can be adjusted by
	 * overriding getGeneralCategories and getRelevantFeatures.
	 */
	protected void addRedefinitions(EList<Subsetting> redefinitions, List<Redefinition> emptyRedefinitions) {
		Type type = getOwningType();
		int i = getRelevantFeatures(type).indexOf(this);
		int j = 0;
		int n = emptyRedefinitions == null ? 0 : emptyRedefinitions.size();
		if (i >= 0) {
			for (Type general : getGeneralTypes(type)) {
				List<? extends Feature> features = getRelevantFeatures(general);
				if (i < features.size()) {
					Feature redefinedFeature = features.get(i);
					if (redefinedFeature != null) {
						Redefinition redefinition;
						if (j < n) {
							redefinition = emptyRedefinitions.get(j);
							j++;
						} else {
							redefinition = SysMLFactory.eINSTANCE.createRedefinition();
							redefinition.setRedefiningFeature(this);
							getOwnedRelationship().add(redefinition);
						}
						redefinition.setRedefinedFeature(redefinedFeature);
						redefinitions.add(redefinition);
					}
				}
			}
			if (n > 0) {
				getOwnedRelationship().removeAll(emptyRedefinitions.subList(j, n));
			}
		}
	}

	/**
	 * Get the set of Types, more general than the given type, that may have
	 * features redefined by this feature. By default this is all general Types of
	 * the given Type (without defaults).
	 */
	protected Set<Type> getGeneralTypes(Type type) {
		return type.getOwnedGeneralization().stream().map(gen -> gen.getGeneral()).filter(gen -> gen != null)
				.collect(Collectors.toSet());
	}

	/**
	 * Get the relevant Features that may be redefined from the given Type. If this
	 * is an end Feature, return the end Features of the Type, otherwise return the
	 * relavent features of the type.
	 */
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return getOwningFeatureMembership() instanceof EndFeatureMembership
				? type.getFeature().stream().filter(f -> f.getOwningFeatureMembership() instanceof EndFeatureMembership)
						.collect(Collectors.toList())
				:

				// NOTE: This is a temporary measure until connecting to inherited features
				// is handled generally.
				getOwningType() instanceof Parameter ? type.getOwnedFeature() :

						type != null ? ((TypeImpl) type).getRelevantFeatures() : Collections.emptyList();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public FeatureMembership getOwningFeatureMembership() {
		if (eContainerFeatureID() != SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP)
			return null;
		return (FeatureMembership) eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOwningFeatureMembership(FeatureMembership newOwningFeatureMembership,
			NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject) newOwningFeatureMembership,
				SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOwningFeatureMembership != null) {
				if (newOwningFeatureMembership != owningMembership) {
					setOwningMembership(newOwningFeatureMembership);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	public FeatureMembership basicGetOwningFeatureMembership() {
		return getOwningRelationship(FeatureMembership.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	@Override
	public void setOwningFeatureMembership(FeatureMembership newOwningFeatureMembership) {
		// TODO: implement this method to set the 'Owning Feature Membership' reference
	}

	/**
	 * Locally cached value for isComposite. This allows isComposite to be set
	 * directly on a Feature, and then propagated back to the
	 * owningFeatureMembership, once this is set.
	 */
	protected boolean isComposite = false;

	public boolean basicIsComposite() {
		return isComposite;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public boolean isComposite() {
		FeatureMembership featureMembership = this.getOwningFeatureMembership();
		return featureMembership != null && featureMembership.isPart();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public void setIsComposite(boolean newIsComposite) {
		isComposite = newIsComposite;
		FeatureMembership featureMembership = this.getOwningFeatureMembership();
		if (featureMembership != null) {
			featureMembership.setIsPart(newIsComposite);
		}
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public FeatureValue getValuation() {
		if (valuation != null && valuation.eIsProxy()) {
			InternalEObject oldValuation = (InternalEObject) valuation;
			valuation = (FeatureValue) eResolveProxy(oldValuation);
			if (valuation != oldValuation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE__VALUATION,
							oldValuation, valuation));
			}
		}
		return valuation;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	public FeatureValue basicGetValuation() {
		return getFirstOwnedRelationship(FeatureValue.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetValuation(FeatureValue newValuation, NotificationChain msgs) {
		FeatureValue oldValuation = valuation;
		valuation = newValuation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SysMLPackage.FEATURE__VALUATION, oldValuation, newValuation);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newValuation != null) {
				EList<Relationship> ownedRelationship = getOwnedRelationship();
				if (!ownedRelationship.contains(newValuation)) {
					ownedRelationship.add(newValuation);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	@Override
	public void setValuation(FeatureValue newValuation) {
		// TODO: implement this method to set the 'Valuation' reference
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity() {
		if (multiplicity != null && multiplicity.eIsProxy()) {
			InternalEObject oldMultiplicity = (InternalEObject) multiplicity;
			multiplicity = (Multiplicity) eResolveProxy(oldMultiplicity);
			if (multiplicity != oldMultiplicity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE__MULTIPLICITY,
							oldMultiplicity, multiplicity));
			}
		}
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	public Multiplicity basicGetMultiplicity() {
		return getFirstOwnedRelationship(Multiplicity.class);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity(Multiplicity newMultiplicity, NotificationChain msgs) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SysMLPackage.FEATURE__MULTIPLICITY, oldMultiplicity, newMultiplicity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newMultiplicity != null) {
				EList<Relationship> ownedRelationship = getOwnedRelationship();
				if (!ownedRelationship.contains(newMultiplicity)) {
					ownedRelationship.add(newMultiplicity);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	@Override
	public void setMultiplicity(Multiplicity newMultiplicity) {
		// TODO: implement this method to set the 'Multiplicity' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	public EList<FeatureTyping> getTyping() {
		return getOwnedGeneralizationWithoutDefault(FeatureTyping.class, SysMLPackage.FEATURE__TYPING);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	@Override
	public boolean isEnd() {
		return getOwningFeatureMembership() instanceof EndFeatureMembership;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	@Override
	public void setIsEnd(boolean newIsEnd) {
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Type getEndOwningType() {
		Type endOwningType = basicGetEndOwningType();
		return endOwningType != null && endOwningType.eIsProxy() ? (Type) eResolveProxy((InternalEObject) endOwningType)
				: endOwningType;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public Type basicGetEndOwningType() {
		return isEnd() ? basicGetOwningType() : null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setEndOwningType(Type newEndOwningType) {
		// TODO: implement this method to set the 'End Owning Type' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public boolean isNonunique() {
		return !isUnique;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public void setIsNonunique(boolean newIsNonunique) {
		this.setIsUnique(!newIsNonunique);
	}

	// Additional redefinitions and subsets

	public BindingConnector getValueConnector() {
		FeatureValue valuation = getValuation();
		if (valuation != null) {
			Expression value = valuation.getValue();
			if (value != null) {
				if (valueConnector == null) {
					valueConnector = addOwnedBindingConnector(((ExpressionImpl) value).getResult(), this);
				} else {
					((ConnectorImpl) valueConnector).setRelatedFeature(0, ((ExpressionImpl) value).getResult());
					((ConnectorImpl) valueConnector).setRelatedFeature(1, this);
				}
			}
		}
		return valueConnector;
	}

	@Override
	public EList<Feature> getFeature() {
		getValueConnector();
		return super.getFeature();
	}

	@Override
	public Membership getOwningMembership() {
		Membership owningFeatureMembership = getOwningFeatureMembership();
		return owningFeatureMembership != null ? owningFeatureMembership : super.getOwningMembership();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Membership basicGetOwningMembership() {
		return owningMembership;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetOwningMembership(Membership newOwningMembership, NotificationChain msgs) {
		Membership oldOwningMembership = owningMembership;
		owningMembership = newOwningMembership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SysMLPackage.FEATURE__OWNING_MEMBERSHIP, oldOwningMembership, newOwningMembership);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			FeatureMembership owningFeatureMembership = getOwningFeatureMembership();
			if (owningFeatureMembership != null && owningFeatureMembership != newOwningMembership) {
				setOwningFeatureMembership(null);
			}
			if (newOwningMembership != null) {
				Relationship owningRelationship = getOwningRelationship();
				if (newOwningMembership != owningRelationship) {
					setOwningRelationship(newOwningMembership);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setOwningMembership(Membership newOwningMembership) {
		if (newOwningMembership != owningMembership) {
			NotificationChain msgs = null;
			if (owningMembership != null)
				msgs = ((InternalEObject) owningMembership).eInverseRemove(this,
						SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT, Membership.class, msgs);
			if (newOwningMembership != null)
				msgs = ((InternalEObject) newOwningMembership).eInverseAdd(this,
						SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT, Membership.class, msgs);
			msgs = basicSetOwningMembership(newOwningMembership, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__OWNING_MEMBERSHIP,
					newOwningMembership, newOwningMembership));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new SubsetSupersetEObjectContainmentWithInverseEList<Relationship>(Relationship.class,
					this, SysMLPackage.FEATURE__OWNED_RELATIONSHIP, null, OWNED_RELATIONSHIP_ESUBSETS,
					SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship;
	}

	/**
	 * The array of subset feature identifiers for the
	 * '{@link #getOwnedRelationship() <em>Owned Relationship</em>}' containment
	 * reference list. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getOwnedRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RELATIONSHIP_ESUBSETS = new int[] { SysMLPackage.FEATURE__OWNED_MEMBERSHIP,
			SysMLPackage.FEATURE__OWNED_IMPORT, SysMLPackage.FEATURE__VALUATION, SysMLPackage.FEATURE__MULTIPLICITY };

	// Utility methods

	public boolean isObjectFeature() {
		return getTypes(false).stream().anyMatch(type -> type instanceof Class);
	}

	public boolean isValueFeature() {
		return getTypes(false).stream().anyMatch(type -> type instanceof DataType);
	}

	public boolean hasObjectType() {
		return getTyping().stream().anyMatch(typing -> typing.getType() instanceof Class);
	}

	public boolean hasValueType() {
		return getTyping().stream().anyMatch(typing -> typing.getType() instanceof DataType);
	}

	public Subsetting createSubsetting() {
		Subsetting subsetting = SysMLFactory.eINSTANCE.createSubsetting();
		subsetting.setSubsettingFeature(this);
		this.getOwnedRelationship().add(subsetting);
		return subsetting;
	}

	public Optional<Subsetting> getFirstSubsetting() {
		return getOwnedSubsetting().stream().filter(s -> !(s instanceof Redefinition)).findFirst();
	}

	public Optional<Feature> getFirstSubsettedFeature() {
		return getFirstSubsetting().map(Subsetting::getSubsettedFeature);
	}

//

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SysMLPackage.FEATURE__OWNING_MEMBERSHIP:
			if (owningMembership != null)
				msgs = ((InternalEObject) owningMembership).eInverseRemove(this,
						SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT, Membership.class, msgs);
			return basicSetOwningMembership((Membership) otherEnd, msgs);
		case SysMLPackage.FEATURE__OWNED_RELATIONSHIP:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getOwnedRelationship()).basicAdd(otherEnd,
					msgs);
		case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			return basicSetOwningFeatureMembership((FeatureMembership) otherEnd, msgs);
		case SysMLPackage.FEATURE__VALUATION:
			if (valuation != null)
				msgs = ((InternalEObject) valuation).eInverseRemove(this,
						SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE, FeatureValue.class, msgs);
			return basicSetValuation((FeatureValue) otherEnd, msgs);
		case SysMLPackage.FEATURE__MULTIPLICITY:
			if (multiplicity != null)
				msgs = ((InternalEObject) multiplicity).eInverseRemove(this,
						SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, Multiplicity.class, msgs);
			return basicSetMultiplicity((Multiplicity) otherEnd, msgs);
		case SysMLPackage.FEATURE__TYPING:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getTyping()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SysMLPackage.FEATURE__OWNING_MEMBERSHIP:
			return basicSetOwningMembership(null, msgs);
		case SysMLPackage.FEATURE__OWNED_RELATIONSHIP:
			return ((InternalEList<?>) getOwnedRelationship()).basicRemove(otherEnd, msgs);
		case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
			return basicSetOwningFeatureMembership(null, msgs);
		case SysMLPackage.FEATURE__VALUATION:
			return basicSetValuation(null, msgs);
		case SysMLPackage.FEATURE__MULTIPLICITY:
			return basicSetMultiplicity(null, msgs);
		case SysMLPackage.FEATURE__TYPING:
			return ((InternalEList<?>) getTyping()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
		case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
			return eInternalContainer().eInverseRemove(this, SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
					FeatureMembership.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SysMLPackage.FEATURE__REFERENCED_TYPE:
			return getReferencedType();
		case SysMLPackage.FEATURE__OWNING_TYPE:
			if (resolve)
				return getOwningType();
			return basicGetOwningType();
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
		case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
			return getOwningFeatureMembership();
		case SysMLPackage.FEATURE__IS_COMPOSITE:
			return isComposite();
		case SysMLPackage.FEATURE__VALUATION:
			if (resolve)
				return getValuation();
			return basicGetValuation();
		case SysMLPackage.FEATURE__MULTIPLICITY:
			if (resolve)
				return getMultiplicity();
			return basicGetMultiplicity();
		case SysMLPackage.FEATURE__TYPING:
			return getTyping();
		case SysMLPackage.FEATURE__IS_END:
			return isEnd();
		case SysMLPackage.FEATURE__END_OWNING_TYPE:
			if (resolve)
				return getEndOwningType();
			return basicGetEndOwningType();
		case SysMLPackage.FEATURE__IS_NONUNIQUE:
			return isNonunique();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SysMLPackage.FEATURE__REFERENCED_TYPE:
			getReferencedType().clear();
			getReferencedType().addAll((Collection<? extends Type>) newValue);
			return;
		case SysMLPackage.FEATURE__OWNING_TYPE:
			setOwningType((Type) newValue);
			return;
		case SysMLPackage.FEATURE__IS_UNIQUE:
			setIsUnique((Boolean) newValue);
			return;
		case SysMLPackage.FEATURE__IS_ORDERED:
			setIsOrdered((Boolean) newValue);
			return;
		case SysMLPackage.FEATURE__TYPE:
			getType().clear();
			getType().addAll((Collection<? extends Type>) newValue);
			return;
		case SysMLPackage.FEATURE__OWNED_TYPE:
			getOwnedType().clear();
			getOwnedType().addAll((Collection<? extends Type>) newValue);
			return;
		case SysMLPackage.FEATURE__OWNED_REDEFINITION:
			getOwnedRedefinition().clear();
			getOwnedRedefinition().addAll((Collection<? extends Redefinition>) newValue);
			return;
		case SysMLPackage.FEATURE__OWNED_SUBSETTING:
			getOwnedSubsetting().clear();
			getOwnedSubsetting().addAll((Collection<? extends Subsetting>) newValue);
			return;
		case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
			setOwningFeatureMembership((FeatureMembership) newValue);
			return;
		case SysMLPackage.FEATURE__IS_COMPOSITE:
			setIsComposite((Boolean) newValue);
			return;
		case SysMLPackage.FEATURE__VALUATION:
			setValuation((FeatureValue) newValue);
			return;
		case SysMLPackage.FEATURE__MULTIPLICITY:
			setMultiplicity((Multiplicity) newValue);
			return;
		case SysMLPackage.FEATURE__TYPING:
			getTyping().clear();
			getTyping().addAll((Collection<? extends FeatureTyping>) newValue);
			return;
		case SysMLPackage.FEATURE__IS_END:
			setIsEnd((Boolean) newValue);
			return;
		case SysMLPackage.FEATURE__END_OWNING_TYPE:
			setEndOwningType((Type) newValue);
			return;
		case SysMLPackage.FEATURE__IS_NONUNIQUE:
			setIsNonunique((Boolean) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SysMLPackage.FEATURE__REFERENCED_TYPE:
			getReferencedType().clear();
			return;
		case SysMLPackage.FEATURE__OWNING_TYPE:
			setOwningType((Type) null);
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
		case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
			setOwningFeatureMembership((FeatureMembership) null);
			return;
		case SysMLPackage.FEATURE__IS_COMPOSITE:
			setIsComposite(IS_COMPOSITE_EDEFAULT);
			return;
		case SysMLPackage.FEATURE__VALUATION:
			setValuation((FeatureValue) null);
			return;
		case SysMLPackage.FEATURE__MULTIPLICITY:
			setMultiplicity((Multiplicity) null);
			return;
		case SysMLPackage.FEATURE__TYPING:
			getTyping().clear();
			return;
		case SysMLPackage.FEATURE__IS_END:
			setIsEnd(IS_END_EDEFAULT);
			return;
		case SysMLPackage.FEATURE__END_OWNING_TYPE:
			setEndOwningType((Type) null);
			return;
		case SysMLPackage.FEATURE__IS_NONUNIQUE:
			setIsNonunique(IS_NONUNIQUE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SysMLPackage.FEATURE__OWNING_MEMBERSHIP:
			return owningMembership != null;
		case SysMLPackage.FEATURE__OWNED_RELATIONSHIP:
			return ownedRelationship != null && !ownedRelationship.isEmpty();
		case SysMLPackage.FEATURE__REFERENCED_TYPE:
			return !getReferencedType().isEmpty();
		case SysMLPackage.FEATURE__OWNING_TYPE:
			return basicGetOwningType() != null;
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
		case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
			return getOwningFeatureMembership() != null;
		case SysMLPackage.FEATURE__IS_COMPOSITE:
			return isComposite() != IS_COMPOSITE_EDEFAULT;
		case SysMLPackage.FEATURE__VALUATION:
			return valuation != null;
		case SysMLPackage.FEATURE__MULTIPLICITY:
			return multiplicity != null;
		case SysMLPackage.FEATURE__TYPING:
			return typing != null && !typing.isEmpty();
		case SysMLPackage.FEATURE__IS_END:
			return isEnd() != IS_END_EDEFAULT;
		case SysMLPackage.FEATURE__END_OWNING_TYPE:
			return basicGetEndOwningType() != null;
		case SysMLPackage.FEATURE__IS_NONUNIQUE:
			return isNonunique() != IS_NONUNIQUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isUnique: ");
		result.append(isUnique);
		result.append(", isOrdered: ");
		result.append(isOrdered);
		result.append(')');
		return result.toString();
	}

} // FeatureImpl
