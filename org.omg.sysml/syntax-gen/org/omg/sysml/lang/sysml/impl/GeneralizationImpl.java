/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.omg.sysml.lang.sysml.Category;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generalization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl#getSpecific <em>Specific</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl#getGeneral <em>General</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.GeneralizationImpl#getOwningCategory <em>Owning Category</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneralizationImpl extends RelationshipImpl implements Generalization {
	/**
	 * The cached value of the '{@link #getSpecific() <em>Specific</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecific()
	 * @generated
	 * @ordered
	 */
	protected Category specific;

	/**
	 * The cached value of the '{@link #getGeneral() <em>General</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneral()
	 * @generated
	 * @ordered
	 */
	protected Category general;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GeneralizationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.GENERALIZATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getGeneral() {
		if (general != null && general.eIsProxy()) {
			InternalEObject oldGeneral = (InternalEObject)general;
			general = (Category)eResolveProxy(oldGeneral);
			if (general != oldGeneral) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.GENERALIZATION__GENERAL, oldGeneral, general));
			}
		}
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category basicGetGeneral() {
		return general;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGeneral(Category newGeneral) {
		Category oldGeneral = general;
		general = newGeneral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__GENERAL, oldGeneral, general));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetGeneral() {
		return general != null;
	}
	
	public Category getSpecific() {
		return specific == null? basicGetSpecific(): getSpecificGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getSpecificGen() {
		if (specific != null && specific.eIsProxy()) {
			InternalEObject oldSpecific = (InternalEObject)specific;
			specific = (Category)eResolveProxy(oldSpecific);
			if (specific != oldSpecific) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
			}
		}
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * If the Generalization has a Category as its owningRelatedElement, then use this as the default value for its specific property.
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Category basicGetSpecific() {
		if (specific == null) {
			Element owner = getOwningRelatedElement();
			if (owner instanceof Category) {
				specific = (Category)owner;
			}
		}
		return specific;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecific(Category newSpecific) {
		Category oldSpecific = specific;
		specific = newSpecific;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.GENERALIZATION__SPECIFIC, oldSpecific, specific));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSetSpecific() {
		return basicGetSpecific() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Category getOwningCategory() {
		Category owningCategory = basicGetOwningCategory();
		return owningCategory != null && owningCategory.eIsProxy() ? (Category)eResolveProxy((InternalEObject)owningCategory) : owningCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Category basicGetOwningCategory() {
		org.omg.sysml.lang.sysml.Package namespace = this.getOwningNamespace();
		return namespace instanceof Category? (Category)namespace: null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void setOwningCategory(Category newOwningCategory) {
		if (getSpecific() != newOwningCategory) {
			setSpecific(newOwningCategory);
		}
		setOwningRelatedElement(newOwningCategory);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				if (resolve) return getSpecific();
				return basicGetSpecific();
			case SysMLPackage.GENERALIZATION__GENERAL:
				if (resolve) return getGeneral();
				return basicGetGeneral();
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				if (resolve) return getOwningCategory();
				return basicGetOwningCategory();
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
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Category)newValue);
				return;
			case SysMLPackage.GENERALIZATION__GENERAL:
				setGeneral((Category)newValue);
				return;
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				setOwningCategory((Category)newValue);
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
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				setSpecific((Category)null);
				return;
			case SysMLPackage.GENERALIZATION__GENERAL:
				setGeneral((Category)null);
				return;
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				setOwningCategory((Category)null);
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
			case SysMLPackage.GENERALIZATION__SPECIFIC:
				return isSetSpecific();
			case SysMLPackage.GENERALIZATION__TARGET:
				return isSetTarget();
			case SysMLPackage.GENERALIZATION__SOURCE:
				return isSetSource();
			case SysMLPackage.GENERALIZATION__GENERAL:
				return isSetGeneral();
			case SysMLPackage.GENERALIZATION__OWNING_CATEGORY:
				return basicGetOwningCategory() != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.GENERALIZATION__TARGET);
		// NOTE: The "general" object must NOT be resolved here, in order to avoid Xtext lazy linking errors.
		Element general = basicGetGeneral();
		if (general != null) {
			target.add(general);
		}
		return target;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getTarget() <em>Target</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.GENERALIZATION__OWNED_RELATED_ELEMENT};

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
	 * @generated NOT
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.GENERALIZATION__SOURCE);
		Element specific = basicGetSpecific();
		if (specific != null) {
			source.add(specific);
		}
		return source;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final int[] SOURCE_ESUBSETS = new int[] {SysMLPackage.GENERALIZATION__OWNING_RELATED_ELEMENT};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

} //GeneralizationImpl
