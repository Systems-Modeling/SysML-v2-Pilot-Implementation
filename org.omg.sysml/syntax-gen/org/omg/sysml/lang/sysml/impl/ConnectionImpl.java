/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Action;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Connection;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.InterfaceUsage;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Property;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionImpl#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionImpl#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionImpl#getOwningDefinition <em>Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionImpl#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionImpl#getNestedProperty <em>Nested Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionImpl#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionImpl#getConnectionInterface <em>Connection Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionImpl extends ConnectorImpl implements Connection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getNestedUsage() {
		return new DerivedEObjectEList<Usage>(Usage.class, this, SysMLPackage.CONNECTION__NESTED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PortUsage> getNestedPort() {
		return new DerivedEObjectEList<PortUsage>(PortUsage.class, this, SysMLPackage.CONNECTION__NESTED_PORT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getNestedProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.CONNECTION__NESTED_PROPERTY, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.CONNECTION__PROPERTY, new int[] {SysMLPackage.TYPE__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Action> getNestedAction() {
		return new DerivedEObjectEList<Action>(Action.class, this, SysMLPackage.CONNECTION__NESTED_ACTION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Association getConnectionInterface() {
		Association connectionInterface = basicGetConnectionInterface();
		return connectionInterface != null && connectionInterface.eIsProxy() ? (Association)eResolveProxy((InternalEObject)connectionInterface) : connectionInterface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Association basicGetConnectionInterface() {
		return super.basicGetAssociation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConnectionInterface(Association newConnectionInterface) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionInterface() {
		return basicGetConnectionInterface() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONNECTION__NESTED_USAGE:
				return getNestedUsage();
			case SysMLPackage.CONNECTION__OWNING_USAGE:
				if (resolve) return getOwningUsage();
				return basicGetOwningUsage();
			case SysMLPackage.CONNECTION__OWNING_DEFINITION:
				if (resolve) return getOwningDefinition();
				return basicGetOwningDefinition();
			case SysMLPackage.CONNECTION__NESTED_PORT:
				return getNestedPort();
			case SysMLPackage.CONNECTION__NESTED_PROPERTY:
				return getNestedProperty();
			case SysMLPackage.CONNECTION__PROPERTY:
				return getProperty();
			case SysMLPackage.CONNECTION__NESTED_ACTION:
				return getNestedAction();
			case SysMLPackage.CONNECTION__INTERFACE_DEFINITION:
				if (resolve) return getInterfaceDefinition();
				return basicGetInterfaceDefinition();
			case SysMLPackage.CONNECTION__CONNECTION_INTERFACE:
				if (resolve) return getConnectionInterface();
				return basicGetConnectionInterface();
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
			case SysMLPackage.CONNECTION__NESTED_USAGE:
				getNestedUsage().clear();
				getNestedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.CONNECTION__OWNING_USAGE:
				setOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.CONNECTION__OWNING_DEFINITION:
				setOwningDefinition((Definition)newValue);
				return;
			case SysMLPackage.CONNECTION__NESTED_PORT:
				getNestedPort().clear();
				getNestedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.CONNECTION__NESTED_PROPERTY:
				getNestedProperty().clear();
				getNestedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.CONNECTION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.CONNECTION__NESTED_ACTION:
				getNestedAction().clear();
				getNestedAction().addAll((Collection<? extends Action>)newValue);
				return;
			case SysMLPackage.CONNECTION__INTERFACE_DEFINITION:
				setInterfaceDefinition((Association)newValue);
				return;
			case SysMLPackage.CONNECTION__CONNECTION_INTERFACE:
				setConnectionInterface((Association)newValue);
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
			case SysMLPackage.CONNECTION__NESTED_USAGE:
				getNestedUsage().clear();
				return;
			case SysMLPackage.CONNECTION__OWNING_USAGE:
				setOwningUsage((Usage)null);
				return;
			case SysMLPackage.CONNECTION__OWNING_DEFINITION:
				setOwningDefinition((Definition)null);
				return;
			case SysMLPackage.CONNECTION__NESTED_PORT:
				getNestedPort().clear();
				return;
			case SysMLPackage.CONNECTION__NESTED_PROPERTY:
				getNestedProperty().clear();
				return;
			case SysMLPackage.CONNECTION__PROPERTY:
				getProperty().clear();
				return;
			case SysMLPackage.CONNECTION__NESTED_ACTION:
				getNestedAction().clear();
				return;
			case SysMLPackage.CONNECTION__INTERFACE_DEFINITION:
				setInterfaceDefinition((Association)null);
				return;
			case SysMLPackage.CONNECTION__CONNECTION_INTERFACE:
				setConnectionInterface((Association)null);
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
			case SysMLPackage.CONNECTION__NESTED_USAGE:
				return !getNestedUsage().isEmpty();
			case SysMLPackage.CONNECTION__OWNING_USAGE:
				return basicGetOwningUsage() != null;
			case SysMLPackage.CONNECTION__OWNING_DEFINITION:
				return basicGetOwningDefinition() != null;
			case SysMLPackage.CONNECTION__NESTED_PORT:
				return !getNestedPort().isEmpty();
			case SysMLPackage.CONNECTION__NESTED_PROPERTY:
				return !getNestedProperty().isEmpty();
			case SysMLPackage.CONNECTION__PROPERTY:
				return !getProperty().isEmpty();
			case SysMLPackage.CONNECTION__NESTED_ACTION:
				return !getNestedAction().isEmpty();
			case SysMLPackage.CONNECTION__TYPE:
				return isSetType();
			case SysMLPackage.CONNECTION__INTERFACE_DEFINITION:
				return isSetInterfaceDefinition();
			case SysMLPackage.CONNECTION__ASSOCIATION:
				return isSetAssociation();
			case SysMLPackage.CONNECTION__CONNECTION_INTERFACE:
				return isSetConnectionInterface();
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
				case SysMLPackage.CONNECTION__NESTED_USAGE: return SysMLPackage.USAGE__NESTED_USAGE;
				case SysMLPackage.CONNECTION__OWNING_USAGE: return SysMLPackage.USAGE__OWNING_USAGE;
				case SysMLPackage.CONNECTION__OWNING_DEFINITION: return SysMLPackage.USAGE__OWNING_DEFINITION;
				case SysMLPackage.CONNECTION__NESTED_PORT: return SysMLPackage.USAGE__NESTED_PORT;
				case SysMLPackage.CONNECTION__NESTED_PROPERTY: return SysMLPackage.USAGE__NESTED_PROPERTY;
				case SysMLPackage.CONNECTION__PROPERTY: return SysMLPackage.USAGE__PROPERTY;
				case SysMLPackage.CONNECTION__NESTED_ACTION: return SysMLPackage.USAGE__NESTED_ACTION;
				default: return -1;
			}
		}
		if (baseClass == InterfaceUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTION__INTERFACE_DEFINITION: return SysMLPackage.INTERFACE_USAGE__INTERFACE_DEFINITION;
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
				case SysMLPackage.USAGE__NESTED_USAGE: return SysMLPackage.CONNECTION__NESTED_USAGE;
				case SysMLPackage.USAGE__OWNING_USAGE: return SysMLPackage.CONNECTION__OWNING_USAGE;
				case SysMLPackage.USAGE__OWNING_DEFINITION: return SysMLPackage.CONNECTION__OWNING_DEFINITION;
				case SysMLPackage.USAGE__NESTED_PORT: return SysMLPackage.CONNECTION__NESTED_PORT;
				case SysMLPackage.USAGE__NESTED_PROPERTY: return SysMLPackage.CONNECTION__NESTED_PROPERTY;
				case SysMLPackage.USAGE__PROPERTY: return SysMLPackage.CONNECTION__PROPERTY;
				case SysMLPackage.USAGE__NESTED_ACTION: return SysMLPackage.CONNECTION__NESTED_ACTION;
				default: return -1;
			}
		}
		if (baseClass == InterfaceUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.INTERFACE_USAGE__INTERFACE_DEFINITION: return SysMLPackage.CONNECTION__INTERFACE_DEFINITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> association = (EList<Type>)((EList<?>)getAssociation());
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getInterfaceDefinition() {
		return getConnectionInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetInterfaceDefinition() {
		return basicGetConnectionInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInterfaceDefinition(Association newInterfaceDefinition) {
		setConnectionInterface(newInterfaceDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetInterfaceDefinition() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getAssociation() {
		EList<Association> association = new UniqueEList<Association>();
		Association connectionInterface = getConnectionInterface();
		if (connectionInterface != null) {
			association.add(connectionInterface);
		}
		return new UnionEObjectEList<Association>(this, SysMLPackage.Literals.CONNECTOR__ASSOCIATION, association.size(), association.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociation() {
  		return false;
	}

} //ConnectionImpl
