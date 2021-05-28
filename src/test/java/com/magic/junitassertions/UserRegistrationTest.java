package com.magic.junitassertions;

import com.magic.registrationform.RegistrationForm;

import org.junit.Assert;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class UserRegistrationTest {


    @Test
    public void givenFirstName_whenProper_ShouldReturnTrue() {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateFirstName("Daniel");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenFirstName_whenShort_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateFirstName("Da");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenFirstName_WhenWithSplChar_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateFirstName("R@jnish");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_whenProper_ShouldReturnTrue() {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateFirstName("Clark");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenLastName_whenShort_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateFirstName("Cl");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenLastName_WhenWithSplChar_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateFirstName("Cl@rk");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenProper_ShouldReturnTrue()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateMobileNo("91 7838288091");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenMobileNumber_WhenShort_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateMobileNo("91 7838");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenNoExtensionIncluded_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateMobileNo("7838288091");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenMoreChar_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateMobileNo("91 783828809110");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenMobileNumber_WhenWithSplChar_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateMobileNo("+91 7838288091");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateEmailId("rajnisher20@gmail.com");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenCorrectSymbolNotPresent_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateEmailId("rajnisher20gmail.com");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenLastTldShort_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateEmailId("rajnisher20@gmail.com.i");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenDigitAlongWithTld_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateEmailId("rajnisher20@gmail.com.1a");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenEmailId_WhenMultipleTld_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateEmailId("rajnisher20@gmail.com.aa.au");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validatePassword("P@ssword20");
        Assertions.assertTrue(result);
    }

    @Test
    public void givenPassword_WhenShort_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validatePassword("P@ss20");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoUpperCase_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validatePassword("p@ssword20");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoSplChar_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validatePassword("Password20");
        Assertions.assertFalse(result);
    }

    @Test
    public void givenPassword_WhenNoNumeric_ShouldReturnFalse()
    {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validatePassword("P@ssword");
        Assertions.assertFalse(result);
    }












}
