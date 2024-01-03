package JunitDemo.Junit.Libraray;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class LibrarayTest {
	private LibrarayCatalog libraryCatalog;
	private Book book1;
	private Book book2;

	@Before
	public void setUp() {
		libraryCatalog = new LibrarayCatalog();
		book1 = new Book("Book 1", "Author 1");
		book2 = new Book("Book 2", "Author 2");
		libraryCatalog.addBook(book1);
		libraryCatalog.addBook(book2);
	}

	@Test
	public void testAddBook() {
		List<Book> books = libraryCatalog.getBooks();
		assertEquals(2, books.size());
	}

	@Test
	public void testBorrowBook() {
		libraryCatalog.borrowBook("Book 1");
		assertFalse(book1.isAvailable());
	}

	@Test
	public void testReturnBook() {
		book2.setAvailable(false);
		libraryCatalog.returnBook("Book 2");
		assertTrue(book2.isAvailable());
	}

	@Test
	public void testBorrowUnavailableBook() {
		libraryCatalog.borrowBook("Book 1");
		libraryCatalog.borrowBook("Book 1"); // Borrow the same book again
		assertFalse(book1.isAvailable());
	}

	@Test
	public void testReturnAvailableBook() {
		libraryCatalog.returnBook("Book 1"); // Return book which is already available
		assertTrue(book1.isAvailable());
	}
}
