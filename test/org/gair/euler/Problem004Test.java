package org.gair.euler;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Problem004Test {

	@Test
	public void test() {
		assertEquals(100002, Problem004.reverse(200001));
		assertEquals(123456, Problem004.reverse(654321));
		
	}
	

}
