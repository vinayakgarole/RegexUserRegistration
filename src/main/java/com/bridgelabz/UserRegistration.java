package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@FunctionalInterface
interface validation {
    boolean validate (String x) throws Invalid_InputDetailsException;
}

public class UserRegistration {

      static validation validateFirstName = firstName -> {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("first Name should start with a Cap and should have minimum 3 characters");
        } else {
            return true;
        }
    };

    static validation validateLastName = lastName -> {
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Last Name should start with a Cap and should have minimum 3 chars");
        }
        else {
            return true;
        }
    };

    static validation validateEmail = email -> {

        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Enter a valid email address");
        }
        else {
            return true;
        }
    };

    static validation validateMobileNo = mobileNo -> {
        String regex = "^[\\d]{2}\\s[\\d]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Enter the Valid Mobile number with county code");
        }
        else {
            return true;
        }
    };

    static validation validatepasswordRule1 = passwordRule1 -> {
        String regex = "^[A-Za-z0-9@._-]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule1);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Password must have 8 character");
        }
        else {
            return true;
        }
    };

    static validation validatepasswordRule2 = passwordRule2 -> {
        String regex = "^[A-Z]{1}[A-Za-z0-9@._-]{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule2);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Password must have atleast one uppercase letter");
        }
        else {
            return true;
        }
    };

    static validation validatepasswordRule3 = passwordRule3 -> {
        String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule3);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Password must have atleast one numeric number");
        }
        else {
            return true;
        }
    };

    static validation validatepasswordRule4 = passwordRule4 -> {
        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule4);
        boolean result = matcher.matches();
        System.out.println(result);

        if (!result) {
            throw new Invalid_InputDetailsException("Password must has exactly one special character");
        }
        else {
            return true;
        }
    };
}