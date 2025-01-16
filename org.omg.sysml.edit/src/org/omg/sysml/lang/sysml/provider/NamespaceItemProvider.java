/**
 */
package org.omg.sysml.lang.sysml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * This is the item provider adapter for a {@link org.omg.sysml.lang.sysml.Namespace} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class NamespaceItemProvider extends ElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NamespaceItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedMembershipPropertyDescriptor(object);
			addOwnedMemberPropertyDescriptor(object);
			addMembershipPropertyDescriptor(object);
			addOwnedImportPropertyDescriptor(object);
			addMemberPropertyDescriptor(object);
			addImportedMembershipPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Membership feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMembershipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_membership_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_membership_feature", "_UI_Namespace_type"),
				 SysMLPackage.Literals.NAMESPACE__MEMBERSHIP,
				 false,
				 false,
				 false,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Import feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedImportPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_ownedImport_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_ownedImport_feature", "_UI_Namespace_type"),
				 SysMLPackage.Literals.NAMESPACE__OWNED_IMPORT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_member_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_member_feature", "_UI_Namespace_type"),
				 SysMLPackage.Literals.NAMESPACE__MEMBER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Member feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMemberPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_ownedMember_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_ownedMember_feature", "_UI_Namespace_type"),
				 SysMLPackage.Literals.NAMESPACE__OWNED_MEMBER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Membership feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMembershipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_ownedMembership_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_ownedMembership_feature", "_UI_Namespace_type"),
				 SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Imported Membership feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addImportedMembershipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Namespace_importedMembership_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Namespace_importedMembership_feature", "_UI_Namespace_type"),
				 SysMLPackage.Literals.NAMESPACE__IMPORTED_MEMBERSHIP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Namespace.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Namespace"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Namespace)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Namespace_type") :
			getString("_UI_Namespace_type") + " " + label;
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

		switch (notification.getFeatureID(Namespace.class)) {
			case SysMLPackage.NAMESPACE__OWNED_MEMBERSHIP:
			case SysMLPackage.NAMESPACE__OWNED_IMPORT:
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
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createOwningMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createFeatureMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createElementFilterMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createParameterMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createReturnParameterMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createResultExpressionMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createFeatureValue()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createEndFeatureMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createVariantMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createStateSubactionMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createTransitionFeatureMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createActorMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createRequirementConstraintMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createFramedConcernMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createStakeholderMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createSubjectMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createRequirementVerificationMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createViewRenderingMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP,
				 SysMLFactory.eINSTANCE.createObjectiveMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_IMPORT,
				 SysMLFactory.eINSTANCE.createNamespaceImport()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_IMPORT,
				 SysMLFactory.eINSTANCE.createMembershipImport()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_IMPORT,
				 SysMLFactory.eINSTANCE.createMembershipExpose()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.NAMESPACE__OWNED_IMPORT,
				 SysMLFactory.eINSTANCE.createNamespaceExpose()));
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
			childFeature == SysMLPackage.Literals.NAMESPACE__OWNED_MEMBERSHIP ||
			childFeature == SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION ||
			childFeature == SysMLPackage.Literals.NAMESPACE__OWNED_IMPORT;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
