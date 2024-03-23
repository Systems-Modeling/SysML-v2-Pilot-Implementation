/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.WrappedException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.omg.sysml.expressions.ModelLevelExpressionEvaluator;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.MetadataAccessExpression;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Access Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataAccessExpressionImpl#getReferencedElement <em>Referenced Element</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataAccessExpressionImpl extends ExpressionImpl implements MetadataAccessExpression {
	/**
	 * The cached value of the '{@link #getReferencedElement() <em>Referenced Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReferencedElement()
	 * @generated
	 * @ordered
	 */
	protected Element referencedElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataAccessExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.METADATA_ACCESS_EXPRESSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Element getReferencedElement() {
		if (referencedElement != null && referencedElement.eIsProxy()) {
			InternalEObject oldReferencedElement = (InternalEObject)referencedElement;
			referencedElement = (Element)eResolveProxy(oldReferencedElement);
			if (referencedElement != oldReferencedElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.METADATA_ACCESS_EXPRESSION__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
			}
		}
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetReferencedElement() {
		return referencedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReferencedElement(Element newReferencedElement) {
		Element oldReferencedElement = referencedElement;
		referencedElement = newReferencedElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.METADATA_ACCESS_EXPRESSION__REFERENCED_ELEMENT, oldReferencedElement, referencedElement));
	}
	
	/**
	 * The cached invocation delegate for the '{@link #metaclassFeature() <em>Metaclass Feature</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #metaclassFeature()
	 * @generated
	 * @ordered
	 */
	protected static final EOperation.Internal.InvocationDelegate METACLASS_FEATURE__EINVOCATION_DELEGATE = ((EOperation.Internal)SysMLPackage.Literals.METADATA_ACCESS_EXPRESSION___METACLASS_FEATURE).getInvocationDelegate();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MetadataFeature metaclassFeature() {
		try {
			return (MetadataFeature)METACLASS_FEATURE__EINVOCATION_DELEGATE.dynamicInvoke(this, null);
		}
		catch (InvocationTargetException ite) {
			throw new WrappedException(ite);
		}
	}

	// Additional overrides
	
	@Override
	public boolean modelLevelEvaluable(EList<Feature> visited) {
		return true;
	}
	
	@Override
	public EList<Element> evaluate(Element target) {
		return ModelLevelExpressionEvaluator.INSTANCE.evaluateMetadataAccess(this, target);
	}
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.METADATA_ACCESS_EXPRESSION__REFERENCED_ELEMENT:
				if (resolve) return getReferencedElement();
				return basicGetReferencedElement();
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
			case SysMLPackage.METADATA_ACCESS_EXPRESSION__REFERENCED_ELEMENT:
				setReferencedElement((Element)newValue);
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
			case SysMLPackage.METADATA_ACCESS_EXPRESSION__REFERENCED_ELEMENT:
				setReferencedElement((Element)null);
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
			case SysMLPackage.METADATA_ACCESS_EXPRESSION__REFERENCED_ELEMENT:
				return referencedElement != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.METADATA_ACCESS_EXPRESSION___METACLASS_FEATURE:
				return metaclassFeature();
		}
		return super.eInvoke(operationID, arguments);
	}

} //MetadataAccessExpressionImpl
