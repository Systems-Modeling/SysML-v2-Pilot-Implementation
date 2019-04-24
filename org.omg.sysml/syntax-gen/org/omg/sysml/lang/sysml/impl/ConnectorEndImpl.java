/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EObjectEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.BindingConnector;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.ConnectorEnd;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector End</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getEnd <em>End</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getMultiplicity <em>Multiplicity</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectorEndImpl#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorEndImpl extends RelationshipImpl implements ConnectorEnd {
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
	
	@Override
	public Feature getFeature() {
		return feature == null? basicGetFeature(): getFeatureGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getFeatureGen() {
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
	 * @generated NOT
	 */
	public Feature basicGetFeature() {
		if (feature == null) {
			Connector connector = this.getConnector();
			if (connector instanceof BindingConnector) {
				Element owner = connector.getOwningNamespace();
				if (owner instanceof InvocationExpressionImpl) {
					InvocationExpressionImpl expression = (InvocationExpressionImpl)owner;
					int i = expression.getFeature().stream().filter(f->f instanceof Connector).
							collect(Collectors.toList()).indexOf(connector);
					if (i >= 0) {
						if (this == connector.getConnectorEnd().get(0)) {
							List<Feature> arguments = expression.getArguments();
							if (i < arguments.size()) {
								Feature argument = arguments.get(i);
								feature = argument instanceof Expression? 
										((ExpressionImpl)argument).getResult(): argument;
							}
						} else {
							EList<Feature> inputs = expression.getInput();
							if (i < inputs.size()) {
								feature = inputs.get(i);
							}
						}
					}
				}
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFeature(Feature newFeature) {
		Feature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_END__FEATURE, oldFeature, feature));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newFeature != null) {
				EList<Element> target = getTarget();
				if (!target.contains(newFeature)) {
					target.add(newFeature);
				}
			}
		}
	}

	@Override
	public Feature getEnd() {
		return end == null? basicGetEnd(): getEndGen();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getEndGen() {
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
	 * @generated NOT
	 */
	public Feature basicGetEnd() {
		if (end == null) {
			Connector connector = this.getConnector();
			if (connector != null) {
				Association association = connector.getAssociation();
				if (association != null) {
					EList<EndFeatureMembership> endMembership = association.getOwnedEndFeatureMembership();
					int i = connector.getConnectorEnd().indexOf(this);
					if (i < endMembership.size()) {
						end = endMembership.get(i).getMemberFeature();
					}
				}
			}
		}
		return end;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnd(Feature newEnd) {
		Feature oldEnd = end;
		end = newEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTOR_END__END, oldEnd, end));
		Resource.Internal eInternalResource = eInternalResource();
		if (eInternalResource == null || !eInternalResource.isLoading()) {
			if (newEnd != null) {
				EList<Element> target = getTarget();
				if (!target.contains(newEnd)) {
					target.add(newEnd);
				}
			}
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> getPath() {
		EList<Feature> path = new EObjectEList<Feature>(Feature.class, this, SysMLPackage.CONNECTOR_END__PATH);
		getPath(path, this.getConnector().getOwningNamespace(), this.getFeature());
		return path;
	}
	
	private static void getPath(EList<Feature> path, org.omg.sysml.lang.sysml.Package start, Feature end) {
		if (end != null) {
			org.omg.sysml.lang.sysml.Package owningNamespace = end.getOwningNamespace();
			if (owningNamespace instanceof Feature && owningNamespace != start) {
				getPath(path, start, (Feature)owningNamespace);
			}
			path.add(end);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Multiplicity getMultiplicity() {
		Multiplicity multiplicity = basicGetMultiplicity();
		return multiplicity != null && multiplicity.eIsProxy() ? (Multiplicity)eResolveProxy((InternalEObject)multiplicity) : multiplicity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Multiplicity basicGetMultiplicity() {
		return getFirstOwnedRelationship(Multiplicity.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMultiplicity(Multiplicity newMultiplicity) {
		// TODO: implement this method to set the 'Multiplicity' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Connector getConnector() {
		Connector connector = basicGetConnector();
		return connector != null && connector.eIsProxy() ? (Connector)eResolveProxy((InternalEObject)connector) : connector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Connector basicGetConnector() {
		return getOwningRelatedElement(Connector.class);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setConnector(Connector newConnector) {
		// TODO: implement this method to set the 'Connector' reference
		// Ensure that you remove @generated or mark it @generated NOT
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnector() {
		return basicGetConnector() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTOR_END__TARGET);
		// NOTE: The "end" and "feature" objects must NOT be resolved here, in order to avoid Xtext lazy linking errors.
		Element end = basicGetEnd();
		if (end != null) {
			target.add(end);
		}
		Element feature = basicGetFeature();
		if (feature != null) {
			target.add(feature);
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
	protected static final int[] TARGET_ESUBSETS = new int[] {SysMLPackage.CONNECTOR_END__FEATURE, SysMLPackage.CONNECTOR_END__END};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.CONNECTOR_END__SOURCE);
		Element connector = getConnector();
		if (connector != null) {
			source.add(connector);
		}
		return source;
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetSource() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONNECTOR_END__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case SysMLPackage.CONNECTOR_END__END:
				if (resolve) return getEnd();
				return basicGetEnd();
			case SysMLPackage.CONNECTOR_END__PATH:
				return getPath();
			case SysMLPackage.CONNECTOR_END__MULTIPLICITY:
				if (resolve) return getMultiplicity();
				return basicGetMultiplicity();
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
			case SysMLPackage.CONNECTOR_END__MULTIPLICITY:
				setMultiplicity((Multiplicity)newValue);
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
			case SysMLPackage.CONNECTOR_END__FEATURE:
				setFeature((Feature)null);
				return;
			case SysMLPackage.CONNECTOR_END__END:
				setEnd((Feature)null);
				return;
			case SysMLPackage.CONNECTOR_END__PATH:
				getPath().clear();
				return;
			case SysMLPackage.CONNECTOR_END__MULTIPLICITY:
				setMultiplicity((Multiplicity)null);
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
			case SysMLPackage.CONNECTOR_END__TARGET:
				return target != null && !target.isEmpty();
			case SysMLPackage.CONNECTOR_END__SOURCE:
				return isSetSource();
			case SysMLPackage.CONNECTOR_END__FEATURE:
				return feature != null;
			case SysMLPackage.CONNECTOR_END__END:
				return end != null;
			case SysMLPackage.CONNECTOR_END__PATH:
				return !getPath().isEmpty();
			case SysMLPackage.CONNECTOR_END__MULTIPLICITY:
				return basicGetMultiplicity() != null;
			case SysMLPackage.CONNECTOR_END__CONNECTOR:
				return isSetConnector();
		}
		return super.eIsSet(featureID);
	}

} //ConnectorEndImpl
