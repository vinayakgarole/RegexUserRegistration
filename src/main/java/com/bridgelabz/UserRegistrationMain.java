package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) {

        System.out.println("Welcome to User Registration Program");

        UserRegistration user = new UserRegistration();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1: To validate First Name: ");

        switch (sc.nextInt()) {
            case 1:
                user.validFirstName();
                break;
        }
    }
}