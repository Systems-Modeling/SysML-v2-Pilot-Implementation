/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Annotation</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getAnnotatedElement
 * <em>Annotated Element</em>}</li>
 * <li>{@link org.omg.sysml.lang.sysml.impl.AnnotationImpl#getAnnotatingComment
 * <em>Annotating Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AnnotationImpl extends RelationshipImpl implements Annotation {
	/**
	 * The cached value of the '{@link #getAnnotatedElement() <em>Annotated
	 * Element</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnnotatedElement()
	 * @generated
	 * @ordered
	 */
	protected Element annotatedElement;

	/**
	 * The cached value of the '{@link #getAnnotatingComment() <em>Annotating
	 * Comment</em>}' reference. <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getAnnotatingComment()
	 * @generated
	 * @ordered
	 */
	protected Comment annotatingComment;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	protected AnnotationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ANNOTATION;
	}

	/**
	 * <!-- begin-user-doc --> If the Annotation has an owner, use this as the
	 * default value for its annotatedElement property. <!-- end-user-doc -->
	 */
	public Element getAnnotatedElement() {
		return annotatedElement == null ? basicGetAnnotatedElement() : getAnnotatedElementGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Element getAnnotatedElementGen() {
		if (annotatedElement != null && annotatedElement.eIsProxy()) {
			InternalEObject oldAnnotatedElement = (InternalEObject) annotatedElement;
			annotatedElement = (Element) eResolveProxy(oldAnnotatedElement);
			if (annotatedElement != oldAnnotatedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT, oldAnnotatedElement, annotatedElement));
			}
		}
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	public Element basicGetAnnotatedElement() {
		if (annotatedElement == null) {
			annotatedElement = getOwningRelatedElement();
			if (annotatedElement instanceof Membership) {
				Element ownedElement = ((Membership) annotatedElement).getOwnedMemberElement();
				if (ownedElement != null) {
					annotatedElement = ownedElement;
				}
			}
		}
		return annotatedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAnnotatedElement(Element newAnnotatedElement) {
		Element oldAnnotatedElement = annotatedElement;
		annotatedElement = newAnnotatedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT,
					oldAnnotatedElement, annotatedElement));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetAnnotatedElement() {
		return annotatedElement != null;
	}

	public Comment getAnnotatingComment() {
		return annotatingComment == null ? basicGetAnnotatingComment() : getAnnotatingCommentGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public Comment getAnnotatingCommentGen() {
		if (annotatingComment != null && annotatingComment.eIsProxy()) {
			InternalEObject oldAnnotatingComment = (InternalEObject) annotatingComment;
			annotatingComment = (Comment) eResolveProxy(oldAnnotatingComment);
			if (annotatingComment != oldAnnotatingComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							SysMLPackage.ANNOTATION__ANNOTATING_COMMENT, oldAnnotatingComment, annotatingComment));
			}
		}
		return annotatingComment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // TODO check, not derived
	 */
	public Comment basicGetAnnotatingComment() {
		if (annotatingComment == null) {
			EList<Element> ownedRelatedElements = getOwnedRelatedElement();
			if (!ownedRelatedElements.isEmpty()) {
				Element ownedRelatedElement = ownedRelatedElements.get(0);
				if (ownedRelatedElement instanceof Comment) {
					annotatingComment = (Comment) ownedRelatedElement;
				}
			}
		}
		return annotatingComment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public NotificationChain basicSetAnnotatingComment(Comment newAnnotatingComment, NotificationChain msgs) {
		Comment oldAnnotatingComment = annotatingComment;
		annotatingComment = newAnnotatingComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					SysMLPackage.ANNOTATION__ANNOTATING_COMMENT, oldAnnotatingComment, newAnnotatingComment);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void setAnnotatingComment(Comment newAnnotatingComment) {
		if (newAnnotatingComment != annotatingComment) {
			NotificationChain msgs = null;
			if (annotatingComment != null)
				msgs = ((InternalEObject) annotatingComment).eInverseRemove(this,
						SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT, Comment.class, msgs);
			if (newAnnotatingComment != null)
				msgs = ((InternalEObject) newAnnotatingComment).eInverseAdd(this,
						SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT, Comment.class, msgs);
			msgs = basicSetAnnotatingComment(newAnnotatingComment, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ANNOTATION__ANNOTATING_COMMENT,
					newAnnotatingComment, newAnnotatingComment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetAnnotatingComment() {
		return annotatingComment != null;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Element> getTarget() {
		EList<Element> target = new UniqueEList<Element>();
		Element annotatedElement = getAnnotatedElement();
		if (annotatedElement != null) {
			target.add(annotatedElement);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__TARGET, target.size(),
				target.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetTarget() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public EList<Element> getSource() {
		EList<Element> source = new UniqueEList<Element>();
		Comment annotatingComment = getAnnotatingComment();
		if (annotatingComment != null) {
			source.add(annotatingComment);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.RELATIONSHIP__SOURCE, source.size(),
				source.toArray());
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	public boolean isSetSource() {
		return false;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SysMLPackage.ANNOTATION__ANNOTATING_COMMENT:
			if (annotatingComment != null)
				msgs = ((InternalEObject) annotatingComment).eInverseRemove(this,
						SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT, Comment.class, msgs);
			return basicSetAnnotatingComment((Comment) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case SysMLPackage.ANNOTATION__ANNOTATING_COMMENT:
			return basicSetAnnotatingComment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
			if (resolve)
				return getAnnotatedElement();
			return basicGetAnnotatedElement();
		case SysMLPackage.ANNOTATION__ANNOTATING_COMMENT:
			if (resolve)
				return getAnnotatingComment();
			return basicGetAnnotatingComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
			setAnnotatedElement((Element) newValue);
			return;
		case SysMLPackage.ANNOTATION__ANNOTATING_COMMENT:
			setAnnotatingComment((Comment) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
			setAnnotatedElement((Element) null);
			return;
		case SysMLPackage.ANNOTATION__ANNOTATING_COMMENT:
			setAnnotatingComment((Comment) null);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case SysMLPackage.ANNOTATION__TARGET:
			return isSetTarget();
		case SysMLPackage.ANNOTATION__SOURCE:
			return isSetSource();
		case SysMLPackage.ANNOTATION__ANNOTATED_ELEMENT:
			return isSetAnnotatedElement();
		case SysMLPackage.ANNOTATION__ANNOTATING_COMMENT:
			return isSetAnnotatingComment();
		}
		return super.eIsSet(featureID);
	}

} // AnnotationImpl
