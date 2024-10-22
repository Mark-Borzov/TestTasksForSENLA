package org.example.Category;

public class GeographyCategory {
    private final String[] geographyWords = {
            "Глобус",
            "Материк",
            "Экватор",
            "Океан",
            "Гидросфера",
            "Азимут",
            "Рельеф",
            "Меридиан",
            "Параллели",
            "Литосфера"
    };

    public String wordGeneration() {
        int randomIndex = (int)(Math.random() * geographyWords.length);
        return geographyWords[randomIndex];
    }
}