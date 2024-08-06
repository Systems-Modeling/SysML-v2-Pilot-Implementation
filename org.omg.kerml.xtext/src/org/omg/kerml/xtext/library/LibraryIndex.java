package org.omg.kerml.xtext.library;

import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Membership;
import org.omg.sysml.lang.sysml.Namespace;

import com.google.common.hash.HashCode;
import com.google.common.hash.Hashing;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

public class LibraryIndex {
	
	public static final String FILE_NAME = ".index.json";
	private static final Type JAVA_TYPE = new TypeToken<LibraryIndex>() {}.getType();
	
	private final Map<String, Set<String>> index;
	private String checksum = null;

	public LibraryIndex() {
		this(new HashMap<>());
	}
	
	private LibraryIndex(Map<String, Set<String>> index) {
		this.index = index;
	}
	
	public boolean containsNamespace(String namespace) {
		return index.containsKey(namespace);
	}
	
	public boolean containsMember(String namespace, String member) {
		if (index.containsKey(namespace)) {
			return index.get(namespace).contains(member);
		}
		
		return false;
	}
	
	public void updateIndex(Collection<Resource> resources) {
		resources.forEach(it -> {
			it.getAllContents().forEachRemaining(el -> {
				if (el instanceof Namespace) {
					final String nsQn = ((Namespace) el).getQualifiedName();
					if ((nsQn != null) && (!nsQn.isEmpty())) {
						EList<Membership> membership = ((Namespace) el).getMembership();
						for (final Membership mem : new ArrayList<>(membership)) {
							{
								final String memberName = mem.getMemberName();
								final String memberShortName = mem.getMemberShortName();
								final Element memberElement = mem.getMemberElement();
								final String memberElementDeclaredName = memberElement.getDeclaredName();;
								final String memberElementDeclaredShortName = memberElement.getDeclaredShortName();;
								addIfNotNull(index, nsQn, memberName);
								addIfNotNull(index, nsQn, memberShortName);
								addIfNotNull(index, nsQn, memberElementDeclaredName);
								addIfNotNull(index, nsQn, memberElementDeclaredShortName);
							}
						}
					}
				}
			});
		});
	}
	
	public static LibraryIndex fromJson(Reader reader) {
		Gson gson = new Gson();
		return gson.fromJson(reader, JAVA_TYPE);
	}
	
	public String toJson(GsonBuilder builder) {
		//copy the index into an ordered collection, this allows the creating of deltas between indexes
		//additionally a checksum is created based on the ordered collection to efficiently detect outdated indexes
		final Map<String, Set<String>> orderedMap = new TreeMap<>();
		
		index.forEach((ns, name) ->{ 
			orderedMap.computeIfAbsent(ns, key -> new TreeSet<>()).addAll(name);
		});
		
		LibraryIndex orderedIndex = new LibraryIndex(orderedMap);
		orderedIndex.checksum = createChecksum(orderedMap);
		
		Gson gson = builder.create();
		return gson.toJson(orderedIndex);
	}
	
	private String createChecksum(Map<String, Set<String>> index) {
		 HashCode hashedIndex = Hashing.sha256().hashObject(index, (from, into) -> {
			from.forEach((libFqn, shortNames) -> {
				into.putBytes(libFqn.getBytes());
				shortNames.forEach(shortName -> into.putBytes(shortName.getBytes()));
			});
		});
            
        return hashedIndex.toString();
	}
	
	public String getChecksum() {
		return checksum;
	}
	
	private static void addIfNotNull(final Map<String, Set<String>> names, final String ns, final String name) {
		if (name != null) {
			names.computeIfAbsent(ns, key -> new HashSet<>()).add(name);
		}
	}
}
