/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.omg.sysml.logic;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * Determines whether a reference has been explicitly set.
 */
@FunctionalInterface
public interface IReferenceSetChecker {

	/**
	 * Tests whether the given reference has been explicitly set on an object.
	 *
	 * @param object
	 *            the object holding the reference
	 * @param reference
	 *            the reference to test
	 * @return {@code true} if the reference has been explicitly set
	 */
	boolean isSet(EObject object, EReference reference);
}
