package com.nish.calculator.processor.types;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

import org.junit.Test;

import com.nish.calculator.types.OperatorTypes;

public class OperatorTypesTest {

	@Test
	public void testGetValueOfAliseForPlus() {
		assertThat(OperatorTypes.getValueOfAlise("plus"), equalTo(OperatorTypes.PLUS));
	}
	
	@Test
	public void testGetValueOfAliseForAdd() {
		assertThat(OperatorTypes.getValueOfAlise("Add"), equalTo(OperatorTypes.ADD));
	}
	
	@Test
	public void testGetValueOfAliseForMinus() {
		assertThat(OperatorTypes.getValueOfAlise("Minus"), equalTo(OperatorTypes.MINUS));
	}
	@Test
	public void testGetValueOfAliseForSubtract() {
		assertThat(OperatorTypes.getValueOfAlise("subtract"), equalTo(OperatorTypes.SUBTRACT));
	}
	@Test
	public void testGetValueOfAliseForLess() {
		assertThat(OperatorTypes.getValueOfAlise("less"), equalTo(OperatorTypes.LESS));
	}
	@Test
	public void testGetValueOfAliseForTimes() {
		assertThat(OperatorTypes.getValueOfAlise("times"), equalTo(OperatorTypes.TIMES));
	}
	@Test
	public void testGetValueOfAliseForDividedBy() {
		assertThat(OperatorTypes.getValueOfAlise("divided-by"), equalTo(OperatorTypes.DIVIDED_BY));
	}
	@Test
	public void testGetValueOfAliseForOver() {
		assertThat(OperatorTypes.getValueOfAlise("over"), equalTo(OperatorTypes.OVER));
	}
	@Test
	public void testGetValueOfAliseForOverCaseInsensitive() {
		assertThat(OperatorTypes.getValueOfAlise("OVER"), equalTo(OperatorTypes.OVER));
	}

}
