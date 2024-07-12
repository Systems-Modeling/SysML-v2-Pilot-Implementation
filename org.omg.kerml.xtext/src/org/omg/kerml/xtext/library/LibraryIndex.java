package org.omg.kerml.xtext.library;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.xtext.naming.QualifiedName;
import org.omg.sysml.lang.sysml.Namespace;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class LibraryIndex {
	
	private static Map<String, Set<String>> LIBRARY_INDEX = null;
	private static boolean enabled = true;
	
	
	static {
		InputStream resourceStream = LibraryIndex.class.getResourceAsStream("LibraryIndex.json");
		try (var inputStream = new InputStreamReader(resourceStream)) {
			try (BufferedReader fileReader = new BufferedReader(inputStream)) {
				Gson gson = new Gson();
				var javaType = new TypeToken<Map<String, Set<String>>>() {}.getType();
				LIBRARY_INDEX = gson.fromJson(fileReader, javaType);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	public static boolean contains(Namespace ns, QualifiedName prefix, QualifiedName member) {
		
		if (!enabled) {
			return true;
		}
		
		var qn = ns.getQualifiedName();
		member = member.startsWith(prefix) ? member.skipFirst(prefix.getSegmentCount()) : member;
		
		return LIBRARY_INDEX == null ||
				qn == null ||
				(namespaceContainsQn(qn, member));
	}
	
	public static boolean namespaceContainsQn(String ns, QualifiedName qn)
	{
		List<String> segments = qn.getSegments();
		
		for (String segment: segments) {
			if (!namespaceContainsMember(ns, segment)) {
				return false;
			}
			
			ns += "::" + segment;
		}
		
		return !segments.isEmpty();
	}
	
	public static boolean namespaceContainsMember(String ns, String member) {
		return LIBRARY_INDEX.containsKey(ns) && LIBRARY_INDEX.get(ns).contains(member);
	}
	
	public static void disable() {
		enabled = false;
	}
	
	public static void enable() {
		enabled = true;
	}
}