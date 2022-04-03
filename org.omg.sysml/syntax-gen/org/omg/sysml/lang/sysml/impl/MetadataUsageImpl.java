/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.common.util.UnionEObjectEList;

import org.omg.sysml.lang.sysml.AnnotatingElement;
import org.omg.sysml.lang.sysml.Annotation;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Metaclass;
import org.omg.sysml.lang.sysml.MetadataFeature;
import org.omg.sysml.lang.sysml.MetadataUsage;
import org.omg.sysml.lang.sysml.Structure;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.ElementUtil;
import org.omg.sysml.util.NonNotifyingEObjectEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Metadata Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataUsageImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataUsageImpl#getAnnotatedElement <em>Annotated Element</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.MetadataUsageImpl#getMetadataDefinition <em>Metadata Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetadataUsageImpl extends ItemUsageImpl implements MetadataUsage {
	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MetadataUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.METADATA_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Annotation> getAnnotation() {
		if (annotation == null) {
			annotation = new EObjectWithInverseResolvingEList<Annotation>(Annotation.class, this, SysMLPackage.METADATA_USAGE__ANNOTATION, SysMLPackage.ANNOTATION__ANNOTATING_ELEMENT);
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<Element> getAnnotatedElement() {
		EList<Element> annotatedElements = new NonNotifyingEObjectEList<>(Element.class, this, SysMLPackage.METADATA_USAGE__ANNOTATED_ELEMENT);
		annotatedElements.addAll(ElementUtil.getAnnotatedElementOf(this));
		return annotatedElements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Metaclass getMetadataDefinition() {
		Metaclass metadataDefinition = basicGetMetadataDefinition();
		return metadataDefinition != null && metadataDefinition.eIsProxy() ? (Metaclass)eResolveProxy((InternalEObject)metadataDefinition) : metadataDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Metaclass basicGetMetadataDefinition() {
		EList<Structure> definitions = super.getItemDefinition();
		if (definitions.isEmpty()) {
			return null;
		} else {
			Structure definition = definitions.get(0);
			return definition instanceof Metaclass? (Metaclass)definition: null;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setMetadataDefinition(Metaclass newMetadataDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetadataDefinition() {
		return basicGetMetadataDefinition() != null;
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
			case SysMLPackage.METADATA_USAGE__ANNOTATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getAnnotation()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.METADATA_USAGE__ANNOTATION:
				return ((InternalEList<?>)getAnnotation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.METADATA_USAGE__ANNOTATION:
				return getAnnotation();
			case SysMLPackage.METADATA_USAGE__ANNOTATED_ELEMENT:
				return getAnnotatedElement();
			case SysMLPackage.METADATA_USAGE__METACLASS:
				if (resolve) return getMetaclass();
				return basicGetMetaclass();
			case SysMLPackage.METADATA_USAGE__METADATA_DEFINITION:
				if (resolve) return getMetadataDefinition();
				return basicGetMetadataDefinition();
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
			case SysMLPackage.METADATA_USAGE__ANNOTATION:
				getAnnotation().clear();
				getAnnotation().addAll((Collection<? extends Annotation>)newValue);
				return;
			case SysMLPackage.METADATA_USAGE__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				getAnnotatedElement().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.METADATA_USAGE__METACLASS:
				setMetaclass((Metaclass)newValue);
				return;
			case SysMLPackage.METADATA_USAGE__METADATA_DEFINITION:
				setMetadataDefinition((Metaclass)newValue);
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
			case SysMLPackage.METADATA_USAGE__ANNOTATION:
				getAnnotation().clear();
				return;
			case SysMLPackage.METADATA_USAGE__ANNOTATED_ELEMENT:
				getAnnotatedElement().clear();
				return;
			case SysMLPackage.METADATA_USAGE__METACLASS:
				setMetaclass((Metaclass)null);
				return;
			case SysMLPackage.METADATA_USAGE__METADATA_DEFINITION:
				setMetadataDefinition((Metaclass)null);
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
			case SysMLPackage.METADATA_USAGE__ANNOTATION:
				return annotation != null && !annotation.isEmpty();
			case SysMLPackage.METADATA_USAGE__ANNOTATED_ELEMENT:
				return !getAnnotatedElement().isEmpty();
			case SysMLPackage.METADATA_USAGE__TYPE:
				return isSetType();
			case SysMLPackage.METADATA_USAGE__METACLASS:
				return isSetMetaclass();
			case SysMLPackage.METADATA_USAGE__ITEM_DEFINITION:
				return isSetItemDefinition();
			case SysMLPackage.METADATA_USAGE__METADATA_DEFINITION:
				return isSetMetadataDefinition();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotatingElement.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.METADATA_USAGE__ANNOTATION: return SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION;
				case SysMLPackage.METADATA_USAGE__ANNOTATED_ELEMENT: return SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MetadataFeature.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.METADATA_USAGE__METACLASS: return SysMLPackage.METADATA_FEATURE__METACLASS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotatingElement.class) {
			switch (baseFeatureID) {
				case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATION: return SysMLPackage.METADATA_USAGE__ANNOTATION;
				case SysMLPackage.ANNOTATING_ELEMENT__ANNOTATED_ELEMENT: return SysMLPackage.METADATA_USAGE__ANNOTATED_ELEMENT;
				default: return -1;
			}
		}
		if (baseClass == MetadataFeature.class) {
			switch (baseFeatureID) {
				case SysMLPackage.METADATA_FEATURE__METACLASS: return SysMLPackage.METADATA_USAGE__METACLASS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getType() {
		@SuppressWarnings("unchecked")
		EList<Type> definition = (EList<Type>)((EList<?>)getDefinition());
		return definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetType() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass getMetaclass() {
		return getMetadataDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Metaclass basicGetMetaclass() {
		return basicGetMetadataDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMetaclass(Metaclass newMetaclass) {
		setMetadataDefinition(newMetaclass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetMetaclass() {
  		return false;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Structure> getItemDefinition() {
		EList<Structure> itemDefinition = new UniqueEList<Structure>();
		Metaclass metadataDefinition = getMetadataDefinition();
		if (metadataDefinition != null) {
			itemDefinition.add(metadataDefinition);
		}
		return new UnionEObjectEList<Structure>(this, SysMLPackage.Literals.ITEM_USAGE__ITEM_DEFINITION, itemDefinition.size(), itemDefinition.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetItemDefinition() {
  		return false;
	}

} //MetadataUsageImpl
