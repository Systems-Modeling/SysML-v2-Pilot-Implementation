/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Property;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedUsage <em>Nested Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getOwningUsage <em>Owning Usage</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedPort <em>Nested Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedProperty <em>Nested Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getNestedAction <em>Nested Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.UsageImpl#getOwningDefinition <em>Owning Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class UsageImpl extends FeatureImpl implements Usage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getNestedUsage() {
		return new DerivedEObjectEList<Usage>(Usage.class, this, SysMLPackage.USAGE__NESTED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
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
		Type owningType = getOwningType();
		return owningType instanceof Definition? (Definition)owningType: null;
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
		return new DerivedEObjectEList<PortUsage>(PortUsage.class, this, SysMLPackage.USAGE__NESTED_PORT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getNestedProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.USAGE__NESTED_PROPERTY, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.USAGE__PROPERTY, new int[] {SysMLPackage.TYPE__FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ActionUsage> getNestedAction() {
		return new DerivedEObjectEList<ActionUsage>(ActionUsage.class, this, SysMLPackage.USAGE__NESTED_ACTION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.USAGE__NESTED_USAGE:
				return getNestedUsage();
			case SysMLPackage.USAGE__OWNING_USAGE:
				if (resolve) return getOwningUsage();
				return basicGetOwningUsage();
			case SysMLPackage.USAGE__NESTED_PORT:
				return getNestedPort();
			case SysMLPackage.USAGE__NESTED_PROPERTY:
				return getNestedProperty();
			case SysMLPackage.USAGE__PROPERTY:
				return getProperty();
			case SysMLPackage.USAGE__NESTED_ACTION:
				return getNestedAction();
			case SysMLPackage.USAGE__OWNING_DEFINITION:
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
			case SysMLPackage.USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				getNestedUsage().addAll((Collection<? extends Usage>)newValue);
				return;
			case SysMLPackage.USAGE__OWNING_USAGE:
				setOwningUsage((Usage)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_PORT:
				getNestedPort().clear();
				getNestedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_PROPERTY:
				getNestedProperty().clear();
				getNestedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.USAGE__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.USAGE__NESTED_ACTION:
				getNestedAction().clear();
				getNestedAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.USAGE__OWNING_DEFINITION:
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
			case SysMLPackage.USAGE__NESTED_USAGE:
				getNestedUsage().clear();
				return;
			case SysMLPackage.USAGE__OWNING_USAGE:
				setOwningUsage((Usage)null);
				return;
			case SysMLPackage.USAGE__NESTED_PORT:
				getNestedPort().clear();
				return;
			case SysMLPackage.USAGE__NESTED_PROPERTY:
				getNestedProperty().clear();
				return;
			case SysMLPackage.USAGE__PROPERTY:
				getProperty().clear();
				return;
			case SysMLPackage.USAGE__NESTED_ACTION:
				getNestedAction().clear();
				return;
			case SysMLPackage.USAGE__OWNING_DEFINITION:
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
			case SysMLPackage.USAGE__NESTED_USAGE:
				return !getNestedUsage().isEmpty();
			case SysMLPackage.USAGE__OWNING_USAGE:
				return basicGetOwningUsage() != null;
			case SysMLPackage.USAGE__NESTED_PORT:
				return !getNestedPort().isEmpty();
			case SysMLPackage.USAGE__NESTED_PROPERTY:
				return !getNestedProperty().isEmpty();
			case SysMLPackage.USAGE__PROPERTY:
				return !getProperty().isEmpty();
			case SysMLPackage.USAGE__NESTED_ACTION:
				return !getNestedAction().isEmpty();
			case SysMLPackage.USAGE__OWNING_DEFINITION:
				return basicGetOwningDefinition() != null;
		}
		return super.eIsSet(featureID);
	}

} //UsageImpl
