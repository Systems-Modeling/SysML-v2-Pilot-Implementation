/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2019 Model Driven Solutions, Inc.
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
 *  Ed Seidewitz
 * 
 *****************************************************************************/
package org.omg.sysml.interactive;

public class VizResult {
    private final String svgResult;
    private final Exception exception;


    public static class UnresolvedException extends Exception {
		private static final long serialVersionUID = 1L;

		public UnresolvedException(String name) {
            super("ERROR:Couldn't resolve reference to Element '" + name + "'\n");
        }
    }

    public boolean hasException() {
        return exception != null;
    }

    public String formatException() {
        if (exception == null) return "";
        return SysMLInteractiveUtil.formatException(exception);
    }

    public String getSVG() {
        return svgResult;
    }

    VizResult(String svg) {
        this.svgResult = svg;
        this.exception = null;
    }

    VizResult(Exception e) {
        this.exception = e;
        this.svgResult = null;
    }

    public static VizResult unresolvedResult(String name) {
        return new VizResult(new UnresolvedException(name));
    }
}

