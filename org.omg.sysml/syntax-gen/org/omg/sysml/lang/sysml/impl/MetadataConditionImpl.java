/**
 */
package org.omg.sysml.lang.sysml.impl;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.MetadataCondition;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Condition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataConditionImpl#getAnnotationParameter <em>Annotation Parameter</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataConditionImpl extends MetadataExpressionImpl implements MetadataCondition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataConditionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.METADATA_CONDITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Feature getAnnotationParameter() {
		Feature annotationParameter = basicGetAnnotationParameter();
		return annotationParameter != null && annotationParameter.eIsProxy() ? (Feature)eResolveProxy((InternalEObject)annotationParameter) : annotationParameter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Feature basicGetAnnotationParameter() {
		EList<Feature> parameters = super.getParameter();
		return parameters.isEmpty()? null: parameters.get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setAnnotationParameter(Feature newAnnotationParameter) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetAnnotationParameter() {
		return basicGetAnnotationParameter() != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.METADATA_CONDITION__ANNOTATION_PARAMETER:
				if (resolve) return getAnnotationParameter();
				return basicGetAnnotationParameter();
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
			case SysMLPackage.METADATA_CONDITION__ANNOTATION_PARAMETER:
				setAnnotationParameter((Feature)newValue);
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
			case SysMLPackage.METADATA_CONDITION__ANNOTATION_PARAMETER:
				setAnnotationParameter((Feature)null);
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
			case SysMLPackage.METADATA_CONDITION__PARAMETER:
				return isSetParameter();
			case SysMLPackage.METADATA_CONDITION__ANNOTATION_PARAMETER:
				return isSetAnnotationParameter();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Feature> getParameter() {
		EList<Feature> parameter = new UniqueEList<Feature>();
		Feature annotationParameter = getAnnotationParameter();
		if (annotationParameter != null) {
			parameter.add(annotationParameter);
		}
		return new UnionEObjectEList<Feature>(this, SysMLPackage.Literals.STEP__PARAMETER, parameter.size(), parameter.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetParameter() {
  		return false;
	}

} //MetadataConditionImpl
