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

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.AnnotatingElement;
import org.omg.sysml.model.sysml.Annotation;
import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.AnnotationImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.AnnotationImpl#getAnnotatingElement <em>Annotating Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.AnnotationImpl#getOwnedAnnotatingElement <em>Owned Annotating Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.AnnotationImpl#getOwningAnnotatedElement <em>Owning Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.AnnotationImpl#getOwningAnnotatingElement <em>Owning Annotating Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends RelationshipImpl implements Annotation {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getAnnotatedElement() {
		return (Element)eGet(SysMLPackage.Literals.ANNOTATION__ANNOTATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotatedElement(Element newAnnotatedElement) {
		eSet(SysMLPackage.Literals.ANNOTATION__ANNOTATED_ELEMENT, newAnnotatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatingElement getAnnotatingElement() {
		return (AnnotatingElement)eGet(SysMLPackage.Literals.ANNOTATION__ANNOTATING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotatingElement(AnnotatingElement newAnnotatingElement) {
		eSet(SysMLPackage.Literals.ANNOTATION__ANNOTATING_ELEMENT, newAnnotatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatingElement getOwnedAnnotatingElement() {
		return (AnnotatingElement)eGet(SysMLPackage.Literals.ANNOTATION__OWNED_ANNOTATING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedAnnotatingElement(AnnotatingElement newOwnedAnnotatingElement) {
		eSet(SysMLPackage.Literals.ANNOTATION__OWNED_ANNOTATING_ELEMENT, newOwnedAnnotatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningAnnotatedElement() {
		return (Element)eGet(SysMLPackage.Literals.ANNOTATION__OWNING_ANNOTATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningAnnotatedElement(Element newOwningAnnotatedElement) {
		eSet(SysMLPackage.Literals.ANNOTATION__OWNING_ANNOTATED_ELEMENT, newOwningAnnotatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public AnnotatingElement getOwningAnnotatingElement() {
		return (AnnotatingElement)eGet(SysMLPackage.Literals.ANNOTATION__OWNING_ANNOTATING_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningAnnotatingElement(AnnotatingElement newOwningAnnotatingElement) {
		eSet(SysMLPackage.Literals.ANNOTATION__OWNING_ANNOTATING_ELEMENT, newOwningAnnotatingElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		var sourceValue = this.getAnnotatedElement();
		Object source = sourceValue;
		var result = new BasicEList<Element>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Element typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Element typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		var sourceValue = this.getAnnotatingElement();
		Object source = sourceValue;
		var result = new BasicEList<Element>();
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Element typedValue) {
					result.add(typedValue);
				}
			}
		} else if (sourceValue instanceof Element typedValue) {
			result.add(typedValue);
		}
		return ECollections.unmodifiableEList(result);
	}

} //AnnotationImpl
