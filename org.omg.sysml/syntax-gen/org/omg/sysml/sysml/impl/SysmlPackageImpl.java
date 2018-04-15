/**
 */
package org.omg.sysml.sysml.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.omg.sysml.behaviors.BehaviorsPackage;

import org.omg.sysml.classification.ClassificationPackage;

import org.omg.sysml.core.CorePackage;

import org.omg.sysml.groups.GroupsPackage;

import org.omg.sysml.sysml.Model;
import org.omg.sysml.sysml.SysmlFactory;
import org.omg.sysml.sysml.SysmlPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysmlPackageImpl extends EPackageImpl implements SysmlPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modelEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.omg.sysml.sysml.SysmlPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private SysmlPackageImpl() {
		super(eNS_URI, SysmlFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link SysmlPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static SysmlPackage init() {
		if (isInited) return (SysmlPackage)EPackage.Registry.INSTANCE.getEPackage(SysmlPackage.eNS_URI);

		// Obtain or create and register package
		SysmlPackageImpl theSysmlPackage = (SysmlPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof SysmlPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new SysmlPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		BehaviorsPackage.eINSTANCE.eClass();
		ClassificationPackage.eINSTANCE.eClass();
		CorePackage.eINSTANCE.eClass();
		GroupsPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theSysmlPackage.createPackageContents();

		// Initialize created meta-data
		theSysmlPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theSysmlPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(SysmlPackage.eNS_URI, theSysmlPackage);
		return theSysmlPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModel() {
		return modelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysmlFactory getSysmlFactory() {
		return (SysmlFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		modelEClass = createEClass(MODEL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		GroupsPackage theGroupsPackage = (GroupsPackage)EPackage.Registry.INSTANCE.getEPackage(GroupsPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		modelEClass.getESuperTypes().add(theGroupsPackage.getNamespace());

		// Initialize classes, features, and operations; add parameters
		initEClass(modelEClass, Model.class, "Model", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //SysmlPackageImpl
