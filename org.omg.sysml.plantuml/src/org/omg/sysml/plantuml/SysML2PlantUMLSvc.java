/*****************************************************************************
 * SysML 2 Pilot Implementation, PlantUML Visualization
 * Copyright (c) 2020, 2021 Mgnite Inc.
 * Copyright (c) 2021 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz, Model Driven Solutions, Inc.
 * 
 *****************************************************************************/

package org.omg.sysml.plantuml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;

import org.eclipse.emf.ecore.EObject;

import net.sourceforge.plantuml.FileFormat;
import net.sourceforge.plantuml.FileFormatOption;
import net.sourceforge.plantuml.OptionFlags;
import net.sourceforge.plantuml.SourceStringReader;

public class SysML2PlantUMLSvc {
    private final SysML2PlantUMLText s2Text;

    public void setGraphVizPath(String path) {
        OptionFlags.getInstance().setDotExecutable(path);
    }

    private SysML2PlantUMLText.MODE mode = SysML2PlantUMLText.MODE.Default;

    private static <T extends Enum<?>> String getPossibleValues(Class<T> en) {
        StringBuilder sb = new StringBuilder();
        for (T e : en.getEnumConstants()) {
            sb.append(e.name());
            sb.append(' ');
        }
        return sb.toString();
    }

    public void setView(String view) {
        for (SysML2PlantUMLText.MODE m: SysML2PlantUMLText.MODE.values()) {
            if (m.name().equalsIgnoreCase(view)) {
                this.mode = m;
                return;
            }
        }
        throw new IllegalArgumentException("Invalid View: " + view
                                           + " View candidates are: "
                                           + getPossibleValues(SysML2PlantUMLText.MODE.class));
    }

    private void applyStyle(List<String> styles) {
        s2Text.clearStyle();
        boolean addDefault = true;
        if (styles != null) {
            for (String style: styles) {
                SysML2PlantUMLStyle s = SysML2PlantUMLStyle.get(style);
                if (s.isPrimary()) addDefault = false;
                s2Text.addStyle(s);
            }
        }
        if (addDefault) {
            s2Text.addStyle(SysML2PlantUMLStyle.getDefault());
        }
    }

    public String getPlantUMLCode(List<EObject> eObjs, List<String> styles) {
        if (eObjs.isEmpty()) return null;
        // Setup Visualization Mode with the first item.
        s2Text.setupVisualizationEObjects(eObjs.get(0));
        s2Text.setMode(mode);
        applyStyle(styles);

        StringBuilder sb = new StringBuilder("@startuml\n");
        sb.append(s2Text.sysML2PUML(eObjs));
        sb.append("@enduml\n");

        return sb.toString();
    }
    
    public String getSVG(List<EObject> eObjs, List<String> styles) throws IOException {
        String pcode = getPlantUMLCode(eObjs, styles);

        final FileFormatOption ffo = new FileFormatOption(FileFormat.SVG);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        SourceStringReader reader = new SourceStringReader(pcode);
        reader.outputImage(bos, ffo);

        return bos.toString("UTF-8");
    }

    public SysML2PlantUMLSvc(SysML2PlantUMLLinkProvider linkProvider) {
        this.s2Text = new SysML2PlantUMLText(linkProvider);
    }
}
