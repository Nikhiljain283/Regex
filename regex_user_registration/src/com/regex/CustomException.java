package com.regex;

class UserValidatorException extends Exception {
	public UserValidatorException(String exc) {
		super(exc);
	}
}

public class CustomException {
	UserRegistration userRegistration = new UserRegistration();

	void checkFirstNameException() throws UserValidatorException {
		try {
			if (userRegistration.validateFirstName() != true) {
				throw new UserValidatorException("exception in first name");
			} else {
				System.out.println("First Name is valid");
			}
		} catch (Exception fn) {
			System.out.println("Exception occured : " + fn);
		}
	}

	void checkLastNameException() throws UserValidatorException {
		try {
			if (userRegistration.validateLastName() != true) {
				throw new UserValidatorException("exception in last name");
			} else {
				System.out.println("Last Name is valid");
			}
		} catch (Exception fn) {
			System.out.println("Exception occured : " + fn);
		}
	}
	
	void checkEmailException() throws UserValidatorException {
		try {
			if (userRegistration.validateEmail() != true) {
				throw new UserValidatorException("exception in email");
			} else {
				System.out.println("Email is valid");
			}
		} catch (Exception fn) {
			System.out.println("Exception occured : " + fn);
		}
	}
	
	void checkValidMobileNumberException() throws UserValidatorException {
		try {
			if (userRegistration.validateMobileNo() != true) {
				throw new UserValidatorException("exception in mobile number");
			} else {
				System.out.println("Mobile number is valid");
			}
		} catch (Exception fn) {
			System.out.println("Exception occured : " + fn);
		}
	}
	
	void checkPasswordMinCharacterException() throws UserValidatorException {
		try {
			if (userRegistration.validatePasswordMinCharacter() != true) {
				throw new UserValidatorException("exception in passwod, Not following min character");
			} else {
				System.out.println("password is valid");
			}
		} catch (Exception fn) {
			System.out.println("Exception occured : " + fn);
		}
	}
	
	void checkPasswordAtleastOneUpperCaseException() throws UserValidatorException {
		try {
			if (userRegistration.validateAtLeastOneUpperCase() != true) {
				throw new UserValidatorException("exception in password, should contain minimum one upper case");
			} else {
				System.out.println("password is valid");
			}
		} catch (Exception fn) {
			System.out.println("Exception occured : " + fn);
		}
	}

	void checkPasswordAtleastOneNumericValueException() throws UserValidatorException {
		try {
			if (userRegistration.validateAtLeastOneNumber() != true) {
				throw new UserValidatorException("exception in password, should contain minimum one numeric value");
			} else {
				System.out.println("password is valid");
			}
		} catch (Exception fn) {
			System.out.println("Exception occured : " + fn);
		}
	}
	
	public static void main(String[] args) throws UserValidatorException {
		CustomException customExc = new CustomException();
		customExc.checkFirstNameException();
		customExc.checkLastNameException();
		customExc.checkEmailException();
		customExc.checkValidMobileNumberException();
		customExc.checkPasswordMinCharacterException();
		customExc.checkPasswordAtleastOneUpperCaseException();
		customExc.checkPasswordAtleastOneNumericValueException();

	}
}
