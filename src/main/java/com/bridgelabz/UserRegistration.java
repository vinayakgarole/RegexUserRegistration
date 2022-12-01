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
}