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

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.omg.sysml.model.sysml.AnnotatingElement;
import org.omg.sysml.model.sysml.Annotation;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Feature;
import org.omg.sysml.model.sysml.Metaclass;
import org.omg.sysml.model.sysml.MetadataFeature;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MetadataFeatureImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MetadataFeatureImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MetadataFeatureImpl#getOwnedAnnotatingRelationship <em>Owned Annotating Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MetadataFeatureImpl#getOwningAnnotatingRelationship <em>Owning Annotating Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MetadataFeatureImpl#getMetaclass <em>Metaclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataFeatureImpl extends FeatureImpl implements MetadataFeature {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.METADATA_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getAnnotatedElement() {
		return (EList<Element>)eGet(SysMLPackage.Literals.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Annotation> getAnnotation() {
		return (EList<Annotation>)eGet(SysMLPackage.Literals.ANNOTATING_ELEMENT__ANNOTATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Annotation> getOwnedAnnotatingRelationship() {
		return (EList<Annotation>)eGet(SysMLPackage.Literals.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getOwningAnnotatingRelationship() {
		return (Annotation)eGet(SysMLPackage.Literals.ANNOTATING_ELEMENT__OWNING_ANNOTATING_RELATIONSHIP, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningAnnotatingRelationship(Annotation newOwningAnnotatingRelationship) {
		eSet(SysMLPackage.Literals.ANNOTATING_ELEMENT__OWNING_ANNOTATING_RELATIONSHIP, newOwningAnnotatingRelationship);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metaclass getMetaclass() {
		return (Metaclass)eGet(SysMLPackage.Literals.METADATA_FEATURE__METACLASS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaclass(Metaclass newMetaclass) {
		eSet(SysMLPackage.Literals.METADATA_FEATURE__METACLASS, newMetaclass);
	}

	/**
	 * The cached invocation delegate for the '{@link #evaluateFeature(org.omg.sysml.model.sysml.Feature) <em>Evaluate Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #evaluateFeature(org.omg.sysml.model.sysml.Feature)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EVALUATE_FEATURE_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.METADATA_FEATURE___EVALUATE_FEATURE__FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> evaluateFeature(Feature baseFeature) {
		try {
			return (EList<Element>)EVALUATE_FEATURE_FEATURE__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{baseFeature}));
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isSemantic() <em>Is Semantic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSemantic()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SEMANTIC__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.METADATA_FEATURE___IS_SEMANTIC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSemantic() {
		try {
			return (Boolean)IS_SEMANTIC__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #isSyntactic() <em>Is Syntactic</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSyntactic()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_SYNTACTIC__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.METADATA_FEATURE___IS_SYNTACTIC).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isSyntactic() {
		try {
			return (Boolean)IS_SYNTACTIC__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * The cached invocation delegate for the '{@link #syntaxElement() <em>Syntax Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #syntaxElement()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate SYNTAX_ELEMENT__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.METADATA_FEATURE___SYNTAX_ELEMENT).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element syntaxElement() {
		try {
			return (Element)SYNTAX_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotatingElement.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.METADATA_FEATURE__ANNOTATED_ELEMENT: return SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT;
				case SysMLPackage.METADATA_FEATURE__ANNOTATION: return SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION;
				case SysMLPackage.METADATA_FEATURE__OWNED_ANNOTATING_RELATIONSHIP: return SysMLPackage.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP;
				case SysMLPackage.METADATA_FEATURE__OWNING_ANNOTATING_RELATIONSHIP: return SysMLPackage.ANNOTATING_ELEMENT__OWNING_ANNOTATING_RELATIONSHIP;
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
		if (baseClass == AnnotatingElement.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT: return SysMLPackage.METADATA_FEATURE__ANNOTATED_ELEMENT;
				case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION: return SysMLPackage.METADATA_FEATURE__ANNOTATION;
				case SysMLPackage.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP: return SysMLPackage.METADATA_FEATURE__OWNED_ANNOTATING_RELATIONSHIP;
				case SysMLPackage.ANNOTATING_ELEMENT__OWNING_ANNOTATING_RELATIONSHIP: return SysMLPackage.METADATA_FEATURE__OWNING_ANNOTATING_RELATIONSHIP;
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.METADATA_FEATURE___EVALUATE_FEATURE__FEATURE:
				return evaluateFeature((Feature)arguments.get(0));
			case SysMLPackage.METADATA_FEATURE___IS_SEMANTIC:
				return isSemantic();
			case SysMLPackage.METADATA_FEATURE___IS_SYNTACTIC:
				return isSyntactic();
			case SysMLPackage.METADATA_FEATURE___SYNTAX_ELEMENT:
				return syntaxElement();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MetadataFeatureImpl
