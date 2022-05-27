/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020 Mgnite Inc.
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
 * You should have received a copy of theGNU Lesser General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 *
 * @license LGPL-3.0-or-later <http://spdx.org/licenses/LGPL-3.0-or-later>
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
