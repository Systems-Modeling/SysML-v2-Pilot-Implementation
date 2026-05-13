/*******************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2021-2022, 2025 Model Driven Solutions, Inc.
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
 * You should have received a copy of theEclipse Public License
 * along with this program.  If not, see <https://www.eclipse.org/legal/epl-2.0/>.
 *  
 * @license EPL-2.0 <http://spdx.org/licenses/EPL-2.0>
 *  
 *******************************************************************************/

package org.omg.sysml.adapter;

import org.omg.sysml.lang.sysml.Element;
import org.omg.sysml.lang.sysml.Feature;
import org.omg.sysml.lang.sysml.PayloadFeature;
import org.omg.sysml.lang.sysml.SysMLPackage;
import org.omg.sysml.lang.sysml.util.SysMLLibraryUtil;

public class PayloadFeatureAdapter extends FeatureAdapter {

	public PayloadFeatureAdapter(PayloadFeature element) {
		super(element);
	}
	
	@Override
	public PayloadFeature getTarget() {
		return (PayloadFeature)super.getTarget();
	}
	
	/**
	 * @satisfies checkPayloadFeatureRedefinition
	 */
	@Override
	public void addRedefinitions(Element skip) {
		Feature redefinedFeature = (Feature)SysMLLibraryUtil.getLibraryType(getTarget(), getDefaultSupertype("payload"));
		addImplicitGeneralType(SysMLPackage.eINSTANCE.getRedefinition(), redefinedFeature);
	}

}
