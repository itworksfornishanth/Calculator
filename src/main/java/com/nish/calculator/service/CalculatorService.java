package com.nish.calculator.service;

import java.util.List;

/**
 * This service class exposed main method for performing operation
 * 
 * @author Nishanth Mathew Joy
 *
 */
public interface CalculatorService {
	/**
	 * This method does calculation of input operation with help of Shunding
	 * yard algorithm
	 * 
	 * @param tokens
	 * @return
	 */
	public double calculateOutputofOperations(List<String> tokens);

}
