package org.omg.sysml.interactive;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.List;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.eclipse.emf.ecore.EClass;
import org.omg.sysml.lang.sysml.CalculationUsage;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Relationship;
import org.omg.sysml.lang.sysml.Type;
import org.omg.sysml.lang.sysml.impl.TypeImpl;

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
		String name = element.getName();
		buffer.append(indentation + 
				relationshipTag + 
				element.eClass().getName() + 
				(name == null? "": " " + name) + " (" + element.getIdentifier() + ")\n");
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
			if (element instanceof TypeImpl) {
				TypeImpl type = (TypeImpl)element;
				for (EClass kind: type.getImplicitGeneralTypeKinds()) {
					for (Type supertype: type.getImplicitGeneralTypes(kind)) {
						formatImplicitElement(buffer, indentation + SysMLInteractiveUtil.INDENT, supertype, kind);
					}
				}
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
	
}
