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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Association;
import org.omg.sysml.model.sysml.Connector;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Relationship;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#isIsImplied <em>Is Implied</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getAssociation <em>Association</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getConnectorEnd <em>Connector End</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getDefaultFeaturingType <em>Default Featuring Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getRelatedFeature <em>Related Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getSourceFeature <em>Source Feature</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectorImpl#getTargetFeature <em>Target Feature</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectorImpl extends FeatureImpl implements Connector {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTOR;
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
	@Override
	public EList<Element> getRelatedElement() {
		var sourceValue = this.getRelatedFeature();
		Object source = sourceValue;
		var result = new BasicEList<Element>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Element typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Element typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		var sourceValue = this.getSourceFeature();
		Object source = sourceValue;
		var result = new BasicEList<Element>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Element typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Element typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		var sourceValue = this.getTargetFeature();
		Object source = sourceValue;
		var result = new BasicEList<Element>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Element typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Element typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
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
				case SysMLPackage.CONNECTOR__IS_IMPLIED: return SysMLPackage.RELATIONSHIP__IS_IMPLIED;
				case SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.CONNECTOR__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				case SysMLPackage.CONNECTOR__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
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
				case SysMLPackage.RELATIONSHIP__IS_IMPLIED: return SysMLPackage.CONNECTOR__IS_IMPLIED;
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.CONNECTOR__OWNED_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.CONNECTOR__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.CONNECTOR__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.CONNECTOR__SOURCE;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.CONNECTOR__TARGET;
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
	public EList<Type> getType() {
		var sourceValue = this.getAssociation();
		Object source = sourceValue;
		var result = new BasicEList<Type>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Type typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Type typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getEndFeature() {
		var sourceValue = this.getConnectorEnd();
		Object source = sourceValue;
		var result = new BasicEList<Feature>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Feature typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Feature typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

} //ConnectorImpl
