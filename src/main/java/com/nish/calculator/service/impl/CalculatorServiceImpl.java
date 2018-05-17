package com.nish.calculator.service.impl;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

import com.nish.calculator.dto.CalculatorDto;
import com.nish.calculator.service.CalculatorService;
import com.nish.calculator.types.NumberTypes;
import com.nish.calculator.types.OperatorTypes;

/**
 * This class implements logic for performing operation and it internaly
 * converts natural language operations from infix to reverse polish notation
 * using shunting yard algorithm
 * 
 * @author Nishanth Mathew Joy
 *
 */
public class CalculatorServiceImpl implements CalculatorService {

	private static CalculatorService instance = new CalculatorServiceImpl();

	public static CalculatorService getInstance() {
		return instance;
	}

	@Override
	public double calculateOutputofOperations(List<String> tokens) {
		List<CalculatorDto> rpnToken = infixToRPN(tokens);
		return performFinalOperation(rpnToken);
	}

	/**
	 * checks for operator precedence and left association and assign to output
	 * to perform rpn
	 * 
	 * @param infixInput
	 * @return
	 */
	private List<CalculatorDto> infixToRPN(List<String> infixInput) {
		List<CalculatorDto> outPut = new ArrayList<>();
		Deque<CalculatorDto> operator = new LinkedList<>();
		infixInput.stream().forEach(token -> {
			if (NumberTypes.isNumber(token)) {
				outPut.add(new CalculatorDto(NumberTypes.getNumberTypeText(token)));

			} else {
				OperatorTypes operatorType = OperatorTypes.getValueOfAlise(token);
				while (!operator.isEmpty() && operatorType.getOperatorPrecedence() <= operator.peek().getOperatorTypes()
						.getOperatorPrecedence()) {
					outPut.add(operator.pop());
				}
				operator.push(new CalculatorDto(operatorType));

			}
		});
		while (!operator.isEmpty()) {
			outPut.add(operator.pop());
		}
		return outPut;
	}

	/**
	 * Performs final operation on Reverse polish notation input with help of
	 * double binary operator available in operator type and final output will
	 * be available as last element on Deque
	 * 
	 * @param rpmInput
	 * @return
	 */
	private double performFinalOperation(List<CalculatorDto> rpmInput) {

		Deque<Double> numbers = new LinkedList<>();
		rpmInput.stream().forEach(calculatorDto -> {
			if (calculatorDto.getOperatorTypes() != null) {
				double rightOperant = numbers.pop();
				double leftOperant = numbers.pop();
				numbers.push(calculatorDto.getOperatorTypes().getDoubleBinaryOperator().applyAsDouble(leftOperant,
						rightOperant));

			} else {
				numbers.push((double) calculatorDto.getNumberTypes().getNumber());

			}
		});
		return Math.round(numbers.pop() * 100D) / 100D;
	}

}
