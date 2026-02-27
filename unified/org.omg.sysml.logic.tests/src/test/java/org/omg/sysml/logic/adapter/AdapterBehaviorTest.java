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
package org.omg.sysml.logic.adapter;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.BasicNotifierImpl;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.junit.jupiter.api.Test;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * Verifies runtime behavior of generated SysML adapters.
 */
public class AdapterBehaviorTest {

    @Test
    void generatedAdaptersAcceptOnlyTheirAdaptedTypeToken() throws Exception {
        for (var adapterClass : this.generatedAdapterClasses()) {
            var adapter = this.newAdapter(adapterClass);
            assertTrue(adapter.isAdapterForType(adapter.adaptedType()));
            assertFalse(adapter.isAdapterForType(Object.class));
        }
    }

    @Test
    void generatedAdaptersExposeEmptyAdaptedTargetWithoutTarget() throws Exception {
        for (var adapterClass : this.generatedAdapterClasses()) {
            var adapter = this.newAdapter(adapterClass);
            assertTrue(adapter.adaptedTarget().isEmpty());
        }
    }

    @Test
    void generatedAdaptersExposeAdaptedTargetWhenCompatible() throws Exception {
        for (var adapterClass : this.generatedAdapterClasses()) {
            var adapter = this.newAdapter(adapterClass);
            var compatibleTarget = this.newCompatibleTarget(adapter.adaptedType());
            adapter.setTarget(compatibleTarget);
            assertTrue(adapter.adaptedTarget().isPresent());
            assertSame(compatibleTarget, adapter.adaptedTarget().orElseThrow());
        }
    }

    @Test
    void generatedAdaptersIgnoreIncompatibleTargets() throws Exception {
        for (var adapterClass : this.generatedAdapterClasses()) {
            var adapter = this.newAdapter(adapterClass);
            adapter.setTarget(new BasicNotifierImpl());
            assertTrue(adapter.adaptedTarget().isEmpty());
        }
    }

    /**
     * Resolves all generated adapter classes from EClass names in the SysML package.
     *
     * @return sorted list of adapter classes
     * @throws ClassNotFoundException if an expected adapter class is missing
     */
    @SuppressWarnings("unchecked")
    private List<Class<? extends AbstractSysMLAdapter<?>>> generatedAdapterClasses() throws ClassNotFoundException {
        var result = new ArrayList<Class<? extends AbstractSysMLAdapter<?>>>();
        for (var eClassName : this.eClassNames()) {
            var adapterClassName = "org.omg.sysml.logic.adapter." + this.sanitize(eClassName) + "Adapter";
            var adapterClass = (Class<? extends AbstractSysMLAdapter<?>>) Class.forName(adapterClassName);
            result.add(adapterClass);
        }
        result.sort(Comparator.comparing(Class::getName));
        return result;
    }

    /**
     * Collects all SysML EClass names recursively.
     *
     * @return sorted EClass names
     */
    private List<String> eClassNames() {
        var names = new ArrayList<String>();
        this.collectClassNames(SysMLPackage.eINSTANCE, names);
        names.sort(Comparator.naturalOrder());
        return names;
    }

    /**
     * Recursively collects EClass names in a package hierarchy.
     *
     * @param ePackage package to scan
     * @param target mutable receiver list
     */
    private void collectClassNames(EPackage ePackage, List<String> target) {
        for (EClassifier classifier : ePackage.getEClassifiers()) {
            if (classifier instanceof EClass eClass) {
                target.add(eClass.getName());
            }
        }
        for (EPackage sub : ePackage.getESubpackages()) {
            this.collectClassNames(sub, target);
        }
    }

    /**
     * Instantiates a generated adapter class.
     *
     * @param adapterClass adapter class to instantiate
     * @return adapter instance
     * @throws Exception if construction fails
     */
    private AbstractSysMLAdapter<?> newAdapter(Class<? extends AbstractSysMLAdapter<?>> adapterClass) throws Exception {
        Constructor<?> ctor = adapterClass.getDeclaredConstructor();
        return (AbstractSysMLAdapter<?>) ctor.newInstance();
    }

    /**
     * Creates a notifier compatible with the adapter target type.
     *
     * @param adaptedType adapter target type
     * @return compatible notifier instance
     */
    private Notifier newCompatibleTarget(Class<?> adaptedType) {
        var adaptedEClass = this.eClassForName(adaptedType.getSimpleName());
        var concreteEClass = this.concreteEClassFor(adaptedEClass);
        return (Notifier) EcoreUtil.create(concreteEClass);
    }

    /**
     * Resolves an EClass by simple name from {@link SysMLPackage}.
     *
     * @param eClassName target EClass name
     * @return resolved EClass
     */
    private EClass eClassForName(String eClassName) {
        var classifier = SysMLPackage.eINSTANCE.getEClassifier(eClassName);
        if (classifier instanceof EClass eClass) {
            return eClass;
        }
        throw new IllegalStateException("EClass not found for adapter type: " + eClassName);
    }

    /**
     * Resolves a concrete EClass for instance creation.
     *
     * @param eClass source EClass (possibly abstract)
     * @return concrete EClass assignable to source
     */
    private EClass concreteEClassFor(EClass eClass) {
        if (!eClass.isAbstract()) {
            return eClass;
        }
        var concreteClasses = new ArrayList<EClass>();
        this.collectConcreteSubtypes(SysMLPackage.eINSTANCE, eClass, concreteClasses);
        if (concreteClasses.isEmpty()) {
            throw new IllegalStateException("No concrete subtype found for abstract EClass: " + eClass.getName());
        }
        concreteClasses.sort(Comparator.comparing(EClass::getName));
        return concreteClasses.getFirst();
    }

    /**
     * Collects concrete EClasses assignable to a target EClass.
     *
     * @param ePackage package to scan
     * @param targetType required supertype
     * @param out mutable receiver list
     */
    private void collectConcreteSubtypes(EPackage ePackage, EClass targetType, List<EClass> out) {
        for (EClassifier classifier : ePackage.getEClassifiers()) {
            if (classifier instanceof EClass candidate
                    && !candidate.isAbstract()
                    && (candidate == targetType || candidate.getEAllSuperTypes().contains(targetType))) {
                out.add(candidate);
            }
        }
        for (EPackage sub : ePackage.getESubpackages()) {
            this.collectConcreteSubtypes(sub, targetType, out);
        }
    }

    /**
     * Sanitizes an identifier into a Java class token.
     *
     * @param identifier source identifier
     * @return sanitized identifier
     */
    private String sanitize(String identifier) {
        StringBuilder result = new StringBuilder(identifier.length());
        for (int i = 0; i < identifier.length(); i++) {
            char c = identifier.charAt(i);
            if (Character.isLetterOrDigit(c) || c == '_') {
                result.append(c);
            } else {
                result.append('_');
            }
        }
        if (result.isEmpty()) {
            return "_";
        }
        if (!Character.isJavaIdentifierStart(result.charAt(0))) {
            result.insert(0, '_');
        }
        return result.toString();
    }
}
