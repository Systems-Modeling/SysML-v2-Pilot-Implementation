/**
 * SysML 2 Pilot Implementation
 * Copyright (c) 2018 Model Driven Solutions, Inc. and IncQuery Labs Ltd.
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
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 * 
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
 * 
 * Contributors:
 *  Zoltan Kiss
 *  Balazs Grill
 */
package org.omg.sysml.tests;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.eclipse.xtext.resource.XtextSyntaxDiagnostic;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.XtextRunner;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Conversions;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.tests.AlfInjectorProvider;

@RunWith(XtextRunner.class)
@InjectWith(AlfInjectorProvider.class)
@SuppressWarnings("all")
public class AlfParsingTest {
  @Inject
  private ParseHelper<org.omg.sysml.lang.sysml.Package> parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  @Inject
  private Provider<XtextResourceSet> resourceSetProvider;
  
  private ResourceSetImpl getDependency() {
    try {
      final XtextResourceSet rs = this.resourceSetProvider.get();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package Test1{");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class A{}");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("class B{");
      _builder.newLine();
      _builder.append("\t\t\t\t\t");
      _builder.append("feature b: A;");
      _builder.newLine();
      _builder.append("\t\t\t\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("\t\t\t");
      _builder.append("}");
      this.parseHelper.parse(_builder, rs);
      return rs;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScopeWithOnlyDot() {
    try {
      final ResourceSetImpl rs = this.getDependency();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package Test2{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature c : Test1.B.b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final org.omg.sysml.lang.sysml.Package result = this.parseHelper.parse(_builder, rs);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertNoErrors(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScopeWithDotAndFourDot() {
    try {
      final ResourceSetImpl rs = this.getDependency();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package Test2{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature c : Test1.B::b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final org.omg.sysml.lang.sysml.Package result = this.parseHelper.parse(_builder, rs);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertNoErrors(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScopeWithFourDotAndDot() {
    try {
      final ResourceSetImpl rs = this.getDependency();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package Test2{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature c : Test1::B.b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final org.omg.sysml.lang.sysml.Package result = this.parseHelper.parse(_builder, rs);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertNoErrors(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testScopeWithOnlyFourDot() {
    try {
      final ResourceSetImpl rs = this.getDependency();
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package Test2{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class C{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature c : Test1::B::b;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final org.omg.sysml.lang.sysml.Package result = this.parseHelper.parse(_builder, rs);
      Assert.assertNotNull(result);
      this._validationTestHelper.assertNoErrors(result);
      Assert.assertTrue(result.eResource().getErrors().isEmpty());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBadScopeWithOnlyTwoDotAtTheEnd() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package Test3{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class non{}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature aa is non;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature a: A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("feature b: Test3::A:a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final org.omg.sysml.lang.sysml.Package result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      int _length = ((Object[])Conversions.unwrapArray(result.eResource().getErrors(), Object.class)).length;
      boolean _equals = (_length == 1);
      Assert.assertTrue(_equals);
      this._validationTestHelper.assertError(result, SysMLPackage.eINSTANCE.getPackage(), XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBadScopeWithOnlyTwoSingleDotAtTheEnd() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package Test3{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class non{}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature aa is non;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature a: A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature b: Test3::A..a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final org.omg.sysml.lang.sysml.Package result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      int _length = ((Object[])Conversions.unwrapArray(result.eResource().getErrors(), Object.class)).length;
      boolean _equals = (_length == 1);
      Assert.assertTrue(_equals);
      this._validationTestHelper.assertError(result, SysMLPackage.eINSTANCE.getPackage(), XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBadScopeWithOnlyTwoSingleDot() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package Test3{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class non{}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature aa is non;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature a: A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature b: Test3..A::a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final org.omg.sysml.lang.sysml.Package result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      int _length = ((Object[])Conversions.unwrapArray(result.eResource().getErrors(), Object.class)).length;
      boolean _equals = (_length == 2);
      Assert.assertTrue(_equals);
      this._validationTestHelper.assertError(result, SysMLPackage.eINSTANCE.getClass_(), XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC, 148, (-1));
      this._validationTestHelper.assertError(result, SysMLPackage.eINSTANCE.getMembership(), XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC, 150, (-1));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void testBadScopeWithOnlyTwoDot() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("package Test3{");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class non{}");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class A{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature aa is non;");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature a: A;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.newLine();
      _builder.append("\t");
      _builder.append("class B{");
      _builder.newLine();
      _builder.append("\t\t");
      _builder.append("feature b: Test3:A::a;");
      _builder.newLine();
      _builder.append("\t");
      _builder.append("}");
      _builder.newLine();
      _builder.append("}");
      _builder.newLine();
      final org.omg.sysml.lang.sysml.Package result = this.parseHelper.parse(_builder);
      Assert.assertNotNull(result);
      int _length = ((Object[])Conversions.unwrapArray(result.eResource().getErrors(), Object.class)).length;
      boolean _equals = (_length == 2);
      Assert.assertTrue(_equals);
      this._validationTestHelper.assertError(result, SysMLPackage.eINSTANCE.getClass_(), XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC, 148, (-1));
      this._validationTestHelper.assertError(result, SysMLPackage.eINSTANCE.getMembership(), XtextSyntaxDiagnostic.SYNTAX_DIAGNOSTIC, 149, (-1));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
