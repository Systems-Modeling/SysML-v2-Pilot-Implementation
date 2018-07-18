/**
 */
package org.omg.sysml.lang.sysml.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.omg.sysml.lang.sysml.Association;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.EndFeatureMembership;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Generalization;
import org.omg.sysml.lang.sysml.Import;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.SysMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getMembership <em>Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedImport <em>Owned Import</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getMember <em>Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedMember <em>Owned Member</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedMembership <em>Owned Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getImportedMembership <em>Imported Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#isIsAbstract <em>Is Abstract</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedFeature <em>Owned Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedGeneralization <em>Owned Generalization</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getInput <em>Input</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOutput <em>Output</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedFeatureMembership <em>Owned Feature Membership</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwningFeature <em>Owning Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getRelatedType <em>Related Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getSourceType <em>Source Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getTargetType <em>Target Type</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getParticipantFeature <em>Participant Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getSourceParticipantFeature <em>Source Participant Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getTargetParticipantFeature <em>Target Participant Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getEndFeature <em>End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getTargetEndFeature <em>Target End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getSourceEndFeature <em>Source End Feature</em>}</li>
 *   <li>{@link org.omg.sysml.lang.sysml.impl.AssociationImpl#getOwnedEndFeatureMembership <em>Owned End Feature Membership</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends RelationshipImpl implements Association {
	/**
	 * The cached value of the '{@link #getMembership() <em>Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> membership;

	/**
	 * The cached value of the '{@link #getOwnedImport() <em>Owned Import</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedImport()
	 * @generated
	 * @ordered
	 */
	protected EList<Import> ownedImport;

	/**
	 * The cached value of the '{@link #getMember() <em>Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> member;

	/**
	 * The cached value of the '{@link #getOwnedMember() <em>Owned Member</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMember()
	 * @generated
	 * @ordered
	 */
	protected EList<Element> ownedMember;

	/**
	 * The cached value of the '{@link #getOwnedMembership() <em>Owned Membership</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> ownedMembership;

	/**
	 * The cached value of the '{@link #getImportedMembership() <em>Imported Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportedMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<Membership> importedMembership;

	/**
	 * The default value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ABSTRACT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAbstract() <em>Is Abstract</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAbstract()
	 * @generated
	 * @ordered
	 */
	protected boolean isAbstract = IS_ABSTRACT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> feature;

	/**
	 * The cached value of the '{@link #getOwnedFeature() <em>Owned Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> ownedFeature;

	/**
	 * The cached value of the '{@link #getOwnedGeneralization() <em>Owned Generalization</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedGeneralization()
	 * @generated
	 * @ordered
	 */
	protected EList<Generalization> ownedGeneralization;

	/**
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> input;

	/**
	 * The cached value of the '{@link #getOutput() <em>Output</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutput()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> output;

	/**
	 * The cached value of the '{@link #getOwnedFeatureMembership() <em>Owned Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<FeatureMembership> ownedFeatureMembership;

	/**
	 * The cached value of the '{@link #getOwningFeature() <em>Owning Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwningFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature owningFeature;

	/**
	 * The cached value of the '{@link #getRelatedType() <em>Related Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRelatedType()
	 * @generated
	 * @ordered
	 */
	protected EList<org.omg.sysml.lang.sysml.Class> relatedType;

	/**
	 * The cached value of the '{@link #getSourceType() <em>Source Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceType()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class sourceType;

	/**
	 * The cached value of the '{@link #getTargetType() <em>Target Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetType()
	 * @generated
	 * @ordered
	 */
	protected org.omg.sysml.lang.sysml.Class targetType;

	/**
	 * The cached value of the '{@link #getParticipantFeature() <em>Participant Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipantFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> participantFeature;

	/**
	 * The cached value of the '{@link #getSourceParticipantFeature() <em>Source Participant Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceParticipantFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature sourceParticipantFeature;

	/**
	 * The cached value of the '{@link #getTargetParticipantFeature() <em>Target Participant Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetParticipantFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature targetParticipantFeature;

	/**
	 * The cached value of the '{@link #getEndFeature() <em>End Feature</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEndFeature()
	 * @generated
	 * @ordered
	 */
	protected EList<Feature> endFeature;

	/**
	 * The cached value of the '{@link #getTargetEndFeature() <em>Target End Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetEndFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature targetEndFeature;

	/**
	 * The cached value of the '{@link #getSourceEndFeature() <em>Source End Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceEndFeature()
	 * @generated
	 * @ordered
	 */
	protected Feature sourceEndFeature;

	/**
	 * The cached value of the '{@link #getOwnedEndFeatureMembership() <em>Owned End Feature Membership</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedEndFeatureMembership()
	 * @generated
	 * @ordered
	 */
	protected EList<EndFeatureMembership> ownedEndFeatureMembership;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SysMLPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> getMembership() {
		if (membership == null) {
			membership = new EObjectResolvingEList<Membership>(Membership.class, this, SysMLPackage.ASSOCIATION__MEMBERSHIP);
		}
		return membership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Import> getOwnedImport() {
		if (ownedImport == null) {
			ownedImport = new EObjectContainmentWithInverseEList<Import>(Import.class, this, SysMLPackage.ASSOCIATION__OWNED_IMPORT, SysMLPackage.IMPORT__IMPORTING_PACKAGE);
		}
		return ownedImport;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getMember() {
		if (member == null) {
			member = new EObjectResolvingEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION__MEMBER);
		}
		return member;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Element> getOwnedMember() {
		if (ownedMember == null) {
			ownedMember = new EObjectWithInverseResolvingEList<Element>(Element.class, this, SysMLPackage.ASSOCIATION__OWNED_MEMBER, SysMLPackage.ELEMENT__OWNING_NAMESPACE);
		}
		return ownedMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> getOwnedMembership() {
		if (ownedMembership == null) {
			ownedMembership = new EObjectContainmentWithInverseEList<Membership>(Membership.class, this, SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP, SysMLPackage.MEMBERSHIP__OWNING_PACKAGE);
		}
		return ownedMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> getImportedMembership() {
		if (importedMembership == null) {
			importedMembership = new EObjectResolvingEList<Membership>(Membership.class, this, SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP);
		}
		return importedMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAbstract() {
		return isAbstract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAbstract(boolean newIsAbstract) {
		boolean oldIsAbstract = isAbstract;
		isAbstract = newIsAbstract;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__IS_ABSTRACT, oldIsAbstract, isAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getFeature() {
		if (feature == null) {
			feature = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.ASSOCIATION__FEATURE);
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getOwnedFeature() {
		if (ownedFeature == null) {
			ownedFeature = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, SysMLPackage.ASSOCIATION__OWNED_FEATURE, SysMLPackage.FEATURE__OWNING_CLASS);
		}
		return ownedFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Generalization> getOwnedGeneralization() {
		if (ownedGeneralization == null) {
			ownedGeneralization = new EObjectWithInverseResolvingEList<Generalization>(Generalization.class, this, SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION, SysMLPackage.GENERALIZATION__OWNING_CLASS);
		}
		return ownedGeneralization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getInput() {
		if (input == null) {
			input = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.ASSOCIATION__INPUT);
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getOutput() {
		if (output == null) {
			output = new EObjectResolvingEList<Feature>(Feature.class, this, SysMLPackage.ASSOCIATION__OUTPUT);
		}
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FeatureMembership> getOwnedFeatureMembership() {
		if (ownedFeatureMembership == null) {
			ownedFeatureMembership = new EObjectWithInverseResolvingEList<FeatureMembership>(FeatureMembership.class, this, SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP, SysMLPackage.FEATURE_MEMBERSHIP__OWNING_CLASS);
		}
		return ownedFeatureMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getOwningFeature() {
		if (owningFeature != null && owningFeature.eIsProxy()) {
			InternalEObject oldOwningFeature = (InternalEObject)owningFeature;
			owningFeature = (Feature)eResolveProxy(oldOwningFeature);
			if (owningFeature != oldOwningFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ASSOCIATION__OWNING_FEATURE, oldOwningFeature, owningFeature));
			}
		}
		return owningFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetOwningFeature() {
		return owningFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetOwningFeature(Feature newOwningFeature, NotificationChain msgs) {
		Feature oldOwningFeature = owningFeature;
		owningFeature = newOwningFeature;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__OWNING_FEATURE, oldOwningFeature, newOwningFeature);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwningFeature(Feature newOwningFeature) {
		if (newOwningFeature != owningFeature) {
			NotificationChain msgs = null;
			if (owningFeature != null)
				msgs = ((InternalEObject)owningFeature).eInverseRemove(this, SysMLPackage.FEATURE__OWNED_TYPE, Feature.class, msgs);
			if (newOwningFeature != null)
				msgs = ((InternalEObject)newOwningFeature).eInverseAdd(this, SysMLPackage.FEATURE__OWNED_TYPE, Feature.class, msgs);
			msgs = basicSetOwningFeature(newOwningFeature, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__OWNING_FEATURE, newOwningFeature, newOwningFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<org.omg.sysml.lang.sysml.Class> getRelatedType() {
		if (relatedType == null) {
			relatedType = new EObjectResolvingEList<org.omg.sysml.lang.sysml.Class>(org.omg.sysml.lang.sysml.Class.class, this, SysMLPackage.ASSOCIATION__RELATED_TYPE);
		}
		return relatedType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getSourceType() {
		if (sourceType != null && sourceType.eIsProxy()) {
			InternalEObject oldSourceType = (InternalEObject)sourceType;
			sourceType = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldSourceType);
			if (sourceType != oldSourceType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ASSOCIATION__SOURCE_TYPE, oldSourceType, sourceType));
			}
		}
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetSourceType() {
		return sourceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceType(org.omg.sysml.lang.sysml.Class newSourceType) {
		org.omg.sysml.lang.sysml.Class oldSourceType = sourceType;
		sourceType = newSourceType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__SOURCE_TYPE, oldSourceType, sourceType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class getTargetType() {
		if (targetType != null && targetType.eIsProxy()) {
			InternalEObject oldTargetType = (InternalEObject)targetType;
			targetType = (org.omg.sysml.lang.sysml.Class)eResolveProxy(oldTargetType);
			if (targetType != oldTargetType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ASSOCIATION__TARGET_TYPE, oldTargetType, targetType));
			}
		}
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.omg.sysml.lang.sysml.Class basicGetTargetType() {
		return targetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetType(org.omg.sysml.lang.sysml.Class newTargetType) {
		org.omg.sysml.lang.sysml.Class oldTargetType = targetType;
		targetType = newTargetType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__TARGET_TYPE, oldTargetType, targetType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getParticipantFeature() {
		if (participantFeature == null) {
			participantFeature = new EObjectWithInverseResolvingEList.ManyInverse<Feature>(Feature.class, this, SysMLPackage.ASSOCIATION__PARTICIPANT_FEATURE, SysMLPackage.FEATURE__PARTICIPANT_OF_ASSOCIATION);
		}
		return participantFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSourceParticipantFeature() {
		if (sourceParticipantFeature != null && sourceParticipantFeature.eIsProxy()) {
			InternalEObject oldSourceParticipantFeature = (InternalEObject)sourceParticipantFeature;
			sourceParticipantFeature = (Feature)eResolveProxy(oldSourceParticipantFeature);
			if (sourceParticipantFeature != oldSourceParticipantFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ASSOCIATION__SOURCE_PARTICIPANT_FEATURE, oldSourceParticipantFeature, sourceParticipantFeature));
			}
		}
		return sourceParticipantFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSourceParticipantFeature() {
		return sourceParticipantFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceParticipantFeature(Feature newSourceParticipantFeature) {
		Feature oldSourceParticipantFeature = sourceParticipantFeature;
		sourceParticipantFeature = newSourceParticipantFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__SOURCE_PARTICIPANT_FEATURE, oldSourceParticipantFeature, sourceParticipantFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getTargetParticipantFeature() {
		if (targetParticipantFeature != null && targetParticipantFeature.eIsProxy()) {
			InternalEObject oldTargetParticipantFeature = (InternalEObject)targetParticipantFeature;
			targetParticipantFeature = (Feature)eResolveProxy(oldTargetParticipantFeature);
			if (targetParticipantFeature != oldTargetParticipantFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ASSOCIATION__TARGET_PARTICIPANT_FEATURE, oldTargetParticipantFeature, targetParticipantFeature));
			}
		}
		return targetParticipantFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetTargetParticipantFeature() {
		return targetParticipantFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetParticipantFeature(Feature newTargetParticipantFeature) {
		Feature oldTargetParticipantFeature = targetParticipantFeature;
		targetParticipantFeature = newTargetParticipantFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__TARGET_PARTICIPANT_FEATURE, oldTargetParticipantFeature, targetParticipantFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Feature> getEndFeature() {
		if (endFeature == null) {
			endFeature = new EObjectWithInverseResolvingEList<Feature>(Feature.class, this, SysMLPackage.ASSOCIATION__END_FEATURE, SysMLPackage.FEATURE__END_OF_ASSOCIATION);
		}
		return endFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getTargetEndFeature() {
		if (targetEndFeature != null && targetEndFeature.eIsProxy()) {
			InternalEObject oldTargetEndFeature = (InternalEObject)targetEndFeature;
			targetEndFeature = (Feature)eResolveProxy(oldTargetEndFeature);
			if (targetEndFeature != oldTargetEndFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ASSOCIATION__TARGET_END_FEATURE, oldTargetEndFeature, targetEndFeature));
			}
		}
		return targetEndFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetTargetEndFeature() {
		return targetEndFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetEndFeature(Feature newTargetEndFeature) {
		Feature oldTargetEndFeature = targetEndFeature;
		targetEndFeature = newTargetEndFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__TARGET_END_FEATURE, oldTargetEndFeature, targetEndFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature getSourceEndFeature() {
		if (sourceEndFeature != null && sourceEndFeature.eIsProxy()) {
			InternalEObject oldSourceEndFeature = (InternalEObject)sourceEndFeature;
			sourceEndFeature = (Feature)eResolveProxy(oldSourceEndFeature);
			if (sourceEndFeature != oldSourceEndFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SysMLPackage.ASSOCIATION__SOURCE_END_FEATURE, oldSourceEndFeature, sourceEndFeature));
			}
		}
		return sourceEndFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Feature basicGetSourceEndFeature() {
		return sourceEndFeature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceEndFeature(Feature newSourceEndFeature) {
		Feature oldSourceEndFeature = sourceEndFeature;
		sourceEndFeature = newSourceEndFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SysMLPackage.ASSOCIATION__SOURCE_END_FEATURE, oldSourceEndFeature, sourceEndFeature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EndFeatureMembership> getOwnedEndFeatureMembership() {
		if (ownedEndFeatureMembership == null) {
			ownedEndFeatureMembership = new EObjectWithInverseResolvingEList<EndFeatureMembership>(EndFeatureMembership.class, this, SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP, SysMLPackage.END_FEATURE_MEMBERSHIP__OWNING_ASSOCIATION);
		}
		return ownedEndFeatureMembership;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String nameOf(Element element) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Membership> excludeCollisions(EList<Membership> mem) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
			case SysMLPackage.ASSOCIATION__OWNED_IMPORT:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedImport()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMember()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedMembership()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedGeneralization()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedFeatureMembership()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNING_FEATURE:
				if (owningFeature != null)
					msgs = ((InternalEObject)owningFeature).eInverseRemove(this, SysMLPackage.FEATURE__OWNED_TYPE, Feature.class, msgs);
				return basicSetOwningFeature((Feature)otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__PARTICIPANT_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getParticipantFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__END_FEATURE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEndFeature()).basicAdd(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedEndFeatureMembership()).basicAdd(otherEnd, msgs);
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
			case SysMLPackage.ASSOCIATION__OWNED_IMPORT:
				return ((InternalEList<?>)getOwnedImport()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_MEMBER:
				return ((InternalEList<?>)getOwnedMember()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedMembership()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE:
				return ((InternalEList<?>)getOwnedFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION:
				return ((InternalEList<?>)getOwnedGeneralization()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedFeatureMembership()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNING_FEATURE:
				return basicSetOwningFeature(null, msgs);
			case SysMLPackage.ASSOCIATION__PARTICIPANT_FEATURE:
				return ((InternalEList<?>)getParticipantFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__END_FEATURE:
				return ((InternalEList<?>)getEndFeature()).basicRemove(otherEnd, msgs);
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return ((InternalEList<?>)getOwnedEndFeatureMembership()).basicRemove(otherEnd, msgs);
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
			case SysMLPackage.ASSOCIATION__MEMBERSHIP:
				return getMembership();
			case SysMLPackage.ASSOCIATION__OWNED_IMPORT:
				return getOwnedImport();
			case SysMLPackage.ASSOCIATION__MEMBER:
				return getMember();
			case SysMLPackage.ASSOCIATION__OWNED_MEMBER:
				return getOwnedMember();
			case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP:
				return getOwnedMembership();
			case SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP:
				return getImportedMembership();
			case SysMLPackage.ASSOCIATION__IS_ABSTRACT:
				return isIsAbstract();
			case SysMLPackage.ASSOCIATION__FEATURE:
				return getFeature();
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE:
				return getOwnedFeature();
			case SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION:
				return getOwnedGeneralization();
			case SysMLPackage.ASSOCIATION__INPUT:
				return getInput();
			case SysMLPackage.ASSOCIATION__OUTPUT:
				return getOutput();
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				return getOwnedFeatureMembership();
			case SysMLPackage.ASSOCIATION__OWNING_FEATURE:
				if (resolve) return getOwningFeature();
				return basicGetOwningFeature();
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				return getRelatedType();
			case SysMLPackage.ASSOCIATION__SOURCE_TYPE:
				if (resolve) return getSourceType();
				return basicGetSourceType();
			case SysMLPackage.ASSOCIATION__TARGET_TYPE:
				if (resolve) return getTargetType();
				return basicGetTargetType();
			case SysMLPackage.ASSOCIATION__PARTICIPANT_FEATURE:
				return getParticipantFeature();
			case SysMLPackage.ASSOCIATION__SOURCE_PARTICIPANT_FEATURE:
				if (resolve) return getSourceParticipantFeature();
				return basicGetSourceParticipantFeature();
			case SysMLPackage.ASSOCIATION__TARGET_PARTICIPANT_FEATURE:
				if (resolve) return getTargetParticipantFeature();
				return basicGetTargetParticipantFeature();
			case SysMLPackage.ASSOCIATION__END_FEATURE:
				return getEndFeature();
			case SysMLPackage.ASSOCIATION__TARGET_END_FEATURE:
				if (resolve) return getTargetEndFeature();
				return basicGetTargetEndFeature();
			case SysMLPackage.ASSOCIATION__SOURCE_END_FEATURE:
				if (resolve) return getSourceEndFeature();
				return basicGetSourceEndFeature();
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return getOwnedEndFeatureMembership();
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
			case SysMLPackage.ASSOCIATION__MEMBERSHIP:
				getMembership().clear();
				getMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_IMPORT:
				getOwnedImport().clear();
				getOwnedImport().addAll((Collection<? extends Import>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__MEMBER:
				getMember().clear();
				getMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				getOwnedMember().addAll((Collection<? extends Element>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
				getOwnedMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				getImportedMembership().addAll((Collection<? extends Membership>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract((Boolean)newValue);
				return;
			case SysMLPackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				getFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE:
				getOwnedFeature().clear();
				getOwnedFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				getOwnedGeneralization().addAll((Collection<? extends Generalization>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__INPUT:
				getInput().clear();
				getInput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OUTPUT:
				getOutput().clear();
				getOutput().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				getOwnedFeatureMembership().addAll((Collection<? extends FeatureMembership>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNING_FEATURE:
				setOwningFeature((Feature)newValue);
				return;
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				getRelatedType().clear();
				getRelatedType().addAll((Collection<? extends org.omg.sysml.lang.sysml.Class>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__SOURCE_TYPE:
				setSourceType((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.ASSOCIATION__TARGET_TYPE:
				setTargetType((org.omg.sysml.lang.sysml.Class)newValue);
				return;
			case SysMLPackage.ASSOCIATION__PARTICIPANT_FEATURE:
				getParticipantFeature().clear();
				getParticipantFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__SOURCE_PARTICIPANT_FEATURE:
				setSourceParticipantFeature((Feature)newValue);
				return;
			case SysMLPackage.ASSOCIATION__TARGET_PARTICIPANT_FEATURE:
				setTargetParticipantFeature((Feature)newValue);
				return;
			case SysMLPackage.ASSOCIATION__END_FEATURE:
				getEndFeature().clear();
				getEndFeature().addAll((Collection<? extends Feature>)newValue);
				return;
			case SysMLPackage.ASSOCIATION__TARGET_END_FEATURE:
				setTargetEndFeature((Feature)newValue);
				return;
			case SysMLPackage.ASSOCIATION__SOURCE_END_FEATURE:
				setSourceEndFeature((Feature)newValue);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				getOwnedEndFeatureMembership().clear();
				getOwnedEndFeatureMembership().addAll((Collection<? extends EndFeatureMembership>)newValue);
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
			case SysMLPackage.ASSOCIATION__MEMBERSHIP:
				getMembership().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNED_IMPORT:
				getOwnedImport().clear();
				return;
			case SysMLPackage.ASSOCIATION__MEMBER:
				getMember().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNED_MEMBER:
				getOwnedMember().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP:
				getOwnedMembership().clear();
				return;
			case SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP:
				getImportedMembership().clear();
				return;
			case SysMLPackage.ASSOCIATION__IS_ABSTRACT:
				setIsAbstract(IS_ABSTRACT_EDEFAULT);
				return;
			case SysMLPackage.ASSOCIATION__FEATURE:
				getFeature().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE:
				getOwnedFeature().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION:
				getOwnedGeneralization().clear();
				return;
			case SysMLPackage.ASSOCIATION__INPUT:
				getInput().clear();
				return;
			case SysMLPackage.ASSOCIATION__OUTPUT:
				getOutput().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				getOwnedFeatureMembership().clear();
				return;
			case SysMLPackage.ASSOCIATION__OWNING_FEATURE:
				setOwningFeature((Feature)null);
				return;
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				getRelatedType().clear();
				return;
			case SysMLPackage.ASSOCIATION__SOURCE_TYPE:
				setSourceType((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.ASSOCIATION__TARGET_TYPE:
				setTargetType((org.omg.sysml.lang.sysml.Class)null);
				return;
			case SysMLPackage.ASSOCIATION__PARTICIPANT_FEATURE:
				getParticipantFeature().clear();
				return;
			case SysMLPackage.ASSOCIATION__SOURCE_PARTICIPANT_FEATURE:
				setSourceParticipantFeature((Feature)null);
				return;
			case SysMLPackage.ASSOCIATION__TARGET_PARTICIPANT_FEATURE:
				setTargetParticipantFeature((Feature)null);
				return;
			case SysMLPackage.ASSOCIATION__END_FEATURE:
				getEndFeature().clear();
				return;
			case SysMLPackage.ASSOCIATION__TARGET_END_FEATURE:
				setTargetEndFeature((Feature)null);
				return;
			case SysMLPackage.ASSOCIATION__SOURCE_END_FEATURE:
				setSourceEndFeature((Feature)null);
				return;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				getOwnedEndFeatureMembership().clear();
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
			case SysMLPackage.ASSOCIATION__MEMBERSHIP:
				return membership != null && !membership.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNED_IMPORT:
				return ownedImport != null && !ownedImport.isEmpty();
			case SysMLPackage.ASSOCIATION__MEMBER:
				return member != null && !member.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNED_MEMBER:
				return ownedMember != null && !ownedMember.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP:
				return ownedMembership != null && !ownedMembership.isEmpty();
			case SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP:
				return importedMembership != null && !importedMembership.isEmpty();
			case SysMLPackage.ASSOCIATION__IS_ABSTRACT:
				return isAbstract != IS_ABSTRACT_EDEFAULT;
			case SysMLPackage.ASSOCIATION__FEATURE:
				return feature != null && !feature.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE:
				return ownedFeature != null && !ownedFeature.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION:
				return ownedGeneralization != null && !ownedGeneralization.isEmpty();
			case SysMLPackage.ASSOCIATION__INPUT:
				return input != null && !input.isEmpty();
			case SysMLPackage.ASSOCIATION__OUTPUT:
				return output != null && !output.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP:
				return ownedFeatureMembership != null && !ownedFeatureMembership.isEmpty();
			case SysMLPackage.ASSOCIATION__OWNING_FEATURE:
				return owningFeature != null;
			case SysMLPackage.ASSOCIATION__RELATED_TYPE:
				return relatedType != null && !relatedType.isEmpty();
			case SysMLPackage.ASSOCIATION__SOURCE_TYPE:
				return sourceType != null;
			case SysMLPackage.ASSOCIATION__TARGET_TYPE:
				return targetType != null;
			case SysMLPackage.ASSOCIATION__PARTICIPANT_FEATURE:
				return participantFeature != null && !participantFeature.isEmpty();
			case SysMLPackage.ASSOCIATION__SOURCE_PARTICIPANT_FEATURE:
				return sourceParticipantFeature != null;
			case SysMLPackage.ASSOCIATION__TARGET_PARTICIPANT_FEATURE:
				return targetParticipantFeature != null;
			case SysMLPackage.ASSOCIATION__END_FEATURE:
				return endFeature != null && !endFeature.isEmpty();
			case SysMLPackage.ASSOCIATION__TARGET_END_FEATURE:
				return targetEndFeature != null;
			case SysMLPackage.ASSOCIATION__SOURCE_END_FEATURE:
				return sourceEndFeature != null;
			case SysMLPackage.ASSOCIATION__OWNED_END_FEATURE_MEMBERSHIP:
				return ownedEndFeatureMembership != null && !ownedEndFeatureMembership.isEmpty();
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
		if (baseClass == org.omg.sysml.lang.sysml.Package.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ASSOCIATION__MEMBERSHIP: return SysMLPackage.PACKAGE__MEMBERSHIP;
				case SysMLPackage.ASSOCIATION__OWNED_IMPORT: return SysMLPackage.PACKAGE__OWNED_IMPORT;
				case SysMLPackage.ASSOCIATION__MEMBER: return SysMLPackage.PACKAGE__MEMBER;
				case SysMLPackage.ASSOCIATION__OWNED_MEMBER: return SysMLPackage.PACKAGE__OWNED_MEMBER;
				case SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP: return SysMLPackage.PACKAGE__OWNED_MEMBERSHIP;
				case SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP: return SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.lang.sysml.Class.class) {
			switch (derivedFeatureID) {
				case SysMLPackage.ASSOCIATION__IS_ABSTRACT: return SysMLPackage.CLASS__IS_ABSTRACT;
				case SysMLPackage.ASSOCIATION__FEATURE: return SysMLPackage.CLASS__FEATURE;
				case SysMLPackage.ASSOCIATION__OWNED_FEATURE: return SysMLPackage.CLASS__OWNED_FEATURE;
				case SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION: return SysMLPackage.CLASS__OWNED_GENERALIZATION;
				case SysMLPackage.ASSOCIATION__INPUT: return SysMLPackage.CLASS__INPUT;
				case SysMLPackage.ASSOCIATION__OUTPUT: return SysMLPackage.CLASS__OUTPUT;
				case SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP: return SysMLPackage.CLASS__OWNED_FEATURE_MEMBERSHIP;
				case SysMLPackage.ASSOCIATION__OWNING_FEATURE: return SysMLPackage.CLASS__OWNING_FEATURE;
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
		if (baseClass == org.omg.sysml.lang.sysml.Package.class) {
			switch (baseFeatureID) {
				case SysMLPackage.PACKAGE__MEMBERSHIP: return SysMLPackage.ASSOCIATION__MEMBERSHIP;
				case SysMLPackage.PACKAGE__OWNED_IMPORT: return SysMLPackage.ASSOCIATION__OWNED_IMPORT;
				case SysMLPackage.PACKAGE__MEMBER: return SysMLPackage.ASSOCIATION__MEMBER;
				case SysMLPackage.PACKAGE__OWNED_MEMBER: return SysMLPackage.ASSOCIATION__OWNED_MEMBER;
				case SysMLPackage.PACKAGE__OWNED_MEMBERSHIP: return SysMLPackage.ASSOCIATION__OWNED_MEMBERSHIP;
				case SysMLPackage.PACKAGE__IMPORTED_MEMBERSHIP: return SysMLPackage.ASSOCIATION__IMPORTED_MEMBERSHIP;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.lang.sysml.Class.class) {
			switch (baseFeatureID) {
				case SysMLPackage.CLASS__IS_ABSTRACT: return SysMLPackage.ASSOCIATION__IS_ABSTRACT;
				case SysMLPackage.CLASS__FEATURE: return SysMLPackage.ASSOCIATION__FEATURE;
				case SysMLPackage.CLASS__OWNED_FEATURE: return SysMLPackage.ASSOCIATION__OWNED_FEATURE;
				case SysMLPackage.CLASS__OWNED_GENERALIZATION: return SysMLPackage.ASSOCIATION__OWNED_GENERALIZATION;
				case SysMLPackage.CLASS__INPUT: return SysMLPackage.ASSOCIATION__INPUT;
				case SysMLPackage.CLASS__OUTPUT: return SysMLPackage.ASSOCIATION__OUTPUT;
				case SysMLPackage.CLASS__OWNED_FEATURE_MEMBERSHIP: return SysMLPackage.ASSOCIATION__OWNED_FEATURE_MEMBERSHIP;
				case SysMLPackage.CLASS__OWNING_FEATURE: return SysMLPackage.ASSOCIATION__OWNING_FEATURE;
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
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == org.omg.sysml.lang.sysml.Package.class) {
			switch (baseOperationID) {
				case SysMLPackage.PACKAGE___NAME_OF__ELEMENT: return SysMLPackage.ASSOCIATION___NAME_OF__ELEMENT;
				case SysMLPackage.PACKAGE___EXCLUDE_COLLISIONS__ELIST: return SysMLPackage.ASSOCIATION___EXCLUDE_COLLISIONS__ELIST;
				default: return -1;
			}
		}
		if (baseClass == org.omg.sysml.lang.sysml.Class.class) {
			switch (baseOperationID) {
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case SysMLPackage.ASSOCIATION___NAME_OF__ELEMENT:
				return nameOf((Element)arguments.get(0));
			case SysMLPackage.ASSOCIATION___EXCLUDE_COLLISIONS__ELIST:
				return excludeCollisions((EList<Membership>)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (isAbstract: ");
		result.append(isAbstract);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl
