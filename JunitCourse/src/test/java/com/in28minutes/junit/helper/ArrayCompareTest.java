package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;

import org.junit.AfterClass;
import org.junit.Test;

public class ArrayCompareTest {

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testArraySort_RandomArray() {
			int[] numbers={12,3,4,1};
			int[] expected={1,3,4,12};
			Arrays.sort(numbers);
			assertArrayEquals(expected,numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testArraySort_NullArray() {
			int[] numbers=null;
			Arrays.sort(numbers);
	}
	
	@Test(timeout=5)
	public void testSort_Performance(){
		int[] array={12,23,4};
		for(int i=0;i<=100000;i++){
			array[0]=i;
			Arrays.sort(array);
		}
	}

}
