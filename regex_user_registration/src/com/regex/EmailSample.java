package com.regex;

import java.util.regex.Pattern;

public class EmailSample {

	public void checkEmail(String sample) {
		boolean check = Pattern.matches(
				"^[a-zA-Z0-9]{1}[A-Za-z0-9-_.+]+[a-zA-Z0-9]{1}@[A-Za-z0-9]+[.]{1}[a-z]{2,}[.]{0,1}[a-z,]*$", sample);
		System.out.println(check);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to email-validation");
		EmailSample emailValidation = new EmailSample();
		System.out.println("checking for valid emails");
		emailValidation.checkEmail("abc@yahoo.com,");
		emailValidation.checkEmail("abc-100@yahoo.com,");
		emailValidation.checkEmail("abc.100@yahoo.com");
		emailValidation.checkEmail("abc111@abc.com,");
		emailValidation.checkEmail("abc-100@abc.net,");
		emailValidation.checkEmail("abc.100@abc.com.au");
		emailValidation.checkEmail("abc@1.com,");
		emailValidation.checkEmail("abc@gmail.com.com");
		emailValidation.checkEmail("abc+100@gmail.com");

		System.out.println();
		System.out.println("checking for invalid emails");
		emailValidation.checkEmail("abc");
		emailValidation.checkEmail("abc@.com.my");
		emailValidation.checkEmail("abc123@gmail.a");
		emailValidation.checkEmail("abc123@.com");
		emailValidation.checkEmail("abc123@.com.com");
		emailValidation.checkEmail(".abc@abc.com");
		emailValidation.checkEmail("abc()*@gmail.com");
		emailValidation.checkEmail("abc@%*.com");
		emailValidation.checkEmail("abc.@gmail.com");
		emailValidation.checkEmail("abc@gmail.com.1a");
		emailValidation.checkEmail("abc@gmail.com.aa.au");

	}

}
