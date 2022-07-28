/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.BasicInternalEList;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.AssociationStructure;
import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.ConnectionUsage;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.ItemUsage;
import org.omg.sysml.lang.sysml.OccurrenceDefinition;
import org.omg.sysml.lang.sysml.OccurrenceUsage;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.PartUsage;
import org.omg.sysml.lang.sysml.PortionKind;
import org.omg.sysml.lang.sysml.PortioningFeature;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.util.ConnectorUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;
import org.omg.sysml.util.UsageUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getOccurrenceDefinition <em>Occurrence Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getPortioningFeature <em>Portioning Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#isIndividual <em>Is Individual</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getPortionKind <em>Portion Kind</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getPartDefinition <em>Part Definition</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.ConnectionUsageImpl#getConnectionDefinition <em>Connection Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionUsageImpl extends ConnectorAsUsageImpl implements ConnectionUsage {

	/**
	 * The default value of the '{@link #isIndividual() <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividual()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INDIVIDUAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIndividual() <em>Is Individual</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIndividual()
	 * @generated
	 * @ordered
	 */
	protected boolean isIndividual = IS_INDIVIDUAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortionKind() <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortionKind()
	 * @generated NOT
	 * @ordered
	 */
	protected static final PortionKind PORTION_KIND_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPortionKind() <em>Portion Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortionKind()
	 * @generated
	 * @ordered
	 */
	protected PortionKind portionKind = PORTION_KIND_EDEFAULT;

	/**
	 * The cached setting delegate for the '{@link #getPartDefinition() <em>Part Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPartDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate PART_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.PART_USAGE__PART_DEFINITION).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getConnectionDefinition() <em>Connection Definition</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectionDefinition()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate CONNECTION_DEFINITION__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.CONNECTION_USAGE__CONNECTION_DEFINITION).getSettingDelegate();

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
	public EList<org.omg.sysml.lang.sysml.Class> getOccurrenceDefinition() {
		EList<org.omg.sysml.lang.sysml.Class> definitions =
				new NonNotifyingEObjectEList<>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION);
		super.getDefinition().stream().
			filter(org.omg.sysml.lang.sysml.Class.class::isInstance).
			map(org.omg.sysml.lang.sysml.Class.class::cast).
			forEachOrdered(definitions::add);
		return definitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOccurrenceDefinition() {
		return !getOccurrenceDefinition().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortioningFeature getPortioningFeature() {
		PortioningFeature portioningFeature = basicGetPortioningFeature();
		return portioningFeature != null && portioningFeature.eIsProxy() ? (PortioningFeature)eResolveProxy((InternalEObject)portioningFeature) : portioningFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public PortioningFeature basicGetPortioningFeature() {
		return getOwnedFeature().stream().
				filter(PortioningFeature.class::isInstance).
				map(PortioningFeature.class::cast).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setPortioningFeature(PortioningFeature newPortioningFeature) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceDefinition getIndividualDefinition() {
		OccurrenceDefinition individualDefinition = basicGetIndividualDefinition();
		return individualDefinition != null && individualDefinition.eIsProxy() ? (OccurrenceDefinition)eResolveProxy((InternalEObject)individualDefinition) : individualDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public OccurrenceDefinition basicGetIndividualDefinition() {
		return getOccurrenceDefinition().stream().
				filter(OccurrenceDefinition.class::isInstance).
				map(OccurrenceDefinition.class::cast).
				filter(OccurrenceDefinition::isIndividual).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setIndividualDefinition(OccurrenceDefinition newIndividualDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIndividual() {
		return isIndividual;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsIndividual(boolean newIsIndividual) {
		boolean oldIsIndividual = isIndividual;
		isIndividual = newIsIndividual;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTION_USAGE__IS_INDIVIDUAL, oldIsIndividual, isIndividual));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortionKind getPortionKind() {
		return portionKind;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortionKind(PortionKind newPortionKind) {
		PortionKind oldPortionKind = portionKind;
		portionKind = newPortionKind == null ? PORTION_KIND_EDEFAULT : newPortionKind;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.CONNECTION_USAGE__PORTION_KIND, oldPortionKind, portionKind));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Structure> getItemDefinition() {
		return new DerivedEObjectEList<>(Structure.class, this, SysMLPackage.CONNECTION_USAGE__ITEM_DEFINITION, new int[] {SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION});
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemDefinition() {
		return !getItemDefinition().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartDefinition> getPartDefinition() {
		return (EList<PartDefinition>)PART_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getRelatedFeature() {
		EList<Feature> relatedFeatures = new BasicInternalEList<Feature>(Feature.class);
		for (Object end: getConnectorEnd().toArray()) {
			if (end != null) {
				Feature subsettedFeature = ((Feature)end).firstSubsettedFeature();
				if (subsettedFeature != null) {
					relatedFeatures.add(subsettedFeature);
				}
			}
		}
		return relatedFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Association> getAssociation() {
		@SuppressWarnings("unchecked")
		EList<Association> connectionDefinition = (EList<Association>)((EList<?>)getConnectionDefinition());
		return connectionDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAssociation() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AssociationStructure> getConnectionDefinition() {
		return (EList<AssociationStructure>)CONNECTION_DEFINITION__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetConnectionDefinition() {
		return !getConnectionDefinition().isEmpty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Classifier> getDefinition() {
		@SuppressWarnings("unchecked")
		EList<Classifier> occurrenceDefinition = (EList<Classifier>)((EList<?>)getOccurrenceDefinition());
		return occurrenceDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetDefinition() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setSourceFeature(Feature newSourceFeature) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Feature> getTargetFeature() {
		EList<Feature> targetFeatures = new NonNotifyingEObjectEList<>(Feature.class, this, SysMLPackage.CONNECTION_USAGE__TARGET_FEATURE);
		ConnectorUtil.addTargetFeatures(this, targetFeatures);
		return targetFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Feature> path(Feature relatedFeature) {
		EList<Feature> path = new BasicInternalEList<Feature>(Feature.class);
		ConnectorUtil.getPath(path, getOwningNamespace(), relatedFeature);
		return path;
	}
	
	// Additional overrides

	@Override
	public boolean isComposite() {
		return UsageUtil.isComposite(this, isComposite);
	}
	
	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION:
				return getOccurrenceDefinition();
			case SysMLPackage.CONNECTION_USAGE__PORTIONING_FEATURE:
				if (resolve) return getPortioningFeature();
				return basicGetPortioningFeature();
			case SysMLPackage.CONNECTION_USAGE__INDIVIDUAL_DEFINITION:
				if (resolve) return getIndividualDefinition();
				return basicGetIndividualDefinition();
			case SysMLPackage.CONNECTION_USAGE__IS_INDIVIDUAL:
				return isIndividual();
			case SysMLPackage.CONNECTION_USAGE__PORTION_KIND:
				return getPortionKind();
			case SysMLPackage.CONNECTION_USAGE__ITEM_DEFINITION:
				return getItemDefinition();
			case SysMLPackage.CONNECTION_USAGE__PART_DEFINITION:
				return getPartDefinition();
			case SysMLPackage.CONNECTION_USAGE__CONNECTION_DEFINITION:
				return getConnectionDefinition();
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
			case SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION:
				getOccurrenceDefinition().clear();
				getOccurrenceDefinition().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__PORTIONING_FEATURE:
				setPortioningFeature((PortioningFeature)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__INDIVIDUAL_DEFINITION:
				setIndividualDefinition((OccurrenceDefinition)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__IS_INDIVIDUAL:
				setIsIndividual((Boolean)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__PORTION_KIND:
				setPortionKind((PortionKind)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__ITEM_DEFINITION:
				getItemDefinition().clear();
				getItemDefinition().addAll((Collection<? extends Structure>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__PART_DEFINITION:
				getPartDefinition().clear();
				getPartDefinition().addAll((Collection<? extends PartDefinition>)newValue);
				return;
			case SysMLPackage.CONNECTION_USAGE__CONNECTION_DEFINITION:
				getConnectionDefinition().clear();
				getConnectionDefinition().addAll((Collection<? extends AssociationStructure>)newValue);
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
			case SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION:
				getOccurrenceDefinition().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__PORTIONING_FEATURE:
				setPortioningFeature((PortioningFeature)null);
				return;
			case SysMLPackage.CONNECTION_USAGE__INDIVIDUAL_DEFINITION:
				setIndividualDefinition((OccurrenceDefinition)null);
				return;
			case SysMLPackage.CONNECTION_USAGE__IS_INDIVIDUAL:
				setIsIndividual(IS_INDIVIDUAL_EDEFAULT);
				return;
			case SysMLPackage.CONNECTION_USAGE__PORTION_KIND:
				setPortionKind(PORTION_KIND_EDEFAULT);
				return;
			case SysMLPackage.CONNECTION_USAGE__ITEM_DEFINITION:
				getItemDefinition().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__PART_DEFINITION:
				getPartDefinition().clear();
				return;
			case SysMLPackage.CONNECTION_USAGE__CONNECTION_DEFINITION:
				getConnectionDefinition().clear();
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
			case SysMLPackage.CONNECTION_USAGE__DEFINITION:
				return isSetDefinition();
			case SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION:
				return isSetOccurrenceDefinition();
			case SysMLPackage.CONNECTION_USAGE__PORTIONING_FEATURE:
				return basicGetPortioningFeature() != null;
			case SysMLPackage.CONNECTION_USAGE__INDIVIDUAL_DEFINITION:
				return basicGetIndividualDefinition() != null;
			case SysMLPackage.CONNECTION_USAGE__IS_INDIVIDUAL:
				return isIndividual != IS_INDIVIDUAL_EDEFAULT;
			case SysMLPackage.CONNECTION_USAGE__PORTION_KIND:
				return portionKind != PORTION_KIND_EDEFAULT;
			case SysMLPackage.CONNECTION_USAGE__ITEM_DEFINITION:
				return isSetItemDefinition();
			case SysMLPackage.CONNECTION_USAGE__PART_DEFINITION:
				return PART_DEFINITION__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.CONNECTION_USAGE__ASSOCIATION:
				return isSetAssociation();
			case SysMLPackage.CONNECTION_USAGE__CONNECTION_DEFINITION:
				return isSetConnectionDefinition();
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
		if (baseClass == OccurrenceUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION: return SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION;
				case SysMLPackage.CONNECTION_USAGE__PORTIONING_FEATURE: return SysMLPackage.OCCURRENCE_USAGE__PORTIONING_FEATURE;
				case SysMLPackage.CONNECTION_USAGE__INDIVIDUAL_DEFINITION: return SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION;
				case SysMLPackage.CONNECTION_USAGE__IS_INDIVIDUAL: return SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL;
				case SysMLPackage.CONNECTION_USAGE__PORTION_KIND: return SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND;
				default: return -1;
			}
		}
		if (baseClass == ItemUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTION_USAGE__ITEM_DEFINITION: return SysMLPackage.ITEM_USAGE__ITEM_DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == PartUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTION_USAGE__PART_DEFINITION: return SysMLPackage.PART_USAGE__PART_DEFINITION;
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
		if (baseClass == OccurrenceUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION: return SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION;
				case SysMLPackage.OCCURRENCE_USAGE__PORTIONING_FEATURE: return SysMLPackage.CONNECTION_USAGE__PORTIONING_FEATURE;
				case SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION: return SysMLPackage.CONNECTION_USAGE__INDIVIDUAL_DEFINITION;
				case SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL: return SysMLPackage.CONNECTION_USAGE__IS_INDIVIDUAL;
				case SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND: return SysMLPackage.CONNECTION_USAGE__PORTION_KIND;
				default: return -1;
			}
		}
		if (baseClass == ItemUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ITEM_USAGE__ITEM_DEFINITION: return SysMLPackage.CONNECTION_USAGE__ITEM_DEFINITION;
				default: return -1;
			}
		}
		if (baseClass == PartUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.PART_USAGE__PART_DEFINITION: return SysMLPackage.CONNECTION_USAGE__PART_DEFINITION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isIndividual: ");
		result.append(isIndividual);
		result.append(", portionKind: ");
		result.append(portionKind);
		result.append(')');
		return result.toString();
	}

} //ConnectUsageImpl
