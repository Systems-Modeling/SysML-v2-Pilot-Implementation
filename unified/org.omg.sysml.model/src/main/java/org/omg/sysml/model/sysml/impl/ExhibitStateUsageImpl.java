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
import org.omg.sysml.model.sysml.ExhibitStateUsage;
import org.omg.sysml.model.sysml.OccurrenceUsage;
import org.omg.sysml.model.sysml.PerformActionUsage;
import org.omg.sysml.model.sysml.StateUsage;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Exhibit State Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ExhibitStateUsageImpl#getEventOccurrence <em>Event Occurrence</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ExhibitStateUsageImpl#getPerformedAction <em>Performed Action</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.ExhibitStateUsageImpl#getExhibitedState <em>Exhibited State</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ExhibitStateUsageImpl extends StateUsageImpl implements ExhibitStateUsage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExhibitStateUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.EXHIBIT_STATE_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public OccurrenceUsage getEventOccurrence() {
		return (OccurrenceUsage)eGet(SysMLPackage.Literals.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE, true);
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
		var sourceValue = this.getExhibitedState();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof ActionUsage typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof ActionUsage typedValue) {
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
	public void setPerformedAction(ActionUsage newPerformedAction) {
		eSet(SysMLPackage.Literals.PERFORM_ACTION_USAGE__PERFORMED_ACTION, newPerformedAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public StateUsage getExhibitedState() {
		return (StateUsage)eGet(SysMLPackage.Literals.EXHIBIT_STATE_USAGE__EXHIBITED_STATE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setExhibitedState(StateUsage newExhibitedState) {
		eSet(SysMLPackage.Literals.EXHIBIT_STATE_USAGE__EXHIBITED_STATE, newExhibitedState);
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
				case SysMLPackage.EXHIBIT_STATE_USAGE__EVENT_OCCURRENCE: return SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE;
				default: return -1;
			}
		}
		if (baseClass == PerformActionUsage.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.EXHIBIT_STATE_USAGE__PERFORMED_ACTION: return SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION;
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
				case SysMLPackage.EVENT_OCCURRENCE_USAGE__EVENT_OCCURRENCE: return SysMLPackage.EXHIBIT_STATE_USAGE__EVENT_OCCURRENCE;
				default: return -1;
			}
		}
		if (baseClass == PerformActionUsage.class) {
			switch (baseFeatureID) {
				case SysMLPackage.PERFORM_ACTION_USAGE__PERFORMED_ACTION: return SysMLPackage.EXHIBIT_STATE_USAGE__PERFORMED_ACTION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //ExhibitStateUsageImpl
