package com.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName() {
		boolean firstName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{1}[a-zA-Z]+$", "Aman");
		return firstName;
	}

	public boolean validateLastName() {
		boolean lastName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{1}[a-zA-Z]+$", "Singh");
		return lastName;
	}

	public boolean validateEmail() {
		boolean email = Pattern.matches("^[a-z]{3}[.]{0,1}[a-z]*@[b]{1}[l]{1}.[c]{1}[o]{1}[.]{0,1}[a-z]*$",
				"abc@bl.co");
		return email;
	}

	public boolean validateMobileNo() {
		boolean mobileNo = Pattern.matches("^[9]{1}[1]{1}[ ][1-9]{1}[0-9]{9}$", "91 7542968745");
		return mobileNo;
	}

	public boolean validatePasswordMinCharacter() {
		boolean passwordMinCharacter = Pattern.matches("^[a-zA-Z0-9]{8,}$", "2654641357");
		return passwordMinCharacter;
	}

	public boolean validateAtLeastOneUpperCase() {
		boolean passwordAtleastOneUpperCase = Pattern.matches("^(?=.*[A-Z])[a-zA-Z]{8,}$", "Password");
		return passwordAtleastOneUpperCase;
	}

	public boolean validateAtLeastOneNumber() {
		boolean passwordAtleastOneNumber = Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])[0-9A-Za-z]{8,}$", "158ASXPasswor");
		return passwordAtleastOneNumber;
	}
}
