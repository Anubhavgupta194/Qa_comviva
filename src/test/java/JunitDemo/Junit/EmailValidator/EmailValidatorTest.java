package JunitDemo.Junit.EmailValidator;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

import JunitDemo.Junit.Emailvalidator.EmailValidator;

public class EmailValidatorTest {
	EmailValidator evt=new EmailValidator();;

	
	@Test
	public void testIsValidEmail() {
		assertTrue(evt.isValidEmail("user@example.com"));
		assertFalse(evt.isValidEmail("invalid_email"));
		assertFalse(evt.isValidEmail(null));
	}

	@Test
	public void testIsCorporateEmail() {
		assertTrue(evt.isCorporateEmail("employee@company.com"));
		assertFalse(evt.isCorporateEmail("user@example.com"));
		assertFalse(evt.isCorporateEmail(null));
	}

}
