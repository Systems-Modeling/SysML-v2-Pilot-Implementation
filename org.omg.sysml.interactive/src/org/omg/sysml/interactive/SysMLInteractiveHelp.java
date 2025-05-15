/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021, 2025 Model Driven Solutions, Inc.
 * Copyright (c) 2021 Twingineer LLC
 * Copyright (c) 2022 Mgnite Inc.
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
 *  Ivan Gomes
 *  Hisashi Miyashita
 *
 *******************************************************************************/

package org.omg.sysml.interactive;

import java.util.HashMap;
import java.util.Map;

import org.omg.sysml.plantuml.SysML2PlantUMLStyle;

public class SysMLInteractiveHelp {

	private static final String GENERAL_HELP_STRING =
			  "The following SysML v2 magic commands are available.\n"
			+ "For help on a specific command, use \"%help <COMMAND>\" or \"%<cmd> -h\".\n\n"
			+ "%eval\t\tEvaluate a given expression.\n"
			+ "%export\t\tSave a file of the JSON representation of the abstract syntax tree rooted in the named element.\n"
			+ "%help\t\tGet a list of available commands or help on a specific command\n"
			+ "%list\t\tList loaded library packages or the results of a given query\n"
			+ "%load\t\tLoad a model from the repository\n"
			+ "%repo\t Set the api base path for the repository\n"
			+ "%show\t\tPrint the abstract syntax tree rooted in a named element\n"
			+ "%projects\tList projects in the repository\n"
			+ "%publish\tPublish to the repository the modele elements rooted in a named element\n"
			+ "%view\t\tRender the view specified by the named view usage\n"
			+ "%viz\t\tVisualize the name model elements\n"
			;

	private static final String HELP_HELP_STRING =
			  "Usage: %help [<COMMAND>]\n\n"
			+ "Print help information on the named SysML v2 magic <COMMAND>.\n"
			+ "If no <COMMAND> is given, then list the available commands.\n";

	private static final String EVAL_HELP_STRING =
			  "Usage: %eval [--target=<NAME>] <EXPR>\n\n"
			+ "Print the results of evaluating <EXPR> on the target given by <NAME>, which must be fully qualified.\n"
			+ "If a target is not given, then evaluate <EXPR> in global scope.\n";

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
			  "Usage: %show [--style=<STYLE>] <NAME>\n\n"
			+ "Print the abstract syntax tree rooted in <NAME>. <NAME> must be fully qualified.\n\n"
			+ "<STYLE> is also case insensitive. The possible style names are:\n"
    	    + "   TREE\t\tHierarchically indented representation with only identifying information\n"
    	    + "   JSON\t\tComplete JSON representation of the tree\n";

	private static final String PUBLISH_HELP_STRING =
			  "Usage: %publish [-d] [--project=<PROJECT NAME>] [--branch=<BRANCH NAME>] <NAME>\n\n"
			+ "Publish the model elements rooted in <NAME> to the repository. <NAME> must be fully qualified.\n"
			+ "Use the -d flag to include derived properties.\n"
			+ "If <PROJECT NAME> is given, it is used as the name of the project to create or update.\n"
			+ "If <PROJECT NAME> is not given, the (simple) name of the model element is used.\n"
			+ "    If no project exits with the given name, then a new project with that name is created.\n"
			+ "    Otherwise, the existing project is updated with a new commit.\n"
			+ "If <BRANCH NAME> is given, then the model is written to this branch of the project.\n"
			+ "If <BRANCH NAME> is not given, the default branch is used.\n";

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
            + SysML2PlantUMLStyle.getStyleHelp()
    	    + "\nExample:\n"
    	    + "\t%viz --view Tree --style LR --style ortholine Pkg1::PartDef Pkg1::Pkg2::partUsage\n"
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
            + SysML2PlantUMLStyle.getStyleHelp();


	private static final String EXPORT_HELP_STRING =
			  "Usage: %export <NAME>\n\n"
			+ "Save a file containing the complete JSON representation of the abstract syntax tree rooted in <NAME>.\n"
		    + "<NAME> must be fully qualified.\n";

	private static final String LOAD_HELP_STRING =
			"Usage: %load [--id=<PROJECT ID] [--name=<NAME>] [--branch=<BRANCH_NAME>] [<NAME>]\n\n"
			+ "Download previously published models from a project in the repository. <NAME> is the full name of the project.\n"
			+ "Named elements of the downloaded models may then be referenced models in the notebook."
			+ "(Use %projects to view repository contents.)\n"
			+ "If <PROJECT ID> is given, then the project with that UUID is loaded. In this case, the <NAME> must not be given.\n"
			+ "If <BRANCH NAME> is given, then the model is loaded from this branch of the project.\n"
			+ "If <BRANCH NAME> is not given, the default branch is used.\n";

	private static final String PROJECTS_HELP_STRING =
			  "Usage: %projects\n\n"
			+ "Print the name and identifier of all projects in the repository.\n";

	private static final String API_BASE_PATH_HELP_STRING =
			  "Usage: %repo [<BASE PATH>]\n\n"
			+ "If <BASE PATH> is not given, print the current repository base path.\r\n"
			+ "If <BASE PATH> is given, set the repository base path.\r\n"
			+ "\r\n"
			+ "<BASE PATH> is a URL giving the API base path for the repository access by the %projects, %publish and %load commands. \r\n"
			+ "For example: https://my.domain.com/sysml_repo";
 
	public static String getGeneralHelp() {
		return GENERAL_HELP_STRING;
	}

	public static String getHelpHelp() {
		return HELP_HELP_STRING;
	}

	public static String getEvalHelp() {
		return EVAL_HELP_STRING;
	}

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

    public static String getExportHelp() {
    	return EXPORT_HELP_STRING;
    }

    public static String getProjectsHelp() {
    	return PROJECTS_HELP_STRING;
    }

    public static String getLoadHelp() {
    	return LOAD_HELP_STRING;
    }

    private static Map<String, String> commandHelpMap = createCommandHelpMap();

    private static Map<String, String> createCommandHelpMap() {
    	Map<String, String> map = new HashMap<>();
    	map.put("%help", HELP_HELP_STRING);
    	map.put("%eval", EVAL_HELP_STRING);
    	map.put("%list", LIST_HELP_STRING);
    	map.put("%show", SHOW_HELP_STRING);
    	map.put("%publish", PUBLISH_HELP_STRING);
    	map.put("%viz", VIZ_HELP_STRING);
    	map.put("%view", VIEW_HELP_STRING);
    	map.put("%export", EXPORT_HELP_STRING);
    	map.put("%load", LOAD_HELP_STRING);
    	map.put("%projects", PROJECTS_HELP_STRING);
    	map.put("%repo", API_BASE_PATH_HELP_STRING);

    	return map;
    }

    public static String getHelpString(String command) {
    	return commandHelpMap.get(command);
    }

}
