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

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import org.omg.sysml.kerml.structure.AggregationKind;
import org.omg.sysml.kerml.structure.Association;
import org.omg.sysml.kerml.structure.PropertyAccessKind;
import org.omg.sysml.kerml.structure.StructurePackage;
import org.omg.sysml.kerml.structure.StructuredFeature;
import org.omg.sysml.kerml.structure.ValueOption;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Structured Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#isIsPort <em>Is Port</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#getOutsideAccess <em>Outside Access</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#getInsideAccess <em>Inside Access</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#getUnion <em>Union</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#isIsNavigable <em>Is Navigable</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#getAggregation <em>Aggregation</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#getEndOf <em>End Of</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#getParticipatesIn <em>Participates In</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#isIsInput <em>Is Input</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.structure.impl.StructuredFeatureImpl#isIsOutput <em>Is Output</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StructuredFeatureImpl extends FeatureImpl implements StructuredFeature {
	/**
	 * The default value of the '{@link #isIsPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPort()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_PORT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsPort() <em>Is Port</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsPort()
	 * @generated
	 * @ordered
	 */
	protected boolean isPort = IS_PORT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getOutsideAccess() <em>Outside Access</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutsideAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAccessKind> outsideAccess;

	/**
	 * The cached value of the '{@link #getInsideAccess() <em>Inside Access</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsideAccess()
	 * @generated
	 * @ordered
	 */
	protected EList<PropertyAccessKind> insideAccess;

	/**
	 * The cached value of the '{@link #getUnion() <em>Union</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnion()
	 * @generated
	 * @ordered
	 */
	protected EList<StructuredFeature> union;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected ValueOption option;

	/**
	 * The default value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NAVIGABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNavigable() <em>Is Navigable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNavigable()
	 * @generated
	 * @ordered
	 */
	protected boolean isNavigable = IS_NAVIGABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected static final AggregationKind AGGREGATION_EDEFAULT = AggregationKind.COMPOSITE;

	/**
	 * The cached value of the '{@link #getAggregation() <em>Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAggregation()
	 * @generated
	 * @ordered
	 */
	protected AggregationKind aggregation = AGGREGATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEndOf() <em>End Of</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndOf()
	 * @generated
	 * @ordered
	 */
	protected Association endOf;

	/**
	 * The cached value of the '{@link #getParticipatesIn() <em>Participates In</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipatesIn()
	 * @generated
	 * @ordered
	 */
	protected Association participatesIn;

	/**
	 * The default value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInput() <em>Is Input</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInput()
	 * @generated
	 * @ordered
	 */
	protected boolean isInput = IS_INPUT_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutput()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_OUTPUT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsOutput() <em>Is Output</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsOutput()
	 * @generated
	 * @ordered
	 */
	protected boolean isOutput = IS_OUTPUT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StructuredFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StructurePackage.Literals.STRUCTURED_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsPort() {
		return isPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsPort(boolean newIsPort) {
		boolean oldIsPort = isPort;
		isPort = newIsPort;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__IS_PORT, oldIsPort, isPort));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAccessKind> getOutsideAccess() {
		if (outsideAccess == null) {
			outsideAccess = new EDataTypeUniqueEList<PropertyAccessKind>(PropertyAccessKind.class, this, StructurePackage.STRUCTURED_FEATURE__OUTSIDE_ACCESS);
		}
		return outsideAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PropertyAccessKind> getInsideAccess() {
		if (insideAccess == null) {
			insideAccess = new EDataTypeUniqueEList<PropertyAccessKind>(PropertyAccessKind.class, this, StructurePackage.STRUCTURED_FEATURE__INSIDE_ACCESS);
		}
		return insideAccess;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<StructuredFeature> getUnion() {
		if (union == null) {
			union = new EObjectResolvingEList<StructuredFeature>(StructuredFeature.class, this, StructurePackage.STRUCTURED_FEATURE__UNION);
		}
		return union;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueOption getOption() {
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOption(ValueOption newOption, NotificationChain msgs) {
		ValueOption oldOption = option;
		option = newOption;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__OPTION, oldOption, newOption);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOption(ValueOption newOption) {
		if (newOption != option) {
			NotificationChain msgs = null;
			if (option != null)
				msgs = ((InternalEObject)option).eInverseRemove(this, StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY, ValueOption.class, msgs);
			if (newOption != null)
				msgs = ((InternalEObject)newOption).eInverseAdd(this, StructurePackage.VALUE_OPTION__OPTION_OF_PROPERTY, ValueOption.class, msgs);
			msgs = basicSetOption(newOption, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__OPTION, newOption, newOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNavigable() {
		return isNavigable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNavigable(boolean newIsNavigable) {
		boolean oldIsNavigable = isNavigable;
		isNavigable = newIsNavigable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__IS_NAVIGABLE, oldIsNavigable, isNavigable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AggregationKind getAggregation() {
		return aggregation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAggregation(AggregationKind newAggregation) {
		AggregationKind oldAggregation = aggregation;
		aggregation = newAggregation == null ? AGGREGATION_EDEFAULT : newAggregation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__AGGREGATION, oldAggregation, aggregation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getEndOf() {
		if (endOf != null && endOf.eIsProxy()) {
			InternalEObject oldEndOf = (InternalEObject)endOf;
			endOf = (Association)eResolveProxy(oldEndOf);
			if (endOf != oldEndOf) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.STRUCTURED_FEATURE__END_OF, oldEndOf, endOf));
			}
		}
		return endOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetEndOf() {
		return endOf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEndOf(Association newEndOf, NotificationChain msgs) {
		Association oldEndOf = endOf;
		endOf = newEndOf;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__END_OF, oldEndOf, newEndOf);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEndOf(Association newEndOf) {
		if (newEndOf != endOf) {
			NotificationChain msgs = null;
			if (endOf != null)
				msgs = ((InternalEObject)endOf).eInverseRemove(this, StructurePackage.ASSOCIATION__END_PROPERTY, Association.class, msgs);
			if (newEndOf != null)
				msgs = ((InternalEObject)newEndOf).eInverseAdd(this, StructurePackage.ASSOCIATION__END_PROPERTY, Association.class, msgs);
			msgs = basicSetEndOf(newEndOf, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__END_OF, newEndOf, newEndOf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association getParticipatesIn() {
		if (participatesIn != null && participatesIn.eIsProxy()) {
			InternalEObject oldParticipatesIn = (InternalEObject)participatesIn;
			participatesIn = (Association)eResolveProxy(oldParticipatesIn);
			if (participatesIn != oldParticipatesIn) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN, oldParticipatesIn, participatesIn));
			}
		}
		return participatesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Association basicGetParticipatesIn() {
		return participatesIn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParticipatesIn(Association newParticipatesIn, NotificationChain msgs) {
		Association oldParticipatesIn = participatesIn;
		participatesIn = newParticipatesIn;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN, oldParticipatesIn, newParticipatesIn);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParticipatesIn(Association newParticipatesIn) {
		if (newParticipatesIn != participatesIn) {
			NotificationChain msgs = null;
			if (participatesIn != null)
				msgs = ((InternalEObject)participatesIn).eInverseRemove(this, StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY, Association.class, msgs);
			if (newParticipatesIn != null)
				msgs = ((InternalEObject)newParticipatesIn).eInverseAdd(this, StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY, Association.class, msgs);
			msgs = basicSetParticipatesIn(newParticipatesIn, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN, newParticipatesIn, newParticipatesIn));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInput() {
		return isInput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInput(boolean newIsInput) {
		boolean oldIsInput = isInput;
		isInput = newIsInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__IS_INPUT, oldIsInput, isInput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsOutput() {
		return isOutput;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsOutput(boolean newIsOutput) {
		boolean oldIsOutput = isOutput;
		isOutput = newIsOutput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, StructurePackage.STRUCTURED_FEATURE__IS_OUTPUT, oldIsOutput, isOutput));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.STRUCTURED_FEATURE__OPTION:
				if (option != null)
					msgs = ((InternalEObject)option).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - StructurePackage.STRUCTURED_FEATURE__OPTION, null, msgs);
				return basicSetOption((ValueOption)otherEnd, msgs);
			case StructurePackage.STRUCTURED_FEATURE__END_OF:
				if (endOf != null)
					msgs = ((InternalEObject)endOf).eInverseRemove(this, StructurePackage.ASSOCIATION__END_PROPERTY, Association.class, msgs);
				return basicSetEndOf((Association)otherEnd, msgs);
			case StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN:
				if (participatesIn != null)
					msgs = ((InternalEObject)participatesIn).eInverseRemove(this, StructurePackage.ASSOCIATION__PARTICIPANT_PROPERTY, Association.class, msgs);
				return basicSetParticipatesIn((Association)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case StructurePackage.STRUCTURED_FEATURE__OPTION:
				return basicSetOption(null, msgs);
			case StructurePackage.STRUCTURED_FEATURE__END_OF:
				return basicSetEndOf(null, msgs);
			case StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN:
				return basicSetParticipatesIn(null, msgs);
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
			case StructurePackage.STRUCTURED_FEATURE__IS_PORT:
				return isIsPort();
			case StructurePackage.STRUCTURED_FEATURE__OUTSIDE_ACCESS:
				return getOutsideAccess();
			case StructurePackage.STRUCTURED_FEATURE__INSIDE_ACCESS:
				return getInsideAccess();
			case StructurePackage.STRUCTURED_FEATURE__UNION:
				return getUnion();
			case StructurePackage.STRUCTURED_FEATURE__OPTION:
				return getOption();
			case StructurePackage.STRUCTURED_FEATURE__IS_NAVIGABLE:
				return isIsNavigable();
			case StructurePackage.STRUCTURED_FEATURE__AGGREGATION:
				return getAggregation();
			case StructurePackage.STRUCTURED_FEATURE__END_OF:
				if (resolve) return getEndOf();
				return basicGetEndOf();
			case StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN:
				if (resolve) return getParticipatesIn();
				return basicGetParticipatesIn();
			case StructurePackage.STRUCTURED_FEATURE__IS_INPUT:
				return isIsInput();
			case StructurePackage.STRUCTURED_FEATURE__IS_OUTPUT:
				return isIsOutput();
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
			case StructurePackage.STRUCTURED_FEATURE__IS_PORT:
				setIsPort((Boolean)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__OUTSIDE_ACCESS:
				getOutsideAccess().clear();
				getOutsideAccess().addAll((Collection<? extends PropertyAccessKind>)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__INSIDE_ACCESS:
				getInsideAccess().clear();
				getInsideAccess().addAll((Collection<? extends PropertyAccessKind>)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__UNION:
				getUnion().clear();
				getUnion().addAll((Collection<? extends StructuredFeature>)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__OPTION:
				setOption((ValueOption)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__IS_NAVIGABLE:
				setIsNavigable((Boolean)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__AGGREGATION:
				setAggregation((AggregationKind)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__END_OF:
				setEndOf((Association)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN:
				setParticipatesIn((Association)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__IS_INPUT:
				setIsInput((Boolean)newValue);
				return;
			case StructurePackage.STRUCTURED_FEATURE__IS_OUTPUT:
				setIsOutput((Boolean)newValue);
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
			case StructurePackage.STRUCTURED_FEATURE__IS_PORT:
				setIsPort(IS_PORT_EDEFAULT);
				return;
			case StructurePackage.STRUCTURED_FEATURE__OUTSIDE_ACCESS:
				getOutsideAccess().clear();
				return;
			case StructurePackage.STRUCTURED_FEATURE__INSIDE_ACCESS:
				getInsideAccess().clear();
				return;
			case StructurePackage.STRUCTURED_FEATURE__UNION:
				getUnion().clear();
				return;
			case StructurePackage.STRUCTURED_FEATURE__OPTION:
				setOption((ValueOption)null);
				return;
			case StructurePackage.STRUCTURED_FEATURE__IS_NAVIGABLE:
				setIsNavigable(IS_NAVIGABLE_EDEFAULT);
				return;
			case StructurePackage.STRUCTURED_FEATURE__AGGREGATION:
				setAggregation(AGGREGATION_EDEFAULT);
				return;
			case StructurePackage.STRUCTURED_FEATURE__END_OF:
				setEndOf((Association)null);
				return;
			case StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN:
				setParticipatesIn((Association)null);
				return;
			case StructurePackage.STRUCTURED_FEATURE__IS_INPUT:
				setIsInput(IS_INPUT_EDEFAULT);
				return;
			case StructurePackage.STRUCTURED_FEATURE__IS_OUTPUT:
				setIsOutput(IS_OUTPUT_EDEFAULT);
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
			case StructurePackage.STRUCTURED_FEATURE__IS_PORT:
				return isPort != IS_PORT_EDEFAULT;
			case StructurePackage.STRUCTURED_FEATURE__OUTSIDE_ACCESS:
				return outsideAccess != null && !outsideAccess.isEmpty();
			case StructurePackage.STRUCTURED_FEATURE__INSIDE_ACCESS:
				return insideAccess != null && !insideAccess.isEmpty();
			case StructurePackage.STRUCTURED_FEATURE__UNION:
				return union != null && !union.isEmpty();
			case StructurePackage.STRUCTURED_FEATURE__OPTION:
				return option != null;
			case StructurePackage.STRUCTURED_FEATURE__IS_NAVIGABLE:
				return isNavigable != IS_NAVIGABLE_EDEFAULT;
			case StructurePackage.STRUCTURED_FEATURE__AGGREGATION:
				return aggregation != AGGREGATION_EDEFAULT;
			case StructurePackage.STRUCTURED_FEATURE__END_OF:
				return endOf != null;
			case StructurePackage.STRUCTURED_FEATURE__PARTICIPATES_IN:
				return participatesIn != null;
			case StructurePackage.STRUCTURED_FEATURE__IS_INPUT:
				return isInput != IS_INPUT_EDEFAULT;
			case StructurePackage.STRUCTURED_FEATURE__IS_OUTPUT:
				return isOutput != IS_OUTPUT_EDEFAULT;
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
		result.append(" (isPort: ");
		result.append(isPort);
		result.append(", outsideAccess: ");
		result.append(outsideAccess);
		result.append(", insideAccess: ");
		result.append(insideAccess);
		result.append(", isNavigable: ");
		result.append(isNavigable);
		result.append(", aggregation: ");
		result.append(aggregation);
		result.append(", isInput: ");
		result.append(isInput);
		result.append(", isOutput: ");
		result.append(isOutput);
		result.append(')');
		return result.toString();
	}

} //StructuredFeatureImpl
