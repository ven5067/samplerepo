package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {
	// AACD => CD ACD=>CD CDEF=>CDEF CDAA=>CDAA
	StringHelper helper=new StringHelper();
	
	@Test
	public void testTruncateAInFirst2Positions_AinFirstTwoPosition() {
		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
		// expected,actual
	}

	@Test
	public void testTruncateAInFirst2Positions2_AinFirstPosition() {
		assertEquals("CDA", helper.truncateAInFirst2Positions("ACD"));
		// expected,actual
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicNativeScenario(){
		//ABCD=>true, ABAB=>true, AB=>true, A=>false
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_BasicPositiveScenario(){
		//ABCD=>true, ABAB=>true, AB=>true, A=>false
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

}
