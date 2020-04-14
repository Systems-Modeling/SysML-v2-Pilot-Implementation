package org.omg.sysml.interactive;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import org.omg.sysml.lang.sysml.Classifier;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;

public class SysMLInteractiveUtil {

	public static final String INDENT = "  ";
	
	private static String formatRelationship(Relationship relationship) {
		return relationship == null? "":
			   relationship instanceof Membership && ((Membership)relationship).getOwnedMemberElement() == null?
					   "[" + relationship.eClass().getName() + " " + ((Membership)relationship).getMemberName() + "] ":
			   "[" + relationship.eClass().getName() + "] ";
	}
	
	private static void formatElement(StringBuilder buffer, String indentation, Element element, Relationship relationship) {
		if (element instanceof Classifier) {
			((Classifier)element).getOwnedSuperclassing();
		} else if (element instanceof Feature) {
			((Feature)element).getOwnedSubsetting();
			((Feature)element).getFeature();
		}
		
		String name = element.getName();
		buffer.append(indentation + 
				formatRelationship(relationship) + 
				element.eClass().getName() + 
				(name == null? "": " " + name) + " (" + element.getIdentifier() + ")\n");
	}
	
	private static void formatTree(StringBuilder buffer, String indentation, Element element, Relationship relationship) {
		formatElement(buffer, indentation, element, relationship);
		if (element instanceof Expression) {
			for (Element output: ((Expression)element).getOutput()) {
				if (output.getOwner() == element) {
					formatElement(buffer, indentation + SysMLInteractiveUtil.INDENT, output, output.getOwningMembership());
				}
			}
		} else {
			for (Relationship subrelationship: element.getOwnedRelationship()) {
				for (Element relatedElement: subrelationship.getRelatedElement()) {
					if (relatedElement != element) {
						if (relatedElement.getOwningRelationship() == subrelationship) {
							formatTree(buffer, indentation + SysMLInteractiveUtil.INDENT, relatedElement, subrelationship);
						} else {
							formatElement(buffer, indentation + SysMLInteractiveUtil.INDENT, relatedElement, subrelationship);
						}
					}
				}
			}
		}
	}

	public static String formatElement(Element element) {
		StringBuilder buffer = new StringBuilder();
		formatElement(buffer, "", element, null);
		return buffer.toString();
	}

	public static String formatTree(Element element) {
		StringBuilder buffer = new StringBuilder();
		formatTree(buffer, "", element, null);
		return buffer.toString();
	}

	public static <T extends Object> String formatList(List<T> list) {
		StringBuilder buffer = new StringBuilder();
		list.stream().map(x->x.toString() + "\n").forEachOrdered(buffer::append);
		return buffer.toString();
	}
	
	public static String formatException(Exception exception) {
		StringWriter writer = new StringWriter();
		exception.printStackTrace(new PrintWriter(writer));
		return writer.toString();
	}
	
}
