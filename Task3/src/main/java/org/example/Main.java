package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите желаемую длину пароля. Длина пароля должна быть в диапазоне от 8 до 12 символов.");
            int passwordLength = validPasswordLength(scanner);
            PasswordGenerator password = new PasswordGenerator(passwordLength);
            String resultPassword = password.getPassword();
            System.out.println("Сгенерированный пароль: " + resultPassword);

            System.out.println("\nНажмите 1, чтобы продолжить.");
            System.out.println("Нажмите 2, чтобы выйти.");

            int continueOrExit = validContinueOrExit(scanner);

            if (continueOrExit == 2) {
                break;
            }
        }

        scanner.close();
    }

    // Метод проверки валидности вводимого значения:
    public static int validPasswordLength(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                if (value > 12 || value < 8) {
                    System.out.println("Длина пароля должна быть от 8 до 12 символов включительно.");
                } else {
                    scanner.nextLine();
                    return value;
                }
            } else {
                System.out.println("Некорректное значение. Пожалуйста повторите попытку.");
                scanner.nextLine();
            }
        }
    }

    // Метод проверки валидности действий:
    public static int validContinueOrExit(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                if (value == 1 || value == 2) {
                    return value;
                } else {
                    System.out.println("Некорректное действие. Пожалуйста повторите попытку.");
                }
            } else {
                System.out.println("Некорректное действие. Пожалуйста повторите попытку.");
                scanner.nextLine();
            }
        }
    }
}