package JunitDemo.Junit.StringUtils;

import static org.junit.Assert.*;

import org.junit.Test;


public class StringUtilsTest {
	StringUtils st = new StringUtils();

	@Test
	public void testReverse() {

		// Test cases for reverse method
		assertEquals("olleh", st.reverse("hello"));
		assertEquals("", st.reverse(""));
		assertEquals("12345", st.reverse("54321"));
		assertEquals("a", st.reverse("a"));
		assertEquals("madam", st.reverse("madam"));

		// Additional assertions with assertNotEquals and assertNotNull
		assertNotEquals("hello", st.reverse("hello"));
		assertNotNull(st.reverse("123"));
	}

	@Test
	public void testIsPalindrome() {

		// Test cases for isPalindrome method
		assertTrue(st.isPalindrome("radar"));
		assertTrue(st.isPalindrome(""));
		assertFalse(st.isPalindrome("hello"));
		assertTrue(st.isPalindrome("madam"));
		assertTrue(st.isPalindrome("racecar"));
		assertFalse(st.isPalindrome("world"));

		// Additional assertions with assertTrue and assertFalse
		assertTrue(st.isPalindrome("level"));
		assertFalse(st.isPalindrome("algorithm"));
	}

	@Test
	public void testConcatenate() {

		// Test cases for concatenate method
		assertEquals("HelloWorld", st.concatenate("Hello", "World"));
		assertEquals("Test", st.concatenate("Test", ""));
		assertEquals("123", st.concatenate("", "123"));
		assertEquals("OpenAI", st.concatenate("Open", "AI"));

		// Additional assertions with assertNotEquals 
		assertNotEquals("OpenAI", st.concatenate("Open ", "AI"));
		
	}

	@Test
	public void testCountOccurrences() {

		// Test cases for countOccurrences methods
		assertEquals(2, st.countOccurrences("hello", 'l'));
		assertEquals(0, st.countOccurrences("", 'a'));
		assertEquals(3, st.countOccurrences("banana", 'a'));
		assertEquals(4, st.countOccurrences("mississippi", 's'));
		assertEquals(1, st.countOccurrences("testing", 'g'));

	}
}
