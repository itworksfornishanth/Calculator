package com.nish.calculator.processor;

/**
 * This class is the main entry point where we have calculation starts from
 * getting value from console and calling service
 * 
 * @author Nishanth Mathew Joy
 *
 */
public interface Calculator {
	/**
	 * 
	 * @param operationInput
	 * @return
	 */
	public double processArithemeticOperations(String operationInput);
}
