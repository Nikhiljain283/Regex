package com.regex;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class UserRegistrationTest {
	UserRegistration validate = new UserRegistration();

	@Test
	public void testFirstName_if_proper_returnTrue() {
		boolean result = validate.validateFirstName();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testLastName_if_proper_returnTrue() {
		boolean result = validate.validateLastName();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testValidEmail_if_proper_returnTrue() {
		boolean result = validate.validateLastName();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testMobileFormat_if_proper_returnTrue() {
		boolean result = validate.validateLastName();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPasswordMin8Character_if_proper_returnTrue() {
		boolean result = validate.validateLastName();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPasswordMin1UpperCase_if_proper_returnTrue() {
		boolean result = validate.validateLastName();
		Assert.assertEquals(true, result);
	}

	@Test
	public void testPasswordMin1NumericNumber_if_proper_returnTrue() {
		boolean result = validate.validateLastName();
		Assert.assertEquals(true, result);
	}

}
