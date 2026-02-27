/*******************************************************************************
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
 *
 *******************************************************************************/
package org.omg.sysml.logic.delegate;

import java.lang.reflect.Constructor;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.emf.ecore.EOperation;

/**
 * Factory that provides invocation delegates for SysML EMF operations.
 *
 * <p>It maps each {@link EOperation} to a generated delegate class name, loads the constructor
 * reflectively, and instantiates the delegate on demand.
 *
 * <p>If a generated delegate class is missing or cannot be instantiated, a fallback delegate is
 * returned to keep invocation behavior defined.
 */
public class DefaultSysMLInvocationDelegateFactory implements EOperation.Internal.InvocationDelegate.Factory {

    private static final String GENERATED_PACKAGE = "org.omg.sysml.logic.delegate.invocation";

    private final Map<EOperation, Constructor<?>> constructors = new ConcurrentHashMap<>();

    @Override
    public EOperation.Internal.InvocationDelegate createInvocationDelegate(EOperation eOperation) {
        String className = GENERATED_PACKAGE + "." + delegateSimpleName(eOperation);
        Constructor<?> constructor = constructors.computeIfAbsent(eOperation, op -> loadConstructor(className));
        if (constructor == null) {
            return new AbstractInvocationDelegate.FallbackInvocationDelegate(eOperation, className);
        }
        try {
            return (EOperation.Internal.InvocationDelegate) constructor.newInstance(eOperation);
        } catch (ReflectiveOperationException e) {
            return new AbstractInvocationDelegate.FallbackInvocationDelegate(eOperation, className);
        }
    }

    /**
     * Loads the generated delegate constructor for the given fully qualified class name.
     *
     * <p>Returns {@code null} when the class does not exist.
     */
    private static Constructor<?> loadConstructor(String className) {
        try {
            return Class.forName(className).getConstructor(EOperation.class);
        } catch (ClassNotFoundException e) {
            return null;
        } catch (ReflectiveOperationException e) {
            throw new IllegalStateException("Failed to initialize invocation delegate " + className, e);
        }
    }

    /**
     * Computes the generated invocation delegate simple class name for an operation.
     */
    private static String delegateSimpleName(EOperation operation) {
        return sanitize(operation.getEContainingClass().getName()) + "_"
                + operationToken(operation) + "_InvocationDelegate";
    }

    /**
     * Builds the stable operation token used in generated invocation delegate class names.
     */
    private static String operationToken(EOperation operation) {
        return sanitize(operation.getName());
    }

    /**
     * Converts an arbitrary token to a valid Java identifier fragment.
     */
    private static String sanitize(String value) {
        StringBuilder builder = new StringBuilder(value.length() + 4);
        for (int i = 0; i < value.length(); i++) {
            char ch = value.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                builder.append(ch);
            } else {
                builder.append('_');
            }
        }

        if (builder.length() == 0 || !Character.isJavaIdentifierStart(builder.charAt(0))) {
            builder.insert(0, '_');
        }
        return builder.toString();
    }
}
