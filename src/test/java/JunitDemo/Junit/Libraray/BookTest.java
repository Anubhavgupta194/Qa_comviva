package JunitDemo.Junit.Libraray;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BookTest {
	private Book book;

	@Before
	public void setUp() {
		book = new Book("Sample Title", "Sample Author");
	}

	@Test
	public void testGetTitle() {
		assertEquals("Sample Title", book.getTitle());
	}

	@Test
	public void testGetAuthor() {
		assertEquals("Sample Author", book.getAuthor());
	}

	@Test
	public void testIsAvailableInitially() {
		assertTrue(book.isAvailable());
	}

	@Test
	public void testSetAvailable() {
		book.setAvailable(false);
		assertFalse(book.isAvailable());
	}

}
