/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2026 Obeo
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package org.omg.kerml.xpect.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.omg.kerml.xpect.tests.imports.global.KerMLImportGlobalTest;
import org.omg.kerml.xpect.tests.imports.local.KerMLImportLocalTest;
import org.omg.kerml.xpect.tests.imports.recursive.KerMLImportRecursiveTest;
import org.omg.kerml.xpect.tests.indexing.KerMLIndexerTest;
import org.omg.kerml.xpect.tests.linking.KerMLLinkingTest;
import org.omg.kerml.xpect.tests.linking.ParserAdapterTest;
import org.omg.kerml.xpect.tests.parsing.KerMLParsingTest;
import org.omg.kerml.xpect.tests.scoping.KerMLScopingTest;
import org.omg.kerml.xpect.tests.testsuite.KerMLXtextTest;
import org.omg.kerml.xpect.tests.validation.KerMLValidationTest;
import org.omg.kerml.xpect.tests.visibility.KerMLVisibilityTest;

@SuiteClasses({ 
		KerMLImportGlobalTest.class, //
		KerMLImportLocalTest.class, //
		KerMLImportRecursiveTest.class, //
		KerMLLinkingTest.class,//
		ParserAdapterTest.class, //
		KerMLParsingTest.class, //
		KerMLScopingTest.class, //
		KerMLXtextTest.class, //
		KerMLValidationTest.class, //
		KerMLVisibilityTest.class,
		KerMLIndexerTest.class
})
@RunWith(Suite.class)
public class AllKerMLXpectTests {

}
