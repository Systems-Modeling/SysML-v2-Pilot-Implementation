/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TextualRepresentation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Textual Representation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TextualRepresentationImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TextualRepresentationImpl#getBody <em>Body</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.TextualRepresentationImpl#getRepresentedElement <em>Represented Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextualRepresentationImpl extends AnnotatingElementImpl implements TextualRepresentation {
	/**
	 * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected static final String LANGUAGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLanguage()
	 * @generated
	 * @ordered
	 */
	protected String language = LANGUAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected static final String BODY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBody() <em>Body</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBody()
	 * @generated
	 * @ordered
	 */
	protected String body = BODY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextualRepresentationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.TEXTUAL_REPRESENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getLanguage() {
		return language;
	}
	
	@Override
	public void setLanguage(String newLanguage) {
		setLanguageGen(unescapeString(newLanguage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLanguageGen(String newLanguage) {
		String oldLanguage = language;
		language = newLanguage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TEXTUAL_REPRESENTATION__LANGUAGE, oldLanguage, language));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getBody() {
		return body;
	}
	
	@Override
	public void setBody(String newBody) {
		setBodyGen(processCommentBody(newBody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBodyGen(String newBody) {
		String oldBody = body;
		body = newBody;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.TEXTUAL_REPRESENTATION__BODY, oldBody, body));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getRepresentedElement() {
		Element representedElement = basicGetRepresentedElement();
		return representedElement != null && representedElement.eIsProxy() ? (Element)eResolveProxy((InternalEObject)representedElement) : representedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Element basicGetRepresentedElement() {
		return super.getAnnotatedElement().stream().findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setRepresentedElement(Element newRepresentedElement) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRepresentedElement() {
		return basicGetRepresentedElement() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.TEXTUAL_REPRESENTATION__LANGUAGE:
				return getLanguage();
			case SysMLPackage.TEXTUAL_REPRESENTATION__BODY:
				return getBody();
			case SysMLPackage.TEXTUAL_REPRESENTATION__REPRESENTED_ELEMENT:
				if (resolve) return getRepresentedElement();
				return basicGetRepresentedElement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SysMLPackage.TEXTUAL_REPRESENTATION__LANGUAGE:
				setLanguage((String)newValue);
				return;
			case SysMLPackage.TEXTUAL_REPRESENTATION__BODY:
				setBody((String)newValue);
				return;
			case SysMLPackage.TEXTUAL_REPRESENTATION__REPRESENTED_ELEMENT:
				setRepresentedElement((Element)newValue);
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
			case SysMLPackage.TEXTUAL_REPRESENTATION__LANGUAGE:
				setLanguage(LANGUAGE_EDEFAULT);
				return;
			case SysMLPackage.TEXTUAL_REPRESENTATION__BODY:
				setBody(BODY_EDEFAULT);
				return;
			case SysMLPackage.TEXTUAL_REPRESENTATION__REPRESENTED_ELEMENT:
				setRepresentedElement((Element)null);
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
			case SysMLPackage.TEXTUAL_REPRESENTATION__ANNOTATED_ELEMENT:
				return isSetAnnotatedElement();
			case SysMLPackage.TEXTUAL_REPRESENTATION__LANGUAGE:
				return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
			case SysMLPackage.TEXTUAL_REPRESENTATION__BODY:
				return BODY_EDEFAULT == null ? body != null : !BODY_EDEFAULT.equals(body);
			case SysMLPackage.TEXTUAL_REPRESENTATION__REPRESENTED_ELEMENT:
				return isSetRepresentedElement();
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

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (language: ");
		result.append(language);
		result.append(", body: ");
		result.append(body);
		result.append(')');
		return result.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Element> getAnnotatedElement() {
		EList<Element> annotatedElement = new UniqueEList<Element>();
		Element representedElement = getRepresentedElement();
		if (representedElement != null) {
			annotatedElement.add(representedElement);
		}
		return new UnionEObjectEList<Element>(this, SysMLPackage.Literals.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT, annotatedElement.size(), annotatedElement.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotatedElement() {
  		return false;
	}

} //TextualRepresentationImpl
