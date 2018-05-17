package com.nish.calculator.processor.types;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertThat;

import org.junit.Test;

import com.nish.calculator.types.NumberTypes;

public class NumberTypesTest {

	@Test
	public void testgetNumberTypeTextForZero() {
		assertThat(NumberTypes.getNumberTypeText("Zero"), equalTo(NumberTypes.ZERO));
	}
	@Test
	public void testgetNumberTypeTextForOne() {
		assertThat(NumberTypes.getNumberTypeText("one"), equalTo(NumberTypes.ONE));
	}
	@Test
	public void testgetNumberTypeTextForTwo() {
		assertThat(NumberTypes.getNumberTypeText("two"), equalTo(NumberTypes.TWO));
	}
	@Test
	public void testgetNumberTypeTextForThree() {
		assertThat(NumberTypes.getNumberTypeText("three"), equalTo(NumberTypes.THREE));
	}
	@Test
	public void testgetNumberTypeTextForFour() {
		assertThat(NumberTypes.getNumberTypeText("four"), equalTo(NumberTypes.FOUR));
	}
	@Test
	public void testgetNumberTypeTextForFive() {
		assertThat(NumberTypes.getNumberTypeText("five"), equalTo(NumberTypes.FIVE));
	}
	@Test
	public void testgetNumberTypeTextForSix() {
		assertThat(NumberTypes.getNumberTypeText("six"), equalTo(NumberTypes.SIX));
	}
	@Test
	public void testgetNumberTypeTextForSeven() {
		assertThat(NumberTypes.getNumberTypeText("Seven"), equalTo(NumberTypes.SEVEN));
	}
	@Test
	public void testgetNumberTypeTextForEight() {
		assertThat(NumberTypes.getNumberTypeText("Eight"), equalTo(NumberTypes.EIGHT));
	}
	@Test
	public void testgetNumberTypeTextForNine() {
		assertThat(NumberTypes.getNumberTypeText("Nine"), equalTo(NumberTypes.NINE));
	}
	@Test
	public void testgetNumberTypeTextForTen() {
		assertThat(NumberTypes.getNumberTypeText("TEN"), equalTo(NumberTypes.TEN));
	}

}
