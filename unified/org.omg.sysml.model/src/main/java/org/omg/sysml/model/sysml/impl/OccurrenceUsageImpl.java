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

import org.omg.sysml.model.sysml.Classifier;
import org.omg.sysml.model.sysml.OccurrenceDefinition;
import org.omg.sysml.model.sysml.OccurrenceUsage;
import org.omg.sysml.model.sysml.PortionKind;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Occurrence Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.OccurrenceUsageImpl#isIsIndividual <em>Is Individual</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.OccurrenceUsageImpl#getPortionKind <em>Portion Kind</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.OccurrenceUsageImpl#getIndividualDefinition <em>Individual Definition</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.OccurrenceUsageImpl#getOccurrenceDefinition <em>Occurrence Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OccurrenceUsageImpl extends UsageImpl implements OccurrenceUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OccurrenceUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OCCURRENCE_USAGE;
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
	@Override
	public EList<Classifier> getDefinition() {
		var sourceValue = this.getOccurrenceDefinition();
		Object source = sourceValue;
		var result = new BasicEList<Classifier>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Classifier typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Classifier typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

} //OccurrenceUsageImpl
