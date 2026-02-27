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
import org.omg.sysml.model.sysml.ConnectionUsage;
import org.omg.sysml.model.sysml.ItemUsage;
import org.omg.sysml.model.sysml.OccurrenceDefinition;
import org.omg.sysml.model.sysml.OccurrenceUsage;
import org.omg.sysml.model.sysml.PartDefinition;
import org.omg.sysml.model.sysml.PartUsage;
import org.omg.sysml.model.sysml.PortionKind;
import org.omg.sysml.model.sysml.Structure;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Connection Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionUsageImpl#isIsIndividual <em>Is Individual</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionUsageImpl#getPortionKind <em>Portion Kind</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionUsageImpl#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionUsageImpl#getOccurrenceDefinition <em>Occurrence Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionUsageImpl#getItemDefinition <em>Item Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionUsageImpl#getPartDefinition <em>Part Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ConnectionUsageImpl#getConnectionDefinition <em>Connection Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConnectionUsageImpl extends ConnectorAsUsageImpl implements ConnectionUsage {
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
	 * @generated
	 */
	@Override
	public boolean isIsIndividual() {
		return (Boolean)eGet(SysMLPackage.Literals.OCCURRENCE_USAGE__IS_INDIVIDUAL, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsIndividual(boolean newIsIndividual) {
		eSet(SysMLPackage.Literals.OCCURRENCE_USAGE__IS_INDIVIDUAL, newIsIndividual);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public PortionKind getPortionKind() {
		return (PortionKind)eGet(SysMLPackage.Literals.OCCURRENCE_USAGE__PORTION_KIND, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPortionKind(PortionKind newPortionKind) {
		eSet(SysMLPackage.Literals.OCCURRENCE_USAGE__PORTION_KIND, newPortionKind);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceDefinition getIndividualDefinition() {
		return (OccurrenceDefinition)eGet(SysMLPackage.Literals.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIndividualDefinition(OccurrenceDefinition newIndividualDefinition) {
		eSet(SysMLPackage.Literals.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION, newIndividualDefinition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<org.omg.sysml.model.sysml.Class> getOccurrenceDefinition() {
		return (EList<org.omg.sysml.model.sysml.Class>)eGet(SysMLPackage.Literals.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Structure> getItemDefinition() {
		return (EList<Structure>)eGet(SysMLPackage.Literals.ITEM_USAGE__ITEM_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<PartDefinition> getPartDefinition() {
		return (EList<PartDefinition>)eGet(SysMLPackage.Literals.PART_USAGE__PART_DEFINITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<AssociationStructure> getConnectionDefinition() {
		return (EList<AssociationStructure>)eGet(SysMLPackage.Literals.CONNECTION_USAGE__CONNECTION_DEFINITION, true);
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
				case SysMLPackage.CONNECTION_USAGE__IS_INDIVIDUAL: return SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL;
				case SysMLPackage.CONNECTION_USAGE__PORTION_KIND: return SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND;
				case SysMLPackage.CONNECTION_USAGE__INDIVIDUAL_DEFINITION: return SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION;
				case SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION: return SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION;
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
				case SysMLPackage.OCCURRENCE_USAGE__IS_INDIVIDUAL: return SysMLPackage.CONNECTION_USAGE__IS_INDIVIDUAL;
				case SysMLPackage.OCCURRENCE_USAGE__PORTION_KIND: return SysMLPackage.CONNECTION_USAGE__PORTION_KIND;
				case SysMLPackage.OCCURRENCE_USAGE__INDIVIDUAL_DEFINITION: return SysMLPackage.CONNECTION_USAGE__INDIVIDUAL_DEFINITION;
				case SysMLPackage.OCCURRENCE_USAGE__OCCURRENCE_DEFINITION: return SysMLPackage.CONNECTION_USAGE__OCCURRENCE_DEFINITION;
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
	public EList<Association> getAssociation() {
		var sourceValue = this.getConnectionDefinition();
		Object source = sourceValue;
		var result = new BasicEList<Association>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Association typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Association typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

} //ConnectionUsageImpl
