/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.uml2.common.util.DerivedEObjectEList;
import org.omg.sysml.lang.sysml.RenderingDefinition;
import org.omg.sysml.lang.sysml.RenderingUsage;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rendering Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.RenderingDefinitionImpl#getRendering <em>Rendering</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenderingDefinitionImpl extends PartDefinitionImpl implements RenderingDefinition {

	public static final String RENDERING_DEFINITION_SUPERCLASS_DEFAULT = "Views::Rendering";
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderingDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.RENDERING_DEFINITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public EList<RenderingUsage> getRendering() {
		return new DerivedEObjectEList<>(RenderingUsage.class, this, SysMLPackage.DEFINITION__OWNED_RENDERING, new int[] {SysMLPackage.DEFINITION__OWNED_USAGE});
	}
	
	@Override
	public String getDefaultSupertype() {
		return RENDERING_DEFINITION_SUPERCLASS_DEFAULT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SysMLPackage.RENDERING_DEFINITION__RENDERING:
				return getRendering();
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
			case SysMLPackage.RENDERING_DEFINITION__RENDERING:
				getRendering().clear();
				getRendering().addAll((Collection<? extends RenderingUsage>)newValue);
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
			case SysMLPackage.RENDERING_DEFINITION__RENDERING:
				getRendering().clear();
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
			case SysMLPackage.RENDERING_DEFINITION__RENDERING:
				return !getRendering().isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RenderingDefinitionImpl
