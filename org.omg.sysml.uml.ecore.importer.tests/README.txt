The custom UML importer can be tested in two ways:

1) using the launch configuration : to check how org.omg.sysml.uml.ecore.importer.CustomUML2EcoreConverter changes the generation of composite properties.
NOTE: it is hard to completely reproduce the EMF behaviour from SysML.uml => SysML.ecore,SysML.genmodel, so this test only focus on the UML2Ecore conversion.
Its only purpose to ease the implementation of the custom UML2Ecore converter.

2) by launching a runtime to test the ecore generation in situation. Launch a runtime (which include org.omg.sysml.uml.ecore.importer), import org.omg.sysml and regenerate the ecore using the custom importer.
In the end the custom importer should be integrated into the target plaform.