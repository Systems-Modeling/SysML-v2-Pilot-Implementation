/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.ConjugatedPortDefinition;
import org.omg.sysml.lang.sysml.ConjugatedPortTyping;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.PortDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conjugated Port Typing</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortTypingImpl#getOriginalPortDefinition <em>Original Port Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConjugatedPortTypingImpl#getConjugatedPortDefinition <em>Conjugated Port Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConjugatedPortTypingImpl extends FeatureTypingImpl implements ConjugatedPortTyping {
	/**
	 * The cached value of the '{@link #getOriginalPortDefinition() <em>Original Port Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginalPortDefinition()
	 * @generated
	 * @ordered
	 */
	protected PortDefinition originalPortDefinition;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConjugatedPortTypingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONJUGATED_PORT_TYPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortDefinition getOriginalPortDefinition() {
		if (originalPortDefinition != null && originalPortDefinition.eIsProxy()) {
			InternalEObject oldOriginalPortDefinition = (InternalEObject)originalPortDefinition;
			originalPortDefinition = (PortDefinition)eResolveProxy(oldOriginalPortDefinition);
			if (originalPortDefinition != oldOriginalPortDefinition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONJUGATED_PORT_TYPING__ORIGINAL_PORT_DEFINITION, oldOriginalPortDefinition, originalPortDefinition));
			}
		}
		return originalPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortDefinition basicGetOriginalPortDefinition() {
		return originalPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOriginalPortDefinition(PortDefinition newOriginalPortDefinition) {
		PortDefinition oldOriginalPortDefinition = originalPortDefinition;
		originalPortDefinition = newOriginalPortDefinition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONJUGATED_PORT_TYPING__ORIGINAL_PORT_DEFINITION, oldOriginalPortDefinition, originalPortDefinition));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newOriginalPortDefinition != null) {
				EList<Element> target = getTarget();
				if (!target.contains(newOriginalPortDefinition)) {
					target.add(newOriginalPortDefinition);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ConjugatedPortDefinition getConjugatedPortDefinition() {
		ConjugatedPortDefinition conjugatedPortDefinition = basicGetConjugatedPortDefinition();
		return conjugatedPortDefinition != null && conjugatedPortDefinition.eIsProxy() ? (ConjugatedPortDefinition)eResolveProxy((InternalEObject)conjugatedPortDefinition) : conjugatedPortDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ConjugatedPortDefinition basicGetConjugatedPortDefinition() {
		PortDefinition originalPortDefinition = getOriginalPortDefinition();
		return originalPortDefinition == null? null: originalPortDefinition.getConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConjugatedPortDefinition(ConjugatedPortDefinition newConjugatedPortDefinition) {
		setOriginalPortDefinition(newConjugatedPortDefinition == null? null: 
			newConjugatedPortDefinition.getOriginalPortDefinition());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConjugatedPortDefinition() {
		return basicGetConjugatedPortDefinition() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONJUGATED_PORT_TYPING__ORIGINAL_PORT_DEFINITION:
				if (resolve) return getOriginalPortDefinition();
				return basicGetOriginalPortDefinition();
			case SysMLPackage.CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION:
				if (resolve) return getConjugatedPortDefinition();
				return basicGetConjugatedPortDefinition();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Type general = getGeneral();
		if (general != null) {
			target.add(general);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(), target.toArray());
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.CONJUGATED_PORT_TYPING__ORIGINAL_PORT_DEFINITION};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetTarget() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return getConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type basicGetType() {
		return basicGetConjugatedPortDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setType(Type newType) {
		if (newType != null && !(newType instanceof ConjugatedPortDefinition)) {
			throw new IllegalArgumentException("newType must be an instance of ConjugatedPortDefinition");
		}
		setConjugatedPortDefinition((ConjugatedPortDefinition) newType);
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
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.CONJUGATED_PORT_TYPING__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)newValue);
				return;
			case SysMLPackage.CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION:
				setConjugatedPortDefinition((ConjugatedPortDefinition)newValue);
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
			case SysMLPackage.CONJUGATED_PORT_TYPING__ORIGINAL_PORT_DEFINITION:
				setOriginalPortDefinition((PortDefinition)null);
				return;
			case SysMLPackage.CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION:
				setConjugatedPortDefinition((ConjugatedPortDefinition)null);
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
			case SysMLPackage.CONJUGATED_PORT_TYPING__TARGET:
				return isSetTarget();
			case SysMLPackage.CONJUGATED_PORT_TYPING__TYPE:
				return isSetType();
			case SysMLPackage.CONJUGATED_PORT_TYPING__ORIGINAL_PORT_DEFINITION:
				return originalPortDefinition != null;
			case SysMLPackage.CONJUGATED_PORT_TYPING__CONJUGATED_PORT_DEFINITION:
				return isSetConjugatedPortDefinition();
		}
		return super.eIsSet(featureID);
	}

} //ConjugatedPortTypingImpl
