/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2022 Model Driven Solutions, Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 *******************************************************************************/
/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Metaclass;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotating Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getOwnedRelationship <em>Owned Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getOwnedAnnotatingRelationship <em>Owned Annotating Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getMetaclass <em>Metaclass</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataFeatureImpl extends FeatureImpl implements MetadataFeature {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * The cached setting delegate for the '{@link #getAnnotatedElement() <em>Annotated Element</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotatedElement()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate ANNOTATED_ELEMENT__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT).getSettingDelegate();
	/**
	 * The cached setting delegate for the '{@link #getOwnedAnnotatingRelationship() <em>Owned Annotating Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotatingRelationship()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate OWNED_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP).getSettingDelegate();

	/**
	 * The cached setting delegate for the '{@link #getMetaclass() <em>Metaclass</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMetaclass()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature.Internal.SettingDelegate METACLASS__ESETTING_DELEGATE = ((EStructuralFeature.Internal)SysMLPackage.Literals.METADATA_FEATURE__METACLASS).getSettingDelegate();

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
		return (EList<Element>)ANNOTATED_ELEMENT__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Annotation> getOwnedAnnotatingRelationship() {
		return (EList<Annotation>)OWNED_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * The array of superset feature identifiers for the '{@link #getOwnedAnnotatingRelationship() <em>Owned Annotating Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedAnnotatingRelationship()
	 * @generated
	 * @ordered
	 */
	protected static final int[] OWNED_ANNOTATING_RELATIONSHIP_ESUPERSETS = new int[] {SysMLPackage.METADATA_FEATURE__ANNOTATION, SysMLPackage.METADATA_FEATURE__OWNED_RELATIONSHIP};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metaclass getMetaclass() {
		return (Metaclass)METACLASS__ESETTING_DELEGATE.dynamicGet(this, null, 0, true, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass basicGetMetaclass() {
		return (Metaclass)METACLASS__ESETTING_DELEGATE.dynamicGet(this, null, 0, false, false);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMetaclass(Metaclass newMetaclass) {
		METACLASS__ESETTING_DELEGATE.dynamicSet(this, null, 0, newMetaclass);
	}

	/**
	 * The cached invocation delegate for the '{@link #evaluateFeature(org.omg.sysml.lang.sysml.Feature) <em>Evaluate Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #evaluateFeature(org.omg.sysml.lang.sysml.Feature)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate EVALUATE_FEATURE_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.METADATA_FEATURE___EVALUATE_FEATURE__FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectWithInverseResolvingEList<Annotation>(Annotation.class, this, SysMLPackage.METADATA_FEATURE__ANNOTATION, SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Relationship> getOwnedRelationship() {
		if (ownedRelationship == null) {
			ownedRelationship = new EObjectContainmentWithInverseEList<Relationship>(Relationship.class, this, SysMLPackage.METADATA_FEATURE__OWNED_RELATIONSHIP, SysMLPackage.RELATIONSHIP__OWNING_RELATED_ELEMENT);
		}
		return ownedRelationship;
	}

	// Operations
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
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
	public Element syntaxElement() {
		try {
			return (Element)SYNTAX_ELEMENT__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	//

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE__ANNOTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotation()).basicAdd(otherEnd, msgs);
			case SysMLPackage.METADATA_FEATURE__OWNED_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedRelationship()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
			case SysMLPackage.METADATA_FEATURE__OWNED_RELATIONSHIP:
				return ((InternalEList<?>)getOwnedRelationship()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE__ANNOTATION:
				return getAnnotation();
			case SysMLPackage.METADATA_FEATURE__ANNOTATED_ELEMENT:
				return getAnnotatedElement();
			case SysMLPackage.METADATA_FEATURE__OWNED_ANNOTATING_RELATIONSHIP:
				return getOwnedAnnotatingRelationship();
			case SysMLPackage.METADATA_FEATURE__METACLASS:
				if (resolve) return getMetaclass();
				return basicGetMetaclass();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SysMLPackage.METADATA_FEATURE__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				getAnnotatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.METADATA_FEATURE__OWNED_ANNOTATING_RELATIONSHIP:
				getOwnedAnnotatingRelationship().clear();
				getOwnedAnnotatingRelationship().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SysMLPackage.METADATA_FEATURE__METACLASS:
				setMetaclass((Metaclass)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE__ANNOTATION:
				getAnnotation().clear();
				return;
			case SysMLPackage.METADATA_FEATURE__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				return;
			case SysMLPackage.METADATA_FEATURE__OWNED_ANNOTATING_RELATIONSHIP:
				getOwnedAnnotatingRelationship().clear();
				return;
			case SysMLPackage.METADATA_FEATURE__METACLASS:
				setMetaclass((Metaclass)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SysMLPackage.METADATA_FEATURE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case SysMLPackage.METADATA_FEATURE__OWNED_RELATIONSHIP:
				return ownedRelationship != null && !ownedRelationship.isEmpty();
			case SysMLPackage.METADATA_FEATURE__ANNOTATED_ELEMENT:
				return ANNOTATED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.METADATA_FEATURE__OWNED_ANNOTATING_RELATIONSHIP:
				return OWNED_ANNOTATING_RELATIONSHIP__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.METADATA_FEATURE__METACLASS:
				return METACLASS__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
		}
		return super.eIsSet(featureID);
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
				case SysMLPackage.METADATA_FEATURE__OWNED_ANNOTATING_RELATIONSHIP: return SysMLPackage.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP;
				case SysMLPackage.METADATA_FEATURE__ANNOTATION: return SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION;
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
				case SysMLPackage.ANNOTATING_ELEMENT__OWNED_ANNOTATING_RELATIONSHIP: return SysMLPackage.METADATA_FEATURE__OWNED_ANNOTATING_RELATIONSHIP;
				case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION: return SysMLPackage.METADATA_FEATURE__ANNOTATION;
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

} //AnnotatingFeatureImpl
