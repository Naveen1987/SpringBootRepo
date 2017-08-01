package com.demo;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class ExtestingTest {

	@Test(timeout=0)
	public void testGet() {
		new Extesting().get(1, 1);
	}

}
