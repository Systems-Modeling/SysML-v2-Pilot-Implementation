/**
 * SysML 2 Pilot Implementation
 * Copyright (C) 2024 Model Driven Solutions, Inc.
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
 * 
 *   Contributors:
 *   Laszlo Gati, MDS
 */
package org.omg.kerml.xtext.ui.reconciler;

import org.eclipse.xtext.ui.editor.reconciler.XtextDocumentReconcileStrategy;
import org.eclipse.xtext.ui.editor.reconciler.XtextReconciler;

import com.google.inject.Inject;

public class ConfigurableXtextReconciler extends XtextReconciler {
	
	/**
	 * Waiting time (ms) before processing changes. Editing resets the timer.
	 * Increasing this delay prevents premature linking and validation,
	 * while the user is typing, but it can also lead to long waiting times for the
	 * linking and validation to start after editing.
	 */
	private static final int REPARSE_DELAY_AFTER_EDIT = 1000;
	
	@Inject
	public ConfigurableXtextReconciler(XtextDocumentReconcileStrategy strategy) {
		super(strategy);
		setDelay(REPARSE_DELAY_AFTER_EDIT);
	}
}
