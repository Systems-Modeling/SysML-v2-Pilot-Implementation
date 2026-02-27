/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 */
package org.omg.sysml.model.sysml.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Association;
import org.omg.sysml.model.sysml.Connector;
import org.omg.sysml.model.sysml.ConnectorAsUsage;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Relationship;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector As Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#isIsImplied <em>Is Implied</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getConnectorEnd <em>Connector End</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getDefaultFeaturingType <em>Default Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getRelatedFeature <em>Related Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorAsUsageImpl#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ConnectorAsUsageImpl extends UsageImpl implements ConnectorAsUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorAsUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTOR_AS_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsImplied() {
		return (Boolean)eGet(SysMLPackage.Literals.RELATIONSHIP__IS_IMPLIED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsImplied(boolean newIsImplied) {
		eSet(SysMLPackage.Literals.RELATIONSHIP__IS_IMPLIED, newIsImplied);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getOwnedRelatedElement() {
		return (EList<Element>)eGet(SysMLPackage.Literals.RELATIONSHIP__OWNED_RELATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		return (Element)eGet(SysMLPackage.Literals.RELATIONSHIP__OWNING_RELATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		eSet(SysMLPackage.Literals.RELATIONSHIP__OWNING_RELATED_ELEMENT, newOwningRelatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getRelatedElement() {
		return (EList<Element>)eGet(SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getSource() {
		return (EList<Element>)eGet(SysMLPackage.Literals.RELATIONSHIP__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getTarget() {
		return (EList<Element>)eGet(SysMLPackage.Literals.RELATIONSHIP__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Association> getAssociation() {
		return (EList<Association>)eGet(SysMLPackage.Literals.CONNECTOR__ASSOCIATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getConnectorEnd() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.CONNECTOR__CONNECTOR_END, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getDefaultFeaturingType() {
		return (Type)eGet(SysMLPackage.Literals.CONNECTOR__DEFAULT_FEATURING_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDefaultFeaturingType(Type newDefaultFeaturingType) {
		eSet(SysMLPackage.Literals.CONNECTOR__DEFAULT_FEATURING_TYPE, newDefaultFeaturingType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getRelatedFeature() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.CONNECTOR__RELATED_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getSourceFeature() {
		return (Feature)eGet(SysMLPackage.Literals.CONNECTOR__SOURCE_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceFeature(Feature newSourceFeature) {
		eSet(SysMLPackage.Literals.CONNECTOR__SOURCE_FEATURE, newSourceFeature);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Feature> getTargetFeature() {
		return (EList<Feature>)eGet(SysMLPackage.Literals.CONNECTOR__TARGET_FEATURE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Relationship.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR_AS_USAGE__IS_IMPLIED: return SysMLPackage.RELATIONSHIP__IS_IMPLIED;
				case SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				case SysMLPackage.CONNECTOR_AS_USAGE__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION: return SysMLPackage.CONNECTOR__ASSOCIATION;
				case SysMLPackage.CONNECTOR_AS_USAGE__CONNECTOR_END: return SysMLPackage.CONNECTOR__CONNECTOR_END;
				case SysMLPackage.CONNECTOR_AS_USAGE__DEFAULT_FEATURING_TYPE: return SysMLPackage.CONNECTOR__DEFAULT_FEATURING_TYPE;
				case SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE: return SysMLPackage.CONNECTOR__RELATED_FEATURE;
				case SysMLPackage.CONNECTOR_AS_USAGE__SOURCE_FEATURE: return SysMLPackage.CONNECTOR__SOURCE_FEATURE;
				case SysMLPackage.CONNECTOR_AS_USAGE__TARGET_FEATURE: return SysMLPackage.CONNECTOR__TARGET_FEATURE;
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
		if (baseClass == Relationship.class) {
			switch (baseFeatureID) {
				case SysMLPackage.RELATIONSHIP__IS_IMPLIED: return SysMLPackage.CONNECTOR_AS_USAGE__IS_IMPLIED;
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.CONNECTOR_AS_USAGE__OWNED_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.CONNECTOR_AS_USAGE__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.CONNECTOR_AS_USAGE__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.CONNECTOR_AS_USAGE__SOURCE;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.CONNECTOR_AS_USAGE__TARGET;
				default: return -1;
			}
		}
		if (baseClass == Connector.class) {
			switch (baseFeatureID) {
				case SysMLPackage.CONNECTOR__ASSOCIATION: return SysMLPackage.CONNECTOR_AS_USAGE__ASSOCIATION;
				case SysMLPackage.CONNECTOR__CONNECTOR_END: return SysMLPackage.CONNECTOR_AS_USAGE__CONNECTOR_END;
				case SysMLPackage.CONNECTOR__DEFAULT_FEATURING_TYPE: return SysMLPackage.CONNECTOR_AS_USAGE__DEFAULT_FEATURING_TYPE;
				case SysMLPackage.CONNECTOR__RELATED_FEATURE: return SysMLPackage.CONNECTOR_AS_USAGE__RELATED_FEATURE;
				case SysMLPackage.CONNECTOR__SOURCE_FEATURE: return SysMLPackage.CONNECTOR_AS_USAGE__SOURCE_FEATURE;
				case SysMLPackage.CONNECTOR__TARGET_FEATURE: return SysMLPackage.CONNECTOR_AS_USAGE__TARGET_FEATURE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectorAsUsageImpl
