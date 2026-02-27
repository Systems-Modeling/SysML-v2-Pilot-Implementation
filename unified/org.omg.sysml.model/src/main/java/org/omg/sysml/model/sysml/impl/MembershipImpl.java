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
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;

import org.omg.sysml.model.sysml.Element;
import org.omg.sysml.model.sysml.Membership;
import org.omg.sysml.model.sysml.Namespace;
import org.omg.sysml.model.sysml.SysMLPackage;
import org.omg.sysml.model.sysml.VisibilityKind;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Membership</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MembershipImpl#getMemberElementId <em>Member Element Id</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MembershipImpl#getMemberName <em>Member Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MembershipImpl#getMemberShortName <em>Member Short Name</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MembershipImpl#getVisibility <em>Visibility</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MembershipImpl#getMemberElement <em>Member Element</em>}</li>
 *   <li>{@link org.omg.sysml.model.sysml.impl.MembershipImpl#getMembershipOwningNamespace <em>Membership Owning Namespace</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MembershipImpl extends RelationshipImpl implements Membership {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MembershipImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.MEMBERSHIP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberElementId() {
		return (String)eGet(SysMLPackage.Literals.MEMBERSHIP__MEMBER_ELEMENT_ID, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberElementId(String newMemberElementId) {
		eSet(SysMLPackage.Literals.MEMBERSHIP__MEMBER_ELEMENT_ID, newMemberElementId);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberName() {
		return (String)eGet(SysMLPackage.Literals.MEMBERSHIP__MEMBER_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberName(String newMemberName) {
		eSet(SysMLPackage.Literals.MEMBERSHIP__MEMBER_NAME, newMemberName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMemberShortName() {
		return (String)eGet(SysMLPackage.Literals.MEMBERSHIP__MEMBER_SHORT_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberShortName(String newMemberShortName) {
		eSet(SysMLPackage.Literals.MEMBERSHIP__MEMBER_SHORT_NAME, newMemberShortName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public VisibilityKind getVisibility() {
		return (VisibilityKind)eGet(SysMLPackage.Literals.MEMBERSHIP__VISIBILITY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVisibility(VisibilityKind newVisibility) {
		eSet(SysMLPackage.Literals.MEMBERSHIP__VISIBILITY, newVisibility);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getMemberElement() {
		return (Element)eGet(SysMLPackage.Literals.MEMBERSHIP__MEMBER_ELEMENT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMemberElement(Element newMemberElement) {
		eSet(SysMLPackage.Literals.MEMBERSHIP__MEMBER_ELEMENT, newMemberElement);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Namespace getMembershipOwningNamespace() {
		return (Namespace)eGet(SysMLPackage.Literals.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMembershipOwningNamespace(Namespace newMembershipOwningNamespace) {
		eSet(SysMLPackage.Literals.MEMBERSHIP__MEMBERSHIP_OWNING_NAMESPACE, newMembershipOwningNamespace);
	}

	/**
	 * The cached invocation delegate for the '{@link #isDistinguishableFrom(org.omg.sysml.model.sysml.Membership) <em>Is Distinguishable From</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isDistinguishableFrom(org.omg.sysml.model.sysml.Membership)
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate IS_DISTINGUISHABLE_FROM_MEMBERSHIP__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isDistinguishableFrom(Membership other) {
		try {
			return (Boolean)IS_DISTINGUISHABLE_FROM_MEMBERSHIP__EINVOCATION_DELEGATE.dynamicInvoke(this, new BasicEList.UnmodifiableEList<Object>(1, new Object[]{other}));
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
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.MEMBERSHIP___IS_DISTINGUISHABLE_FROM__MEMBERSHIP:
				return isDistinguishableFrom((Membership)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		var sourceValue = this.getMemberElement();
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
		var sourceValue = this.getMembershipOwningNamespace();
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

} //MembershipImpl
