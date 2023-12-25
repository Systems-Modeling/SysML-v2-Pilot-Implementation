/**
 */
package org.omg.sysml.lang.sysml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * This is the item provider adapter for a {@link org.omg.sysml.lang.sysml.FeatureMembership} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FeatureMembershipItemProvider extends OwningMembershipItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMembershipItemProvider(AdapterFactory adapterFactory) {
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

			addTypePropertyDescriptor(object);
			addFeaturePropertyDescriptor(object);
			addOwningTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Featuring_type_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Featuring_type_feature", "_UI_Featuring_type"),
				 SysMLPackage.Literals.FEATURING__TYPE,
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
				 getString("_UI_Featuring_feature_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Featuring_feature_feature", "_UI_Featuring_type"),
				 SysMLPackage.Literals.FEATURING__FEATURE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owning Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_FeatureMembership_owningType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_FeatureMembership_owningType_feature", "_UI_FeatureMembership_type"),
				 SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNING_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FeatureMembership.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FeatureMembership"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FeatureMembership)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_FeatureMembership_type") :
			getString("_UI_FeatureMembership_type") + " " + label;
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

		switch (notification.getFeatureID(FeatureMembership.class)) {
			case SysMLPackage.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
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
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createStep()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createMetadataFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createItemFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createItemFlowEnd()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createItemFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createSuccessionItemFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createSuccession()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createMultiplicityRange()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createFeatureReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createInvocationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createLiteralRational()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createFeatureChainExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createMetadataAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createLiteralInfinity()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createCollectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createBindingConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createOccurrenceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createCalculationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createReferenceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createEnumerationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createItemUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createPartUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createPortUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createFlowConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createInterfaceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createAllocationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createStateUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createTransitionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createAcceptActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createConstraintUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createRequirementUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createConcernUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createAnalysisCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createVerificationCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createUseCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createViewUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createViewpointUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createRenderingUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createMetadataUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createSuccessionAsUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createSuccessionFlowConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createBindingConnectorAsUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createExhibitStateUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createPerformActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createEventOccurrenceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createSatisfyRequirementUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createAssertConstraintUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createForLoopActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createSendActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createTriggerInvocationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createWhileLoopActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createAssignmentActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createIfActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE,
				 SysMLFactory.eINSTANCE.createIncludeUseCaseUsage()));
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
			childFeature == SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION ||
			childFeature == SysMLPackage.Literals.FEATURE_MEMBERSHIP__OWNED_MEMBER_FEATURE ||
			childFeature == SysMLPackage.Literals.ELEMENT__DOCUMENTATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
