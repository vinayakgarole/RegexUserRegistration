package com.bridgelabz;

import java.util.Scanner;

public class UserRegistrationMain {

    public static void main(String[] args) throws InvalidFirstNameException, InvalidLastNameException, InvalidEmailException, InvalidMobileNumberException, InvalidPasswordRule1Exception, InvalidPasswordRule2Exception, InvalidPasswordRule3Exception, InvalidPasswordRule4Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the options:\n1. Validate First Name\n2. Validate Last Name\n3. Validate Email ID\n4. Validate Mobile Number\n5. Validate Password Rule1\n6. Validate Password Rule2\n7. Validate Password Rule3\n8. Validate Password Rule4");
        switch (scanner.nextInt()){
            case 1:
                UserRegistration.validFirstName("Surabhi");
                break;
            case 2:
                UserRegistration.validLastName("Bhagat");
                break;
            case 3:
                UserRegistration.validEmail("abc.xyz@bl.co.in");
                break;
            case 4:
                UserRegistration.validMobileNumber("91 8957412368");
                break;
            case 5:
                UserRegistration.validPasswordRule1("Su@ra-bhi");
                break;
            case 6:
                UserRegistration.validPasswordRule2("Su@ra-bhi_Bhagat");
                break;
            case 7:
                UserRegistration.validPasswordRule3("Sur@bhi12");
                break;
            case 8:
                UserRegistration.validPasswordRule4("Surabhi@12bhagat");
                break;
        }
    }
}