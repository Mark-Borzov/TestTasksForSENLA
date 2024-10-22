package org.example;
import org.example.Category.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Gallows {
    // Поле "Выбранная категория":
    private int category;
    // Поле "Сгенерированное слово":
    private String resultWord;
    // Поле "Количество жизней игрока":
    private int playersAttempts = 9;
    // Поле "Общее количество ошибок":
    private int playersMistakes = 0;
    // Массив для хранения ошибок:
    private final ArrayList<Character> arrayErrors = new ArrayList<>();

    // Конструктор класса "Выбор категории":
    public Gallows(int category) {
        this.category = category;
        choosingCategory();
    }

    // Метод вывода сгенерированного слова и интерфейса в игровом формате:
    public void outputForm(Scanner scanner) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("_ ".repeat(this.resultWord.length()));
        System.out.println("Слово: " + stringBuilder.toString().trim());
        stateTheGame(scanner,stringBuilder);
        if (playersAttempts == 0) {
            System.out.println("У вас больше нет попыток. " + "Игра окончена! Загадано слово " + this.resultWord.toUpperCase());
            manOnPorchResult();
        }
    }

    // Метод для отрисовки человека на виселице по ходу игры (никто не пострадал!):
    private void manOnPorchResult() {
        if (this.playersMistakes == 0) {
            System.out.println(manOnPorchOption1());
        } else if (this.playersMistakes == 1 || this.playersMistakes == 2) {
            System.out.println(manOnPorchOption2());
        } else if (this.playersMistakes == 3 || this.playersMistakes == 4) {
            System.out.println(manOnPorchOption3());
        } else if (this.playersMistakes == 5 || this.playersMistakes == 6) {
            System.out.println(manOnPorchOption4());
        } else if (this.playersMistakes == 7) {
            System.out.println(manOnPorchOption5());
        } else if (this.playersMistakes == 8) {
            System.out.println(manOnPorchOption6());
        } else if (this.playersMistakes == 9) {
            System.out.println(manOnPorchOption7());
        }
    }

    // Метод для отрисовки успешного конца игры:
    private void manSurvived() {
        System.out.println("""
                +---+
                |   |
                |   \s
                |   О ---> |Ура! Я жив!|
                |  /|\\
                |  / \\
                =======""");
    }

    // Метод для отрисовки виселицы (Состояние №1):
    private String manOnPorchOption1() {
        return """
                +---+
                |   |
                |
                |
                |
                |
                =======""";
    }

    // Метод для отрисовки виселицы (Состояние №2):
    private String manOnPorchOption2() {
        return """
                +---+
                |   |
                |   О
                |
                |
                |
                =======""";
    }

    // Метод для отрисовки виселицы (Состояние №3):
    private String manOnPorchOption3() {
        return """
                +---+
                |   |
                |   О
                |   |
                |
                |
                =======""";
    }

    // Метод для отрисовки виселицы (Состояние №4):
    private String manOnPorchOption4() {
        return """
                +---+
                |   |
                |   О
                |  /|
                |
                |
                =======""";
    }

    // Метод для отрисовки виселицы (Состояние №5):
    private String manOnPorchOption5() {
        return """
                +---+
                |   |
                |   О
                |  /|\\
                |
                |
                =======""";
    }

    // Метод для отрисовки виселицы (Состояние №6):
    private String manOnPorchOption6() {
        return """
                +---+
                |   |
                |   О
                |  /|\\
                |  /
                |
                =======""";
    }

    // Метод для отрисовки виселицы (Состояние №7):
    private String manOnPorchOption7() {
        return """
                +---+
                |   |
                |   О
                |  /|\\
                |  / \\
                |
                =======""";
    }

    // Метод создания объекта "Категория":
    private void choosingCategory() {
        if (this.category == 1) {
            FoodCategory foodCategory = new FoodCategory();
            this.resultWord = foodCategory.wordGeneration();
        } else if (this.category == 2) {
            GarmentCategory garmentCategory = new GarmentCategory();
            this.resultWord = garmentCategory.wordGeneration();
        } else if (this.category == 3) {
            AnimalsCategory animalsCategory = new AnimalsCategory();
            this.resultWord = animalsCategory.wordGeneration();
        } else if (this.category == 4) {
            GeographyCategory geographyCategory = new GeographyCategory();
            this.resultWord = geographyCategory.wordGeneration();
        } else {
            AutomobilesCategory automobilesCategory = new AutomobilesCategory();
            this.resultWord = automobilesCategory.wordGeneration();
        }
    }

    // Метод для проверки вводимого символа в диапазоне от 'А' до 'Я' без учета регистра:
    private char validSymbol(Scanner scanner) {
        char value;
        while (true) {
            String input = scanner.nextLine();
            if (input.length() == 1) {
                value = Character.toUpperCase(input.charAt(0));
                if (value >= 1040 && value <= 1071) {
                    return value;
                } else {
                    System.out.println("Невалидный символ. Введите символ в диапазоне от 'А' до 'Я'.");
                }
            } else {
                System.out.println("Невалидный ввод. Пожалуйста, введите одиночный символ.");
            }
        }
    }

    // Данный метод реализует основной цикл игры:
    private void stateTheGame(Scanner scanner, StringBuilder stringBuilder) {
        while (playersAttempts > 0) {
            manOnPorchResult();
            System.out.println("Ошибки (" + this.playersMistakes + "): " + arrayErrors);
            System.out.println("Количество оставшихся попыток: " + this.playersAttempts);
            char symbol = validSymbol(scanner);
            if (this.resultWord.toUpperCase().indexOf(symbol) > -1) {
                for (int i = 0; i < this.resultWord.length(); i++) {
                    if (Character.toUpperCase(this.resultWord.charAt(i)) == Character.toUpperCase(symbol)) {
                        stringBuilder.setCharAt(i * 2, symbol);
                    }
                }
            } else {
                arrayErrors.add(symbol);
                this.playersAttempts--;
                this.playersMistakes++;
            }
            System.out.println("Слово: " + stringBuilder.toString().trim());
            if (stringBuilder.toString().replace(" ", "").equalsIgnoreCase(this.resultWord)) {
                System.out.println("Поздравляем! Вы угадали слово. Игра окончена!");
                manSurvived();
                break;
            }
        }
    }
}