package readable.code.playground;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringsTest {

	@Test
	public void testCapitalizeInitialCharacter_null() {
		assertNull(Strings.capitalizeInitialCharcter(null));
	}

	@Test
	public void testCapitalizeInitialCharacter_blank() {
		assertEquals("", Strings.capitalizeInitialCharcter(""));
	}

	@Test
	public void testCapitalizeInitialCharacter_multiLetter() {
		assertEquals("Abc", Strings.capitalizeInitialCharcter("abc"));
	}

	@Test
	public void testCapitalizeInitialCharacter_oneLetter() {
		assertEquals("A", Strings.capitalizeInitialCharcter("a"));
	}
}