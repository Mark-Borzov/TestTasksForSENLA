package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            choosingCategory();
            int categoryNumber = validNumberOfCategory(scanner);
            Gallows gallows = new Gallows(categoryNumber);
            gallows.outputForm(scanner);

            System.out.println("\nНажмите 1, чтобы продолжить.");
            System.out.println("Нажмите 2, чтобы выйти.");

            int continueOrExit = validContinueOrExit(scanner);

            if (continueOrExit == 2) {
                break;
            }
        }

        scanner.close();
    }

    // Метод выбора игровой категории:
    public static void choosingCategory() {
        System.out.println("Выберите категорию:");
        System.out.println("№1 Еда");
        System.out.println("№2 Одежда");
        System.out.println("№3 Животные");
        System.out.println("№4 География");
        System.out.println("№5 Автомобили");
        System.out.println("Введите соответствующий номер выбранной категории:");
    }

    // Метод проверки валидности вводимого значения:
    public static int validNumberOfCategory(Scanner scanner) {
        int value;
        while (true) {
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
                scanner.nextLine();
                if (value >= 1 && value <= 5) {
                    return value;
                } else {
                    System.out.println("Несуществующий номер категории. Пожалуйста повторите попытку.");
                    choosingCategory();
                }
            } else {
                System.out.println("Несуществующий номер категории. Пожалуйста повторите попытку.");
                choosingCategory();
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