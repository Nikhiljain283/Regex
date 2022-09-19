package com.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public boolean validateFirstName() {
		boolean firstName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{1}[a-zA-Z]+$", "Aman");
		return firstName;
	}

	public boolean validateLastName() {
		boolean lastName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{1}[a-zA-Z]+$", "Singh");
		System.out.println(lastName);
		return lastName;
	}

	public boolean validateEmail() {
		boolean email = Pattern.matches("^[a-z]{3}[.]{0,1}[a-z]*@[b]{1}[l]{1}.[c]{1}[o]{1}[.]{0,1}[a-z]*$",
				"abc@bl.co");
		System.out.println(email);
		return email;
	}

	public boolean validateMobileNo() {
		boolean mobileNo = Pattern.matches("^[9]{1}[1]{1}[ ][1-9]{1}[0-9]{9}$", "91 7542968745");
		System.out.println(mobileNo);
		return mobileNo;
	}

	public boolean validatePasswordMinCharacter() {
		boolean passwordMinCharacter = Pattern.matches("^[a-zA-Z0-9]{8,}$", "24681357");
		System.out.println(passwordMinCharacter);
		return passwordMinCharacter;
	}

	public boolean validateAtLeastOneUpperCase() {
		boolean passwordAtleastOneUpperCase = Pattern.matches("^(?=.*[A-Z])[a-zA-Z]{8,}$", "Password");
		System.out.println(passwordAtleastOneUpperCase);
		return passwordAtleastOneUpperCase;
	}

	public boolean validateAtLeastOneNumber() {
		boolean passwordAtleastOneNumber = Pattern.matches("^(?=.*[A-Z])(?=.*[0-9])[0-9A-Za-z]{8,}$", "158ASXPasswor");
		System.out.println(passwordAtleastOneNumber);
		return passwordAtleastOneNumber;
	}
}
