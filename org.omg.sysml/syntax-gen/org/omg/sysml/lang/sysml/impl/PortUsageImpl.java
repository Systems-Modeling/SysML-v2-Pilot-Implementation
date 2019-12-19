/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.PortMembership;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Subsetting;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortUsageImpl#getPortDefinition <em>Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortUsageImpl#getPortOwningDefinition <em>Port Owning Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.PortUsageImpl#getPortOwningUsage <em>Port Owning Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PortUsageImpl extends UsageImpl implements PortUsage {
	
	public static final String PORT_USAGE_SUBSETTING_BASE_DEFAULT = "Blocks::Part::ports";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PORT_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortDefinition getPortDefinition() {
		PortDefinition portDefinition = basicGetPortDefinition();
		return portDefinition != null && portDefinition.eIsProxy() ? (PortDefinition)eResolveProxy((InternalEObject)portDefinition) : portDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortDefinition basicGetPortDefinition() {
		EList<Type> types = super.getType();
		if (types.isEmpty()) {
			return null;
		} else {
			Type type = types.get(0);
			return type instanceof PortDefinition? (PortDefinition)type: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPortDefinition(PortDefinition newPortDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPortDefinition() {
		return basicGetPortDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage getPortOwningUsage() {
		Usage portOwningUsage = basicGetPortOwningUsage();
		return portOwningUsage != null && portOwningUsage.eIsProxy() ? (Usage)eResolveProxy((InternalEObject)portOwningUsage) : portOwningUsage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Usage basicGetPortOwningUsage() {
		Type owningType = getOwningType();
		return owningType instanceof Usage? (Usage)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPortOwningUsage(Usage newPortOwningUsage) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPortOwningUsage() {
		return basicGetPortOwningUsage() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getPortOwningDefinition() {
		Definition portOwningDefinition = basicGetPortOwningDefinition();
		return portOwningDefinition != null && portOwningDefinition.eIsProxy() ? (Definition)eResolveProxy((InternalEObject)portOwningDefinition) : portOwningDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Definition basicGetPortOwningDefinition() {
		Type owningType = getOwningType();
		return owningType instanceof Definition? (Definition)owningType: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPortOwningDefinition(Definition newPortOwningDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPortOwningDefinition() {
		return basicGetPortOwningDefinition() != null;
	}

	@Override
	public EList<Subsetting> getOwnedSubsetting() {
		return getOwnedSubsettingWithComputedRedefinitions(PORT_USAGE_SUBSETTING_BASE_DEFAULT);
	}
	
	@Override
	public FeatureMembership getOwningFeatureMembership() {
		EObject container = eInternalContainer();
		return container instanceof PortMembership? 
				(FeatureMembership)container: 
			    super.getOwningFeatureMembership();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.PORT_USAGE__PORT_DEFINITION:
				if (resolve) return getPortDefinition();
				return basicGetPortDefinition();
			case SysMLPackage.PORT_USAGE__PORT_OWNING_DEFINITION:
				if (resolve) return getPortOwningDefinition();
				return basicGetPortOwningDefinition();
			case SysMLPackage.PORT_USAGE__PORT_OWNING_USAGE:
				if (resolve) return getPortOwningUsage();
				return basicGetPortOwningUsage();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.PORT_USAGE__PORT_DEFINITION:
				setPortDefinition((PortDefinition)newValue);
				return;
			case SysMLPackage.PORT_USAGE__PORT_OWNING_DEFINITION:
				setPortOwningDefinition((Definition)newValue);
				return;
			case SysMLPackage.PORT_USAGE__PORT_OWNING_USAGE:
				setPortOwningUsage((Usage)newValue);
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
			case SysMLPackage.PORT_USAGE__PORT_DEFINITION:
				setPortDefinition((PortDefinition)null);
				return;
			case SysMLPackage.PORT_USAGE__PORT_OWNING_DEFINITION:
				setPortOwningDefinition((Definition)null);
				return;
			case SysMLPackage.PORT_USAGE__PORT_OWNING_USAGE:
				setPortOwningUsage((Usage)null);
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
			case SysMLPackage.PORT_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.PORT_USAGE__OWNING_DEFINITION:
				return isSetOwningDefinition();
			case SysMLPackage.PORT_USAGE__OWNING_USAGE:
				return isSetOwningUsage();
			case SysMLPackage.PORT_USAGE__PORT_DEFINITION:
				return isSetPortDefinition();
			case SysMLPackage.PORT_USAGE__PORT_OWNING_DEFINITION:
				return isSetPortOwningDefinition();
			case SysMLPackage.PORT_USAGE__PORT_OWNING_USAGE:
				return isSetPortOwningUsage();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Type> getType() {
		EList<Type> type = new UniqueEList<Type>();
		PortDefinition portDefinition = getPortDefinition();
		if (portDefinition != null) {
			type.add(portDefinition);
		}
		return new UnionEObjectEList<Type>(this, SysMLPackage.Literals.FEATURE__TYPE, type.size(), type.toArray());
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
	@Override
	public Usage getOwningUsage() {
		return getPortOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Usage basicGetOwningUsage() {
		return basicGetPortOwningUsage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningUsage(Usage newOwningUsage) {
		setPortOwningUsage(newOwningUsage);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningUsage() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition getOwningDefinition() {
		return getPortOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Definition basicGetOwningDefinition() {
		return basicGetPortOwningDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningDefinition(Definition newOwningDefinition) {
		setPortOwningDefinition(newOwningDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwningDefinition() {
  		return false;
	}

} //PortUsageImpl
