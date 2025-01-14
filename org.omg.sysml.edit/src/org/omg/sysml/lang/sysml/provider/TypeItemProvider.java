/**
 */
package org.omg.sysml.lang.sysml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * This is the item provider adapter for a {@link org.omg.sysml.lang.sysml.Type} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeItemProvider extends NamespaceItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addOwnedFeatureMembershipPropertyDescriptor(object);
			addOwnedFeaturePropertyDescriptor(object);
			addOwnedEndFeaturePropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addInputPropertyDescriptor(object);
			addOutputPropertyDescriptor(object);
			addIsAbstractPropertyDescriptor(object);
			addInheritedMembershipPropertyDescriptor(object);
			addEndFeaturePropertyDescriptor(object);
			addIsSufficientPropertyDescriptor(object);
			addOwnedConjugatorPropertyDescriptor(object);
			addIsConjugatedPropertyDescriptor(object);
			addInheritedFeaturePropertyDescriptor(object);
			addMultiplicityPropertyDescriptor(object);
			addUnioningTypePropertyDescriptor(object);
			addOwnedIntersectingPropertyDescriptor(object);
			addIntersectingTypePropertyDescriptor(object);
			addOwnedUnioningPropertyDescriptor(object);
			addOwnedDisjoiningPropertyDescriptor(object);
			addFeatureMembershipPropertyDescriptor(object);
			addDifferencingTypePropertyDescriptor(object);
			addOwnedDifferencingPropertyDescriptor(object);
			addDirectedFeaturePropertyDescriptor(object);
			addOwnedSpecializationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Specialization feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedSpecializationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_ownedSpecialization_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_ownedSpecialization_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Feature Membership feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedFeatureMembershipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_ownedFeatureMembership_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_ownedFeatureMembership_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OWNED_FEATURE_MEMBERSHIP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_feature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_feature_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_ownedFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_ownedFeature_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OWNED_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Input feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_input_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_input_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__INPUT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Output feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOutputPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_output_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_output_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OUTPUT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Abstract feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAbstractPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_isAbstract_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_isAbstract_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__IS_ABSTRACT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Membership feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedMembershipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_inheritedMembership_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_inheritedMembership_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__INHERITED_MEMBERSHIP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the End Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addEndFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_endFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_endFeature_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__END_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned End Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedEndFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_ownedEndFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_ownedEndFeature_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OWNED_END_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Sufficient feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsSufficientPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_isSufficient_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_isSufficient_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__IS_SUFFICIENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Conjugator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedConjugatorPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_ownedConjugator_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_ownedConjugator_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OWNED_CONJUGATOR,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Conjugated feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsConjugatedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_isConjugated_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_isConjugated_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__IS_CONJUGATED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Inherited Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInheritedFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_inheritedFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_inheritedFeature_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__INHERITED_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Multiplicity feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMultiplicityPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_multiplicity_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_multiplicity_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__MULTIPLICITY,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Unioning Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addUnioningTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_unioningType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_unioningType_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__UNIONING_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Intersecting feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedIntersectingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_ownedIntersecting_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_ownedIntersecting_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OWNED_INTERSECTING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Intersecting Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIntersectingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_intersectingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_intersectingType_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__INTERSECTING_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Unioning feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedUnioningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_ownedUnioning_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_ownedUnioning_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OWNED_UNIONING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Disjoining feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedDisjoiningPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_ownedDisjoining_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_ownedDisjoining_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OWNED_DISJOINING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Feature Membership feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFeatureMembershipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_featureMembership_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_featureMembership_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__FEATURE_MEMBERSHIP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Differencing Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDifferencingTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_differencingType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_differencingType_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__DIFFERENCING_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Differencing feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedDifferencingPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_ownedDifferencing_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_ownedDifferencing_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__OWNED_DIFFERENCING,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Directed Feature feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDirectedFeaturePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Type_directedFeature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Type_directedFeature_feature", "_UI_Type_type"),
				 SysMLPackage.Literals.TYPE__DIRECTED_FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Type.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Type"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Type)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Type_type") :
			getString("_UI_Type_type") + " " + label;
	}


	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Type.class)) {
			case SysMLPackage.TYPE__IS_ABSTRACT:
			case SysMLPackage.TYPE__IS_SUFFICIENT:
			case SysMLPackage.TYPE__OWNED_CONJUGATOR:
			case SysMLPackage.TYPE__IS_CONJUGATED:
			case SysMLPackage.TYPE__OWNED_INTERSECTING:
			case SysMLPackage.TYPE__OWNED_UNIONING:
			case SysMLPackage.TYPE__OWNED_DISJOINING:
			case SysMLPackage.TYPE__OWNED_DIFFERENCING:
			case SysMLPackage.TYPE__OWNED_SPECIALIZATION:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_CONJUGATOR,
				 SysMLFactory.eINSTANCE.createConjugation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_CONJUGATOR,
				 SysMLFactory.eINSTANCE.createPortConjugation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_INTERSECTING,
				 SysMLFactory.eINSTANCE.createIntersecting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_UNIONING,
				 SysMLFactory.eINSTANCE.createUnioning()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_DISJOINING,
				 SysMLFactory.eINSTANCE.createDisjoining()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_DIFFERENCING,
				 SysMLFactory.eINSTANCE.createDifferencing()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION,
				 SysMLFactory.eINSTANCE.createSpecialization()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION,
				 SysMLFactory.eINSTANCE.createSubclassification()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION,
				 SysMLFactory.eINSTANCE.createSubsetting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION,
				 SysMLFactory.eINSTANCE.createRedefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION,
				 SysMLFactory.eINSTANCE.createFeatureTyping()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION,
				 SysMLFactory.eINSTANCE.createReferenceSubsetting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION,
				 SysMLFactory.eINSTANCE.createCrossSubsetting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION,
				 SysMLFactory.eINSTANCE.createConjugatedPortTyping()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify =
			childFeature == SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP ||
			childFeature == SysMLPackage.Literals.TYPE__OWNED_SPECIALIZATION ||
			childFeature == SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP ||
			childFeature == SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION ||
			childFeature == SysMLPackage.Literals.TYPE__OWNED_CONJUGATOR ||
			childFeature == SysMLPackage.Literals.TYPE__OWNED_INTERSECTING ||
			childFeature == SysMLPackage.Literals.TYPE__OWNED_UNIONING ||
			childFeature == SysMLPackage.Literals.TYPE__OWNED_DISJOINING ||
			childFeature == SysMLPackage.Literals.TYPE__OWNED_DIFFERENCING ||
			childFeature == SysMLPackage.Literals.NAMESPACE__OWNED_IMPORT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
