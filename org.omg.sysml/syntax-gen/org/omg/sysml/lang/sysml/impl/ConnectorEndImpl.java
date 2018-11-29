/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.SubsetSupersetEObjectContainmentWithInverseEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorEnd;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getOwnedElement <em>Owned Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getLower <em>Lower</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getUpper <em>Upper</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorEndImpl extends RelationshipImpl implements ConnectorEnd {
	/**
	 * The cached value of the '{@link #getLower() <em>Lower</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLower()
	 * @generated
	 * @ordered
	 */
	protected Expression lower;

	/**
	 * The cached value of the '{@link #getUpper() <em>Upper</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpper()
	 * @generated
	 * @ordered
	 */
	protected Expression upper;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature feature;

	/**
	 * The cached value of the '{@link #getEnd() <em>End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnd()
	 * @generated
	 * @ordered
	 */
	protected Feature end;

	/**
	 * The cached value of the '{@link #getConnector() <em>Connector</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnector()
	 * @generated
	 * @ordered
	 */
	protected Connector connector;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorEndImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTOR_END;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getOwnedElement() {
		if (ownedElement == null) {
			ownedElement = new SubsetSupersetEObjectContainmentWithInverseEList<Element>(Element.class, this, SysMLPackage.CONNECTOR_END__OWNED_ELEMENT, null, OWNED_ELEMENT_ESUBSETS, SysMLPackage.ELEMENT__OWNER);
		}
		return ownedElement;
	}

	/**
	 * The array of subset feature identifiers for the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ELEMENT_ESUBSETS = new int[] {SysMLPackage.CONNECTOR_END__LOWER, SysMLPackage.CONNECTOR_END__UPPER};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwner() {
		if (eContainerFeatureID() != SysMLPackage.CONNECTOR_END__OWNER) return null;
		return (Element)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(Element newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, SysMLPackage.CONNECTOR_END__OWNER, msgs);
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (owningMembership != null && owningMembership != newOwner) {
				setOwningMembership(null);
			}
			if (connector != null && connector != newOwner) {
				setConnector(null);
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(Element newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != SysMLPackage.CONNECTOR_END__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, SysMLPackage.ELEMENT__OWNED_ELEMENT, Element.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_END__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getLower() {
		if (lower != null && lower.eIsProxy()) {
			InternalEObject oldLower = (InternalEObject)lower;
			lower = (Expression)eResolveProxy(oldLower);
			if (lower != oldLower) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR_END__LOWER, oldLower, lower));
			}
		}
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetLower() {
		return lower;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLower(Expression newLower) {
		Expression oldLower = lower;
		lower = newLower;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_END__LOWER, oldLower, lower));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newLower != null) {
				EList<Element> ownedElement = getOwnedElement();
				if (!ownedElement.contains(newLower)) {
					ownedElement.add(newLower);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression getUpper() {
		if (upper != null && upper.eIsProxy()) {
			InternalEObject oldUpper = (InternalEObject)upper;
			upper = (Expression)eResolveProxy(oldUpper);
			if (upper != oldUpper) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR_END__UPPER, oldUpper, upper));
			}
		}
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Expression basicGetUpper() {
		return upper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUpper(Expression newUpper) {
		Expression oldUpper = upper;
		upper = newUpper;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_END__UPPER, oldUpper, upper));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newUpper != null) {
				EList<Element> ownedElement = getOwnedElement();
				if (!ownedElement.contains(newUpper)) {
					ownedElement.add(newUpper);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (Feature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR_END__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_END__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetFeature() {
		return feature != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getEnd() {
		if (end != null && end.eIsProxy()) {
			InternalEObject oldEnd = (InternalEObject)end;
			end = (Feature)eResolveProxy(oldEnd);
			if (end != oldEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR_END__END, oldEnd, end));
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetEnd() {
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnd(Feature newEnd) {
		Feature oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_END__END, oldEnd, end));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getPath() {
		// TODO: implement this method to return the 'Path' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector getConnector() {
		if (connector != null && connector.eIsProxy()) {
			InternalEObject oldConnector = (InternalEObject)connector;
			connector = (Connector)eResolveProxy(oldConnector);
			if (connector != oldConnector) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.CONNECTOR_END__CONNECTOR, oldConnector, connector));
			}
		}
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connector basicGetConnector() {
		return connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnector(Connector newConnector, NotificationChain msgs) {
		Connector oldConnector = connector;
		connector = newConnector;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_END__CONNECTOR, oldConnector, newConnector);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newConnector != null) {
				Element owner = getOwner();
				if (newConnector != owner) {
					setOwner(newConnector);
				}
			}
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnector(Connector newConnector) {
		if (newConnector != connector) {
			NotificationChain msgs = null;
			if (connector != null)
				msgs = ((InternalEObject)connector).eInverseRemove(this, SysMLPackage.CONNECTOR__CONNECTOR_END, Connector.class, msgs);
			if (newConnector != null)
				msgs = ((InternalEObject)newConnector).eInverseAdd(this, SysMLPackage.CONNECTOR__CONNECTOR_END, Connector.class, msgs);
			msgs = basicSetConnector(newConnector, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_END__CONNECTOR, newConnector, newConnector));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnector() {
		return connector != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.CONNECTOR_END__OWNED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElement()).basicAdd(otherEnd, msgs);
			case SysMLPackage.CONNECTOR_END__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((Element)otherEnd, msgs);
			case SysMLPackage.CONNECTOR_END__CONNECTOR:
				if (connector != null)
					msgs = ((InternalEObject)connector).eInverseRemove(this, SysMLPackage.CONNECTOR__CONNECTOR_END, Connector.class, msgs);
				return basicSetConnector((Connector)otherEnd, msgs);
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
			case SysMLPackage.CONNECTOR_END__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
			case SysMLPackage.CONNECTOR_END__OWNER:
				return basicSetOwner(null, msgs);
			case SysMLPackage.CONNECTOR_END__CONNECTOR:
				return basicSetConnector(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SysMLPackage.CONNECTOR_END__OWNER:
				return eInternalContainer().eInverseRemove(this, SysMLPackage.ELEMENT__OWNED_ELEMENT, Element.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONNECTOR_END__LOWER:
				if (resolve) return getLower();
				return basicGetLower();
			case SysMLPackage.CONNECTOR_END__UPPER:
				if (resolve) return getUpper();
				return basicGetUpper();
			case SysMLPackage.CONNECTOR_END__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case SysMLPackage.CONNECTOR_END__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case SysMLPackage.CONNECTOR_END__PATH:
				return getPath();
			case SysMLPackage.CONNECTOR_END__CONNECTOR:
				if (resolve) return getConnector();
				return basicGetConnector();
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
			case SysMLPackage.CONNECTOR_END__LOWER:
				setLower((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR_END__UPPER:
				setUpper((Expression)newValue);
				return;
			case SysMLPackage.CONNECTOR_END__FEATURE:
				setFeature((Feature)newValue);
				return;
			case SysMLPackage.CONNECTOR_END__END:
				setEnd((Feature)newValue);
				return;
			case SysMLPackage.CONNECTOR_END__PATH:
				getPath().clear();
				getPath().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.CONNECTOR_END__CONNECTOR:
				setConnector((Connector)newValue);
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
			case SysMLPackage.CONNECTOR_END__LOWER:
				setLower((Expression)null);
				return;
			case SysMLPackage.CONNECTOR_END__UPPER:
				setUpper((Expression)null);
				return;
			case SysMLPackage.CONNECTOR_END__FEATURE:
				setFeature((Feature)null);
				return;
			case SysMLPackage.CONNECTOR_END__END:
				setEnd((Feature)null);
				return;
			case SysMLPackage.CONNECTOR_END__PATH:
				getPath().clear();
				return;
			case SysMLPackage.CONNECTOR_END__CONNECTOR:
				setConnector((Connector)null);
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
			case SysMLPackage.CONNECTOR_END__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
			case SysMLPackage.CONNECTOR_END__OWNER:
				return getOwner() != null;
			case SysMLPackage.CONNECTOR_END__TARGET:
				return isSetTarget();
			case SysMLPackage.CONNECTOR_END__SOURCE:
				return isSetSource();
			case SysMLPackage.CONNECTOR_END__LOWER:
				return lower != null;
			case SysMLPackage.CONNECTOR_END__UPPER:
				return upper != null;
			case SysMLPackage.CONNECTOR_END__FEATURE:
				return isSetFeature();
			case SysMLPackage.CONNECTOR_END__END:
				return end != null;
			case SysMLPackage.CONNECTOR_END__PATH:
				return !getPath().isEmpty();
			case SysMLPackage.CONNECTOR_END__CONNECTOR:
				return isSetConnector();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Feature feature = getFeature();
		if (feature != null) {
			target.add(feature);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(), target.toArray());
	}

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
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Connector connector = getConnector();
		if (connector != null) {
			source.add(connector);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__SOURCE, source.size(), source.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

} //ConnectorEndImpl
