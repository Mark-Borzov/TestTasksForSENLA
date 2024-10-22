package org.example.Category;

public class AutomobilesCategory {
    private final String[] automobilesWords = {
            "Автобус",
            "Электромобиль",
            "Камаз",
            "Седан",
            "Микроавтобус",
            "Автомобиль",
            "Кабриолет",
            "Внедорожник",
            "Фургон",
            "Грузовик"
    };

    public String wordGeneration() {
        int randomIndex = (int)(Math.random() * automobilesWords.length);
        return automobilesWords[randomIndex];
    }
}