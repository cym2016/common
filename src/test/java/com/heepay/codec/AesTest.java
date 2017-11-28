package com.heepay.codec;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author lizongjie
 *
 */
public class AesTest {

	private final static String originalString = "this is new NGP project";
	private final static String privateKey = "heepay613";
	private final static String encryptString = "98BE5CA1FBE2ACCEEC6FF021D084704980E201AAE26922DF5BE700BFE33E4B8C";
	/**
	 * Test method for {@link com.heepay.codec.Aes#encryptStr(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testEncryptStr() {
		assertEquals(encryptString, Aes.encryptStr(originalString, privateKey));
	}

	/**
	 * Test method for {@link com.heepay.codec.Aes#decryptStr(java.lang.String, java.lang.String)}.
	 */
	@Test
	public final void testDecryptStr() {
		assertEquals(originalString, Aes.decryptStr(encryptString, privateKey));
	}

}
