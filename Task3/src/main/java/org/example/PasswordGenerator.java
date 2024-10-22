package org.example;

import java.security.SecureRandom;

public class PasswordGenerator {
    // Поле "Результирующий набор символов"
    private String resultPassword;
    // Поле "Длина пароля"
    private int passwordLength;

    // Конструктор класса для установки длины пароля:
    public PasswordGenerator(int passwordLength) {
        this.passwordLength = passwordLength;
    }

    // Метод возврата сгенерированного пароля:
    public String getPassword() {
        generatePassword();
        return this.resultPassword;
    }

    // Метод генерации пароля с разными видами символов:
    private void generatePassword() {
        // Поле "Верхний регистр"
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        // Поле "Нижний регистр"
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        // Поле "Нижний цифры"
        String numbers = "0123456789";
        // Поле "Нижний специальные символы"
        String specialCharacters = "#$&(/):;<=>&@";
        StringBuilder resultPassword = new StringBuilder();
        SecureRandom secureRandom = new SecureRandom();
        resultPassword.append(upperCaseLetters.charAt(secureRandom.nextInt(upperCaseLetters.length())));
        resultPassword.append(lowerCaseLetters.charAt(secureRandom.nextInt(lowerCaseLetters.length())));
        resultPassword.append(numbers.charAt(secureRandom.nextInt(numbers.length())));
        resultPassword.append(specialCharacters.charAt(secureRandom.nextInt(specialCharacters.length())));
        String allCharacters = upperCaseLetters + lowerCaseLetters + numbers + specialCharacters;
        for (int i = 4; i < passwordLength; i++) {
            int randomIndex = secureRandom.nextInt(allCharacters.length());
            resultPassword.append(allCharacters.charAt(randomIndex));
        }
        this.resultPassword = shufflePassword(resultPassword.toString(), secureRandom);
    }

    private String shufflePassword(String resultPassword, SecureRandom secureRandom) {
        char[] charactersArray = resultPassword.toCharArray();
        for (int i = 0; i < charactersArray.length; i++) {
            int randomIndex = secureRandom.nextInt(charactersArray.length);
            char temp = charactersArray[i];
            charactersArray[i] = charactersArray[randomIndex];
            charactersArray[randomIndex] = temp;
        }
        return new String(charactersArray);
    }
}
