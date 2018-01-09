/**
 */
package org.omg.sysml.kerml.core.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.kerml.core.Comment;
import org.omg.sysml.kerml.core.CorePackage;
import org.omg.sysml.kerml.core.ElementRecord;
import org.omg.sysml.kerml.core.Relationship;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getDocumentation <em>Documentation</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getOwner <em>Owner</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getMemberOfNamespace <em>Member Of Namespace</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getSourceRelationship <em>Source Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getTargetRelationship <em>Target Relationship</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getOwnedComment <em>Owned Comment</em>}</li>
 *   <li>{@link org.omg.sysml.kerml.core.impl.ElementRecordImpl#getOwnedElement <em>Owned Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ElementRecordImpl extends MinimalEObjectImpl.Container implements ElementRecord {
	/**
	 * The default value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENTATION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDocumentation() <em>Documentation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentation()
	 * @generated
	 * @ordered
	 */
	protected String documentation = DOCUMENTATION_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRelationship() <em>Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> relationship;

	/**
	 * The cached value of the '{@link #getMemberOfNamespace() <em>Member Of Namespace</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberOfNamespace()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.kerml.core.Container> memberOfNamespace;

	/**
	 * The cached value of the '{@link #getSourceRelationship() <em>Source Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> sourceRelationship;

	/**
	 * The cached value of the '{@link #getTargetRelationship() <em>Target Relationship</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRelationship()
	 * @generated
	 * @ordered
	 */
	protected EList<Relationship> targetRelationship;

	/**
	 * The cached value of the '{@link #getOwnedComment() <em>Owned Comment</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedComment()
	 * @generated
	 * @ordered
	 */
	protected EList<Comment> ownedComment;

	/**
	 * The cached value of the '{@link #getOwnedElement() <em>Owned Element</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedElement()
	 * @generated
	 * @ordered
	 */
	protected EList<ElementRecord> ownedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ElementRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CorePackage.Literals.ELEMENT_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentation() {
		return documentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentation(String newDocumentation) {
		String oldDocumentation = documentation;
		documentation = newDocumentation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT_RECORD__DOCUMENTATION, oldDocumentation, documentation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementRecord getOwner() {
		if (eContainerFeatureID() != CorePackage.ELEMENT_RECORD__OWNER) return null;
		return (ElementRecord)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwner(ElementRecord newOwner, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newOwner, CorePackage.ELEMENT_RECORD__OWNER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwner(ElementRecord newOwner) {
		if (newOwner != eInternalContainer() || (eContainerFeatureID() != CorePackage.ELEMENT_RECORD__OWNER && newOwner != null)) {
			if (EcoreUtil.isAncestor(this, newOwner))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newOwner != null)
				msgs = ((InternalEObject)newOwner).eInverseAdd(this, CorePackage.ELEMENT_RECORD__OWNED_ELEMENT, ElementRecord.class, msgs);
			msgs = basicSetOwner(newOwner, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT_RECORD__OWNER, newOwner, newOwner));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT_RECORD__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT_RECORD__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getRelationship() {
		if (relationship == null) {
			relationship = new EObjectWithInverseResolvingEList.ManyInverse<Relationship>(Relationship.class, this, CorePackage.ELEMENT_RECORD__RELATIONSHIP, CorePackage.RELATIONSHIP__RELATED);
		}
		return relationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.kerml.core.Container getNamespace() {
		if (eContainerFeatureID() != CorePackage.ELEMENT_RECORD__NAMESPACE) return null;
		return (org.omg.sysml.kerml.core.Container)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNamespace(org.omg.sysml.kerml.core.Container newNamespace, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newNamespace, CorePackage.ELEMENT_RECORD__NAMESPACE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNamespace(org.omg.sysml.kerml.core.Container newNamespace) {
		if (newNamespace != eInternalContainer() || (eContainerFeatureID() != CorePackage.ELEMENT_RECORD__NAMESPACE && newNamespace != null)) {
			if (EcoreUtil.isAncestor(this, newNamespace))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newNamespace != null)
				msgs = ((InternalEObject)newNamespace).eInverseAdd(this, CorePackage.CONTAINER__OWNED_MEMBER, org.omg.sysml.kerml.core.Container.class, msgs);
			msgs = basicSetNamespace(newNamespace, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CorePackage.ELEMENT_RECORD__NAMESPACE, newNamespace, newNamespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.kerml.core.Container> getMemberOfNamespace() {
		if (memberOfNamespace == null) {
			memberOfNamespace = new EObjectWithInverseResolvingEList.ManyInverse<org.omg.sysml.kerml.core.Container>(org.omg.sysml.kerml.core.Container.class, this, CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE, CorePackage.CONTAINER__MEMBER);
		}
		return memberOfNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getSourceRelationship() {
		if (sourceRelationship == null) {
			sourceRelationship = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, CorePackage.ELEMENT_RECORD__SOURCE_RELATIONSHIP, CorePackage.RELATIONSHIP__SOURCE);
		}
		return sourceRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Relationship> getTargetRelationship() {
		if (targetRelationship == null) {
			targetRelationship = new EObjectWithInverseResolvingEList<Relationship>(Relationship.class, this, CorePackage.ELEMENT_RECORD__TARGET_RELATIONSHIP, CorePackage.RELATIONSHIP__TARGET);
		}
		return targetRelationship;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Comment> getOwnedComment() {
		if (ownedComment == null) {
			ownedComment = new EObjectResolvingEList<Comment>(Comment.class, this, CorePackage.ELEMENT_RECORD__OWNED_COMMENT);
		}
		return ownedComment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ElementRecord> getOwnedElement() {
		if (ownedElement == null) {
			ownedElement = new EObjectContainmentWithInverseEList<ElementRecord>(ElementRecord.class, this, CorePackage.ELEMENT_RECORD__OWNED_ELEMENT, CorePackage.ELEMENT_RECORD__OWNER);
		}
		return ownedElement;
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
			case CorePackage.ELEMENT_RECORD__OWNER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetOwner((ElementRecord)otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getRelationship()).basicAdd(otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__NAMESPACE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetNamespace((org.omg.sysml.kerml.core.Container)otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getMemberOfNamespace()).basicAdd(otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__SOURCE_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSourceRelationship()).basicAdd(otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__TARGET_RELATIONSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTargetRelationship()).basicAdd(otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__OWNED_ELEMENT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedElement()).basicAdd(otherEnd, msgs);
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
			case CorePackage.ELEMENT_RECORD__OWNER:
				return basicSetOwner(null, msgs);
			case CorePackage.ELEMENT_RECORD__RELATIONSHIP:
				return ((InternalEList<?>)getRelationship()).basicRemove(otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__NAMESPACE:
				return basicSetNamespace(null, msgs);
			case CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE:
				return ((InternalEList<?>)getMemberOfNamespace()).basicRemove(otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__SOURCE_RELATIONSHIP:
				return ((InternalEList<?>)getSourceRelationship()).basicRemove(otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__TARGET_RELATIONSHIP:
				return ((InternalEList<?>)getTargetRelationship()).basicRemove(otherEnd, msgs);
			case CorePackage.ELEMENT_RECORD__OWNED_ELEMENT:
				return ((InternalEList<?>)getOwnedElement()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CorePackage.ELEMENT_RECORD__OWNER:
				return eInternalContainer().eInverseRemove(this, CorePackage.ELEMENT_RECORD__OWNED_ELEMENT, ElementRecord.class, msgs);
			case CorePackage.ELEMENT_RECORD__NAMESPACE:
				return eInternalContainer().eInverseRemove(this, CorePackage.CONTAINER__OWNED_MEMBER, org.omg.sysml.kerml.core.Container.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CorePackage.ELEMENT_RECORD__DOCUMENTATION:
				return getDocumentation();
			case CorePackage.ELEMENT_RECORD__OWNER:
				return getOwner();
			case CorePackage.ELEMENT_RECORD__TITLE:
				return getTitle();
			case CorePackage.ELEMENT_RECORD__NAME:
				return getName();
			case CorePackage.ELEMENT_RECORD__RELATIONSHIP:
				return getRelationship();
			case CorePackage.ELEMENT_RECORD__NAMESPACE:
				return getNamespace();
			case CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE:
				return getMemberOfNamespace();
			case CorePackage.ELEMENT_RECORD__SOURCE_RELATIONSHIP:
				return getSourceRelationship();
			case CorePackage.ELEMENT_RECORD__TARGET_RELATIONSHIP:
				return getTargetRelationship();
			case CorePackage.ELEMENT_RECORD__OWNED_COMMENT:
				return getOwnedComment();
			case CorePackage.ELEMENT_RECORD__OWNED_ELEMENT:
				return getOwnedElement();
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
			case CorePackage.ELEMENT_RECORD__DOCUMENTATION:
				setDocumentation((String)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__OWNER:
				setOwner((ElementRecord)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__TITLE:
				setTitle((String)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__NAME:
				setName((String)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__RELATIONSHIP:
				getRelationship().clear();
				getRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__NAMESPACE:
				setNamespace((org.omg.sysml.kerml.core.Container)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE:
				getMemberOfNamespace().clear();
				getMemberOfNamespace().addAll((Collection<? extends org.omg.sysml.kerml.core.Container>)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__SOURCE_RELATIONSHIP:
				getSourceRelationship().clear();
				getSourceRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__TARGET_RELATIONSHIP:
				getTargetRelationship().clear();
				getTargetRelationship().addAll((Collection<? extends Relationship>)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__OWNED_COMMENT:
				getOwnedComment().clear();
				getOwnedComment().addAll((Collection<? extends Comment>)newValue);
				return;
			case CorePackage.ELEMENT_RECORD__OWNED_ELEMENT:
				getOwnedElement().clear();
				getOwnedElement().addAll((Collection<? extends ElementRecord>)newValue);
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
			case CorePackage.ELEMENT_RECORD__DOCUMENTATION:
				setDocumentation(DOCUMENTATION_EDEFAULT);
				return;
			case CorePackage.ELEMENT_RECORD__OWNER:
				setOwner((ElementRecord)null);
				return;
			case CorePackage.ELEMENT_RECORD__TITLE:
				setTitle(TITLE_EDEFAULT);
				return;
			case CorePackage.ELEMENT_RECORD__NAME:
				setName(NAME_EDEFAULT);
				return;
			case CorePackage.ELEMENT_RECORD__RELATIONSHIP:
				getRelationship().clear();
				return;
			case CorePackage.ELEMENT_RECORD__NAMESPACE:
				setNamespace((org.omg.sysml.kerml.core.Container)null);
				return;
			case CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE:
				getMemberOfNamespace().clear();
				return;
			case CorePackage.ELEMENT_RECORD__SOURCE_RELATIONSHIP:
				getSourceRelationship().clear();
				return;
			case CorePackage.ELEMENT_RECORD__TARGET_RELATIONSHIP:
				getTargetRelationship().clear();
				return;
			case CorePackage.ELEMENT_RECORD__OWNED_COMMENT:
				getOwnedComment().clear();
				return;
			case CorePackage.ELEMENT_RECORD__OWNED_ELEMENT:
				getOwnedElement().clear();
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
			case CorePackage.ELEMENT_RECORD__DOCUMENTATION:
				return DOCUMENTATION_EDEFAULT == null ? documentation != null : !DOCUMENTATION_EDEFAULT.equals(documentation);
			case CorePackage.ELEMENT_RECORD__OWNER:
				return getOwner() != null;
			case CorePackage.ELEMENT_RECORD__TITLE:
				return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
			case CorePackage.ELEMENT_RECORD__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case CorePackage.ELEMENT_RECORD__RELATIONSHIP:
				return relationship != null && !relationship.isEmpty();
			case CorePackage.ELEMENT_RECORD__NAMESPACE:
				return getNamespace() != null;
			case CorePackage.ELEMENT_RECORD__MEMBER_OF_NAMESPACE:
				return memberOfNamespace != null && !memberOfNamespace.isEmpty();
			case CorePackage.ELEMENT_RECORD__SOURCE_RELATIONSHIP:
				return sourceRelationship != null && !sourceRelationship.isEmpty();
			case CorePackage.ELEMENT_RECORD__TARGET_RELATIONSHIP:
				return targetRelationship != null && !targetRelationship.isEmpty();
			case CorePackage.ELEMENT_RECORD__OWNED_COMMENT:
				return ownedComment != null && !ownedComment.isEmpty();
			case CorePackage.ELEMENT_RECORD__OWNED_ELEMENT:
				return ownedElement != null && !ownedElement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (documentation: ");
		result.append(documentation);
		result.append(", title: ");
		result.append(title);
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //ElementRecordImpl
