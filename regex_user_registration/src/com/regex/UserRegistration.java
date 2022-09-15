package com.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");

		boolean firstName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{1}[a-zA-Z]+$", "Aman");
		System.out.println(firstName);

		boolean lastName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{1}[a-zA-Z]+$", "Singh");
		System.out.println(lastName);

		boolean email = Pattern.matches("^[a-z]{3}[.]{0,1}[a-z]*@[b]{1}[l]{1}.[c]{1}[o]{1}[.]{0,1}[a-z]*$", "abc@bl.co");
		System.out.println(email);
	}

}
