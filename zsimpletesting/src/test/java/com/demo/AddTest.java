package com.demo;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class AddTest {

	@Test
	@Ignore
	public void testAdd() {
		fail("Not yet implemented");
	}
	@Test
    public void testAddArray() throws Exception {
//        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});
		assertArrayEquals(new int[]{1,2,3,4},new Add().addArray());
    }

}
