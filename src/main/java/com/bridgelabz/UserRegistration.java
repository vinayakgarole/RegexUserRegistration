package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public static boolean validFirstName(String name) {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validLastName(String name) {

        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validEmail(String email) {

        String regex = "^[a-z]*.[a-z]+@[a-z]+.[a-z]{2,3}(.[a-z]{2})*$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validMobileNumber(String mobileNo) {

        String regex = "^[\\d]{2}\\s[\\d]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validPasswordRule1(String passwordRule1) {

        String regex = "^[A-Za-z0-9@._-]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule1);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validPasswordRule2(String passwordRule2) {

        String regex = "^[A-Z]{1}[A-Za-z0-9@._-]{7,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule2);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validPasswordRule3(String passwordRule3) {

        String regex = "^(?=.*[A-z])(?=.*[0-9])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule3);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }

    public static boolean validPasswordRule4(String passwordRule4) {

        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordRule4);
        boolean result = matcher.matches();
        System.out.println(result);
        return result;
    }
}