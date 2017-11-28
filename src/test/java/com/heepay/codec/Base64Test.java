package com.heepay.codec;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class Base64Test {

	private final static String originalString = "this is new NGP project";
	private final static String encryptString = "dGhpcyBpcyBuZXcgTkdQIHByb2plY3Q=";

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testEncode() {
		assertEquals(encryptString, Base64.encode(originalString.getBytes()));
	}

	@Test
	public final void testDecode() throws CodecException {
		assertEquals(originalString, new String(Base64.decode(encryptString)));
	}

}
