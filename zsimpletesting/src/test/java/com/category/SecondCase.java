package com.category;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.experimental.categories.Category;

public class SecondCase {

	
	@Category(Second.class)
	@Test
	public void C() {
		assertEquals("C", "C");
	}

}
