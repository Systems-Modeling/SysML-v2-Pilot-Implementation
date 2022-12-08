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

import org.omg.sysml.lang.sysml.Conjugation;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * This is the item provider adapter for a {@link org.omg.sysml.lang.sysml.Conjugation} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ConjugationItemProvider extends RelationshipItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConjugationItemProvider(AdapterFactory adapterFactory) {
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

			addOriginalTypePropertyDescriptor(object);
			addConjugatedTypePropertyDescriptor(object);
			addOwningTypePropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Original Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOriginalTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Conjugation_originalType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Conjugation_originalType_feature", "_UI_Conjugation_type"),
				 SysMLPackage.Literals.CONJUGATION__ORIGINAL_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Conjugated Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConjugatedTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Conjugation_conjugatedType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Conjugation_conjugatedType_feature", "_UI_Conjugation_type"),
				 SysMLPackage.Literals.CONJUGATION__CONJUGATED_TYPE,
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
				 getString("_UI_Conjugation_owningType_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Conjugation_owningType_feature", "_UI_Conjugation_type"),
				 SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This returns Conjugation.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Conjugation"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Conjugation)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Conjugation_type") :
			getString("_UI_Conjugation_type") + " " + label;
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

		switch (notification.getFeatureID(Conjugation.class)) {
			case SysMLPackage.CONJUGATION__OWNING_TYPE:
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
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createType()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createMultiplicity()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createMultiplicityRange()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createStep()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createClassifier()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createClass()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createBehavior()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createFunction()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAssociationStructure()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createStructure()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createBooleanExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createInvariant()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createPredicate()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createDataType()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createInvocationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createOperatorExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createFeatureChainExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createLiteralExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createLiteralInteger()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createNullExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createLiteralInfinity()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createMetadataAccessExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createMetadataFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createMetaclass()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createLiteralRational()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createSelectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createLiteralString()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createFeatureReferenceExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createLiteralBoolean()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createCollectExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createItemFlowEnd()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createItemFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createItemFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createSuccessionItemFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createSuccession()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createBindingConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createOccurrenceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createItemDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createPartDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createOccurrenceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createPortUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createPortioningFeature()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createPortDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createConjugatedPortDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createStateUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createConstraintUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createTransitionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAcceptActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createReferenceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createRequirementUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createConstraintDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createRequirementDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createConcernUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createConcernDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createItemUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createPartUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createCalculationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createActionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createCalculationDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createCaseDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAnalysisCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAnalysisCaseDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createInterfaceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createConnectionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createInterfaceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAttributeUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createViewUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createViewDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createViewpointUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createViewpointDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createRenderingUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createRenderingDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createVerificationCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createVerificationCaseDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createEnumerationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAttributeDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createEnumerationDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAllocationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAllocationDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createUseCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createUseCaseDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createFlowConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createMetadataUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createLifeClass()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAssertConstraintUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createIncludeUseCaseUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createPerformActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createEventOccurrenceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createMetadataDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createTriggerInvocationExpression()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createMergeNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createAssignmentActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createSendActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createIfActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createForLoopActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createWhileLoopActionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createDecisionNode()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createStateDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createExhibitStateUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createSuccessionFlowConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createSuccessionAsUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createFlowConnectionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createBindingConnectorAsUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.CONJUGATION__OWNING_TYPE,
				 SysMLFactory.eINSTANCE.createSatisfyRequirementUsage()));
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
			childFeature == SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION ||
			childFeature == SysMLPackage.Literals.CONJUGATION__OWNING_TYPE ||
			childFeature == SysMLPackage.Literals.ELEMENT__DOCUMENTATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}
