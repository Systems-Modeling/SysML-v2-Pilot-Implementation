/**
 */
package org.omg.sysml.lang.sysml.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLFactory;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * This is the item provider adapter for a {@link org.omg.sysml.lang.sysml.Element} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ElementItemProvider 
	extends ItemProviderAdapter
	implements
		IEditingDomainItemProvider,
		IStructuredItemContentProvider,
		ITreeItemContentProvider,
		IItemLabelProvider,
		IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementItemProvider(AdapterFactory adapterFactory) {
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

			addOwningMembershipPropertyDescriptor(object);
			addOwningNamespacePropertyDescriptor(object);
			addElementIdPropertyDescriptor(object);
			addOwnerPropertyDescriptor(object);
			addOwnedElementPropertyDescriptor(object);
			addDocumentationPropertyDescriptor(object);
			addOwnedAnnotationPropertyDescriptor(object);
			addTextualRepresentationPropertyDescriptor(object);
			addAliasIdsPropertyDescriptor(object);
			addDeclaredShortNamePropertyDescriptor(object);
			addDeclaredNamePropertyDescriptor(object);
			addShortNamePropertyDescriptor(object);
			addNamePropertyDescriptor(object);
			addQualifiedNamePropertyDescriptor(object);
			addIsImpliedIncludedPropertyDescriptor(object);
			addIsLibraryElementPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Owning Membership feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningMembershipPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_owningMembership_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_owningMembership_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__OWNING_MEMBERSHIP,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owning Namespace feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwningNamespacePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_owningNamespace_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_owningNamespace_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__OWNING_NAMESPACE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Element Id feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addElementIdPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_elementId_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_elementId_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__ELEMENT_ID,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owner feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnerPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_owner_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_owner_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__OWNER,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_ownedElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_ownedElement_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__OWNED_ELEMENT,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Documentation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDocumentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_documentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_documentation_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__DOCUMENTATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Owned Annotation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOwnedAnnotationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_ownedAnnotation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_ownedAnnotation_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Textual Representation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTextualRepresentationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_textualRepresentation_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_textualRepresentation_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__TEXTUAL_REPRESENTATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Alias Ids feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAliasIdsPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_aliasIds_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_aliasIds_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__ALIAS_IDS,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declared Short Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclaredShortNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_declaredShortName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_declaredShortName_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__DECLARED_SHORT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Declared Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDeclaredNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_declaredName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_declaredName_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__DECLARED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Short Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addShortNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_shortName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_shortName_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__SHORT_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_name_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_name_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Qualified Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addQualifiedNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_qualifiedName_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_qualifiedName_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__QUALIFIED_NAME,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.GENERIC_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Implied Included feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsImpliedIncludedPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_isImpliedIncluded_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_isImpliedIncluded_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__IS_IMPLIED_INCLUDED,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Library Element feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsLibraryElementPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Element_isLibraryElement_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Element_isLibraryElement_feature", "_UI_Element_type"),
				 SysMLPackage.Literals.ELEMENT__IS_LIBRARY_ELEMENT,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
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
			childrenFeatures.add(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP);
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
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((Element)object).getName();
		return label == null || label.length() == 0 ?
			getString("_UI_Element_type") :
			getString("_UI_Element_type") + " " + label;
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

		switch (notification.getFeatureID(Element.class)) {
			case SysMLPackage.ELEMENT__ELEMENT_ID:
			case SysMLPackage.ELEMENT__OWNED_ANNOTATION:
			case SysMLPackage.ELEMENT__ALIAS_IDS:
			case SysMLPackage.ELEMENT__DECLARED_SHORT_NAME:
			case SysMLPackage.ELEMENT__DECLARED_NAME:
			case SysMLPackage.ELEMENT__SHORT_NAME:
			case SysMLPackage.ELEMENT__NAME:
			case SysMLPackage.ELEMENT__QUALIFIED_NAME:
			case SysMLPackage.ELEMENT__IS_IMPLIED_INCLUDED:
			case SysMLPackage.ELEMENT__IS_LIBRARY_ELEMENT:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SysMLPackage.ELEMENT__OWNED_RELATIONSHIP:
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
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createOwningMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createAnnotation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createSpecialization()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createFeatureMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createSubsetting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createRedefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createFeatureTyping()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createTypeFeaturing()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createFeatureInverting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createFeatureChaining()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createReferenceSubsetting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createCrossSubsetting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createConjugation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createIntersecting()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createUnioning()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createDisjoining()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createDifferencing()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createSubclassification()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createAssociation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createSuccessionFlow()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createSuccession()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createFeatureValue()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createElementFilterMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createBindingConnector()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createResultExpressionMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createParameterMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createReturnParameterMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createAssociationStructure()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createEndFeatureMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createDependency()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createMembershipImport()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createNamespaceImport()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createVariantMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createPortConjugation()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createFlowUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createConnectionUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createInterfaceUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createConnectionDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createInterfaceDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createAllocationUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createAllocationDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createStateSubactionMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createTransitionFeatureMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createRequirementConstraintMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createRequirementVerificationMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createActorMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createStakeholderMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createSubjectMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createFramedConcernMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createObjectiveMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createBindingConnectorAsUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createSuccessionAsUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createNamespaceExpose()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createMembershipExpose()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createViewRenderingMembership()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createConjugatedPortTyping()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createFlowDefinition()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_RELATIONSHIP,
				 SysMLFactory.eINSTANCE.createSuccessionFlowUsage()));

		newChildDescriptors.add
			(createChildParameter
				(SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION,
				 SysMLFactory.eINSTANCE.createAnnotation()));
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
			childFeature == SysMLPackage.Literals.ELEMENT__OWNED_ANNOTATION;

		if (qualify) {
			return getString
				("_UI_CreateChild_text2",
				 new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return SysMLEditPlugin.INSTANCE;
	}

}
