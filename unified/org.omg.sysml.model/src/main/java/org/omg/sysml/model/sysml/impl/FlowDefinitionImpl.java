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
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.FlowDefinition;
import org.omg.sysml.model.sysml.Interaction;
import org.omg.sysml.model.sysml.Relationship;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Type;
import org.omg.sysml.model.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Flow Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#isIsImplied <em>Is Implied</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.FlowDefinitionImpl#getFlowEnd <em>Flow End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FlowDefinitionImpl extends ActionDefinitionImpl implements FlowDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FlowDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.FLOW_DEFINITION;
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
	@Override
	public EList<Feature> getAssociationEnd() {
		var sourceValue = this.getFlowEnd();
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
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getRelatedType() {
		return (EList<Type>)eGet(SysMLPackage.Literals.ASSOCIATION__RELATED_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getSourceType() {
		return (Type)eGet(SysMLPackage.Literals.ASSOCIATION__SOURCE_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSourceType(Type newSourceType) {
		eSet(SysMLPackage.Literals.ASSOCIATION__SOURCE_TYPE, newSourceType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Type> getTargetType() {
		return (EList<Type>)eGet(SysMLPackage.Literals.ASSOCIATION__TARGET_TYPE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Usage> getFlowEnd() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.FLOW_DEFINITION__FLOW_END, true);
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
				case SysMLPackage.FLOW_DEFINITION__IS_IMPLIED: return SysMLPackage.RELATIONSHIP__IS_IMPLIED;
				case SysMLPackage.FLOW_DEFINITION__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
				case SysMLPackage.FLOW_DEFINITION__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.FLOW_DEFINITION__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.FLOW_DEFINITION__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				case SysMLPackage.FLOW_DEFINITION__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.FLOW_DEFINITION__ASSOCIATION_END: return SysMLPackage.ASSOCIATION__ASSOCIATION_END;
				case SysMLPackage.FLOW_DEFINITION__RELATED_TYPE: return SysMLPackage.ASSOCIATION__RELATED_TYPE;
				case SysMLPackage.FLOW_DEFINITION__SOURCE_TYPE: return SysMLPackage.ASSOCIATION__SOURCE_TYPE;
				case SysMLPackage.FLOW_DEFINITION__TARGET_TYPE: return SysMLPackage.ASSOCIATION__TARGET_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Interaction.class) {
			switch (derivedFeatureID) {
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
				case SysMLPackage.RELATIONSHIP__IS_IMPLIED: return SysMLPackage.FLOW_DEFINITION__IS_IMPLIED;
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.FLOW_DEFINITION__OWNED_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.FLOW_DEFINITION__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.FLOW_DEFINITION__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.FLOW_DEFINITION__SOURCE;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.FLOW_DEFINITION__TARGET;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ASSOCIATION__ASSOCIATION_END: return SysMLPackage.FLOW_DEFINITION__ASSOCIATION_END;
				case SysMLPackage.ASSOCIATION__RELATED_TYPE: return SysMLPackage.FLOW_DEFINITION__RELATED_TYPE;
				case SysMLPackage.ASSOCIATION__SOURCE_TYPE: return SysMLPackage.FLOW_DEFINITION__SOURCE_TYPE;
				case SysMLPackage.ASSOCIATION__TARGET_TYPE: return SysMLPackage.FLOW_DEFINITION__TARGET_TYPE;
				default: return -1;
			}
		}
		if (baseClass == Interaction.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //FlowDefinitionImpl
