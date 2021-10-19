package junitassertions;

import org.junit.Assert;
import org.junit.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProper_giveTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("Santosh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenFirstName_WhenNotProper_GiveFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateFirstName("SANTOSH");
        boolean result1 = validator.validateFirstName("S@NTOSH");
        Assert.assertEquals(false, result || result1);
    }

    @Test
    public void givenLastName_WhenProper_giveTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("Nandiyawar");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenLastName_WhenNotProper_giveFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateLastName("NANDIYAWAR");
        boolean result1 = validator.validateLastName("N@NDIYAW@R");
        Assert.assertEquals(false, result || result1);
    }

    @Test
    public void givenEmail_WhenProper_GiveTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail("abc@123@abcd.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenEmail_WhenNotProper_GiveFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateEmail(" ");
        Assert.assertEquals(false, result);
    }

    @Test
    public void givenMobileNumber_WhenProper_GiveTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("09604800000");
        boolean result1 = validator.validateMobileNumber("+919604800000");
        Assert.assertEquals(true, result || result1);
    }

    @Test
    public void givenMobileNumber_WhenNotProper_GiveFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.validateMobileNumber("9604840000");
        boolean result1 = validator.validateMobileNumber("196048000");
        Assert.assertEquals(false, result || result1);
    }

    @Test
    public void givenUserPassword_WhenProper_GiveTrue() {
        UserValidator validator = new UserValidator();
        boolean result = validator.ValidateUserPassword("S7@antos");
        Assert.assertEquals(true, result);
    }

    @Test
    public void givenUserPassword_WhenNotProper_GiveFalse() {
        UserValidator validator = new UserValidator();
        boolean result = validator.ValidateUserPassword("&ASHSand46");
        Assert.assertEquals(false, result);
    }
}
