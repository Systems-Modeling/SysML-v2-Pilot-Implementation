/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Optional;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Comment;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object
 * '<em><b>Comment</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CommentImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CommentImpl#getCommentedElement <em>Commented Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.CommentImpl#getAnnotationForComment <em>Annotation For Comment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CommentImpl extends ElementImpl implements Comment {
	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotationForComment() <em>Annotation For Comment</em>}' reference.
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @see #getAnnotationForComment()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotationForComment;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected CommentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.COMMENT;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return body;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public void setBody(String newBody) {
		String oldBody = body;
		
		System.out.println("=============");
		System.out.println(newBody);
		
		System.out.println("--------------");
		String newLine = System.getProperty("line.separator");
		//last replaceFirst also takes care of multiline's first line after removing /** or /*
		//for example " /**     D<space>" will be "D<space>"
		newBody = newBody.replace("/**", "").replace("/*", "").replace("*/", "").replaceFirst("^\\s*", ""); 
		
		
		
		//java 11 lines
		String[] lines = newBody.split(newLine);
		StringBuilder builder2 = new StringBuilder();
		if ( lines.length == 1 ) 
			builder2.append(lines[0].replaceFirst("^\\s*\\*\\s*", ""));
		else {
			for (int i = 0; i < lines.length; i++) {
				String s = lines[i].replaceFirst("^\\s*\\*\\s*", "");
				builder2 = (s.isEmpty() || s.trim().length() == 0) ? builder2 : builder2.append(s).append(newLine);
			}
		}
		newBody = builder2.toString();
		
		body = newBody;
		System.out.println("\"" + body + "\"");
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.COMMENT__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getCommentedElement() {
		Element commentedElement = basicGetCommentedElement();
		return commentedElement != null && commentedElement.eIsProxy() ? (Element)eResolveProxy((InternalEObject)commentedElement) : commentedElement;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	public Element basicGetCommentedElement() {
		Annotation annotation = this.getAnnotationForComment();
		return annotation == null ? null : annotation.getAnnotatedElement();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT // derived
	 */
	@Override
	public void setCommentedElement(Element newCommentedElement) {
		throw new UnsupportedOperationException();
	}

	public Annotation getAnnotationForComment() {
		return annotationForComment == null ? basicGetAnnotationForComment() : getAnnotationForCommentGen();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation getAnnotationForCommentGen() {
		if (annotationForComment != null && annotationForComment.eIsProxy()) {
			InternalEObject oldAnnotationForComment = (InternalEObject)annotationForComment;
			annotationForComment = (Annotation)eResolveProxy(oldAnnotationForComment);
			if (annotationForComment != oldAnnotationForComment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT, oldAnnotationForComment, annotationForComment));
			}
		}
		return annotationForComment;
	}

	/**
	 * <!-- begin-user-doc --> 
	 * If the Comment has an owner, use this as the default value for its annotationForComment property. 
	 * <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Annotation basicGetAnnotationForComment() {
		if (annotationForComment == null) {
			annotationForComment = (Annotation)Optional.ofNullable(getOwningRelationship()).
					filter(rel->rel instanceof Annotation).orElse(null);
		}
		if (annotationForComment == null) {
			annotationForComment = (Annotation)getOwnedRelationship().stream().
					filter(rel->rel instanceof Annotation).findFirst().orElse(null);
		}
		return annotationForComment;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAnnotationForComment(Annotation newAnnotationForComment, NotificationChain msgs) {
		Annotation oldAnnotationForComment = annotationForComment;
		annotationForComment = newAnnotationForComment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT, oldAnnotationForComment, newAnnotationForComment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotationForComment(Annotation newAnnotationForComment) {
		if (newAnnotationForComment != annotationForComment) {
			NotificationChain msgs = null;
			if (annotationForComment != null)
				msgs = ((InternalEObject)annotationForComment).eInverseRemove(this, SysMLPackage.ANNOTATION__ANNOTATING_COMMENT, Annotation.class, msgs);
			if (newAnnotationForComment != null)
				msgs = ((InternalEObject)newAnnotationForComment).eInverseAdd(this, SysMLPackage.ANNOTATION__ANNOTATING_COMMENT, Annotation.class, msgs);
			msgs = basicSetAnnotationForComment(newAnnotationForComment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT, newAnnotationForComment, newAnnotationForComment));
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT:
				if (annotationForComment != null)
					msgs = ((InternalEObject)annotationForComment).eInverseRemove(this, SysMLPackage.ANNOTATION__ANNOTATING_COMMENT, Annotation.class, msgs);
				return basicSetAnnotationForComment((Annotation)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT:
				return basicSetAnnotationForComment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	@Override
	public void setOwner(Element newOwner) {
		super.setOwner(newOwner);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.COMMENT__BODY:
				return getBody();
			case SysMLPackage.COMMENT__COMMENTED_ELEMENT:
				if (resolve) return getCommentedElement();
				return basicGetCommentedElement();
			case SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT:
				if (resolve) return getAnnotationForComment();
				return basicGetAnnotationForComment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.COMMENT__BODY:
				setBody((String)newValue);
				return;
			case SysMLPackage.COMMENT__COMMENTED_ELEMENT:
				setCommentedElement((Element)newValue);
				return;
			case SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT:
				setAnnotationForComment((Annotation)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SysMLPackage.COMMENT__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case SysMLPackage.COMMENT__COMMENTED_ELEMENT:
				setCommentedElement((Element)null);
				return;
			case SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT:
				setAnnotationForComment((Annotation)null);
				return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		return featureID == SysMLPackage.COMMENT__COMMENTED_ELEMENT ? basicGetCommentedElement() != null
				: eIsSetGen(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSetGen(int featureID) {
		switch (featureID) {
			case SysMLPackage.COMMENT__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case SysMLPackage.COMMENT__COMMENTED_ELEMENT:
				return basicGetCommentedElement() != null;
			case SysMLPackage.COMMENT__ANNOTATION_FOR_COMMENT:
				return annotationForComment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

} // CommentImpl
