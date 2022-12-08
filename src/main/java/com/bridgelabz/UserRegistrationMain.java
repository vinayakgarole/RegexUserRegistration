package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void welcome(){
        System.out.println("Welcome to User Registration System Problem");
    }
    public static void main(String[] args) throws Invalid_InputDetailsException {
        welcome(); //calling static method
        UserRegistration user = new UserRegistration();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1: To validate First Name:\nEnter 2: To validate Last Name:\nEnter 3: To validate email: \nEnter 4: To validate Mobile Number: \nEnter 5: To validate passwordRule1: \nEnter 6: To Validate Password Rule2 : \nEnter 7: To Validate Password Rule3 : \nEnter 8: To Validate Password Rule4 : ");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validateFirstName.validate("Vinayak");
                break;
            case 2:
                UserRegistration.validateLastName.validate("Garole");
                break;
            case 3:
                UserRegistration.validateEmail.validate("abc.xyz@bl.co.in");
                break;
            case 4:
                UserRegistration.validateMobileNo.validate("91 8380867601");
                break;
            case 5:
                UserRegistration.validatepasswordRule1.validate("Vinay005");
                break;
            case 6:
                UserRegistration.validatepasswordRule2.validate("Vinay.05");
                break;
            case 7:
                UserRegistration.validatepasswordRule3.validate("Vinay105");
                break;
            case 8:
                UserRegistration.validatepasswordRule4.validate("Vinay@55");
                break;
        }
    }
}