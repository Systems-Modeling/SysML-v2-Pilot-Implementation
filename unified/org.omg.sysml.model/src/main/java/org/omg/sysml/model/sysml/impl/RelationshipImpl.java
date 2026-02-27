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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Relationship;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Relationship</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RelationshipImpl#isIsImplied <em>Is Implied</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RelationshipImpl#getOwnedRelatedElement <em>Owned Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RelationshipImpl#getOwningRelatedElement <em>Owning Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RelationshipImpl#getRelatedElement <em>Related Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RelationshipImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.RelationshipImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class RelationshipImpl extends ElementImpl implements Relationship {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RelationshipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.RELATIONSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isIsImplied() {
		return (Boolean)eGet(SysMLPackage.Literals.RELATIONSHIP__IS_IMPLIED, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setIsImplied(boolean newIsImplied) {
		eSet(SysMLPackage.Literals.RELATIONSHIP__IS_IMPLIED, newIsImplied);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getOwnedRelatedElement() {
		return (EList<Element>)eGet(SysMLPackage.Literals.RELATIONSHIP__OWNED_RELATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwningRelatedElement() {
		return (Element)eGet(SysMLPackage.Literals.RELATIONSHIP__OWNING_RELATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwningRelatedElement(Element newOwningRelatedElement) {
		eSet(SysMLPackage.Literals.RELATIONSHIP__OWNING_RELATED_ELEMENT, newOwningRelatedElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getRelatedElement() {
		return (EList<Element>)eGet(SysMLPackage.Literals.RELATIONSHIP__RELATED_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getSource() {
		return (EList<Element>)eGet(SysMLPackage.Literals.RELATIONSHIP__SOURCE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<Element> getTarget() {
		return (EList<Element>)eGet(SysMLPackage.Literals.RELATIONSHIP__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String path() {
		var owningRelationship = this.getOwningRelationship();
		var owningRelatedElement = this.getOwningRelatedElement();
		if (owningRelationship == null && owningRelatedElement != null) {
			var index = owningRelatedElement.getOwnedRelationship().indexOf(this) + 1;
			return owningRelatedElement.path() + "/" + Integer.toString(index);
		}
		var qualifiedName = this.getQualifiedName();
		if (qualifiedName != null) {
			return qualifiedName;
		}
		if (owningRelationship != null) {
			var index = owningRelationship.getOwnedRelatedElement().indexOf(this) + 1;
			return owningRelationship.path() + "/" + Integer.toString(index);
		}
		return "";
	}

} //RelationshipImpl
