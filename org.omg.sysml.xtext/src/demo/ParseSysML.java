package demo;

import com.google.inject.Injector;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.omg.sysml.xtext.SysMLStandaloneSetup;

public class ParseSysML {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.err.println("Usage: mvn -q -pl org.omg.sysml.xtext -Dexec.mainClass=demo.ParseSysML -Dexec.args=\"<path-to-file.sysml>\" exec:java");
            System.exit(1);
        }

        try {
            Injector injector = new SysMLStandaloneSetup().createInjectorAndDoEMFRegistration();
            ResourceSet resourceSet = injector.getInstance(XtextResourceSet.class);

            URI uri = URI.createFileURI(java.nio.file.Paths.get(args[0]).toAbsolutePath().toString());
            Resource resource = resourceSet.getResource(uri, true);

            if (!resource.getErrors().isEmpty()) {
                System.err.println("Parse errors:");
                resource.getErrors().forEach(e -> System.err.println(" - " + e));
                System.exit(2);
            }

            System.out.println("Parsed successfully.");
            if (!resource.getContents().isEmpty()) {
                System.out.println("Root EObject: " + resource.getContents().get(0).eClass().getName());
            } else {
                System.out.println("No root contents.");
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(3);
        }
    }
}
