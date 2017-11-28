/**
 * 
 */
package com.heepay.codec;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jerry
 *
 */
public class Base32Test {

	private final static String originalString = "this is new NGP project";
	private final static String encryptString = "ehk6isp0d5pi0rj5esg4shqg41o74rraclhn8";

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.heepay.codec.Base32#encode(byte[])}.
	 */
	@Test
	public final void testEncode() {
		assertEquals(encryptString, Base32.encode(originalString.getBytes()));
	}

	/**
	 * Test method for {@link com.heepay.codec.Base32#decode(java.lang.String)}.
	 * @throws Exception 
	 */
	@Test
	public final void testDecode() throws Exception {
		assertEquals(originalString, new String(Base32.decode(encryptString)));
	}

}
