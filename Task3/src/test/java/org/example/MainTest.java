package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void GeneratePasswordTest1() {
        String specialCharacters = "#$&(/):;<=>&@";
        PasswordGenerator password = new PasswordGenerator(8);
        String result = password.getPassword();

        boolean upperCaseSymbol = false;
        boolean lowerCaseSymbol = false;
        boolean numberSymbol = false;
        boolean specialSymbol = false;

        for (int i = 0; i < result.length(); i++) {
            char currentChar = result.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                upperCaseSymbol = true;
            } else if (Character.isLowerCase(currentChar)) {
                lowerCaseSymbol = true;
            } else if (Character.isDigit(currentChar)) {
                numberSymbol = true;
            } else if (specialCharacters.indexOf(currentChar) != -1) {
                specialSymbol = true;
            }
        }

        assertTrue(upperCaseSymbol);
        assertTrue(lowerCaseSymbol);
        assertTrue(numberSymbol);
        assertTrue(specialSymbol);
        assertEquals(8, result.length());
    }

    @Test
    public void GeneratePasswordTest2() {
        String specialCharacters = "#$&(/):;<=>&@";
        PasswordGenerator password = new PasswordGenerator(10);
        String result = password.getPassword();

        boolean upperCaseSymbol = false;
        boolean lowerCaseSymbol = false;
        boolean numberSymbol = false;
        boolean specialSymbol = false;

        for (int i = 0; i < result.length(); i++) {
            char currentChar = result.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                upperCaseSymbol = true;
            } else if (Character.isLowerCase(currentChar)) {
                lowerCaseSymbol = true;
            } else if (Character.isDigit(currentChar)) {
                numberSymbol = true;
            } else if (specialCharacters.indexOf(currentChar) != -1) {
                specialSymbol = true;
            }
        }

        assertTrue(upperCaseSymbol);
        assertTrue(lowerCaseSymbol);
        assertTrue(numberSymbol);
        assertTrue(specialSymbol);
        assertEquals(10, result.length());
    }

    @Test
    public void GeneratePasswordTest12() {
        String specialCharacters = "#$&(/):;<=>&@";
        PasswordGenerator password = new PasswordGenerator(12);
        String result = password.getPassword();

        boolean upperCaseSymbol = false;
        boolean lowerCaseSymbol = false;
        boolean numberSymbol = false;
        boolean specialSymbol = false;

        for (int i = 0; i < result.length(); i++) {
            char currentChar = result.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                upperCaseSymbol = true;
            } else if (Character.isLowerCase(currentChar)) {
                lowerCaseSymbol = true;
            } else if (Character.isDigit(currentChar)) {
                numberSymbol = true;
            } else if (specialCharacters.indexOf(currentChar) != -1) {
                specialSymbol = true;
            }
        }

        assertTrue(upperCaseSymbol);
        assertTrue(lowerCaseSymbol);
        assertTrue(numberSymbol);
        assertTrue(specialSymbol);
        assertEquals(12, result.length());
    }
}
