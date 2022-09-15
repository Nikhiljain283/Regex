package com.regex;

import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		System.out.println("Welcome to user registration");

		boolean firstName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{1}[a-zA-Z]+$", "Aman");
		System.out.println(firstName);

		boolean lastName = Pattern.matches("^[A-Z]{1}[a-zA-Z]{1}[a-zA-Z]+$", "Singh");
		System.out.println(lastName);

	}

}
