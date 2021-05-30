package com.magic.junitassertions;

import com.magic.exception.UserRegistrationException;
import com.magic.registrationform.RegistrationForm;


import org.junit.Assert;
import org.junit.Test;


public class UserRegistrationTest {


    @Test
    public void givenName_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateName("Daniel");
        Assert.assertTrue(result);

    }

    @Test
    public void givenName_WhenShort_ShouldThrowEnteredShortException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateName("Ra");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_Short, e.type);
        }
    }

    @Test
    public void givenName_WhenNull_ShouldThrowEnteredNullException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateName(null);
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_Null, e.type);
        }
    }

    @Test
    public void givenName_WhenEmpty_ShouldThrowEnteredShortException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateName("");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_Empty, e.type);
        }
    }

    @Test
    public void givenName_WhenWithDigits_ShouldThrowEnteredInvalidException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateName("DAN0987");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_INVALID, e.type);
        }
    }

    @Test
    public void givenMobileNo_whenProper_ShouldReturnTrue() throws UserRegistrationException {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateMobileNo("91 7838288091");
        Assert.assertTrue(result);
    }

    @Test
    public void givenMobileNo_WhenShort_ShouldThrowEnteredInvalidException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateMobileNo("91");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_INVALID, e.type);
        }
    }

    @Test
    public void givenName_WhenWithoutExtension_ShouldThrowEnteredInvalidException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateMobileNo("7838288091");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_INVALID, e.type);
        }
    }

    @Test
    public void givenName_WhenWithoutSpace_ShouldThrowEnteredInvalidException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateMobileNo("917838288091");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_INVALID, e.type);
        }
    }

    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue() throws UserRegistrationException {
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validatePassword("D@niel9876");
        Assert.assertTrue(result);

    }

    @Test
    public void givenPassword_WhenShort_ShouldThrowEnteredShortException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatePassword("R@j87");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_Short, e.type);
        }
    }

    @Test
    public void givenPassword_WhenInvalid_ShouldThrowEnteredInvalidException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validatePassword("daniel09988");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_INVALID, e.type);
        }
    }

    @Test
    public void givenEmailId_WhenProper_ShouldReturnTrue() throws UserRegistrationException{
        RegistrationForm registrationForm = new RegistrationForm();
        boolean result = registrationForm.validateEmail("rajnish.sahu@magicedtech.com");
        Assert.assertTrue(result);
    }

    @Test
    public void givenEmailId_WhenMultipleTld_ShouldThrowEnteredInvalidException(){
        RegistrationForm registrationForm = new RegistrationForm();
        try{
            registrationForm.validateEmail("daniel.com.au");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_INVALID,e.type);
        }
    }

    @Test
    public void givenEmailId_WhenDigitAlongWithTld_ShouldThrowEnteredInvalidException(){
        RegistrationForm registrationForm = new RegistrationForm();
        try{
            registrationForm.validateEmail("rajnisher20@gmail.com.1a");
        }catch (UserRegistrationException e)
        {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_INVALID,e.type);
        }
    }

    @Test
    public void givenEmailId_WhenLastTldShort_ShouldThrowEnteredInvalidException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateEmail("rajnisher20@gmail.com.i");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_INVALID, e.type);
        }
    }

    @Test
    public void givenEmailId_WhenCorrectSymbolNotPresent_ShouldThrowEnteredInvalidException() {
        RegistrationForm registrationForm = new RegistrationForm();
        try {
            registrationForm.validateEmail("daniel20gmail.com");
        } catch (UserRegistrationException e) {
            Assert.assertEquals(UserRegistrationException.ExceptionType.Entered_INVALID, e.type);
        }
    }




}