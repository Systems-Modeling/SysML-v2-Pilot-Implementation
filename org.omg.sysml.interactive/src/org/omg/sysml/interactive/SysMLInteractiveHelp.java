/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021 Model Driven Solutions, Inc.
 *    
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *  
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *  
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 *  
 * Contributors:
 *  Ed Seidewitz, MDS
 *  
 *******************************************************************************/

package org.omg.sysml.interactive;

public class SysMLInteractiveHelp {
	
	private static final String LIST_HELP_STRING =
			  "Usage: %list [<QUERY>]\n\n"
			+ "If <QUERY> is not given, then list all loaded library packages.\n"
			+ "If <QUERY> is given, list all elements as specified by the <QUERY>.\n\n"
			+ "<QUERY> must have a form such that \"import <QUERY>;\" would be a legal import, "
			+ "that is, one of the following:\n"
			+ "    <NAME>\t\telement given by the fully qualified <NAME>\n"
			+ "    <NAME>::*\t\tall members of the namespace <NAME>\n"
			+ "    <NAME>::**\t\tall members of the namespace <NAME> and, recursively, members of owned namespaces.\n" 
			+ "The last two forms may be optionally followed by a filter expression in square brackets.\n";

	private static final String SHOW_HELP_STRING =
			  "Usage: %show <NAME>\n\n"
			+ "Print the abstract syntax tree rooted in <NAME>. <NAME> must be fully qualified.\n";

	private static final String PUBLISH_HELP_STRING =
			  "Usage: %publish <NAME>\n\n"
			+ "Publish the model elements rooted in <NAME> to the repository. <NAME> must be fully qualified.\n";

    private static final String VIZ_HELP_STRING =
    	      "Usage: %viz [--view=<VIEW>] [--style=<STYLE>...] <NAME> [<NAME>...]\n\n"
    	    + "Visualize model elements of <NAME>(s). <NAME>s must be fully qualified.\n\n"
    	    + "<VIEW> is case insensitive and possible candidates are:\n"
    	    + "   DEFAULT\t\tAutomatically choose an appropriate view from the given model element names\n"
    	    + "   TREE\t\t\tShow a tree-structural view, like a Block Definition Diagram (BDD)\n"
    	    + "   INTERCONNECTION\tShow an interconnection view, like an Internal Block Diagram (IBD)\n"
    	    + "   STATE\t\tShow state machines\n"
    	    + "   ACTION\t\tShow actions like an activity diagram\n"
    	    + "   SEQUENCE\t\tShow events and messages in a sequence diagram\n"
    	    + "   MIXED\t\tShow multiple views\n\n"
    	    + "<STYLE> is also case insensitive. Multiple --style options are allowed.  The possible style names are:\n"
    	    + "   DEFAULT\t\tStandard B&W format\n"
    	    + "   STDCOLOR\t\tStandard format with colors\n"
    	    + "   PLANTUML\t\tPlantUML format\n"
    	    + "   PUMLCODE\t\tShow PlantUML code mainly for debugging\n"
    	    + "   TB\t\t\tTop-to-Bottom orientation\n"
    	    + "   LR\t\t\tLeft-to-Right orientation\n"
    	    + "   POLYLINE\t\tPolyline style\n"
    	    + "   ORTHOLINE\t\tOrthogonal line style\n"
    	    + "   COMPTREE\t\tShow tree structures in compartments\n\n"
    	    + "Example:\n"
    	    + "  %viz --view Tree --style LR --style ortholine Pkg1::PartDef Pkg1::Pkg2::partUsage\n"
    	    + "should visualize Pkg1::PartDef and Pkg1::Pkg2::partUsage with a tree view ordered in the left-to-right direction with orthogonal lines.\n";

    private static final String VIEW_HELP_STRING =
    	      "Usage: %view [--render=<RENDERING>] [--style=<STYLE>...] <NAME>\n\n"
    	    + "Render the view specified by the view usage <NAME>. <NAME> must be fully qualified.\n"
    	    + "If the view usage has a rendering, this overrides the rendering given in the render option.\n\n"
    	    + "<RENDERING> is case insensitive and possible candidates are:\n"
    	    + "   DEFAULT\t\tAutomatically choose an appropriate view from the given model element names\n"
    	    + "   TREE\t\t\tShow a tree-structural view, like a Block Definition Diagram (BDD)\n"
    	    + "   INTERCONNECTION\tShow an interconnection view, like an Internal Block Diagram (IBD)\n"
    	    + "   STATE\t\tShow state machines\n"
    	    + "   ACTION\t\tShow actions like an activity diagram\n"
    	    + "   MIXED\t\tShow multiple views\n\n"
    	    + "<STYLE> is also case insensitive. Multiple --style options are allowed.  The possible style names are:\n"
    	    + "   DEFAULT\t\tStandard B&W format\n"
    	    + "   STDCOLOR\t\tStandard format with colors\n"
    	    + "   PLANTUML\t\tPlantUML format\n"
    	    + "   PUMLCODE\t\tShow PlantUML code mainly for debugging\n"
    	    + "   TB\t\t\tTop-to-Bottom orientation\n"
    	    + "   LR\t\t\tLeft-to-Right orientation\n"
    	    + "   POLYLINE\t\tPolyline style\n"
    	    + "   ORTHOLINE\t\tOrthogonal line style\n"
    	    + "   COMPTREE\t\tShow tree structures in compartments\n";
    
    public static String getListHelp() {
    	return LIST_HELP_STRING;
    }

    public static String getShowHelp() {
    	return SHOW_HELP_STRING;
    }

    public static String getPublishHelp() {
    	return PUBLISH_HELP_STRING;
    }

    public static String getVizHelp() {
    	return VIZ_HELP_STRING;
    }
    
    public static String getViewHelp() {
    	return VIEW_HELP_STRING;
    }
	
}
