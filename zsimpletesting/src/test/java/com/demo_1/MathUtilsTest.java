package com.demo_1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MathUtilsTest {

	int a,b,expected;
	
	MathUtils m=new MathUtils();
	public MathUtilsTest(int a, int b, int expected) {
		this.a = a;
		this.b = b;
		this.expected = expected;
	}

	@Parameters
	public static Collection<Object[]>data(){
		Object a[][]=new Object[][]{{1,2,2},{1,3,4}};
		return Arrays.asList(a);
	}

	@Test
	public void testAdd() {
		assertEquals(expected, m.add(a, b));
	}

}
