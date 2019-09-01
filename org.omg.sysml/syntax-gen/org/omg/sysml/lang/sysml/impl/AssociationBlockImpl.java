/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.AssociationBlock;
import org.omg.sysml.lang.sysml.Block;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Property;
import org.omg.sysml.lang.sysml.Superclassing;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association Block</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getFlowProperty <em>Flow Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationBlockImpl#getOwnedUsage <em>Owned Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationBlockImpl extends AssociationImpl implements AssociationBlock {

	public static final String ASSOCIATION_BLOCK_SUPERCLASS_DEFAULT = "Blocks::Connection";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationBlockImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSOCIATION_BLOCK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PortUsage> getOwnedPort() {
		return new DerivedEObjectEList<PortUsage>(PortUsage.class, this, SysMLPackage.INTERFACE_DEFINITION__OWNED_PORT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getFlowProperty() {
		EList<Property> flowProperties = new EObjectEList<Property>(Property.class, this, SysMLPackage.DEFINITION__PROPERTY);
		getMembership().stream().
			filter(membership->membership instanceof FeatureMembership && ((FeatureMembership)membership).getDirection() != null).
			map(membership->((FeatureMembership)membership).getMemberFeature()).
			filter(feature->feature instanceof Property).
			forEachOrdered(feature->flowProperties.add((Property)feature));
		return flowProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getOwnedProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.INTERFACE_DEFINITION__OWNED_PROPERTY, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.INTERFACE_DEFINITION__PROPERTY, new int[] {SysMLPackage.TYPE__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ActionUsage> getOwnedAction() {
		return new DerivedEObjectEList<ActionUsage>(ActionUsage.class, this, SysMLPackage.DEFINITION__OWNED_ACTION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getOwnedUsage() {
		return new DerivedEObjectEList<Usage>(Usage.class, this, SysMLPackage.INTERFACE_DEFINITION__OWNED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	@Override
	public EList<Superclassing> getOwnedSuperclassing() {
		return getOwnedSuperclassingWithDefault(
				getOwnedEndFeature().size() > 2? 
					ASSOCIATION_SUPERCLASS_DEFAULT: 
					ASSOCIATION_BLOCK_SUPERCLASS_DEFAULT);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PORT:
				return getOwnedPort();
			case SysMLPackage.ASSOCIATION_BLOCK__FLOW_PROPERTY:
				return getFlowProperty();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PROPERTY:
				return getOwnedProperty();
			case SysMLPackage.ASSOCIATION_BLOCK__PROPERTY:
				return getProperty();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_ACTION:
				return getOwnedAction();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_USAGE:
				return getOwnedUsage();
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
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__FLOW_PROPERTY:
				getFlowProperty().clear();
				getFlowProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PROPERTY:
				getOwnedProperty().clear();
				getOwnedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_ACTION:
				getOwnedAction().clear();
				getOwnedAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_USAGE:
				getOwnedUsage().clear();
				getOwnedUsage().addAll((Collection<? extends Usage>)newValue);
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
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PORT:
				getOwnedPort().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__FLOW_PROPERTY:
				getFlowProperty().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PROPERTY:
				getOwnedProperty().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__PROPERTY:
				getProperty().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_ACTION:
				getOwnedAction().clear();
				return;
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_USAGE:
				getOwnedUsage().clear();
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
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PORT:
				return !getOwnedPort().isEmpty();
			case SysMLPackage.ASSOCIATION_BLOCK__FLOW_PROPERTY:
				return !getFlowProperty().isEmpty();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PROPERTY:
				return !getOwnedProperty().isEmpty();
			case SysMLPackage.ASSOCIATION_BLOCK__PROPERTY:
				return !getProperty().isEmpty();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_ACTION:
				return !getOwnedAction().isEmpty();
			case SysMLPackage.ASSOCIATION_BLOCK__OWNED_USAGE:
				return !getOwnedUsage().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Definition.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PORT: return SysMLPackage.DEFINITION__OWNED_PORT;
				case SysMLPackage.ASSOCIATION_BLOCK__FLOW_PROPERTY: return SysMLPackage.DEFINITION__FLOW_PROPERTY;
				case SysMLPackage.ASSOCIATION_BLOCK__OWNED_PROPERTY: return SysMLPackage.DEFINITION__OWNED_PROPERTY;
				case SysMLPackage.ASSOCIATION_BLOCK__PROPERTY: return SysMLPackage.DEFINITION__PROPERTY;
				case SysMLPackage.ASSOCIATION_BLOCK__OWNED_ACTION: return SysMLPackage.DEFINITION__OWNED_ACTION;
				case SysMLPackage.ASSOCIATION_BLOCK__OWNED_USAGE: return SysMLPackage.DEFINITION__OWNED_USAGE;
				default: return -1;
			}
		}
		if (baseClass == Block.class) {
			switch (derivedFeatureID) {
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Definition.class) {
			switch (baseFeatureID) {
				case SysMLPackage.DEFINITION__OWNED_PORT: return SysMLPackage.ASSOCIATION_BLOCK__OWNED_PORT;
				case SysMLPackage.DEFINITION__FLOW_PROPERTY: return SysMLPackage.ASSOCIATION_BLOCK__FLOW_PROPERTY;
				case SysMLPackage.DEFINITION__OWNED_PROPERTY: return SysMLPackage.ASSOCIATION_BLOCK__OWNED_PROPERTY;
				case SysMLPackage.DEFINITION__PROPERTY: return SysMLPackage.ASSOCIATION_BLOCK__PROPERTY;
				case SysMLPackage.DEFINITION__OWNED_ACTION: return SysMLPackage.ASSOCIATION_BLOCK__OWNED_ACTION;
				case SysMLPackage.DEFINITION__OWNED_USAGE: return SysMLPackage.ASSOCIATION_BLOCK__OWNED_USAGE;
				default: return -1;
			}
		}
		if (baseClass == Block.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //AssociationBlockImpl
