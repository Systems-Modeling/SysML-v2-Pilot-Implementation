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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * Shared delegate invocation utilities for generated semantics tests.
 */
public class DelegateSemanticsSupport {

    private static final String INVOCATION_DELEGATE_PACKAGE = "org.omg.sysml.logic.delegate.invocation.";

    /**
     * Creates a support helper and ensures generated delegates are registered.
     */
    public DelegateSemanticsSupport() {
        SysMLDelegateRegistrar.registerDelegates();
    }

    /**
     * Creates an EMF argument list from the provided values.
     *
     * @param values values to include in the argument list
     * @return argument list preserving input order
     */
    public BasicEList<Object> args(Object... values) {
        var arguments = new BasicEList<Object>();
        for (Object value : values) {
            arguments.add(value);
        }
        return arguments;
    }

    /**
     * Creates an argument list containing one integer argument.
     *
     * @param i integer argument value
     * @return single-value argument list
     */
    public BasicEList<Object> intArg(int i) {
        return args(Integer.valueOf(i));
    }

    /**
     * Creates an argument list containing an empty visited feature list.
     *
     * @return single-value argument list for visited features
     */
    public BasicEList<Object> visitedArg() {
        return args(new BasicEList<Feature>());
    }

    /**
     * Invokes a generated invocation delegate for a resolved EOperation.
     *
     * @param delegateSimpleClassName simple class name of the invocation delegate
     * @param eClassName owning EClass name of the operation
     * @param operationName operation name
     * @param parameterCount operation parameter count
     * @param target invocation target
     * @param arguments invocation arguments
     * @return dynamic invocation result returned by the delegate
     * @throws Exception if operation lookup, delegate instantiation, or invocation fails
     */
    public Object invokeInvocation(
            String delegateSimpleClassName,
            String eClassName,
            String operationName,
            int parameterCount,
            Object target,
            EList<?> arguments) throws Exception {
        var operation = this.findOperation(eClassName, operationName, parameterCount);
        var fqcn = INVOCATION_DELEGATE_PACKAGE + delegateSimpleClassName;
        var delegateClass = Class.forName(fqcn);
        Constructor<?> constructor = delegateClass.getConstructor(EOperation.class);
        var delegate = constructor.newInstance(operation);
        return ((AbstractInvocationDelegate) delegate).dynamicInvoke(
                (org.eclipse.emf.ecore.InternalEObject) target,
                arguments);
    }

    /**
     * Evaluates a derived setting value on an owner through EMF feature access.
     *
     * @param eClassName EClass name declaring or inheriting the feature
     * @param featureName feature name
     * @param owner feature owner instance
     * @return derived setting value produced by the runtime setting delegate
     */
    public Object evaluateSetting(String eClassName, String featureName, Object owner) {
        var feature = this.findFeature(eClassName, featureName);
        return ((InternalEObject) owner).eGet(feature, false);
    }

    /**
     * Finds an EOperation by owning class name, operation name, and arity.
     *
     * @param eClassName EClass name
     * @param operationName operation name
     * @param parameterCount operation arity
     * @return matching EOperation
     */
    private EOperation findOperation(String eClassName, String operationName, int parameterCount) {
        var eClass = (EClass) SysMLPackage.eINSTANCE.getEClassifier(eClassName);
        for (EOperation operation : eClass.getEAllOperations()) {
            if (operationName.equals(operation.getName()) && operation.getEParameters().size() == parameterCount) {
                return operation;
            }
        }
        throw new IllegalStateException(
                "Operation not found: " + eClassName + "::" + operationName + "/" + parameterCount);
    }

    /**
     * Finds an EStructuralFeature by owning class name and feature name.
     *
     * @param eClassName EClass name
     * @param featureName feature name
     * @return matching EStructuralFeature
     */
    private EStructuralFeature findFeature(String eClassName, String featureName) {
        var eClass = (EClass) SysMLPackage.eINSTANCE.getEClassifier(eClassName);
        for (EStructuralFeature feature : eClass.getEAllStructuralFeatures()) {
            if (featureName.equals(feature.getName())) {
                return feature;
            }
        }
        throw new IllegalStateException("Feature not found: " + eClassName + "." + featureName);
    }
}
