package com.bridgelabz.basicprogramming;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bridgelabz.utility.Util;

class HelloTest {

	@Test
	void replace() {
		String x=Util.replace("deepika");
		assertEquals("hello deepika,how are you?",x);
	}

}
