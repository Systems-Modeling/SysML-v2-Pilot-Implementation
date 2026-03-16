package org.omg.sysml.interactive;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Namespace;

public class SysMLParsing {

	public static void main(String[] args) {
		// Get singleton instance.
		SysMLInteractive sysml = SysMLInteractive.getInstance();
		sysml.setVerbose(false);
		
		// Load the KerML and SysML library models. The argument gives the
		// absolute path to the root "system.library" directory.
		System.out.println("Loading libraries...");
		sysml.loadLibrary(args[0]);
		
		// Set the base path used for publishing via the API. 
		sysml.setApiBasePath("http://sysml2.intercax.com:9000");
		
		try {
			// Evaluate (parse and validate) the SysML text read from a file
			// at the given absolute path.
			System.out.println("Reading " + args[1]);
			SysMLInteractiveResult result = sysml.process(Files.readString(Path.of(args[1])));
			
			// If there are warnings or errors, this will print them. 
			// If the eval is successful, it will print the name and UUID of
			// the top-level element.
			System.out.println(result.toString());
			
			if (!result.hasErrors()) {
				// Get the top-level named element in the parsed model.
				Element root = result.getRootElement();
				Element top = ((Namespace)root).getOwnedMember().get(0);
				
				sysml.list("");
				
				// Operate on the model in memory
				// ...
				
				// Publish the updated model to the repository.
				System.out.println(sysml.publish(top.getName()));
			}
			
		} catch (IOException e) {
			System.out.println("IOException: " + e.getMessage());
		}
	}
}
