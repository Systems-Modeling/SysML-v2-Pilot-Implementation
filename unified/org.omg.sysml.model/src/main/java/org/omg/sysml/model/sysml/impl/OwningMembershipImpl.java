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

import org.eclipse.emf.ecore.EClass;

import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.OwningMembership;
import org.omg.sysml.model.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Owning Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.OwningMembershipImpl#getOwnedMemberElementId <em>Owned Member Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.OwningMembershipImpl#getOwnedMemberName <em>Owned Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.OwningMembershipImpl#getOwnedMemberShortName <em>Owned Member Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.OwningMembershipImpl#getOwnedMemberElement <em>Owned Member Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OwningMembershipImpl extends MembershipImpl implements OwningMembership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OwningMembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.OWNING_MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnedMemberElementId() {
		return (String)eGet(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberElementId(String newOwnedMemberElementId) {
		eSet(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT_ID, newOwnedMemberElementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnedMemberName() {
		return (String)eGet(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberName(String newOwnedMemberName) {
		eSet(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_NAME, newOwnedMemberName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getOwnedMemberShortName() {
		return (String)eGet(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberShortName(String newOwnedMemberShortName) {
		eSet(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_SHORT_NAME, newOwnedMemberShortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getOwnedMemberElement() {
		return (Element)eGet(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setOwnedMemberElement(Element newOwnedMemberElement) {
		eSet(SysMLPackage.Literals.OWNING_MEMBERSHIP__OWNED_MEMBER_ELEMENT, newOwnedMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getMemberElement() {
		var sourceValue = this.getOwnedMemberElement();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof Element typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof Element typedValue) {
			return typedValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public java.lang.String getMemberElementId() {
		var sourceValue = this.getOwnedMemberElementId();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof java.lang.String typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof java.lang.String typedValue) {
			return typedValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public java.lang.String getMemberName() {
		var sourceValue = this.getOwnedMemberName();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof java.lang.String typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof java.lang.String typedValue) {
			return typedValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public java.lang.String getMemberShortName() {
		var sourceValue = this.getOwnedMemberShortName();
		Object source = sourceValue;
		if (source instanceof Iterable<?> values) {
			for (var value : values) {
				if (value instanceof java.lang.String typedValue) {
					return typedValue;
				}
			}
			return null;
		}
		if (sourceValue instanceof java.lang.String typedValue) {
			return typedValue;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String path() {
		var ownedElement = this.getOwnedMemberElement();
		var qualifiedName = ownedElement == null ? null : ownedElement.getQualifiedName();
		if (qualifiedName != null) {
			return qualifiedName + "/owningMembership";
		}
		var owningRelationship = this.getOwningRelationship();
		var owningRelatedElement = this.getOwningRelatedElement();
		if (owningRelationship == null && owningRelatedElement != null) {
			var index = owningRelatedElement.getOwnedRelationship().indexOf(this) + 1;
			return owningRelatedElement.path() + "/" + Integer.toString(index);
		}
		var relationshipQualifiedName = this.getQualifiedName();
		if (relationshipQualifiedName != null) {
			return relationshipQualifiedName;
		}
		if (owningRelationship != null) {
			var index = owningRelationship.getOwnedRelatedElement().indexOf(this) + 1;
			return owningRelationship.path() + "/" + Integer.toString(index);
		}
		return "";
	}

} //OwningMembershipImpl
