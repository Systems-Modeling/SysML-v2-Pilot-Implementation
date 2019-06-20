/**
 */
package org.omg.sysml.lang.sysml.impl;

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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.FeatureTyping;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.ObjectClass;
import org.omg.sysml.lang.sysml.Parameter;
import org.omg.sysml.lang.sysml.Redefinition;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.ValueClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningMembership <em>Owning Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRelationship_comp <em>Owned Relationship comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getReferencedType <em>Referenced Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningCategory <em>Owning Category</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isUnique <em>Is Unique</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isOrdered <em>Is Ordered</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedType <em>Owned Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedRedefinition <em>Owned Redefinition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwnedSubsetting <em>Owned Subsetting</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getOwningFeatureMembership <em>Owning Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isComposite <em>Is Composite</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getValuation_comp <em>Valuation comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getValuation <em>Valuation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getMultiplicity_comp <em>Multiplicity comp</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#getTyping <em>Typing</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.FeatureImpl#isNonunique <em>Is Nonunique</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FeatureImpl extends CategoryImpl implements Feature {
	
	private static final String FEATURE_SUBSETTING_DEFAULT = "Base::things";
	private static final String OBJECT_FEATURE_SUBSETTING_DEFAULT = "Base::objects";
	private static final String VALUE_FEATURE_SUBSETTING_DEFAULT = "Base::values";
	
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
	 * The cached value of the '{@link #getValuation_comp() <em>Valuation comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuation_comp()
	 * @generated
	 * @ordered
	 */
	protected FeatureValue valuation_comp;
	/**
	 * The cached value of the '{@link #getValuation() <em>Valuation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValuation()
	 * @generated
	 * @ordered
	 */
	protected FeatureValue valuation;
	/**
	 * The cached value of the '{@link #getMultiplicity_comp() <em>Multiplicity comp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity_comp()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity_comp;
	/**
	 * The cached value of the '{@link #getMultiplicity() <em>Multiplicity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMultiplicity()
	 * @generated
	 * @ordered
	 */
	protected Multiplicity multiplicity;
	/**
	 * The cached value of the '{@link #getTyping() <em>Typing</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTyping()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureTyping> typing;

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
	 * The cached value of the '{@link #isNonunique() <em>Is Nonunique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isNonunique()
	 * @generated
	 * @ordered
	 */
	protected boolean isNonunique = IS_NONUNIQUE_EDEFAULT;
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
	public EList<Category> getType() {
		EList<Category> types = new EObjectEList<Category>(Category.class, this, SysMLPackage.FEATURE__TYPE);
		getTypes(this, types, new HashSet<Feature>());
		return types;
	}
	
	public static void getTypes(Feature feature, List<Category> types, Set<Feature> visitedFeatures) {
		visitedFeatures.add(feature);
		getFeatureTypes(feature, types);
		for (Subsetting subsetting: feature.getOwnedSubsetting()) {
			Feature subsettedFeature = subsetting.getSubsettedFeature();
			if (subsettedFeature != null && !visitedFeatures.contains(subsettedFeature)) {
				getTypes(subsettedFeature, types, visitedFeatures);
			}
		}		
	}
	
	public static void getFeatureTypes(Feature feature, List<Category> types) {
		types.addAll(feature.getTyping().stream().
				map(typing->typing.getType()).filter(type->type != null).collect(Collectors.toList()));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Category> getReferencedType() {
		EList<Category> referencedTypes = new EObjectEList<Category>(Category.class, this, SysMLPackage.FEATURE__REFERENCED_TYPE);
	    referencedTypes.addAll(this.getType());
		referencedTypes.removeAll(this.getOwnedElement());
		return referencedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Category getOwningCategory() {
		Category owningCategory = basicGetOwningCategory();
		return owningCategory != null && owningCategory.eIsProxy() ? (Category)eResolveProxy((InternalEObject)owningCategory) : owningCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Category basicGetOwningCategory() {
		org.omg.sysml.lang.sysml.Package namespace = this.getOwningNamespace();
		return namespace instanceof Category? (Category)namespace: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningCategory(Category newOwningCategory) {
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isOrdered() {
		return isOrdered;
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
	public EList<Category> getOwnedType() {
		EList<Category> ownedTypes = new EObjectEList<Category>(Category.class, this, SysMLPackage.FEATURE__OWNED_TYPE);
		ownedTypes.addAll(this.getType());
		ownedTypes.removeAll(this.getReferencedType());
		return ownedTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Redefinition> getOwnedRedefinition() {
		EList<Redefinition> redefinitions = new EObjectEList<Redefinition>(Redefinition.class, this, SysMLPackage.FEATURE__OWNED_REDEFINITION);
		for (Subsetting subset: this.getOwnedSubsetting()) {
			if (subset instanceof Redefinition) {
				redefinitions.add((Redefinition)subset);
			}
		}
		return redefinitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithComputedRedefinitions(
				hasObjectType()? OBJECT_FEATURE_SUBSETTING_DEFAULT:
				hasValueType()? VALUE_FEATURE_SUBSETTING_DEFAULT:
				FEATURE_SUBSETTING_DEFAULT);
	}
	
	public boolean hasObjectType() {
		return getTyping().stream().anyMatch(typing->typing.getType() instanceof ObjectClass);
	}
	
	public boolean hasValueType() {
		return getTyping().stream().anyMatch(typing->typing.getType() instanceof ValueClass);
	}
	
	public EList<Subsetting> getOwnedSubsettingWithComputedRedefinitions(String subsettingDefault) {
		getComputedRedefinitions();
		return getOwnedSubsettingWithDefault(subsettingDefault);
	}
	
	public EList<Subsetting> getOwnedSubsettingWithDefault(String subsettingDefault) {
		return getOwnedGeneralizationWithDefault(Subsetting.class, SysMLPackage.FEATURE__OWNED_SUBSETTING, SysMLPackage.eINSTANCE.getSubsetting(), subsettingDefault);
	}
	
	public EList<Subsetting> getOwnedSubsettingWithoutDefault() {
		return getOwnedGeneralizationWithoutDefault(Subsetting.class, SysMLPackage.FEATURE__OWNED_SUBSETTING);
	}
	
	public EList<Redefinition> getOwnedRedefinitionsWithoutDefault() {
		return getOwnedGeneralizationWithoutDefault(Redefinition.class, SysMLPackage.FEATURE__OWNED_REDEFINITION);
	}
	
	/**
	 * If this Feature has no redefinitions, compute relevant redefinitions, as appropriate, from generalizations of the owning Category
	 * of the Feature.
	 */
	protected EList<Subsetting> getComputedRedefinitions() {
		EList<Subsetting> redefinitions = new EObjectEList<Subsetting>(Subsetting.class, this, SysMLPackage.FEATURE__OWNED_SUBSETTING);
		EList<Redefinition> ownedRedefinitions = getOwnedRedefinitionsWithoutDefault();
		if (ownedRedefinitions.stream().allMatch(r->r.getRedefinedFeature() == null)) {
			addRedefinitions(redefinitions, ownedRedefinitions);
		}
		return redefinitions;
	}

	protected void addRedefinitions(EList<Subsetting> redefinitions, List<Redefinition> emptyRedefinitions) {
		Category category = getOwningCategory();
		int i = getRelevantFeatures(category).indexOf(this);
		int j = 0;
		int n = emptyRedefinitions.size();
		if (i >= 0) {
			for (Generalization generalization: category.getOwnedGeneralization()) {
				Category general = generalization.getGeneral();
				if (general != null) {
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
			}
			getOwnedRelationship().removeAll(emptyRedefinitions.subList(j, n));
		}
	}
	
	/**
	 * Get the relevant Features that may be redefined from the given Category.
	 * If this is an end Feature, return the end Features of the Category,
	 * otherwise return the relavent features of the category.
	 */
	protected List<? extends Feature> getRelevantFeatures(Category category) {
		return getOwningFeatureMembership() instanceof EndFeatureMembership?
						category.getFeature().stream().
							filter(f->f.getOwningFeatureMembership() instanceof EndFeatureMembership).
							collect(Collectors.toList()):
					   
			   // NOTE: This is a temporary measure until connecting to inherited features
			   // is handled generally.
			   getOwningCategory() instanceof Parameter? category.getOwnedFeature():
						   
			   category != null? ((CategoryImpl)category).getRelevantFeatures():
			   Collections.emptyList();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureMembership getOwningFeatureMembership() {
		if (eContainerFeatureID() != SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP) return null;
		return (FeatureMembership)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFeatureMembership(FeatureMembership newOwningFeatureMembership, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwningFeatureMembership, SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP, msgs);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isComposite() {
		FeatureMembership featureMembership = this.getOwningFeatureMembership();
		return featureMembership != null && featureMembership.isPart();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setIsComposite(boolean newIsComposite) {
		FeatureMembership featureMembership = this.getOwningFeatureMembership();
		if (featureMembership != null) {
			featureMembership.setIsPart(newIsComposite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureValue getValuation_comp() {
		if (valuation_comp != null && valuation_comp.eIsProxy()) {
			InternalEObject oldValuation_comp = (InternalEObject)valuation_comp;
			valuation_comp = (FeatureValue)eResolveProxy(oldValuation_comp);
			if (valuation_comp != oldValuation_comp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE__VALUATION_COMP, oldValuation_comp, valuation_comp));
			}
		}
		return valuation_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValue basicGetValuation_comp() {
		return valuation_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetValuation_comp(FeatureValue newValuation_comp, NotificationChain msgs) {
		FeatureValue oldValuation_comp = valuation_comp;
		valuation_comp = newValuation_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__VALUATION_COMP, oldValuation_comp, newValuation_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newValuation_comp != null) {
				EList<Relationship> ownedRelationship_comp = getOwnedRelationship_comp();
				if (!ownedRelationship_comp.contains(newValuation_comp)) {
					ownedRelationship_comp.add(newValuation_comp);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValuation_comp(FeatureValue newValuation_comp) {
		if (newValuation_comp != valuation_comp) {
			NotificationChain msgs = null;
			if (valuation_comp != null)
				msgs = ((InternalEObject)valuation_comp).eInverseRemove(this, SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE, FeatureValue.class, msgs);
			if (newValuation_comp != null)
				msgs = ((InternalEObject)newValuation_comp).eInverseAdd(this, SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE, FeatureValue.class, msgs);
			msgs = basicSetValuation_comp(newValuation_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__VALUATION_COMP, newValuation_comp, newValuation_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FeatureValue getValuation() {
		if (valuation != null && valuation.eIsProxy()) {
			InternalEObject oldValuation = (InternalEObject)valuation;
			valuation = (FeatureValue)eResolveProxy(oldValuation);
			if (valuation != oldValuation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE__VALUATION, oldValuation, valuation));
			}
		}
		return valuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureValue basicGetValuation() {
		return valuation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setValuation(FeatureValue newValuation) {
		FeatureValue oldValuation = valuation;
		valuation = newValuation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__VALUATION, oldValuation, valuation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity_comp() {
		if (multiplicity_comp != null && multiplicity_comp.eIsProxy()) {
			InternalEObject oldMultiplicity_comp = (InternalEObject)multiplicity_comp;
			multiplicity_comp = (Multiplicity)eResolveProxy(oldMultiplicity_comp);
			if (multiplicity_comp != oldMultiplicity_comp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE__MULTIPLICITY_COMP, oldMultiplicity_comp, multiplicity_comp));
			}
		}
		return multiplicity_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity basicGetMultiplicity_comp() {
		return multiplicity_comp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMultiplicity_comp(Multiplicity newMultiplicity_comp, NotificationChain msgs) {
		Multiplicity oldMultiplicity_comp = multiplicity_comp;
		multiplicity_comp = newMultiplicity_comp;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__MULTIPLICITY_COMP, oldMultiplicity_comp, newMultiplicity_comp);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newMultiplicity_comp != null) {
				EList<Relationship> ownedRelationship_comp = getOwnedRelationship_comp();
				if (!ownedRelationship_comp.contains(newMultiplicity_comp)) {
					ownedRelationship_comp.add(newMultiplicity_comp);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity_comp(Multiplicity newMultiplicity_comp) {
		if (newMultiplicity_comp != multiplicity_comp) {
			NotificationChain msgs = null;
			if (multiplicity_comp != null)
				msgs = ((InternalEObject)multiplicity_comp).eInverseRemove(this, SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, Multiplicity.class, msgs);
			if (newMultiplicity_comp != null)
				msgs = ((InternalEObject)newMultiplicity_comp).eInverseAdd(this, SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, Multiplicity.class, msgs);
			msgs = basicSetMultiplicity_comp(newMultiplicity_comp, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__MULTIPLICITY_COMP, newMultiplicity_comp, newMultiplicity_comp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity() {
		if (multiplicity != null && multiplicity.eIsProxy()) {
			InternalEObject oldMultiplicity = (InternalEObject)multiplicity;
			multiplicity = (Multiplicity)eResolveProxy(oldMultiplicity);
			if (multiplicity != oldMultiplicity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.FEATURE__MULTIPLICITY, oldMultiplicity, multiplicity));
			}
		}
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Multiplicity basicGetMultiplicity() {
		return multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMultiplicity(Multiplicity newMultiplicity) {
		Multiplicity oldMultiplicity = multiplicity;
		multiplicity = newMultiplicity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__MULTIPLICITY, oldMultiplicity, multiplicity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<FeatureTyping> getTyping() {
		return getOwnedGeneralizationWithoutDefault(FeatureTyping.class, SysMLPackage.FEATURE__TYPING);
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
	
	// Additional redefinitions and subsets

	public BindingConnector getValueConnector() {
		FeatureValue valuation = getValuation();
		if (valuation != null) {
			Expression value = valuation.getValue();
			if (value != null) {
				if (valueConnector == null) {
					valueConnector = addOwnedBindingConnector(((ExpressionImpl)value).getResult(), this);
				} else {
					((ConnectorImpl)valueConnector).setRelatedFeature(0, ((ExpressionImpl)value).getResult());
					((ConnectorImpl)valueConnector).setRelatedFeature(1, this);
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
		return owningFeatureMembership != null? owningFeatureMembership: super.getOwningMembership();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Membership basicGetOwningMembership() {
		return owningMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningMembership(Membership newOwningMembership, NotificationChain msgs) {
		Membership oldOwningMembership = owningMembership;
		owningMembership = newOwningMembership;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__OWNING_MEMBERSHIP, oldOwningMembership, newOwningMembership);
			if (msgs == null) msgs = notification; else msgs.add(notification);
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningMembership(Membership newOwningMembership) {
		if (newOwningMembership != owningMembership) {
			NotificationChain msgs = null;
			if (owningMembership != null)
				msgs = ((InternalEObject)owningMembership).eInverseRemove(this, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, Membership.class, msgs);
			if (newOwningMembership != null)
				msgs = ((InternalEObject)newOwningMembership).eInverseAdd(this, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, Membership.class, msgs);
			msgs = basicSetOwningMembership(newOwningMembership, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.FEATURE__OWNING_MEMBERSHIP, newOwningMembership, newOwningMembership));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@Override
	@Override
	public EList<Relationship> getOwnedRelationship_comp() {
		if (ownedRelationship_comp == null) {
			ownedRelationship_comp = new SubsetSupersetEObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.FEATURE__OWNED_RELATIONSHIP_COMP, null, OWNED_RELATIONSHIP_COMP_ESUBSETS, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship_comp;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedRelationship_comp() <em>Owned Relationship comp</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedRelationship_comp()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_RELATIONSHIP_COMP_ESUBSETS = new int[] {SysMLPackage.FEATURE__OWNED_IMPORT_COMP, SysMLPackage.FEATURE__OWNED_MEMBERSHIP_COMP, SysMLPackage.FEATURE__VALUATION_COMP, SysMLPackage.FEATURE__MULTIPLICITY_COMP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.FEATURE__OWNING_MEMBERSHIP:
				if (owningMembership != null)
					msgs = ((InternalEObject)owningMembership).eInverseRemove(this, SysMLPackage.MEMBERSHIP__OWNED_MEMBER_ELEMENT_COMP, Membership.class, msgs);
				return basicSetOwningMembership((Membership)otherEnd, msgs);
			case SysMLPackage.FEATURE__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship_comp()).basicAdd(otherEnd, msgs);
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwningFeatureMembership((FeatureMembership)otherEnd, msgs);
			case SysMLPackage.FEATURE__VALUATION_COMP:
				if (valuation_comp != null)
					msgs = ((InternalEObject)valuation_comp).eInverseRemove(this, SysMLPackage.FEATURE_VALUE__FEATURE_WITH_VALUE, FeatureValue.class, msgs);
				return basicSetValuation_comp((FeatureValue)otherEnd, msgs);
			case SysMLPackage.FEATURE__MULTIPLICITY_COMP:
				if (multiplicity_comp != null)
					msgs = ((InternalEObject)multiplicity_comp).eInverseRemove(this, SysMLPackage.MULTIPLICITY__FEATURE_WITH_MULTIPLICITY, Multiplicity.class, msgs);
				return basicSetMultiplicity_comp((Multiplicity)otherEnd, msgs);
			case SysMLPackage.FEATURE__TYPING:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTyping()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.FEATURE__OWNED_RELATIONSHIP_COMP:
				return ((InternalEList<?>)getOwnedRelationship_comp()).basicRemove(otherEnd, msgs);
			case SysMLPackage.FEATURE__OWNING_FEATURE_MEMBERSHIP:
				return basicSetOwningFeatureMembership(null, msgs);
			case SysMLPackage.FEATURE__VALUATION_COMP:
				return basicSetValuation_comp(null, msgs);
			case SysMLPackage.FEATURE__MULTIPLICITY_COMP:
				return basicSetMultiplicity_comp(null, msgs);
			case SysMLPackage.FEATURE__TYPING:
				return ((InternalEList<?>)getTyping()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				return getReferencedType();
			case SysMLPackage.FEATURE__OWNING_CATEGORY:
				if (resolve) return getOwningCategory();
				return basicGetOwningCategory();
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
			case SysMLPackage.FEATURE__VALUATION_COMP:
				if (resolve) return getValuation_comp();
				return basicGetValuation_comp();
			case SysMLPackage.FEATURE__VALUATION:
				if (resolve) return getValuation();
				return basicGetValuation();
			case SysMLPackage.FEATURE__MULTIPLICITY_COMP:
				if (resolve) return getMultiplicity_comp();
				return basicGetMultiplicity_comp();
			case SysMLPackage.FEATURE__MULTIPLICITY:
				if (resolve) return getMultiplicity();
				return basicGetMultiplicity();
			case SysMLPackage.FEATURE__TYPING:
				return getTyping();
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
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				getReferencedType().clear();
				getReferencedType().addAll((Collection<? extends Category>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNING_CATEGORY:
				setOwningCategory((Category)newValue);
				return;
			case SysMLPackage.FEATURE__IS_UNIQUE:
				setIsUnique((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__IS_ORDERED:
				setIsOrdered((Boolean)newValue);
				return;
			case SysMLPackage.FEATURE__TYPE:
				getType().clear();
				getType().addAll((Collection<? extends Category>)newValue);
				return;
			case SysMLPackage.FEATURE__OWNED_TYPE:
				getOwnedType().clear();
				getOwnedType().addAll((Collection<? extends Category>)newValue);
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
			case SysMLPackage.FEATURE__VALUATION_COMP:
				setValuation_comp((FeatureValue)newValue);
				return;
			case SysMLPackage.FEATURE__VALUATION:
				setValuation((FeatureValue)newValue);
				return;
			case SysMLPackage.FEATURE__MULTIPLICITY_COMP:
				setMultiplicity_comp((Multiplicity)newValue);
				return;
			case SysMLPackage.FEATURE__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
				return;
			case SysMLPackage.FEATURE__TYPING:
				getTyping().clear();
				getTyping().addAll((Collection<? extends FeatureTyping>)newValue);
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
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				getReferencedType().clear();
				return;
			case SysMLPackage.FEATURE__OWNING_CATEGORY:
				setOwningCategory((Category)null);
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
				setOwningFeatureMembership((FeatureMembership)null);
				return;
			case SysMLPackage.FEATURE__IS_COMPOSITE:
				setIsComposite(IS_COMPOSITE_EDEFAULT);
				return;
			case SysMLPackage.FEATURE__VALUATION_COMP:
				setValuation_comp((FeatureValue)null);
				return;
			case SysMLPackage.FEATURE__VALUATION:
				setValuation((FeatureValue)null);
				return;
			case SysMLPackage.FEATURE__MULTIPLICITY_COMP:
				setMultiplicity_comp((Multiplicity)null);
				return;
			case SysMLPackage.FEATURE__MULTIPLICITY:
				setMultiplicity((Multiplicity)null);
				return;
			case SysMLPackage.FEATURE__TYPING:
				getTyping().clear();
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
				return owningMembership != null;
			case SysMLPackage.FEATURE__OWNED_RELATIONSHIP_COMP:
				return ownedRelationship_comp != null && !ownedRelationship_comp.isEmpty();
			case SysMLPackage.FEATURE__REFERENCED_TYPE:
				return !getReferencedType().isEmpty();
			case SysMLPackage.FEATURE__OWNING_CATEGORY:
				return basicGetOwningCategory() != null;
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
			case SysMLPackage.FEATURE__VALUATION_COMP:
				return valuation_comp != null;
			case SysMLPackage.FEATURE__VALUATION:
				return valuation != null;
			case SysMLPackage.FEATURE__MULTIPLICITY_COMP:
				return multiplicity_comp != null;
			case SysMLPackage.FEATURE__MULTIPLICITY:
				return multiplicity != null;
			case SysMLPackage.FEATURE__TYPING:
				return typing != null && !typing.isEmpty();
			case SysMLPackage.FEATURE__IS_NONUNIQUE:
				return isNonunique != IS_NONUNIQUE_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(", isNonunique: ");
		result.append(isNonunique);
		result.append(')');
		return result.toString();
	}

} //FeatureImpl
