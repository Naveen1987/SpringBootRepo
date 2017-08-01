package com.category;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class FirstCase {
	@Test
	public void A() {
		assertEquals("A", "A");
	}
	
	@Category(First.class)
	@Test
	public void B() {
		assertEquals("B", "B");
	}
}
