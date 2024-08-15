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

import org.omg.sysml.lang.sysml.OwningMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * This is the item provider adapter for a {@link org.omg.sysml.lang.sysml.OwningMembership} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class OwningMembershipItemProvider extends MembershipItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OwningMembershipItemProvider(AdapterFactory adapterFactory) {
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

			addOwnedMemberElementIdPropertyDescriptor(object);
			addOwnedMemberShortNamePropertyDescriptor(object);
			addOwnedMemberNamePropertyDescriptor(object);
			addOwnedMemberElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owned Member Element Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMemberElementIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwningMembership_ownedMemberElementId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwningMembership_ownedMemberElementId_feature", "_UI_OwningMembership_type"),
				 SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Member Short Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMemberShortNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwningMembership_ownedMemberShortName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwningMembership_ownedMemberShortName_feature", "_UI_OwningMembership_type"),
				 SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Member Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMemberNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwningMembership_ownedMemberName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwningMembership_ownedMemberName_feature", "_UI_OwningMembership_type"),
				 SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Member Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedMemberElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_OwningMembership_ownedMemberElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_OwningMembership_ownedMemberElement_feature", "_UI_OwningMembership_type"),
				 SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns OwningMembership.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/OwningMembership"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((OwningMembership)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_OwningMembership_type") :
			getString("_UI_OwningMembership_type") + " " + label;
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

		switch (notification.getFeatureID(OwningMembership.class)) {
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID:
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME:
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_NAME:
			case SysMLPackage.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT:
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
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSpecialization()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSubclassification()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createOwningMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createNamespace()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAnnotatingElement()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createComment()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createDocumentation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createTextualRepresentation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFeatureMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSubsetting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createRedefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFeatureTyping()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createTypeFeaturing()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFeatureInverting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFeatureChaining()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createReferenceSubsetting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConjugation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createIntersecting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createUnioning()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createDisjoining()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createDifferencing()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createEndFeatureMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createStep()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createInvocationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createCollectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createLiteralInfinity()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFeatureReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFeatureChainExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createLiteralRational()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMetadataAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMetadataFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMetaclass()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createElementFilterMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createLibraryPackage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAssociationStructure()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMultiplicityRange()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFeatureValue()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createParameterMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createResultExpressionMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createReturnParameterMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createItemFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createItemFlowEnd()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createItemFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSuccessionItemFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSuccession()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createBindingConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createNamespaceImport()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMembershipImport()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createOccurrenceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createItemUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMetadataUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createVariantMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createReferenceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createEnumerationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createEnumerationDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createPartUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createOccurrenceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createPartDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createLifeClass()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createPortUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createPortDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConjugatedPortDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createPortConjugation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFlowConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createInterfaceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConnectionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createInterfaceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAllocationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAllocationDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createStateUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createTransitionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAcceptActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createCalculationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConstraintUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createRequirementUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConstraintDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createRequirementDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConcernUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConcernDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createActionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createCalculationDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createCaseDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAnalysisCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAnalysisCaseDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createVerificationCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createVerificationCaseDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createUseCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createUseCaseDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createViewUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createViewDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createViewpointUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createViewpointDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createRenderingUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createRenderingDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMetadataDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createTransitionFeatureMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createExhibitStateUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createPerformActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createEventOccurrenceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createStateSubactionMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createStateDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createIfActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createForLoopActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAssignmentActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSendActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createTriggerInvocationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createWhileLoopActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createIncludeUseCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createAssertConstraintUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createConjugatedPortTyping()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createObjectiveMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSatisfyRequirementUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSubjectMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createStakeholderMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createRequirementConstraintMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFramedConcernMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createActorMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSuccessionAsUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createFlowConnectionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createSuccessionFlowConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createBindingConnectorAsUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createMembershipExpose()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createViewRenderingMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createNamespaceExpose()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT,
				 SysMLFactory.eINSTANCE.createRequirementVerificationMembership()));
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
			childFeature == SysMLPackage.Literals.RELATIONSHIP__OWNED_RELATED_ELEMENT ||
			childFeature == SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT ||
			childFeature == SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
