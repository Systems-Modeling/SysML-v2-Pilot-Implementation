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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.expressions.util.EvaluationUtil;
import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Metaclass;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotating Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataFeatureImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetaclass() {
		return basicGetMetaclass() != null;
	}

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
	public EList<Type> getType() {
		EList<Type> type = new UniqueEList<Type>();
		Metaclass metaclass = getMetaclass();
		if (metaclass != null) {
			type.add(metaclass);
		}
		return new UnionEObjectEList<Type>(this, SysMLPackage.Literals.FEATURE__TYPE, type.size(), type.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}
	
	// Operations
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public EList<Element> evaluateFeature(Feature baseFeature) {
		return ModelLevelExpressionEvaluator.INSTANCE.evaluateFeature(baseFeature, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSemantic() {
		return specializesFromLibrary("Metaobjects::SemanticMetadata");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isSyntactic() {
		return specializesFromLibrary("KerML::Element");
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element syntaxElement() {
		return EvaluationUtil.getMetaclassReferenceOf(this);				
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
			case SysMLPackage.METADATA_FEATURE__ANNOTATED_ELEMENT:
				return ANNOTATED_ELEMENT__ESETTING_DELEGATE.dynamicIsSet(this, null, 0);
			case SysMLPackage.METADATA_FEATURE__TYPE:
				return isSetType();
			case SysMLPackage.METADATA_FEATURE__METACLASS:
				return isSetMetaclass();
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
				case SysMLPackage.METADATA_FEATURE__ANNOTATION: return SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION;
				case SysMLPackage.METADATA_FEATURE__ANNOTATED_ELEMENT: return SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT;
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
				case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION: return SysMLPackage.METADATA_FEATURE__ANNOTATION;
				case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT: return SysMLPackage.METADATA_FEATURE__ANNOTATED_ELEMENT;
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
