/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020 Mgnite Inc.
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
 * Contributors:
 *  Hisashi Miyashita, Mgnite Inc.
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml.eclipse;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;
import org.omg.sysml.lang.sysml.Element;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

    //private BundleContext bundleContext;
    private static Activator _default;

    public static Activator getDefault() {
        return _default;
    }

    /**
     * This method is called upon plug-in activation
     */
    @Override
    public void start(BundleContext context) throws Exception {
        //this.bundleContext = context;
        _default = this;
    }

    /**
     * This method is called when the plug-in is stopped
     */
    @Override
    public void stop(BundleContext context) throws Exception {
        //this.bundleContext = null;
    }

    private Map<String, Element> elementsMap = new HashMap<String, Element>();

    private synchronized Element get(String id) {
        return elementsMap.get(id);
    }

    private synchronized String register(EObject eObj) {
        if (!(eObj instanceof Element)) return null;
        Element e = (Element) eObj;
        String id = e.getElementId();
        if (id == null) return null;
        elementsMap.put(id, e);
        return id;
    }

    public static EObject findEObject(String id) {
        return getDefault().get(id);
    }

    public static String registerEObject(EObject eObj) {
        return getDefault().register(eObj);
    }

}
