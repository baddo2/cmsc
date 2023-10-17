/*
 * Class: CMSC203 
 * Instructor: Khandan Vahabzadeh Monshi
 * Description: Java program to encrypt and decrypt a phrase using two similar approaches, each insecure by modern standards.  
 * Due: 10/16/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: _Brian Addo__
*/
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CryptoManagerTestStudent {

	@Test
	void testIsStringInBounds() {
		assertTrue(CryptoManager.isStringInBounds("JAVA"));
		assertFalse(CryptoManager.isStringInBounds("{c0Ol b3AnS}"));

	}

	@Test
	void testCaesarEncryption() {
		assertEquals("UIJT!BTTJHONFOU!XBT!TP!EJGGJDVMU", CryptoManager.caesarEncryption("THIS ASSIGNMENT WAS SO DIFFICULT", 1));
	}

	@Test
	void testBellasoEncryption() {
        assertEquals("FEEBF", CryptoManager.bellasoEncryption("ECBAD", "ABC"));
	}

	@Test
	void testCaesarDecryption() {
		assertEquals("I LOVE SOCCER", CryptoManager.caesarDecryption("O&RU\\K&YUIIKX", 6));
	}

	@Test
	void testBellasoDecryption() {
		assertEquals("SPONGEBOB IS GREAT", CryptoManager.bellasoDecryption("WUR  UVSG#[,0[VJD&", "DECRYPT"));
	}

}
