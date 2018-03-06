package org.omg.sysml.qvt;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.URIConverter;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.m2m.qvt.oml.BasicModelExtent;
import org.eclipse.m2m.qvt.oml.ExecutionContextImpl;
import org.eclipse.m2m.qvt.oml.ExecutionDiagnostic;
import org.eclipse.m2m.qvt.oml.ModelExtent;
import org.eclipse.m2m.qvt.oml.TransformationExecutor;
import org.eclipse.m2m.qvt.oml.util.WriterLog;

public class QVTRunner {
	
	protected final ResourceSet resourceSet = new ResourceSetImpl();
	protected final List<EList<EObject>> inputContents = new ArrayList<EList<EObject>>();
	protected final EList<EObject> outputContents = new BasicEList<EObject>();
	protected final ExecutionContextImpl context = new ExecutionContextImpl();
	
	public QVTRunner() {
		this.initialize();
	}
	
	protected void initialize() {
		this.setConfigProperty("keepModeling", true);
	}
	
	public void setConfigProperty(String name, Object value) {
		this.context.setConfigProperty(name, value);
	}
	
	public void setLog(OutputStream logStream) {
		this.context.setLog(new WriterLog(new OutputStreamWriter(logStream)));
	}
	
	public void setLog(String logPath) {
		try {
			this.setLog(new FileOutputStream(logPath));
		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		}
	}
	
	public Resource createResource(final String path) {
		Resource resource = this.resourceSet.createResource(URI.createFileURI(path));
		if (resource == null) {
			throw new RuntimeException("Error creating resource: " + path);
		} else {
			return resource;
		}
	}
	
	public Resource getResource(final String path) {
	    final Resource resource = this.createResource(path);
		if (resource != null) {
			try {
				resource.load(null);
				return resource;
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		throw new RuntimeException("Error opening resource: " + path);
	}
	
	public void addInput(final EList<EObject> inputObjects) {
		this.inputContents.add(inputObjects);
	}
	
	public void addInput(final Resource resource) {
		if (resource != null) {
			this.addInput(resource.getContents());
		}
	}
	
	public void addInput(final String path) {
		this.addInput(this.getResource(path));
	}
	
	protected EList<EObject> getAllContents(final Path directoryPath) throws IOException {
		final DirectoryStream<Path> directory = Files.newDirectoryStream(directoryPath);
		final EList<EObject> allContents = new BasicEList<EObject>();
		for (Path input: directory) {
			if (Files.isDirectory(input)) {
				try {
					allContents.addAll(this.getAllContents(input));
				} catch (Exception e) {
					System.out.println(e);
				}
			} else {
				Resource resource = null;
				try {
					resource = this.getResource(input.toString());
					allContents.addAll(resource.getContents());
				} catch (Exception e) {
					System.out.println(e);
				}
			}
		}
		directory.close();
		return allContents;
	}

	public void addInputDirectory(final Path directoryPath) throws IOException {
		this.addInput(this.getAllContents(directoryPath));
	}

	public void addInputDirectory(final String directoryPath) throws IOException {
		this.addInputDirectory(Paths.get(directoryPath));
	}
	
	public void clearInput() {
		this.inputContents.clear();
	}
	
	public EList<EObject> getInput(int index) {
		return this.inputContents.get(index);
	}
	
	public EList<EObject> getOutput() {
		return this.outputContents;
	}
	
	public static void save(final Resource resource, List<EObject> contents) throws IOException {
		if (resource != null) {
			resource.getContents().clear();
			resource.getContents().addAll(contents);
			resource.save(null);
		}
	}
	
	public void saveOutput(final Resource resource) throws Exception {
		save(resource, this.getOutput());
	}
	
	public void saveOutput(final String path) throws Exception {
		this.saveOutput(this.createResource(path));
	}
	
	protected ModelExtent[] createExtents(List<EList<EObject>> inputContents) {
		final ModelExtent[] extents = new ModelExtent[inputContents.size() + 1];
		for (int i = 0; i < extents.length - 1; i++) {
			extents[i] = new BasicModelExtent(inputContents.get(i));
		}
		extents[extents.length-1] = new BasicModelExtent();
		return extents;
	}
	
	protected void readInput(final String... resourcePaths) throws Exception {
		readInput(resourcePaths, 1, resourcePaths.length - 1);
	}

	protected void readInput(final String[] resourcePaths, int first, int last) throws Exception {
		for (int i = first; i < last; i++) {
			System.out.println("Input: " + resourcePaths[i]);
			if (!Files.isDirectory(Paths.get(resourcePaths[i]))) {
				this.addInput(resourcePaths[i]);
			} else {
				this.addInputDirectory(resourcePaths[i]);
			}
		}
	}
	
	protected void writeOutput(final String... resourcePaths) throws Exception {
		final String outputPath = this.constructOutputPath(resourcePaths);
		if (outputPath == null || outputPath.equals("")) {
			System.out.println("Output...");
		} else {
			System.out.println("Output: " + outputPath);
		}
		this.saveOutput(outputPath);
		System.out.println("Done.");
	}

	protected String constructOutputPath(final String...resourcePaths) {
		return resourcePaths[resourcePaths.length - 1];
	}
	
	public String[] processArgs(String[] args) {
		if (args.length > 0 && args[0].equals("-l")) {
			System.out.println("Log: " + args[1]);
			this.setLog(args[1]);
			args = Arrays.copyOfRange(args, 2, args.length);
		}
		return args;
    }
    
	public Diagnostic run(final TransformationExecutor executor) {
		final ModelExtent[] extents = this.createExtents(this.inputContents);
		
		final ExecutionDiagnostic diagnostic =  executor.execute(context, extents);
		
		if (diagnostic.getSeverity() == Diagnostic.OK) {
			this.outputContents.clear();
			this.outputContents.addAll(extents[extents.length-1].getContents());
		}
		
		return diagnostic;		
	}
	
	public Diagnostic run(final String qvtPath) {
		final TransformationExecutor executor = new TransformationExecutor(
				URIConverter.INSTANCE.normalize(URI.createFileURI(qvtPath)));
		return this.run(executor);
	}
	
	public void run(final String... resourcePaths) throws Exception {
		readInput(resourcePaths);		
		if (resourcePaths.length > 1) {
			final String qvtPath = resourcePaths[0];
			System.out.println("Running: " + qvtPath);
			Diagnostic diagnostic = this.run(qvtPath);
			if (diagnostic.getSeverity() != Diagnostic.OK) {
				System.out.println(diagnostic);
			} else {
				writeOutput(resourcePaths);
			}
		}
	}
	
	public void run(String[] args, int n, String usageMessage) {
		try {
			String[] resourceArgs = this.processArgs(args);
			if (resourceArgs.length < n) {
				System.out.println("Error: Too few arguments");
				System.out.println("Usage: " + usageMessage);
			} else {
				this.run(resourceArgs);
			}
		} catch (RuntimeException | IOException e) {
			System.out.println(e.getMessage());
			this.context.getLog().log(e.getMessage());
		} catch (Exception e) {
			System.out.println(e);
			StringWriter writer = new StringWriter();
			e.printStackTrace(new PrintWriter(writer));
			this.context.getLog().log(writer.toString());
		}
	}
	
	public static void main(String[] args) {
		new QVTRunner().run(args, 3, "QVTRunner [-l logPath] qvtPath inputPaths outputPath");
	}

}