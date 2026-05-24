/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Sensmetry, UAB.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *
 *******************************************************************************/

package org.omg.sysml.xtext.util;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.sensmetry.sysand.Sysand;
import com.sensmetry.sysand.exceptions.SysandException;
import com.sensmetry.sysand.model.InterchangeProject;
import com.sensmetry.sysand.model.InterchangeProjectInfo;
import com.sensmetry.sysand.model.InterchangeProjectMetadata;
import com.sensmetry.sysand.model.InterchangeProjectUsage;

public class StdLibVersionUtil {

	private static final String DEV_SEPARATOR = "-dev.";

	/** Strips any existing -dev.* suffix, then appends -dev.<buildTag>. */
	static String withBuildTag(String version, String buildTag) {
		int idx = version.indexOf(DEV_SEPARATOR);
		String base = idx >= 0 ? version.substring(0, idx) : version;
		return base + DEV_SEPARATOR + buildTag;
	}

	/** Strips any existing -dev.* suffix. */
	static String stripBuildTag(String version) {
		int idx = version.indexOf(DEV_SEPARATOR);
		return idx >= 0 ? version.substring(0, idx) : version;
	}

	/** Applies build tag to a versionConstraint like "=1.0.0" → "=1.0.0-dev.<tag>". */
	static String withBuildTagConstraint(String constraint, String buildTag) {
		int start = 0;
		while (start < constraint.length() && !Character.isDigit(constraint.charAt(start))) {
			start++;
		}
		return constraint.substring(0, start) + withBuildTag(constraint.substring(start), buildTag);
	}

	/** Strips any existing -dev.* suffix from a versionConstraint like "=1.0.0-dev.<tag>" → "=1.0.0". */
	static String stripBuildTagConstraint(String constraint) {
		int start = 0;
		while (start < constraint.length() && !Character.isDigit(constraint.charAt(start))) {
			start++;
		}
		return constraint.substring(0, start) + stripBuildTag(constraint.substring(start));
	}

	/**
	 * Replaces the date segment in a spec resource URL with buildTag.
	 * URL structure: https://www.omg.org/spec/{lang}/{date}/{name}.kpar
	 * Splitting by "/" yields the date at index 5.
	 */
	static String withBuildTagResource(String resource, String buildTag) {
		String[] parts = resource.split("/");
		if (parts.length >= 7) {
			parts[5] = buildTag;
		}
		return String.join("/", parts);
	}

	/**
	 * Replaces the date segment in a spec metamodel URL with buildTag.
	 * URL structure: https://www.omg.org/spec/{lang}/{date}
	 * Splitting by "/" yields the date at index 5.
	 */
	static String withBuildTagMetamodelUrl(String url, String buildTag) {
		String[] parts = url.split("/");
		if (parts.length >= 6) {
			parts[5] = buildTag;
		}
		return String.join("/", parts);
	}

	static void updateProject(Path projectPath, String buildTag, String metamodelTag) throws SysandException {
		InterchangeProject project = Sysand.infoPath(projectPath);
		InterchangeProjectInfo info = project.info;

		if (info.getVersion() != null) {
			info.setVersion(buildTag != null
					? withBuildTag(info.getVersion(), buildTag)
					: stripBuildTag(info.getVersion()));
		}

		InterchangeProjectUsage[] usages = info.getUsage();
		for (InterchangeProjectUsage usage : usages) {
			if (buildTag != null && usage.getResource() != null) {
				usage.setResource(withBuildTagResource(usage.getResource(), buildTag));
			}
			if (usage.getVersionConstraint() != null) {
				usage.setVersionConstraint(buildTag != null
						? withBuildTagConstraint(usage.getVersionConstraint(), buildTag)
						: stripBuildTagConstraint(usage.getVersionConstraint()));
			}
		}
		info.setUsage(usages);

		Sysand.setProjectInfo(projectPath, info);

		InterchangeProjectMetadata metadata = project.metadata;
		if (metadata != null && metadata.getMetamodel() != null && metamodelTag != null) {
			metadata.setMetamodel(withBuildTagMetamodelUrl(metadata.getMetamodel(), metamodelTag));
			Sysand.setProjectMetadata(projectPath, metadata);
		}
	}

	public static void updateWorkspace(String workspacePath, String buildTag, String metamodelTag) throws SysandException {
		String[] projectPaths = Sysand.workspaceProjectPaths(Paths.get(workspacePath));
		for (String projectPath : projectPaths) {
			System.out.println("  Updating: " + projectPath);
			updateProject(Paths.get(projectPath), buildTag, metamodelTag);
		}
	}

	private static boolean isMavenPlaceholder(String value) {
		return value != null && value.startsWith("${");
	}

	private static String parseTag(String value) {
		return (value != null && !value.isEmpty() && !isMavenPlaceholder(value)) ? value : null;
	}

	private static void printUsage() {
		System.err.println("Usage: StdLibVersionUtil --workspace WORKSPACE_PATH");
		System.err.println("           [--build-tag BUILD_TAG] [--metamodel-tag METAMODEL_TAG]");
		System.err.println();
		System.err.println("  --workspace       Path to the workspace directory containing .workspace.json (required)");
		System.err.println("  --build-tag       Stamp -dev.<tag> onto version, versionConstraint, and resource");
		System.err.println("                    URLs in each project's .project.json");
		System.err.println("  --metamodel-tag   Replace the date segment of the metamodel URL in each project's");
		System.err.println("                    .meta.json");
		System.err.println("  --help            Show this message");
		System.err.println();
		System.err.println("At least one of --build-tag or --metamodel-tag must be provided.");
	}

	public static void main(String[] args) throws SysandException {
		String workspacePath = null;
		String buildTag = null;
		String metamodelTag = null;
		String rawBuildTag = null;
		String rawMetamodelTag = null;

		for (int i = 0; i < args.length; i++) {
			switch (args[i]) {
				case "--help":
					printUsage();
					return;
				case "--workspace":
					if (++i >= args.length) { printUsage(); return; }
					workspacePath = args[i];
					break;
				case "--build-tag":
					if (++i >= args.length) { printUsage(); return; }
					rawBuildTag = args[i];
					buildTag = parseTag(args[i]);
					break;
				case "--metamodel-tag":
					if (++i >= args.length) { printUsage(); return; }
					rawMetamodelTag = args[i];
					metamodelTag = parseTag(args[i]);
					break;
				default:
					System.err.println("Unknown argument: " + args[i]);
					printUsage();
					return;
			}
		}

		if (workspacePath == null) {
			System.err.println("Error: --workspace is required.");
			printUsage();
			return;
		}

		if (buildTag == null && metamodelTag == null) {
			if (isMavenPlaceholder(rawBuildTag) || isMavenPlaceholder(rawMetamodelTag)) {
				System.out.println("Skipping: both --build-tag and --metamodel-tag are Maven placeholders.");
				return;
			}
			System.err.println("Error: at least one of --build-tag or --metamodel-tag must be provided.");
			printUsage();
			return;
		}

		if (buildTag != null) {
			System.out.println("Applying build tag '" + buildTag + "' to .project.json files in: " + workspacePath);
		}
		if (metamodelTag != null) {
			System.out.println("Applying metamodel tag '" + metamodelTag + "' to .meta.json files in: " + workspacePath);
		}
		updateWorkspace(workspacePath, buildTag, metamodelTag);
		System.out.println("Done.");
	}
}
