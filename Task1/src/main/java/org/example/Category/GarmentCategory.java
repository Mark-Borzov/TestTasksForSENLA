package org.example.Category;

public class GarmentCategory {
    private final String[] garmentWords = {
            "Наряд",
            "Платье",
            "Ботинки",
            "Кафтан",
            "Куртка",
            "Майка",
            "Лонгслив",
            "Свитер",
            "Кардиган",
            "Джемпер"
    };

    public String wordGeneration() {
        int randomIndex = (int)(Math.random() * garmentWords.length);
        return garmentWords[randomIndex];
    }
}