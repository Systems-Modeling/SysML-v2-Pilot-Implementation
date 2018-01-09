/**
 */
package org.omg.sysml.kerml.structure.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.kerml.structure.Connector;
import org.omg.sysml.kerml.structure.StructurePackage;
import org.omg.sysml.kerml.structure.StructuredClass;
import org.omg.sysml.kerml.structure.StructuredFeature;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Class</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getRequiredProperty <em>Required Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getProvidedProperty <em>Provided Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#isIsEncapsulated <em>Is Encapsulated</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getConjugate <em>Conjugate</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getOwnedConnector <em>Owned Connector</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getOwnedStructuredFeature <em>Owned Structured Feature</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getTypesProperty <em>Types Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getBlindProperty <em>Blind Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getPortProperty <em>Port Property</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getProxyPort <em>Proxy Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getSelfPort <em>Self Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getFullPort <em>Full Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredClassImpl#getInteractionParticipant <em>Interaction Participant</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredClassImpl extends ClassImpl implements StructuredClass {
	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> output;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> input;

	/**
	 * The cached value of the '{@link #getRequiredProperty() <em>Required Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequiredProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> requiredProperty;

	/**
	 * The cached value of the '{@link #getProvidedProperty() <em>Provided Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvidedProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> providedProperty;

	/**
	 * The default value of the '{@link #isIsEncapsulated() <em>Is Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ENCAPSULATED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsEncapsulated() <em>Is Encapsulated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsEncapsulated()
	 * @generated
	 * @ordered
	 */
	protected boolean isEncapsulated = IS_ENCAPSULATED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConjugate() <em>Conjugate</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConjugate()
	 * @generated
	 * @ordered
	 */
	protected StructuredClass conjugate;

	/**
	 * The cached value of the '{@link #getOwnedConnector() <em>Owned Connector</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedConnector()
	 * @generated
	 * @ordered
	 */
	protected EList<Connector> ownedConnector;

	/**
	 * The cached value of the '{@link #getOwnedStructuredFeature() <em>Owned Structured Feature</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedStructuredFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> ownedStructuredFeature;

	/**
	 * The cached value of the '{@link #getTypesProperty() <em>Types Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypesProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> typesProperty;

	/**
	 * The cached value of the '{@link #getBlindProperty() <em>Blind Property</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlindProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> blindProperty;

	/**
	 * The cached value of the '{@link #getPortProperty() <em>Port Property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortProperty()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> portProperty;

	/**
	 * The cached value of the '{@link #getProxyPort() <em>Proxy Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProxyPort()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> proxyPort;

	/**
	 * The cached value of the '{@link #getSelfPort() <em>Self Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSelfPort()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> selfPort;

	/**
	 * The cached value of the '{@link #getFullPort() <em>Full Port</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFullPort()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> fullPort;

	/**
	 * The cached value of the '{@link #getInteractionParticipant() <em>Interaction Participant</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInteractionParticipant()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> interactionParticipant;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredClassImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.STRUCTURED_CLASS;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getOutput() {
		if (output == null) {
			output = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getInput() {
		if (input == null) {
			input = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getRequiredProperty() {
		if (requiredProperty == null) {
			requiredProperty = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__REQUIRED_PROPERTY);
		}
		return requiredProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getProvidedProperty() {
		if (providedProperty == null) {
			providedProperty = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__PROVIDED_PROPERTY);
		}
		return providedProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsEncapsulated() {
		return isEncapsulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsEncapsulated(boolean newIsEncapsulated) {
		boolean oldIsEncapsulated = isEncapsulated;
		isEncapsulated = newIsEncapsulated;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_CLASS__IS_ENCAPSULATED, oldIsEncapsulated, isEncapsulated));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClass getConjugate() {
		if (conjugate != null && conjugate.eIsProxy()) {
			InternalEObject oldConjugate = (InternalEObject)conjugate;
			conjugate = (StructuredClass)eResolveProxy(oldConjugate);
			if (conjugate != oldConjugate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.STRUCTURED_CLASS__CONJUGATE, oldConjugate, conjugate));
			}
		}
		return conjugate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClass basicGetConjugate() {
		return conjugate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConjugate(StructuredClass newConjugate) {
		StructuredClass oldConjugate = conjugate;
		conjugate = newConjugate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_CLASS__CONJUGATE, oldConjugate, conjugate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Connector> getOwnedConnector() {
		if (ownedConnector == null) {
			ownedConnector = new EObjectContainmentEList<Connector>(Connector.class, this, StructurePackage.STRUCTURED_CLASS__OWNED_CONNECTOR);
		}
		return ownedConnector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getOwnedStructuredFeature() {
		if (ownedStructuredFeature == null) {
			ownedStructuredFeature = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE);
		}
		return ownedStructuredFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getTypesProperty() {
		if (typesProperty == null) {
			typesProperty = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__TYPES_PROPERTY);
		}
		return typesProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getBlindProperty() {
		if (blindProperty == null) {
			blindProperty = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__BLIND_PROPERTY);
		}
		return blindProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getPortProperty() {
		if (portProperty == null) {
			portProperty = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__PORT_PROPERTY);
		}
		return portProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getProxyPort() {
		if (proxyPort == null) {
			proxyPort = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__PROXY_PORT);
		}
		return proxyPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getSelfPort() {
		if (selfPort == null) {
			selfPort = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__SELF_PORT);
		}
		return selfPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getFullPort() {
		if (fullPort == null) {
			fullPort = new EObjectContainmentEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__FULL_PORT);
		}
		return fullPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getInteractionParticipant() {
		if (interactionParticipant == null) {
			interactionParticipant = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_CLASS__INTERACTION_PARTICIPANT);
		}
		return interactionParticipant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.STRUCTURED_CLASS__OUTPUT:
				return ((InternalEList<?>)getOutput()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURED_CLASS__INPUT:
				return ((InternalEList<?>)getInput()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURED_CLASS__PROVIDED_PROPERTY:
				return ((InternalEList<?>)getProvidedProperty()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURED_CLASS__OWNED_CONNECTOR:
				return ((InternalEList<?>)getOwnedConnector()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE:
				return ((InternalEList<?>)getOwnedStructuredFeature()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURED_CLASS__PORT_PROPERTY:
				return ((InternalEList<?>)getPortProperty()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURED_CLASS__PROXY_PORT:
				return ((InternalEList<?>)getProxyPort()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURED_CLASS__SELF_PORT:
				return ((InternalEList<?>)getSelfPort()).basicRemove(otherEnd, msgs);
			case StructurePackage.STRUCTURED_CLASS__FULL_PORT:
				return ((InternalEList<?>)getFullPort()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case StructurePackage.STRUCTURED_CLASS__OUTPUT:
				return getOutput();
			case StructurePackage.STRUCTURED_CLASS__INPUT:
				return getInput();
			case StructurePackage.STRUCTURED_CLASS__REQUIRED_PROPERTY:
				return getRequiredProperty();
			case StructurePackage.STRUCTURED_CLASS__PROVIDED_PROPERTY:
				return getProvidedProperty();
			case StructurePackage.STRUCTURED_CLASS__IS_ENCAPSULATED:
				return isIsEncapsulated();
			case StructurePackage.STRUCTURED_CLASS__CONJUGATE:
				if (resolve) return getConjugate();
				return basicGetConjugate();
			case StructurePackage.STRUCTURED_CLASS__OWNED_CONNECTOR:
				return getOwnedConnector();
			case StructurePackage.STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE:
				return getOwnedStructuredFeature();
			case StructurePackage.STRUCTURED_CLASS__TYPES_PROPERTY:
				return getTypesProperty();
			case StructurePackage.STRUCTURED_CLASS__BLIND_PROPERTY:
				return getBlindProperty();
			case StructurePackage.STRUCTURED_CLASS__PORT_PROPERTY:
				return getPortProperty();
			case StructurePackage.STRUCTURED_CLASS__PROXY_PORT:
				return getProxyPort();
			case StructurePackage.STRUCTURED_CLASS__SELF_PORT:
				return getSelfPort();
			case StructurePackage.STRUCTURED_CLASS__FULL_PORT:
				return getFullPort();
			case StructurePackage.STRUCTURED_CLASS__INTERACTION_PARTICIPANT:
				return getInteractionParticipant();
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
			case StructurePackage.STRUCTURED_CLASS__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__REQUIRED_PROPERTY:
				getRequiredProperty().clear();
				getRequiredProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__PROVIDED_PROPERTY:
				getProvidedProperty().clear();
				getProvidedProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__IS_ENCAPSULATED:
				setIsEncapsulated((Boolean)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__CONJUGATE:
				setConjugate((StructuredClass)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				getOwnedConnector().addAll((Collection<? extends Connector>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE:
				getOwnedStructuredFeature().clear();
				getOwnedStructuredFeature().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__TYPES_PROPERTY:
				getTypesProperty().clear();
				getTypesProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__BLIND_PROPERTY:
				getBlindProperty().clear();
				getBlindProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__PORT_PROPERTY:
				getPortProperty().clear();
				getPortProperty().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__PROXY_PORT:
				getProxyPort().clear();
				getProxyPort().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__SELF_PORT:
				getSelfPort().clear();
				getSelfPort().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__FULL_PORT:
				getFullPort().clear();
				getFullPort().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_CLASS__INTERACTION_PARTICIPANT:
				getInteractionParticipant().clear();
				getInteractionParticipant().addAll((Collection<? extends StructuredFeature>)newValue);
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
			case StructurePackage.STRUCTURED_CLASS__OUTPUT:
				getOutput().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__INPUT:
				getInput().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__REQUIRED_PROPERTY:
				getRequiredProperty().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__PROVIDED_PROPERTY:
				getProvidedProperty().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__IS_ENCAPSULATED:
				setIsEncapsulated(IS_ENCAPSULATED_EDEFAULT);
				return;
			case StructurePackage.STRUCTURED_CLASS__CONJUGATE:
				setConjugate((StructuredClass)null);
				return;
			case StructurePackage.STRUCTURED_CLASS__OWNED_CONNECTOR:
				getOwnedConnector().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE:
				getOwnedStructuredFeature().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__TYPES_PROPERTY:
				getTypesProperty().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__BLIND_PROPERTY:
				getBlindProperty().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__PORT_PROPERTY:
				getPortProperty().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__PROXY_PORT:
				getProxyPort().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__SELF_PORT:
				getSelfPort().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__FULL_PORT:
				getFullPort().clear();
				return;
			case StructurePackage.STRUCTURED_CLASS__INTERACTION_PARTICIPANT:
				getInteractionParticipant().clear();
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
			case StructurePackage.STRUCTURED_CLASS__OUTPUT:
				return output != null && !output.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__INPUT:
				return input != null && !input.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__REQUIRED_PROPERTY:
				return requiredProperty != null && !requiredProperty.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__PROVIDED_PROPERTY:
				return providedProperty != null && !providedProperty.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__IS_ENCAPSULATED:
				return isEncapsulated != IS_ENCAPSULATED_EDEFAULT;
			case StructurePackage.STRUCTURED_CLASS__CONJUGATE:
				return conjugate != null;
			case StructurePackage.STRUCTURED_CLASS__OWNED_CONNECTOR:
				return ownedConnector != null && !ownedConnector.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__OWNED_STRUCTURED_FEATURE:
				return ownedStructuredFeature != null && !ownedStructuredFeature.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__TYPES_PROPERTY:
				return typesProperty != null && !typesProperty.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__BLIND_PROPERTY:
				return blindProperty != null && !blindProperty.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__PORT_PROPERTY:
				return portProperty != null && !portProperty.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__PROXY_PORT:
				return proxyPort != null && !proxyPort.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__SELF_PORT:
				return selfPort != null && !selfPort.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__FULL_PORT:
				return fullPort != null && !fullPort.isEmpty();
			case StructurePackage.STRUCTURED_CLASS__INTERACTION_PARTICIPANT:
				return interactionParticipant != null && !interactionParticipant.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isEncapsulated: ");
		result.append(isEncapsulated);
		result.append(')');
		return result.toString();
	}

} //StructuredClassImpl
