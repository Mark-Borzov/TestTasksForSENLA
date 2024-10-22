package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            currencySelection();
            int currencyNumber = validCurrencyNumber(scanner);
            CurrencyConverter converter = new CurrencyConverter(currencyNumber);

            System.out.println("Введите сумму для конвертации:");
            double conversionAmount = validConversionAmount(scanner);

            converter.conversionAmount(conversionAmount);
            converter.conversionResult();

            System.out.println("\nНажмите 1, чтобы продолжить.");
            System.out.println("Нажмите 2, чтобы выйти.");

            int continueOrExit = validContinueOrExit(scanner);

            if (continueOrExit == 2) {
                break;
            }
        }

        scanner.close();
    }

    // Метод вывода валют:
    public static void currencySelection() {
        System.out.println("Выберите номер валюты для ее конвертации:");
        System.out.println("№1 Евро");
        System.out.println("№2 Доллар США");
        System.out.println("№3 Российский рубль");
        System.out.println("№4 Белорусский рубль");
        System.out.println("№5 Китайский юань");
    }

    // Метод выбора существующей валюты:
    public static int validCurrencyNumber(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                if (value >= 1 && value <= 5) {
                    return value;
                } else {
                    System.out.println("Несуществующий номер валюты. Пожалуйста повторите попытку.");
                    currencySelection();
                }
            } else {
                System.out.println("Несуществующий номер валюты. Пожалуйста повторите попытку.");
                currencySelection();
                scanner.nextLine();
            }
        }
    }

    // Метод проверки конвертируемой суммы:
    public static double validConversionAmount(Scanner scanner) {
        double value;
        while (true) {
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
                scanner.nextLine();
                if (value >= 0) {
                    return value;
                } else {
                    System.out.println("Некорректная сумма конвертации. Пожалуйста повторите попытку.");
                }
            } else {
                System.out.println("Некорректная сумма конвертации. Пожалуйста повторите попытку.");
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