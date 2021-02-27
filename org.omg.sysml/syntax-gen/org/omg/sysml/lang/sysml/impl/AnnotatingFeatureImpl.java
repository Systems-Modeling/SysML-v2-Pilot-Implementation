/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020-2021 Model Driven Solutions, Inc.
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

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.AnnotatingFeature;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.DataType;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotating Feature</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingFeatureImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingFeatureImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingFeatureImpl#getMetadataType <em>Metadata Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AnnotatingFeatureImpl#getOwnedMetadata <em>Owned Metadata</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotatingFeatureImpl extends FeatureImpl implements AnnotatingFeature {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotatingFeatureImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ANNOTATING_FEATURE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getAnnotatedElement() {
		return AnnotatingElementImpl.getAnnotatedElementFor(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectWithInverseResolvingEList<Annotation>(Annotation.class, this, SysMLPackage.ANNOTATING_FEATURE__ANNOTATION, SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public DataType getMetadataType() {
		DataType metadataType = basicGetMetadataType();
		return metadataType != null && metadataType.eIsProxy() ? (DataType)eResolveProxy((InternalEObject)metadataType) : metadataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public DataType basicGetMetadataType() {
		EList<Type> types = super.getType();
		if (types.isEmpty()) {
			return null;
		} else {
			Type type = types.get(0);
			return type instanceof DataType? (DataType)type: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMetadataType(DataType newMetadataType) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataType() {
		return basicGetMetadataType() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<MetadataFeature> getOwnedMetadata() {
		EList<MetadataFeature> ownedMetadata = new NonNotifyingEObjectEList<>(MetadataFeature.class, this, SysMLPackage.ANNOTATING_FEATURE__OWNED_METADATA);
		super.getOwnedFeature().stream().filter(MetadataFeature.class::isInstance).map(MetadataFeature.class::cast).forEachOrdered(ownedMetadata::add);
		return ownedMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedMetadata() {
		return !getOwnedMetadata().isEmpty();
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATION:
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
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATION:
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
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATED_ELEMENT:
				return getAnnotatedElement();
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATION:
				return getAnnotation();
			case SysMLPackage.ANNOTATING_FEATURE__METADATA_TYPE:
				if (resolve) return getMetadataType();
				return basicGetMetadataType();
			case SysMLPackage.ANNOTATING_FEATURE__OWNED_METADATA:
				return getOwnedMetadata();
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
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				getAnnotatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SysMLPackage.ANNOTATING_FEATURE__METADATA_TYPE:
				setMetadataType((DataType)newValue);
				return;
			case SysMLPackage.ANNOTATING_FEATURE__OWNED_METADATA:
				getOwnedMetadata().clear();
				getOwnedMetadata().addAll((Collection<? extends MetadataFeature>)newValue);
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
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				return;
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATION:
				getAnnotation().clear();
				return;
			case SysMLPackage.ANNOTATING_FEATURE__METADATA_TYPE:
				setMetadataType((DataType)null);
				return;
			case SysMLPackage.ANNOTATING_FEATURE__OWNED_METADATA:
				getOwnedMetadata().clear();
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
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATED_ELEMENT:
				return !getAnnotatedElement().isEmpty();
			case SysMLPackage.ANNOTATING_FEATURE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case SysMLPackage.ANNOTATING_FEATURE__TYPE:
				return isSetType();
			case SysMLPackage.ANNOTATING_FEATURE__OWNED_FEATURE:
				return isSetOwnedFeature();
			case SysMLPackage.ANNOTATING_FEATURE__METADATA_TYPE:
				return isSetMetadataType();
			case SysMLPackage.ANNOTATING_FEATURE__OWNED_METADATA:
				return isSetOwnedMetadata();
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
				case SysMLPackage.ANNOTATING_FEATURE__ANNOTATED_ELEMENT: return SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT;
				case SysMLPackage.ANNOTATING_FEATURE__ANNOTATION: return SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION;
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
				case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT: return SysMLPackage.ANNOTATING_FEATURE__ANNOTATED_ELEMENT;
				case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION: return SysMLPackage.ANNOTATING_FEATURE__ANNOTATION;
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
	public EList<Type> getType() {
		EList<Type> type = new UniqueEList<Type>();
		DataType metadataType = getMetadataType();
		if (metadataType != null) {
			type.add(metadataType);
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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getOwnedFeature() {
		@SuppressWarnings("unchecked")
		EList<Feature> ownedMetadata = (EList<Feature>)((EList<?>)getOwnedMetadata());
		return ownedMetadata;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetOwnedFeature() {
  		return false;
	}

} //AnnotatingFeatureImpl
