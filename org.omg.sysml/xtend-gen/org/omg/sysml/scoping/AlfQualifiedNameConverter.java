package org.omg.sysml.scoping;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.eclipse.xtext.naming.IQualifiedNameConverter;
import org.eclipse.xtext.naming.QualifiedName;
import org.eclipse.xtext.util.Strings;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class AlfQualifiedNameConverter implements IQualifiedNameConverter {
  @Override
  public QualifiedName toQualifiedName(final String qualifiedNameAsText) {
    QualifiedName _xblockexpression = null;
    {
      Preconditions.checkArgument((qualifiedNameAsText != null), "Qualified name cannot be null");
      boolean _isEmpty = qualifiedNameAsText.isEmpty();
      boolean _not = (!_isEmpty);
      Preconditions.checkArgument(_not, "Qualified name cannot be empty");
      final String delimeter = this.toString();
      boolean _isEmpty_1 = delimeter.isEmpty();
      if (_isEmpty_1) {
        return QualifiedName.create(qualifiedNameAsText);
      }
      final char c = '.';
      final List<String> PartsAfterDotSplit = Strings.split(qualifiedNameAsText, c);
      final ArrayList<String> ret = CollectionLiterals.<String>newArrayList();
      final Consumer<String> _function = (String e) -> {
        ret.addAll(Strings.split(e, "::"));
      };
      PartsAfterDotSplit.forEach(_function);
      _xblockexpression = QualifiedName.create(ret);
    }
    return _xblockexpression;
  }
  
  @Override
  public String toString(final QualifiedName name) {
    if ((name == null)) {
      throw new IllegalArgumentException("Qualified name cannot be null");
    }
    return name.toString("::");
  }
}
