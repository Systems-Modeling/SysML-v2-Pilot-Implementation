package org.omg.sysml.design;

import org.omg.sysml.lang.sysml.AttributeUsage;
import org.omg.sysml.lang.sysml.Connector;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Expression;
import org.omg.sysml.lang.sysml.FeatureValue;
import org.omg.sysml.lang.sysml.LiteralInteger;
import org.omg.sysml.lang.sysml.LiteralString;
import org.omg.sysml.lang.sysml.Multiplicity;
import org.omg.sysml.lang.sysml.PartDefinition;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.TransitionUsage;
import org.omg.sysml.lang.sysml.impl.FeatureImpl;

/**
 * The services class used by VSM.
 */
public class Services {

	public String getLabel(Element self) {
		String label = null;
		if (self instanceof FeatureImpl) {
			label = ((FeatureImpl) self).getEffectiveName();
		} else {
			label = self.getName();
		}
		if (self instanceof AttributeUsage) {
			AttributeUsage au = (AttributeUsage) self;
			String typeName = getTypeName(au);
			if (typeName != null) {
				label += " : " + typeName;
			}
			String value = getValue(au);
			if (value != null) {
				label += " = " + value;
			}

		}
		return label.trim();
	}

	private String getValue(AttributeUsage au) {
		if (!au.getOwnedTyping().isEmpty()) {
			return au.getOwnedTyping().get(0).getType().getName();
		}
		return null;
	}

	private String getTypeName(AttributeUsage au) {
		if (!au.getOwnedFeatureMembership().isEmpty()) {
			if (au.getOwnedFeatureMembership().get(0) instanceof FeatureValue) {
				Expression value = ((FeatureValue) au.getOwnedFeatureMembership().get(0)).getValue();
				return prettyPrint(value);
			}
		}
		return null;
	}

	private String prettyPrint(Expression expr) {
		String res = null;
		switch (expr.eClass().getClassifierID()) {
		case SysMLPackage.LITERAL_STRING:
			res = ((LiteralString) expr).getValue();
			break;
		case SysMLPackage.LITERAL_INTEGER:
			res = String.valueOf(((LiteralInteger) expr).getValue());
			break;
		default:
			break;
		}
		return res;
	}

	public boolean isValidContainerElement(Element self) {
		return !(self instanceof Multiplicity || self instanceof Expression || self instanceof TransitionUsage
				|| self instanceof Connector || self instanceof PartDefinition);
	}
}
