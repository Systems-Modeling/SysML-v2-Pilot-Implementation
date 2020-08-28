/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.UniqueEList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.uml2.common.util.UnionEObjectEList;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.RenderingDefinition;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.ViewDefinition;
import org.omg.sysml.lang.sysml.ViewUsage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rendering Usage</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RenderingUsageImpl#getRenderingDefinition <em>Rendering Definition</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenderingUsageImpl extends PartUsageImpl implements RenderingUsage {
	
	public static final String RENDERING_SUBSETTING_BASE_DEFAULT = "Views::renderings";
	public static final String RENDERING_SUBSETTING_SUBRENDERING_DEFAULT = "Views::Rendering::subrenderings";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderingUsageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.RENDERING_USAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public RenderingDefinition getRenderingDefinition() {
		RenderingDefinition renderingDefinition = basicGetRenderingDefinition();
		return renderingDefinition != null && renderingDefinition.eIsProxy() ? (RenderingDefinition)eResolveProxy((InternalEObject)renderingDefinition) : renderingDefinition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public RenderingDefinition basicGetRenderingDefinition() {
		return (RenderingDefinition)super.getPartDefinition().stream().
				filter(RenderingDefinition.class::isInstance).
				findFirst().orElse(null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public void setRenderingDefinition(RenderingDefinition newRenderingDefinition) {
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetRenderingDefinition() {
		return basicGetRenderingDefinition() != null;
	}

	@Override
	protected String getDefaultSupertype() {
		return isSubrendering()? 
					RENDERING_SUBSETTING_SUBRENDERING_DEFAULT:
					RENDERING_SUBSETTING_BASE_DEFAULT;
	}
	
	public boolean isSubrendering() {
		Type owningType = getOwningType();
		return owningType instanceof RenderingDefinition | owningType instanceof RenderingUsage;
	}
	
	@Override
	protected List<? extends Feature> getRelevantFeatures(Type type) {
		return !isParameter() && !isEnd() && isRender()? getRenderFeatures(type):
			   super.getRelevantFeatures(type);
	}
	
	protected List<? extends Feature> getRenderFeatures(Type type) {
		List<Feature> features = type == getOwningType()? type.getOwnedFeature(): type.getFeature();
		return features.stream().filter(RenderingUsage.class::isInstance).collect(Collectors.toList());
	}
	
	public boolean isRender() {
		Type owningType = getOwningType();
		return owningType instanceof ViewDefinition | owningType instanceof ViewUsage;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.RENDERING_USAGE__RENDERING_DEFINITION:
				if (resolve) return getRenderingDefinition();
				return basicGetRenderingDefinition();
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
			case SysMLPackage.RENDERING_USAGE__RENDERING_DEFINITION:
				setRenderingDefinition((RenderingDefinition)newValue);
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
			case SysMLPackage.RENDERING_USAGE__RENDERING_DEFINITION:
				setRenderingDefinition((RenderingDefinition)null);
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
			case SysMLPackage.RENDERING_USAGE__PART_DEFINITION:
				return isSetPartDefinition();
			case SysMLPackage.RENDERING_USAGE__RENDERING_DEFINITION:
				return isSetRenderingDefinition();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<PartDefinition> getPartDefinition() {
		EList<PartDefinition> partDefinition = new UniqueEList<PartDefinition>();
		RenderingDefinition renderingDefinition = getRenderingDefinition();
		if (renderingDefinition != null) {
			partDefinition.add(renderingDefinition);
		}
		return new UnionEObjectEList<PartDefinition>(this, SysMLPackage.Literals.PART_USAGE__PART_DEFINITION, partDefinition.size(), partDefinition.toArray());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetPartDefinition() {
  		return false;
	}

} //RenderingUsageImpl
