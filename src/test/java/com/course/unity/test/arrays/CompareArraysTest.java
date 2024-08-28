package com.course.unity.test.arrays;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CompareArraysTest {

	@Test
	void compareArrays() {
		int[] numbers = {17,8 , 35 ,21};
		int[] expected = {8,17,21,35};
		
		Arrays.sort(numbers);
		
		assertArrayEquals(numbers, expected);
 	}
}
