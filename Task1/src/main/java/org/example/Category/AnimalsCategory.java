package org.example.Category;

public class AnimalsCategory {
    private final String[] animalsWords = {
            "Капибара",
            "Кошка",
            "Собака",
            "Ласка",
            "Панда",
            "Обезьяна",
            "Птица",
            "Бобр",
            "Кабан",
            "Бабочка"
    };

    public String wordGeneration() {
        int randomIndex = (int)(Math.random() * animalsWords.length);
        return animalsWords[randomIndex];
    }
}