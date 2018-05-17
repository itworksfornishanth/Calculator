package com.nish.calculator.processor.impl;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.nish.calculator.processor.Calculator;
/**
 * This test is performing a kind of integration test by calling entry method with expected input
 * @author n.mathew.joy
 *
 */
public class CalculatorImplTest {
	private Calculator calculator = new CalculatorImpl();

	@Test
	public void testProcessArithemeticOperationsInputOne() {

		assertThat(calculator.processArithemeticOperations("nine over eight plus four times two divided-by three"),
				equalTo(3.79));
	}
	
	@Test
	public void testProcessArithemeticOperationsInputTwo() {

		assertThat(calculator.processArithemeticOperations("one plus six"),
				equalTo(7.0));
	}
	
	@Test
	public void testProcessArithemeticOperationsInputThree() {

		assertThat(calculator.processArithemeticOperations("one plus two times three"),
				equalTo(7.0));
	}
	
	@Test
	public void testProcessArithemeticOperationsInputFour() {

		assertThat(calculator.processArithemeticOperations("nine minus three times seven"),
				equalTo(-12.0));
	}
	
	@Test
	public void testProcessArithemeticOperationsInputFive() {

		assertThat(calculator.processArithemeticOperations("four minus eight plus six times nine"),
				equalTo(50.0));
	}
	
	@Test
	public void testProcessArithemeticOperationsInputSix() {

		assertThat(calculator.processArithemeticOperations("seven over nine plus two"),
				equalTo(2.78));
	}
	/**
	 * This test exception is thrown when there is an invalid input
	 */
	@Test(expected =IllegalArgumentException.class)
	public void testProcessArithemeticOperationsInputInvalid() {

		calculator.processArithemeticOperations("7 over nine plus two");
				
	}

}
