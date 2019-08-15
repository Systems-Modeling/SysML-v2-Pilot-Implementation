/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Action;
import org.omg.sysml.lang.sysml.ConnectorUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Property;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorUsageImpl#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorUsageImpl#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorUsageImpl#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorUsageImpl#getNestedProperty <em>Nested Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorUsageImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorUsageImpl#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorUsageImpl#getOwningDefinition <em>Owning Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorUsageImpl extends ConnectorImpl implements ConnectorUsage {
	
	public static final String CONNECTOR_USAGE_SUBSETTING_DEFAULT = "Blocks::connections";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTOR_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getNestedUsage() {
		return new DerivedEObjectEList<Usage>(Usage.class, this, SysMLPackage.INTERFACE_CONNECTOR__NESTED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getOwningUsage() {
		Usage owningUsage = basicGetOwningUsage();
		return owningUsage != null && owningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)owningUsage) : owningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetOwningUsage() {
		Type owningType = getOwningType();
		return owningType instanceof Usage? (Usage)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningUsage(Usage newOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PortUsage> getNestedPort() {
		return new DerivedEObjectEList<PortUsage>(PortUsage.class, this, SysMLPackage.INTERFACE_CONNECTOR__NESTED_PORT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getNestedProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.INTERFACE_CONNECTOR__NESTED_PROPERTY, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.INTERFACE_CONNECTOR__PROPERTY, new int[] {SysMLPackage.TYPE__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Action> getNestedAction() {
		return new DerivedEObjectEList<Action>(Action.class, this, SysMLPackage.INTERFACE_CONNECTOR__NESTED_ACTION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getOwningDefinition() {
		Definition owningDefinition = basicGetOwningDefinition();
		return owningDefinition != null && owningDefinition.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)owningDefinition) : owningDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Definition basicGetOwningDefinition() {
		Type type = basicGetOwningType();
		return type instanceof Definition? (Definition)type: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setOwningDefinition(Definition newOwningDefinition) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithDefault(
				getConnectorEnd().size() > 2? 
					CONNECTOR_SUBSETTING_DEFAULT:
					CONNECTOR_USAGE_SUBSETTING_DEFAULT);
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONNECTOR_USAGE__NESTED_USAGE:
				return getNestedUsage();
			case SysMLPackage.CONNECTOR_USAGE__OWNING_USAGE:
				if (resolve) return getOwningUsage();
				return basicGetOwningUsage();
			case SysMLPackage.CONNECTOR_USAGE__NESTED_PORT:
				return getNestedPort();
			case SysMLPackage.CONNECTOR_USAGE__NESTED_PROPERTY:
				return getNestedProperty();
			case SysMLPackage.CONNECTOR_USAGE__PROPERTY:
				return getProperty();
			case SysMLPackage.CONNECTOR_USAGE__NESTED_ACTION:
				return getNestedAction();
			case SysMLPackage.CONNECTOR_USAGE__OWNING_DEFINITION:
				if (resolve) return getOwningDefinition();
				return basicGetOwningDefinition();
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
			case SysMLPackage.CONNECTOR_USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				getNestedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.CONNECTOR_USAGE__OWNING_USAGE:
				setOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.CONNECTOR_USAGE__NESTED_PORT:
				getNestedPort().clear();
				getNestedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.CONNECTOR_USAGE__NESTED_PROPERTY:
				getNestedProperty().clear();
				getNestedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.CONNECTOR_USAGE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.CONNECTOR_USAGE__NESTED_ACTION:
				getNestedAction().clear();
				getNestedAction().addAll((Collection<? extends Action>)newValue);
				return;
			case SysMLPackage.CONNECTOR_USAGE__OWNING_DEFINITION:
				setOwningDefinition((Definition)newValue);
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
			case SysMLPackage.CONNECTOR_USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				return;
			case SysMLPackage.CONNECTOR_USAGE__OWNING_USAGE:
				setOwningUsage((Usage)null);
				return;
			case SysMLPackage.CONNECTOR_USAGE__NESTED_PORT:
				getNestedPort().clear();
				return;
			case SysMLPackage.CONNECTOR_USAGE__NESTED_PROPERTY:
				getNestedProperty().clear();
				return;
			case SysMLPackage.CONNECTOR_USAGE__PROPERTY:
				getProperty().clear();
				return;
			case SysMLPackage.CONNECTOR_USAGE__NESTED_ACTION:
				getNestedAction().clear();
				return;
			case SysMLPackage.CONNECTOR_USAGE__OWNING_DEFINITION:
				setOwningDefinition((Definition)null);
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
			case SysMLPackage.CONNECTOR_USAGE__NESTED_USAGE:
				return !getNestedUsage().isEmpty();
			case SysMLPackage.CONNECTOR_USAGE__OWNING_USAGE:
				return basicGetOwningUsage() != null;
			case SysMLPackage.CONNECTOR_USAGE__NESTED_PORT:
				return !getNestedPort().isEmpty();
			case SysMLPackage.CONNECTOR_USAGE__NESTED_PROPERTY:
				return !getNestedProperty().isEmpty();
			case SysMLPackage.CONNECTOR_USAGE__PROPERTY:
				return !getProperty().isEmpty();
			case SysMLPackage.CONNECTOR_USAGE__NESTED_ACTION:
				return !getNestedAction().isEmpty();
			case SysMLPackage.CONNECTOR_USAGE__OWNING_DEFINITION:
				return basicGetOwningDefinition() != null;
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
		if (baseClass == Usage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR_USAGE__NESTED_USAGE: return SysMLPackage.USAGE__NESTED_USAGE;
				case SysMLPackage.CONNECTOR_USAGE__OWNING_USAGE: return SysMLPackage.USAGE__OWNING_USAGE;
				case SysMLPackage.CONNECTOR_USAGE__NESTED_PORT: return SysMLPackage.USAGE__NESTED_PORT;
				case SysMLPackage.CONNECTOR_USAGE__NESTED_PROPERTY: return SysMLPackage.USAGE__NESTED_PROPERTY;
				case SysMLPackage.CONNECTOR_USAGE__PROPERTY: return SysMLPackage.USAGE__PROPERTY;
				case SysMLPackage.CONNECTOR_USAGE__NESTED_ACTION: return SysMLPackage.USAGE__NESTED_ACTION;
				case SysMLPackage.CONNECTOR_USAGE__OWNING_DEFINITION: return SysMLPackage.USAGE__OWNING_DEFINITION;
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
		if (baseClass == Usage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.USAGE__NESTED_USAGE: return SysMLPackage.CONNECTOR_USAGE__NESTED_USAGE;
				case SysMLPackage.USAGE__OWNING_USAGE: return SysMLPackage.CONNECTOR_USAGE__OWNING_USAGE;
				case SysMLPackage.USAGE__NESTED_PORT: return SysMLPackage.CONNECTOR_USAGE__NESTED_PORT;
				case SysMLPackage.USAGE__NESTED_PROPERTY: return SysMLPackage.CONNECTOR_USAGE__NESTED_PROPERTY;
				case SysMLPackage.USAGE__PROPERTY: return SysMLPackage.CONNECTOR_USAGE__PROPERTY;
				case SysMLPackage.USAGE__NESTED_ACTION: return SysMLPackage.CONNECTOR_USAGE__NESTED_ACTION;
				case SysMLPackage.USAGE__OWNING_DEFINITION: return SysMLPackage.CONNECTOR_USAGE__OWNING_DEFINITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectorUsageImpl
