package org.example.Category;

public class FoodCategory {
    private final String[] foodWords = {
            "Пельмени",
            "Борщ",
            "Лазанья",
            "Шарлотка",
            "Омлет",
            "Рыба",
            "Шоколад",
            "Торт",
            "Пирог",
            "Курица"
    };

    public String wordGeneration() {
        int randomIndex = (int)(Math.random() * foodWords.length);
        return foodWords[randomIndex];
    }
}