package org.omg.sysml.validation.util;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.omg.kerml.util.ValidationUtil;
import org.omg.kerml.validation.ValidationMessageAccepter;
import org.omg.sysml.lang.sysml.Definition;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.FeatureMembership;
import org.omg.sysml.lang.sysml.Namespace;
import org.omg.sysml.lang.sysml.OperatorExpression;
import org.omg.sysml.lang.sysml.ReferenceSubsetting;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.StateSubactionKind;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.Usage;
import org.omg.sysml.util.FeatureUtil;
import org.omg.sysml.util.TypeUtil;
import org.omg.sysml.util.UsageUtil;

public class SysmlValidationUtil {
	

	public static boolean checkReferenceType(Feature feature, Class<?> type, ValidationMessageAccepter messageAccepter, String msgCode) {

	    ReferenceSubsetting subsetting = feature.getOwnedReferenceSubsetting();

	    if (subsetting != null && !type.isInstance(FeatureUtil.getBasicFeatureOf(subsetting.getReferencedFeature()))) {
	    	messageAccepter.error(subsetting, null, msgCode);
	        return false;
	    }
	    return true;
	}
	
	public static boolean checkAllNotComposite(Iterable<? extends Feature> list, ValidationMessageAccepter messageAccepter, String msgCode) {

		boolean check = true; 
		for (Feature feature : list) {
			if (feature.isComposite()) {
				messageAccepter.error(feature, null, msgCode);
				check = false; 
			}
		}
		return check; 
	}
	public static boolean checkAtMostOneFeature(Type featuringType, Class<? extends FeatureMembership> kind, ValidationMessageAccepter messageAccepter, String msgCode) {
	    List<? extends Relationship> memberships = StreamSupport.stream(TypeUtil.getFeatureMembershipOf(featuringType).spliterator(),false).filter(kind::isInstance).collect(Collectors.toList());

	    return checkAtMostOneRelationship(featuringType, memberships, messageAccepter, msgCode);
	}
	public static boolean checkAtMostOneRelationship(Type type, Iterable<? extends Relationship> relationships, ValidationMessageAccepter messageAccepter, String msgCode) {
	    List<? extends Relationship> relationshipList = StreamSupport.stream(relationships.spliterator(), false).collect(Collectors.toList());
	    if (relationshipList.size() <= 1) {
	        return true;
	    }
	    List<Relationship> ownedRelationships = relationshipList.stream().filter(relationship -> relationship.getOwningRelatedElement() == type).collect(Collectors.toList());
	    if (ownedRelationships.isEmpty()) {
	        messageAccepter.error(type, null, msgCode);
	    } else if (ownedRelationships.size() == relationshipList.size()) {
	        for (int i = 1; i < ownedRelationships.size(); i++) {
	            messageAccepter.error(ownedRelationships.get(i), null, msgCode);
	        }
	    } else {
	        for (Relationship relationship : ownedRelationships) {
	            messageAccepter.error(relationship, null, msgCode);
	        }
	    }
	    return false;
	}
	public static boolean checkSubjectParameter(Type type,ValidationMessageAccepter messageAccepter, String msgCode) {
	    var inputs = TypeUtil.getInputOf(type);
	    if (inputs.isEmpty() || !UsageUtil.isSubjectParameter(inputs.get(0))) {
	        var subjectParameter = UsageUtil.getOwnedSubjectParameterOf(type);

	        if (subjectParameter != null) {
	            messageAccepter.error(subjectParameter, null, msgCode);
	        } else {
	            messageAccepter.error(type, null, msgCode);
	        }
	        return false;
	    }
	    return true;
	}
	public static boolean checkAllTypes(Feature f, Class<?> requiredType, EStructuralFeature ref, ValidationMessageAccepter messageAccepter, String msgCode ) {
		boolean check = FeatureUtil.getAllTypesOf(f).stream().allMatch(requiredType::isInstance);
	    if (!check) {
	        messageAccepter.error(f, ref, msgCode);
	    }
	    return check;
	}
	public static void checkStateSubactions(Type type, ValidationMessageAccepter messageAccepter) {
		checkAtMostOneRelationship(type, UsageUtil.getStateSubactionMembershipsOf(type, StateSubactionKind.ENTRY), messageAccepter, "validateStateDefinitionSubactionKind_1");
		checkAtMostOneRelationship(type, UsageUtil.getStateSubactionMembershipsOf(type, StateSubactionKind.DO), messageAccepter, "validateStateDefinitionSubactionKind_2");
		checkAtMostOneRelationship(type, UsageUtil.getStateSubactionMembershipsOf(type, StateSubactionKind.EXIT), messageAccepter, "validateStateDefinitionSubactionKind_3");
	}
	public static boolean isVariation(Namespace namespace) {
		return (namespace instanceof Definition
	            && ((Definition) namespace).isVariation())
	        || (namespace instanceof Usage
	            && ((Usage) namespace).isVariation());
	}
}
