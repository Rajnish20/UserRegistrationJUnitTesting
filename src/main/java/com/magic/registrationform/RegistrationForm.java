package com.magic.registrationform;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegistrationForm {


    public boolean validateFirstName(String firstName) {
        String regex = "^[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstName);
        return matcher.matches();
    }

    public boolean validateLastName(String lastName) {
        String regex = "^[A-Z][a-z]{3,}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastName);
        return matcher.matches();
    }

    public boolean validateMobileNo(String mobileNo) {
        String regex = "\\d{2} \\d{10}";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mobileNo);
        return matcher.matches();
    }

    public boolean validateEmailId(String emailId) {
        String regex = "^[A-Za-z0-9-\\+]+(\\.[A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+?(\\.[A-Za-z0-9]+)?(\\.[A-Za-z]{2,})$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailId);
        return matcher.matches();
    }

    public boolean validatePassword(String password) {
        String regex = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&*-+=()]).{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(password);
        return matcher.matches();
    }

    public static void main(String[] args) {
        System.out.println("User Registration");
        System.out.println("Enter Details");
        Scanner scanner = new Scanner(System.in);

        RegistrationForm registrationForm = new RegistrationForm();
        String firstName;
        String lastName;
        String mobileNo;
        String emailId;
        String password;
        do {
            System.out.println("Enter First Name");
            firstName = scanner.nextLine();
            System.out.println(registrationForm.validateFirstName(firstName));
        } while (!registrationForm.validateFirstName(firstName));

        do {
            System.out.println("Enter Last Name");
            lastName = scanner.nextLine();
            System.out.println(registrationForm.validateLastName(lastName));
        } while (!registrationForm.validateLastName(lastName));

        do {
            System.out.println("Enter Mobile No :");
            mobileNo = scanner.nextLine();
            System.out.println(registrationForm.validateMobileNo(mobileNo));
        } while (!registrationForm.validateMobileNo(mobileNo));

        do {
            System.out.println("Enter email Id");
            emailId = scanner.nextLine();
            System.out.println(registrationForm.validateEmailId(emailId));
        } while (!registrationForm.validateEmailId(emailId));

        do {
            System.out.println("Enter Password");
            password = scanner.nextLine();
            System.out.println(registrationForm.validatePassword(password));
        } while (!registrationForm.validatePassword(password));
        System.out.println("User has been registered");

    }
}
