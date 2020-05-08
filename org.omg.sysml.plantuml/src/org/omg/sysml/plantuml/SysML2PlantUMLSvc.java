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

package org.omg.sysml.plantuml;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

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

    public void setView(String view) {
		mode = SysML2PlantUMLText.MODE.valueOf(view);
    }

    public String getSVG(EObject e) throws IOException {
        s2Text.setupVisualizationEObjects(e);
        s2Text.setMode(mode);
        String text = s2Text.sysML2PUML(Arrays.asList(e));
        final FileFormatOption ffo = new FileFormatOption(FileFormat.SVG);
        ByteArrayOutputStream bos = new ByteArrayOutputStream();

        SourceStringReader reader = new SourceStringReader(text);
        reader.outputImage(bos, ffo);

        return bos.toString("UTF-8");
    }

    public SysML2PlantUMLSvc(SysML2PlantUMLLinkProvider linkProvider) {
        this.s2Text = new SysML2PlantUMLText(linkProvider);
    }
}
