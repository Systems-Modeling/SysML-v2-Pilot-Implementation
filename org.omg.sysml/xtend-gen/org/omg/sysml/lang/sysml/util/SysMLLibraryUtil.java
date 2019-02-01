package org.omg.sysml.lang.sysml.util;

import com.google.inject.Inject;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.resource.IEObjectDescription;
import org.omg.sysml.AlfStandaloneSetup;
import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.scoping.AlfScopeProvider;

@SuppressWarnings("all")
public class SysMLLibraryUtil {
  @Inject
  private AlfScopeProvider scopeProvider;
  
  @Inject
  private IQualifiedNameConverter nameConverter;
  
  protected EObject filePackage(final Element element) {
    Element pack = element;
    while ((pack.getOwner() != null)) {
      pack = pack.getOwner();
    }
    return pack;
  }
  
  public EObject getElement(final Element context, final EReference reference, final String name) {
    IEObjectDescription element = this.scopeProvider.getScope(this.filePackage(context), reference).getSingleElement(this.nameConverter.toQualifiedName(name));
    EObject _xifexpression = null;
    if ((element == null)) {
      _xifexpression = null;
    } else {
      _xifexpression = element.getEObjectOrProxy();
    }
    return _xifexpression;
  }
  
  private static SysMLLibraryUtil INSTANCE = new AlfStandaloneSetup().createInjector().<SysMLLibraryUtil>getInstance(SysMLLibraryUtil.class);
  
  public static EObject getLibraryElement(final Element context, final EReference reference, final String name) {
    return SysMLLibraryUtil.INSTANCE.getElement(context, reference, name);
  }
}
