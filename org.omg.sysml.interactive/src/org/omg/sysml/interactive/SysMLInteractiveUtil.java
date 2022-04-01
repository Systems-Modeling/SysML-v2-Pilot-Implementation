package org.omg.sysml.interactive;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;
import java.util.stream.Collectors;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.LiteralBoolean;
import org.omg.sysml.lang.sysml.LiteralInfinity;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralRational;
import org.omg.sysml.lang.sysml.LiteralString;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.util.TypeUtil;

public class SysMLInteractiveUtil {

	public static final String INDENT = "  ";
	
	private static String formatRelationship(EClass kind, String memberName) {
		return "[" + kind.getName() + (memberName == null? "": " " + memberName) + "] ";
	}
	
	private static String formatRelationship(Relationship relationship) {
		return relationship == null? "":
			   relationship instanceof Membership && ((Membership)relationship).getOwnedMemberElement() == null?
					   formatRelationship(relationship.eClass(), ((Membership)relationship).getMemberName()):
			   formatRelationship(relationship.eClass(), null);
	}
	
	private static void formatElement(StringBuilder buffer, String indentation, Element element, String relationshipTag) {
		String humanId = element.getHumanId();
		String name = nameOf(element);
		buffer.append(indentation + 
				relationshipTag + 
				element.eClass().getName() + 
				(humanId == null? "": " [" + humanId + "]") +
				(name == null? "": " " + name) + 
				" (" + element.getIdentifier() + ")\n");
	}
	
	public static String nameOf(Element element) {
		return element instanceof LiteralBoolean? Boolean.valueOf(((LiteralBoolean)element).isValue()).toString():
			   element instanceof LiteralString? ((LiteralString)element).getValue().toString():
			   element instanceof LiteralInteger? Integer.valueOf(((LiteralInteger)element).getValue()).toString():
			   element instanceof LiteralRational? Double.valueOf(((LiteralRational)element).getValue()).toString():
			   element instanceof LiteralInfinity? "*":
			   element.getName();
	}

	private static void formatExplicitElement(StringBuilder buffer, String indentation, Element element, Relationship relationship) {
		formatElement(buffer, indentation, element, formatRelationship(relationship));
	}
	
	private static void formatImplicitElement(StringBuilder buffer, String indentation, Element element, EClass kind) {
		formatElement(buffer, indentation, element, formatRelationship(kind, "(implicit)"));
	}
	
	private static void formatTree(StringBuilder buffer, String indentation, Element element, Relationship relationship) {
		formatExplicitElement(buffer, indentation, element, relationship);
		if (element instanceof Expression && !(element instanceof CalculationUsage)) {
			for (Element output: ((Expression)element).getOutput()) {
				if (output.getOwner() == element) {
					formatExplicitElement(buffer, indentation + SysMLInteractiveUtil.INDENT, output, output.getOwningMembership());
				}
			}
		} else {
			if (element instanceof Type) {
				TypeUtil.forEachImplicitGeneralTypeOf((Type)element, (kind, supertype)->
					formatImplicitElement(buffer, indentation + SysMLInteractiveUtil.INDENT, supertype, kind)
				);
			}
			
			for (Relationship subrelationship: element.getOwnedRelationship()) {
				for (Element relatedElement: subrelationship.getRelatedElement()) {
					if (relatedElement != element) {
						if (relatedElement.getOwningRelationship() == subrelationship) {
							formatTree(buffer, indentation + SysMLInteractiveUtil.INDENT, relatedElement, subrelationship);
						} else {
							formatExplicitElement(buffer, indentation + SysMLInteractiveUtil.INDENT, relatedElement, subrelationship);
						}
					}
				}
			}
		}
	}

	public static String formatElement(Element element) {
		StringBuilder buffer = new StringBuilder();
		formatExplicitElement(buffer, "", element, null);
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
	
	public static String formatMembershipList(List<Membership> membership) {
		return membership.stream().
			map(Membership::getMemberElement).
			sorted(SysMLInteractiveUtil::compare).
			map(SysMLInteractiveUtil::formatElement).
			collect(Collectors.joining());
	}
	
	public static int compare(Element element1, Element element2) {
		String humanId1 = element1.getHumanId();
		String humanId2 = element2.getHumanId();
		String name1 = element1.getName();
		String name2 = element2.getName();
		return name1 != null && name2 != null? name1.compareToIgnoreCase(name2):
			   name1 == null && name2 != null? -1:
			   name1 != null && name2 == null? 1:
			   humanId1 != null && humanId2 != null? humanId1.compareToIgnoreCase(humanId2):
			   humanId1 == null && humanId2 != null? -1:
			   humanId1 != null && humanId2 == null? 1:
			   0;
	}
	
}
