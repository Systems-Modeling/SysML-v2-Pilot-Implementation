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
import org.omg.sysml.model.sysml.AssociationStructure;
import org.omg.sysml.model.sysml.ConnectionDefinition;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Relationship;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.Type;
import org.omg.sysml.model.sysml.Usage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#isIsImplied <em>Is Implied</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getAssociationEnd <em>Association End</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionDefinitionImpl#getConnectionEnd <em>Connection End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionDefinitionImpl extends PartDefinitionImpl implements ConnectionDefinition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConnectionDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.CONNECTION_DEFINITION;
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
		var sourceValue = this.getConnectionEnd();
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
	public EList<Usage> getConnectionEnd() {
		return (EList<Usage>)eGet(SysMLPackage.Literals.CONNECTION_DEFINITION__CONNECTION_END, true);
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
				case SysMLPackage.CONNECTION_DEFINITION__IS_IMPLIED: return SysMLPackage.RELATIONSHIP__IS_IMPLIED;
				case SysMLPackage.CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT;
				case SysMLPackage.CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT;
				case SysMLPackage.CONNECTION_DEFINITION__RELATED_ELEMENT: return SysMLPackage.RELATIONSHIP__RELATED_ELEMENT;
				case SysMLPackage.CONNECTION_DEFINITION__SOURCE: return SysMLPackage.RELATIONSHIP__SOURCE;
				case SysMLPackage.CONNECTION_DEFINITION__TARGET: return SysMLPackage.RELATIONSHIP__TARGET;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.CONNECTION_DEFINITION__ASSOCIATION_END: return SysMLPackage.ASSOCIATION__ASSOCIATION_END;
				case SysMLPackage.CONNECTION_DEFINITION__RELATED_TYPE: return SysMLPackage.ASSOCIATION__RELATED_TYPE;
				case SysMLPackage.CONNECTION_DEFINITION__SOURCE_TYPE: return SysMLPackage.ASSOCIATION__SOURCE_TYPE;
				case SysMLPackage.CONNECTION_DEFINITION__TARGET_TYPE: return SysMLPackage.ASSOCIATION__TARGET_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AssociationStructure.class) {
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
				case SysMLPackage.RELATIONSHIP__IS_IMPLIED: return SysMLPackage.CONNECTION_DEFINITION__IS_IMPLIED;
				case SysMLPackage.RELATIONSHIP__OWNED_RELATED_ELEMENT: return SysMLPackage.CONNECTION_DEFINITION__OWNED_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT: return SysMLPackage.CONNECTION_DEFINITION__OWNING_RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__RELATED_ELEMENT: return SysMLPackage.CONNECTION_DEFINITION__RELATED_ELEMENT;
				case SysMLPackage.RELATIONSHIP__SOURCE: return SysMLPackage.CONNECTION_DEFINITION__SOURCE;
				case SysMLPackage.RELATIONSHIP__TARGET: return SysMLPackage.CONNECTION_DEFINITION__TARGET;
				default: return -1;
			}
		}
		if (baseClass == Association.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ASSOCIATION__ASSOCIATION_END: return SysMLPackage.CONNECTION_DEFINITION__ASSOCIATION_END;
				case SysMLPackage.ASSOCIATION__RELATED_TYPE: return SysMLPackage.CONNECTION_DEFINITION__RELATED_TYPE;
				case SysMLPackage.ASSOCIATION__SOURCE_TYPE: return SysMLPackage.CONNECTION_DEFINITION__SOURCE_TYPE;
				case SysMLPackage.ASSOCIATION__TARGET_TYPE: return SysMLPackage.CONNECTION_DEFINITION__TARGET_TYPE;
				default: return -1;
			}
		}
		if (baseClass == AssociationStructure.class) {
			switch (baseFeatureID) {
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ConnectionDefinitionImpl
