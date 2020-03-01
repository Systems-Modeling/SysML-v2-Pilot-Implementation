/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Property;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
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
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getNestedProperty <em>Nested Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getNestedState <em>Nested State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getNestedConstraint <em>Nested Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getNestedTransition <em>Nested Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getOwningDefinition <em>Owning Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionUsageImpl extends ConnectorImpl implements ConnectionUsage {
	
	public static final String CONNECTOR_USAGE_SUBSETTING_DEFAULT = "Blocks::connections";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTION_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getNestedUsage() {
		return new DerivedEObjectEList<Usage>(Usage.class, this, SysMLPackage.INTERFACE_USAGE__NESTED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
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
		return new DerivedEObjectEList<PortUsage>(PortUsage.class, this, SysMLPackage.CONNECTION_USAGE__NESTED_PORT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getNestedProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.CONNECTION_USAGE__NESTED_PROPERTY, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<StateUsage> getNestedState() {
		return new DerivedEObjectEList<StateUsage>(StateUsage.class, this, SysMLPackage.CONNECTION_USAGE__NESTED_STATE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConstraintUsage> getNestedConstraint() {
		return new DerivedEObjectEList<ConstraintUsage>(ConstraintUsage.class, this, SysMLPackage.CONNECTION_USAGE__NESTED_CONSTRAINT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TransitionUsage> getNestedTransition() {
		return new DerivedEObjectEList<TransitionUsage>(TransitionUsage.class, this, SysMLPackage.CONNECTION_USAGE__NESTED_TRANSITION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.CONNECTION_USAGE__PROPERTY, new int[] {SysMLPackage.TYPE__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ActionUsage> getNestedAction() {
		return new DerivedEObjectEList<ActionUsage>(ActionUsage.class, this, SysMLPackage.CONNECTION_USAGE__NESTED_ACTION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
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
	protected String[] getDefaultGeneralizationNames() {
		String defaultName = getConnectorEnd().size() > 2? 
				CONNECTOR_SUBSETTING_DEFAULT:
				CONNECTOR_USAGE_SUBSETTING_DEFAULT; 
		return new String[] {defaultName};
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONNECTION_USAGE__NESTED_USAGE:
				return getNestedUsage();
			case SysMLPackage.CONNECTION_USAGE__OWNING_USAGE:
				if (resolve) return getOwningUsage();
				return basicGetOwningUsage();
			case SysMLPackage.CONNECTION_USAGE__NESTED_PORT:
				return getNestedPort();
			case SysMLPackage.CONNECTION_USAGE__NESTED_PROPERTY:
				return getNestedProperty();
			case SysMLPackage.CONNECTION_USAGE__PROPERTY:
				return getProperty();
			case SysMLPackage.CONNECTION_USAGE__NESTED_ACTION:
				return getNestedAction();
			case SysMLPackage.CONNECTION_USAGE__NESTED_STATE:
				return getNestedState();
			case SysMLPackage.CONNECTION_USAGE__NESTED_CONSTRAINT:
				return getNestedConstraint();
			case SysMLPackage.CONNECTION_USAGE__NESTED_TRANSITION:
				return getNestedTransition();
			case SysMLPackage.CONNECTION_USAGE__OWNING_DEFINITION:
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
			case SysMLPackage.CONNECTION_USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				getNestedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__OWNING_USAGE:
				setOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_PORT:
				getNestedPort().clear();
				getNestedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_PROPERTY:
				getNestedProperty().clear();
				getNestedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_ACTION:
				getNestedAction().clear();
				getNestedAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_STATE:
				getNestedState().clear();
				getNestedState().addAll((Collection<? extends StateUsage>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_CONSTRAINT:
				getNestedConstraint().clear();
				getNestedConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_TRANSITION:
				getNestedTransition().clear();
				getNestedTransition().addAll((Collection<? extends TransitionUsage>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__OWNING_DEFINITION:
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
			case SysMLPackage.CONNECTION_USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__OWNING_USAGE:
				setOwningUsage((Usage)null);
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_PORT:
				getNestedPort().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_PROPERTY:
				getNestedProperty().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__PROPERTY:
				getProperty().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_ACTION:
				getNestedAction().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_STATE:
				getNestedState().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_CONSTRAINT:
				getNestedConstraint().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__NESTED_TRANSITION:
				getNestedTransition().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__OWNING_DEFINITION:
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
			case SysMLPackage.CONNECTION_USAGE__NESTED_USAGE:
				return !getNestedUsage().isEmpty();
			case SysMLPackage.CONNECTION_USAGE__OWNING_USAGE:
				return basicGetOwningUsage() != null;
			case SysMLPackage.CONNECTION_USAGE__NESTED_PORT:
				return !getNestedPort().isEmpty();
			case SysMLPackage.CONNECTION_USAGE__NESTED_PROPERTY:
				return !getNestedProperty().isEmpty();
			case SysMLPackage.CONNECTION_USAGE__PROPERTY:
				return !getProperty().isEmpty();
			case SysMLPackage.CONNECTION_USAGE__NESTED_ACTION:
				return !getNestedAction().isEmpty();
			case SysMLPackage.CONNECTION_USAGE__NESTED_STATE:
				return !getNestedState().isEmpty();
			case SysMLPackage.CONNECTION_USAGE__NESTED_CONSTRAINT:
				return !getNestedConstraint().isEmpty();
			case SysMLPackage.CONNECTION_USAGE__NESTED_TRANSITION:
				return !getNestedTransition().isEmpty();
			case SysMLPackage.CONNECTION_USAGE__OWNING_DEFINITION:
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
				case SysMLPackage.CONNECTION_USAGE__NESTED_USAGE: return SysMLPackage.USAGE__NESTED_USAGE;
				case SysMLPackage.CONNECTION_USAGE__OWNING_USAGE: return SysMLPackage.USAGE__OWNING_USAGE;
				case SysMLPackage.CONNECTION_USAGE__NESTED_PORT: return SysMLPackage.USAGE__NESTED_PORT;
				case SysMLPackage.CONNECTION_USAGE__NESTED_PROPERTY: return SysMLPackage.USAGE__NESTED_PROPERTY;
				case SysMLPackage.CONNECTION_USAGE__PROPERTY: return SysMLPackage.USAGE__PROPERTY;
				case SysMLPackage.CONNECTION_USAGE__NESTED_ACTION: return SysMLPackage.USAGE__NESTED_ACTION;
				case SysMLPackage.CONNECTION_USAGE__NESTED_STATE: return SysMLPackage.USAGE__NESTED_STATE;
				case SysMLPackage.CONNECTION_USAGE__NESTED_CONSTRAINT: return SysMLPackage.USAGE__NESTED_CONSTRAINT;
				case SysMLPackage.CONNECTION_USAGE__NESTED_TRANSITION: return SysMLPackage.USAGE__NESTED_TRANSITION;
				case SysMLPackage.CONNECTION_USAGE__OWNING_DEFINITION: return SysMLPackage.USAGE__OWNING_DEFINITION;
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
				case SysMLPackage.USAGE__NESTED_USAGE: return SysMLPackage.CONNECTION_USAGE__NESTED_USAGE;
				case SysMLPackage.USAGE__OWNING_USAGE: return SysMLPackage.CONNECTION_USAGE__OWNING_USAGE;
				case SysMLPackage.USAGE__NESTED_PORT: return SysMLPackage.CONNECTION_USAGE__NESTED_PORT;
				case SysMLPackage.USAGE__NESTED_PROPERTY: return SysMLPackage.CONNECTION_USAGE__NESTED_PROPERTY;
				case SysMLPackage.USAGE__PROPERTY: return SysMLPackage.CONNECTION_USAGE__PROPERTY;
				case SysMLPackage.USAGE__NESTED_ACTION: return SysMLPackage.CONNECTION_USAGE__NESTED_ACTION;
				case SysMLPackage.USAGE__NESTED_STATE: return SysMLPackage.CONNECTION_USAGE__NESTED_STATE;
				case SysMLPackage.USAGE__NESTED_CONSTRAINT: return SysMLPackage.CONNECTION_USAGE__NESTED_CONSTRAINT;
				case SysMLPackage.USAGE__NESTED_TRANSITION: return SysMLPackage.CONNECTION_USAGE__NESTED_TRANSITION;
				case SysMLPackage.USAGE__OWNING_DEFINITION: return SysMLPackage.CONNECTION_USAGE__OWNING_DEFINITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectorUsageImpl
