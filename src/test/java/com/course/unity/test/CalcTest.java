package com.course.unity.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@DisplayName("Test Math Operation")
public class CalcTest {
	
	SimpleCalc simpleCalc = new SimpleCalc();
	double resultSum;
	double expected;
	double firstNumber = 5;
	double secondNumber = 4.5;
	@BeforeEach
	void beforeEach() {
		firstNumber = 5;
		secondNumber = 4.5;
	}
	
	@Test
	@DisplayName("test 5 + 4.6 = 9.5")
	public void testSum_when_Five_is_addBy_FourDotFive_ShouldReturnNineDotFive() {
		firstNumber = 5;
		secondNumber = 4.5;
		resultSum = simpleCalc.sum(firstNumber, secondNumber);
		expected = 9.5;
		assertEquals(expected, resultSum,()->"The "+firstNumber+" sum with "+secondNumber+" not produce the "+expected);
	}
	
	@Test
	@DisplayName("test 10 - 9 = 1")
	public void testSubtration_when_ten_is_subtrationBy_nine_shouldReturnOne() {
		firstNumber = 10;
		secondNumber = 9;
		double result = simpleCalc.sub(firstNumber, secondNumber);
		expected = 1;
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("test 7 * 3 = 21")
	public void test_multiplication_when_seven_multiplyByThree_ShouldReturn_Twenty_one() {
		firstNumber = 7;
		secondNumber = 3;
		double result = simpleCalc.multiplication(firstNumber, secondNumber);
		expected = 21;
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("test 10 / 5 = 2")
	public void test_Division_ten_divisionBy_five_shouldReturn_Two() {
		firstNumber = 10;
		secondNumber = 5;
		double result = simpleCalc.division(firstNumber, secondNumber);
		expected = 2;
		assertEquals(expected, result);
	}
	
	@Test
	@DisplayName("test 10 / 0 ")
	public void test_Division_ten_divisionBy_Zero_shouldReturn_Throw() {
		firstNumber = 10;
		secondNumber = 0;
		var ExpectedMessage = "Impossible to divide by zero!";
		ArithmeticException actual = assertThrows(ArithmeticException.class, ()->{
			simpleCalc.division(firstNumber, secondNumber);
		});
		
		assertEquals(ExpectedMessage, actual.getMessage());
	}
	
	@Test
	@DisplayName("test squate root of 25 = 5")
	public void squareRootTest() {
		double number = 25;
		expected = 5;
		double result = simpleCalc.squareRoot(number);
		assertEquals(expected, result);
	}
	
}
