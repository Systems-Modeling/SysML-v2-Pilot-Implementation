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

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.ActionUsage;
import org.omg.sysml.model.sysml.EventOccurrenceUsage;
import org.omg.sysml.model.sysml.OccurrenceUsage;
import org.omg.sysml.model.sysml.PerformActionUsage;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Perform Action Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.PerformActionUsageImpl#getEventOccurrence <em>Event Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.PerformActionUsageImpl#getPerformedAction <em>Performed Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PerformActionUsageImpl extends ActionUsageImpl implements PerformActionUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PerformActionUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.PERFORM_ACTION_USAGE;
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceUsage getEventOccurrence() {
		var sourceValue = this.getPerformedAction();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof OccurrenceUsage typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof OccurrenceUsage typedValue) {
			return typedValue;
		}
		return null;
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEventOccurrence(OccurrenceUsage newEventOccurrence) {
		eSet(SysMLPackage.Literals.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE, newEventOccurrence);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ActionUsage getPerformedAction() {
		return (ActionUsage)eGet(SysMLPackage.Literals.PERFORM_ACTION_USAGE__PERFORMED_ACTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPerformedAction(ActionUsage newPerformedAction) {
		eSet(SysMLPackage.Literals.PERFORM_ACTION_USAGE__PERFORMED_ACTION, newPerformedAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == EventOccurrenceUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.PERFORM_ACTION_USAGE__EVENT_OCCURRENCE: return SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE;
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
		if (baseClass == EventOccurrenceUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE: return SysMLPackage.PERFORM_ACTION_USAGE__EVENT_OCCURRENCE;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //PerformActionUsageImpl
