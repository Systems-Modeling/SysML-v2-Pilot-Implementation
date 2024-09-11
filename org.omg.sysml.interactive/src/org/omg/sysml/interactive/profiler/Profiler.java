/*****************************************************************************
 * SysML 2 Pilot Implementation
 * Copyright (c) 2024 Model Driven Solutions, Inc.
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
 *  Laszlo Gati, MDS
 *  Zoltan Ujhelyi, MDS
 * 
 *****************************************************************************/
package org.omg.sysml.interactive.profiler;

import java.io.PrintStream;
import java.time.Duration;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

import com.google.common.base.Stopwatch;
import com.google.inject.Singleton;

@Singleton
public class Profiler {
	private final Stopwatch globalTimer = Stopwatch.createUnstarted();
	
	private final Map<String, Duration> operationStartTimes = new HashMap<>();
	
	private final Map<String, Integer> operationCallStack = new HashMap<>();
	
	private final Map<String, Integer> operationCallCount = new HashMap<>();
	private final Map<String, Duration> totalTimeSpentInOperations = new TreeMap<>();
	
	private final Deque<Operation> operationStack = new LinkedList<>();
	
	private final List<Operation> operationRoots = new LinkedList<>();
	
	public void reset() {
		globalTimer.reset();
		operationStartTimes.clear();
		operationCallStack.clear();
		totalTimeSpentInOperations.clear();
		operationStack.clear();
	}
	
	/**
	 * Marks the start of an operation. Time spent executing the operation is
	 * measured. In case of nested operations of the same kind only the outermost
	 * operation's time is measured. Additionally an execution trace is produced of
	 * the operations. Use {@link Profiler#operationFinished(Object, String, String)} to mark the end of the operation.
	 * 
	 * @param caller     object executing the operation, currently unused
	 * @param operation  name of the operation
	 * @param parameters additional information regarding the operation like values
	 *                   of variables when the operation started
	 */
	public void operationStarted(Object caller, String operation, String... parameters) {
		
		if (!globalTimer.isRunning()) {
			globalTimer.start();
		}
		
		if (!operationCallStack.containsKey(operation)) {
			operationStartTimes.put(operation, globalTimer.elapsed());
			operationCallStack.put(operation, 1);
		} else {
			operationCallStack.compute(operation, (k, v) -> ++v);
		}
		
		if (!operationCallCount.containsKey(operation)) {
			operationCallCount.put(operation, 1);
		} else {
			operationCallCount.compute(operation, (k, v) -> ++v);
		}
		
		Operation lastOperation = operationStack.peek();
		Operation currentOperation = new Operation(operation, lastOperation, parameters, globalTimer.elapsed());
		operationStack.push(currentOperation);
		
		if (lastOperation == null) {
			operationRoots.add(currentOperation);
		}
	}
	
	/**
	 * Marks the end of an operation. {@link Profiler#operationStarted(Object, String, String...)} should be called first.
	 * 
	 * @param caller      object executing the operation, currently unused
	 * @param operation   name of the operation
	 * @param returnValue additional information at the end of the operation like
	 *                    return values of methods
	 */
	public void operationFinished(Object caller, String operation, String returnValue) {
		if (operationCallStack.compute(operation, (k, v) -> --v) == 0) {
			Duration duration = globalTimer.elapsed().minus(operationStartTimes.get(operation));
			Duration totalDuration = totalTimeSpentInOperations.computeIfAbsent(operation, key -> Duration.ZERO).plus(duration);
			totalTimeSpentInOperations.put(operation, totalDuration);
			operationCallStack.remove(operation);
		}
		
		Operation currentOperation = operationStack.pop();
		currentOperation.returnValue = returnValue;
		currentOperation.finishTime = globalTimer.elapsed();
	}
	
	public void printOperationTotalTimes(PrintStream out) {
		totalTimeSpentInOperations.forEach((operation, duration) -> {
			int callCount = operationCallCount.get(operation);
			long totalDuration = duration.toMillis();
			out.println(String.format("%s total time spent: %d ms (count: %d, avg: %d ms)", operation, totalDuration, callCount, totalDuration/callCount));
		});
	}
	
	public void printInstrumentationData(PrintStream out) {
		for (Operation operation: operationRoots) {
			operation.print(out, 0);
		}
	}
	
	private class Operation {
		private final String name;
		private final String[] parameters;
		private String returnValue = "NULL";
		private final List<Operation> children = new LinkedList<>();
		private final Operation parent;
		private final Duration startTime;
		private Duration finishTime = Duration.ZERO;
		
		public Operation(String name, Operation parent, String[] parameters, Duration startTime) {
			this.name = name;
			this.parent = parent;
			
			if (parent != null) {
				parent.children.add(this);
			}
			
			this.parameters = parameters;
			this.startTime = startTime;
		}
		
		public void print(PrintStream out, int indentation) {
			
			Duration duration = finishTime.minus(startTime);
			
			addIndentation(out, indentation);
			out.println(name + "[" + duration.toMillis() +" ms]"+ "(" + Arrays.asList(parameters).stream().collect(Collectors.joining(", ")) + "){");
			for (Operation child: children) {
				child.print(out, indentation + 1);
			}
			addIndentation(out, indentation + 1);
			out.println("returns " + returnValue);
			addIndentation(out, indentation);
			out.println("}");
		}
	}
	
	private static void addIndentation(PrintStream out, int indentation) {
		for (int i = 0; i < indentation; i++) {
			out.print(' ');
		}
	}
}
