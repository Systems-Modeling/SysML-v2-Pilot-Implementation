/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.ActionUsage;
import org.omg.sysml.lang.sysml.ConstraintUsage;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.PortUsage;
import org.omg.sysml.lang.sysml.Property;
import org.omg.sysml.lang.sysml.StateUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getFlowProperty <em>Flow Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedProperty <em>Owned Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getProperty <em>Property</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedAction <em>Owned Action</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedState <em>Owned State</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedConstraint <em>Owned Constraint</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedTransition <em>Owned Transition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.DefinitionImpl#getOwnedUsage <em>Owned Usage</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class DefinitionImpl extends ClassifierImpl implements Definition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<PortUsage> getOwnedPort() {
		return new DerivedEObjectEList<PortUsage>(PortUsage.class, this, SysMLPackage.DEFINITION__OWNED_PORT, new int[] {SysMLPackage.FEATURE__OWNED_FEATURE});
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
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.DEFINITION__OWNED_PROPERTY, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Property> getProperty() {
		return new DerivedEObjectEList<Property>(Property.class, this, SysMLPackage.DEFINITION__PROPERTY, new int[] {SysMLPackage.TYPE__FEATURE});
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
	public EList<StateUsage> getOwnedState() {
		return new DerivedEObjectEList<StateUsage>(StateUsage.class, this, SysMLPackage.DEFINITION__OWNED_STATE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<ConstraintUsage> getOwnedConstraint() {
		return new DerivedEObjectEList<ConstraintUsage>(ConstraintUsage.class, this, SysMLPackage.DEFINITION__OWNED_CONSTRAINT, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<TransitionUsage> getOwnedTransition() {
		return new DerivedEObjectEList<TransitionUsage>(TransitionUsage.class, this, SysMLPackage.DEFINITION__OWNED_TRANSITION, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Usage> getOwnedUsage() {
		return new DerivedEObjectEList<Usage>(Usage.class, this, SysMLPackage.DEFINITION__OWNED_USAGE, new int[] {SysMLPackage.TYPE__OWNED_FEATURE});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.DEFINITION__OWNED_PORT:
				return getOwnedPort();
			case SysMLPackage.DEFINITION__FLOW_PROPERTY:
				return getFlowProperty();
			case SysMLPackage.DEFINITION__OWNED_PROPERTY:
				return getOwnedProperty();
			case SysMLPackage.DEFINITION__PROPERTY:
				return getProperty();
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				return getOwnedAction();
			case SysMLPackage.DEFINITION__OWNED_STATE:
				return getOwnedState();
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				return getOwnedConstraint();
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				return getOwnedTransition();
			case SysMLPackage.DEFINITION__OWNED_USAGE:
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
			case SysMLPackage.DEFINITION__OWNED_PORT:
				getOwnedPort().clear();
				getOwnedPort().addAll((Collection<? extends PortUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__FLOW_PROPERTY:
				getFlowProperty().clear();
				getFlowProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_PROPERTY:
				getOwnedProperty().clear();
				getOwnedProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.DEFINITION__PROPERTY:
				getProperty().clear();
				getProperty().addAll((Collection<? extends Property>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				getOwnedAction().clear();
				getOwnedAction().addAll((Collection<? extends ActionUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_STATE:
				getOwnedState().clear();
				getOwnedState().addAll((Collection<? extends StateUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				getOwnedConstraint().addAll((Collection<? extends ConstraintUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				getOwnedTransition().clear();
				getOwnedTransition().addAll((Collection<? extends TransitionUsage>)newValue);
				return;
			case SysMLPackage.DEFINITION__OWNED_USAGE:
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
			case SysMLPackage.DEFINITION__OWNED_PORT:
				getOwnedPort().clear();
				return;
			case SysMLPackage.DEFINITION__FLOW_PROPERTY:
				getFlowProperty().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_PROPERTY:
				getOwnedProperty().clear();
				return;
			case SysMLPackage.DEFINITION__PROPERTY:
				getProperty().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				getOwnedAction().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_STATE:
				getOwnedState().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				getOwnedConstraint().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				getOwnedTransition().clear();
				return;
			case SysMLPackage.DEFINITION__OWNED_USAGE:
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
			case SysMLPackage.DEFINITION__OWNED_PORT:
				return !getOwnedPort().isEmpty();
			case SysMLPackage.DEFINITION__FLOW_PROPERTY:
				return !getFlowProperty().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_PROPERTY:
				return !getOwnedProperty().isEmpty();
			case SysMLPackage.DEFINITION__PROPERTY:
				return !getProperty().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_ACTION:
				return !getOwnedAction().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_STATE:
				return !getOwnedState().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_CONSTRAINT:
				return !getOwnedConstraint().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_TRANSITION:
				return !getOwnedTransition().isEmpty();
			case SysMLPackage.DEFINITION__OWNED_USAGE:
				return !getOwnedUsage().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DefinitionImpl
