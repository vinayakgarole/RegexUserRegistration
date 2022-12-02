package com.bridgelabz;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    Scanner sc = new Scanner(System.in);

    public boolean validFirstName() {

        System.out.println("Enter First Name: ");
        String name = sc.next();
        String regex = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(name);
        boolean result = matcher.matches();

        if (result)
            System.out.println("First name is valid");
        else
            System.out.println("First name is Invalid");
        return result;
    }

    public boolean validLastName() {

        System.out.println("Enter Last Name: ");
        String lastName = sc.next();
        String regex1 = "^[A-Z]{1}[a-z]{2,}$";
        Pattern pattern = Pattern.compile(regex1);
        Matcher matcher = pattern.matcher(lastName);
        boolean result1 = matcher.matches();

        if (result1)
            System.out.println("Last Name is valid");
        else
            System.out.println("Last Name is Invalid");
        return result1;
    }

    public boolean validEmail() {

        System.out.println("Enter EMail: ");
        String EMail = sc.next();
        String regex = "^[a-zA-Z0-9.]+[@][a-zA-Z]{3,}[.][a-zA-Z]{2,5}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(EMail);
        boolean result = matcher.matches();
        System.out.println(result);

        if (result)
            System.out.println("Email is Valid");
        else
            System.out.println("Email is Invalid");

        return result;
    }

    public boolean validMobileNumber() {

        System.out.println("Enter Mobile Number: ");
        String MobileNumber = sc.next();
        String regex = "^([+]\\d{2})?\\d{10}$";          // Country code is not mandatory
        // String regex = "^[+][0-9]{2}[0-9]{10}$";          Country code is mandatory
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(MobileNumber);
        boolean result = matcher.matches();
        System.out.println(result);

        if (result)
            System.out.println("Mobile Number is Valid");
        else
            System.out.println("Mobile Number is Invalid");
        return result;
    }


    public boolean validPassword() {

        System.out.println("Enter Password: ");
        String Password = sc.next();
        ;
        String regex = "^[a-zA-Z]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(Password);
        boolean result = matcher.matches();
        System.out.println(result);

        if (result)
            System.out.println("Password is valid");
        else
            System.out.println("Password is Invalid");
        return result;
    }

    public boolean validUpperCasePassword() {

        System.out.println("Enter upperCasePassword: ");
        String UpperPassword = sc.next();
        String regex = "^[A-Za-z0-9]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(UpperPassword);
        boolean result = matcher.matches();
        System.out.println(result);

        if (result)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
        return result;
    }

    public boolean validNumericPassword() {

        System.out.println("Enter numericPassword: ");
        String NumericPassword = sc.next();
        String regex = "^[A-Z][a-z0-9]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(NumericPassword);
        boolean result = matcher.matches();
        System.out.println(result);

        if (result)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
        return result;
    }

    public boolean validSpecialPassword() {

        System.out.println("Enter validSpecialPassword: ");
        String SpecialPassword = sc.next();
        String regex = "^(?=.*[A-z])(?=.*[0-9])(?=.*[@#$%^&*()-+=])([a-zA-Z0-9@._-]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(SpecialPassword);
        boolean result = matcher.matches();
        System.out.println(result);

        if (result)
            System.out.println("Password is Valid");
        else
            System.out.println("Password is Invalid");
        return result;
    }
}