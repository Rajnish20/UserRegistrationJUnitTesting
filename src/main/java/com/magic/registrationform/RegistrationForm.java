package com.magic.registrationform;

import com.magic.exception.UserRegistrationException;
import java.util.regex.Pattern;

public class RegistrationForm {

    private static final String nameRegexPatter = "^[A-Z][a-z]{2,}";
    private static final String mobileNoRegexPattern = "\\d{2} \\d{10}";
    private static final String emailRegexPattern = "^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+?(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$";
    private static final String passwordRegexPattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&*-+=()]).{8,}$";

    public boolean validateName(String name) throws UserRegistrationException {
        try {
            if (name == null)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.Entered_Null, "Null is not allowed");
            if (name.length() == 0)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.Entered_Empty, "FirstName cannot be empty");
            if (name.length() < 3)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.Entered_Short, "Minimum length should be 3");
            Pattern pattern = Pattern.compile(nameRegexPatter);
            if (pattern.matcher(name).matches())
                return true;
            else
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.Entered_INVALID, "Please enter valid FirstName");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
            return false;
        }

    }

    public boolean validateMobileNo(String mobileNo) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(mobileNoRegexPattern);
            if (pattern.matcher(mobileNo).matches())
                return true;
            else
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.Entered_INVALID, "Please enter valid Mobile Number");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean validatePassword(String password) throws UserRegistrationException {
        try {
            if (password.length() < 8)
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.Entered_Short, "Minimum length should be 8");
            Pattern pattern = Pattern.compile(passwordRegexPattern);
            if (pattern.matcher(password).matches())
                return true;
            else
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.Entered_INVALID, "Please enter valid Password");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean validateEmail(String emailId) throws UserRegistrationException {
        try {
            Pattern pattern = Pattern.compile(emailRegexPattern);
            if (pattern.matcher(emailId).matches())
                return true;
            else
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.Entered_INVALID, "Please enter valid Email Id");
        } catch (UserRegistrationException e) {
            e.printStackTrace();
            return false;
        }
    }
}
