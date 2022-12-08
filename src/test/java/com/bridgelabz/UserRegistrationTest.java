package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();
    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validateFirstName.validate("Vinayak"));
            System.out.println("First name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid First Name because :- " + e);
        }
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validateFirstName.validate("vinayak"));
            System.out.println("First name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid First Name because :- " + e);
        }
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validateLastName.validate("Garole"));
            System.out.println("Last name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validateLastName.validate("garole"));
            System.out.println("Last name is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Last Name because :- " + e);
        }
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validateEmail.validate("abc.xyz@bl.co.in"));
            System.out.println("Email is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Email because :- " + e);
        }
    }



    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validateEmail.validate("abc@bl.in@.in"));
            System.out.println("Email is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Email because :- " + e);
        }
    }

    @Test
    public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validateMobileNo.validate("91 8380867601"));
            System.out.println("Mobile Number is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Mobile Number because :- " + e);
        }
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validateMobileNo.validate("8380867601"));
            System.out.println("Mobile Number is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Mobile Number because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validatepasswordRule1.validate("Vin005"));
            System.out.println("Password Rule1 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule1 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validatepasswordRule1.validate("Vinay05"));
            System.out.println("Password Rule1 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule1 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validatepasswordRule2.validate("Vina.05"));
            System.out.println("Password Rule2 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule2 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validatepasswordRule2.validate("vina.05"));
            System.out.println("Password Rule2 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule2 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue()  {
        try {
            Assertions.assertTrue(userRegistration.validatepasswordRule3.validate("Vina@105"));
            System.out.println("Password Rule3 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validatepasswordRule3.validate("Vinaya@#$%"));
            System.out.println("Password Rule3 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule3 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        try {
            Assertions.assertTrue(userRegistration.validatepasswordRule4.validate("Vinay@55vire"));
            System.out.println("Password Rule4 is valid");
        }catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule4 because :- " + e);
        }
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
        try {
            Assertions.assertTrue(userRegistration.validatepasswordRule4.validate("Vina555"));
            System.out.println("Password Rule4 is valid");
        } catch (Invalid_InputDetailsException e) {
            System.out.println("Invalid Password Rule4 because :- " + e);
        }
    }
}