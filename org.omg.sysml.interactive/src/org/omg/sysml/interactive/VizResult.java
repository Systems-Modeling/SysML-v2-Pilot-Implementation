/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2020, 2021 Mgnite Inc.
 * Copyright (c) 2020, 2021 Model Driven Solutions, Inc.
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
 *  Hisashi Miyashita, Mgnite
 *  Ed Seidewitz, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.interactive;

import org.omg.sysml.util.SysMLUtil;

public class VizResult {
    public static enum Kind {
    	EXCEPTION,
        EMPTY,
        PLANTUML,
        TEXT,
        SVG
    }

    public final Kind kind;
    private final String result;
    private final Exception exception;
    
    public static class VizException extends Exception {
		private static final long serialVersionUID = 1L;
		
    	public VizException(String message) {
			super(message);
		}
    }

    public static class UnresolvedException extends VizException {
		private static final long serialVersionUID = 1L;

		public UnresolvedException(String name) {
            super("ERROR:Couldn't resolve reference to Element '" + name + "'\n");
        }
    }

    public boolean hasException() {
        return exception != null;
    }

    public String formatException() {
        return this.exception == null? "":
        	   this.exception instanceof VizException? this.exception.getMessage():
        	   this.exception instanceof IllegalArgumentException? "ERROR:" + this.exception.getMessage():
        		   SysMLUtil.formatException(exception);
    }

    public String getPlantUML() {
        switch (kind) {
        case EMPTY:
            return "";
        case PLANTUML:
            return result;
        default:
            return null;
        }
    }

    public String getText() {
        switch (kind) {
        case TEXT:
            return result;
        default:
            return null;
        }
    }

    public String getSVG() {
        switch (kind) {
        case EMPTY:
            return "";
        case SVG:
            return result;
        default:
            return null;
        }
    }

    private VizResult(Kind kind, String result) {
        this.kind = kind;
        this.result = result;
        this.exception = null;
    }

    private VizResult(Exception e) {
    	this.kind = Kind.EXCEPTION;
        this.exception = e;
        this.result = null;
    }

    public static VizResult svgResult(String svg) {
        if (svg == null) return emptyResult();
        return new VizResult(Kind.SVG, svg);
    }

    public static VizResult plantumlResult(String plantuml) {
        if (plantuml == null) return emptyResult();
        return new VizResult(Kind.PLANTUML, plantuml);
    }

    public static VizResult textResult(String text) {
        if (text == null) return emptyResult();
        return new VizResult(Kind.TEXT, text);
    }

    public static VizResult unresolvedResult(String name) {
        return new VizResult(new UnresolvedException(name));
    }
    
    public static VizResult vizExceptionResult(String message) {
    	return new VizResult(new VizException(message));
    }

    public static VizResult emptyResult() {
        return new VizResult(Kind.EMPTY, "");
    }

    public static VizResult exceptionResult(Exception e) {
        return new VizResult(e);
    }
    
    public String toString() {
    	return this.kind == Kind.EXCEPTION? this.formatException():
    		   this.kind + "\n" + this.result;
    }
}

