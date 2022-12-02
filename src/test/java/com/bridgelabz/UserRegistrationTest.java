package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {

    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validFirstName("Vinayak");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validFirstName("vinayak");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validLastName("Garole");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validLastName("garole");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmail_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validEmail("abc.xyz@bl.co.in");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmail_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validEmail("vin10@gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNo_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validMobileNumber("91 8380867601");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validMobileNumber("8380867601");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule1_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule1("Vin@ay-k");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule1_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule1("vinayak");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule2_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule2("Vin@ay-k_Garole");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule2_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule2("vin-ay.k");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule3_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule3("Vin@ayak356");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule3_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule3("Vin@a.yak");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPasswordRule4_WhenValid_ShouldReturnsTrue() {
        boolean result = userRegistration.validPasswordRule4("Vinayak@20garole");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPasswordRule4_WhenInValid_ShouldReturnsFalse() {
        boolean result = userRegistration.validPasswordRule4("Vin20ayak78garole");
        Assertions.assertFalse(result);
    }
}