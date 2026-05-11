/**
 * SysML 2 Pilot Implementation
  * Copyright (c) 2020 Model Driven Solutions, Inc. 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the Eclipse Public License as published by
 * the Eclipse Foundation, version 2 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * Eclipse Public License for more details.
 *
 * You should have received a copy of the Eclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 * 
 * Contributors:
 *  Zoltan Ujhelyi, MDS
 */
package org.omg.kerml.xtext.ui.outline;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.swt.graphics.Image;
import org.eclipse.xtext.ui.editor.outline.IOutlineNode;
import org.eclipse.xtext.ui.editor.outline.impl.AbstractOutlineNode;

/**
 * This class is used as an alternative outline node implementation for
 * generalization classes that do not expect a related EObject to be added.
 *
 */
public class ImplicitNode extends AbstractOutlineNode {

	public ImplicitNode(IOutlineNode parent, Image image, EClass eClass) {
		super(parent, image, eClass.getName() + " (implicit)", false);
	}
	
	public ImplicitNode(IOutlineNode parent, Image image, String text) {
		super(parent, image, text + " (implicit)", false);
	}
	
}
