package readable.code.playground;

import static org.junit.Assert.*;

import org.junit.Test;

import readable.code.playground.Strings;

public class StringsTest {

	@Test
	public void testCapitalize_null() {
		assertNull(Strings.capitalize(null));
	}

	@Test
	public void testCapitalize_blank() {
		assertEquals("", Strings.capitalize(""));
	}

	@Test
	public void testCapitalize_multiLetter() {
		assertEquals("Abc", Strings.capitalize("abc"));
	}

	@Test
	public void testCapitalize_oneLetter() {
		assertEquals("A", Strings.capitalize("a"));
	}
}