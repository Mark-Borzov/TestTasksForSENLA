### Задание №1. Игра «Виселица»

![picture_1](pictures/TheGallows.png)

Требования к данному заданию:

Реализуй игру «Виселица», где игрок пытается угадать слово, вводя одну букву за раз. Если буква отсутствует в слове, то игрок теряет жизнь. Игра заканчивается, когда игрок угадывает слово или теряет все жизни. Слово для отгадывания выбирать случайно из списка слов-констант внутри программы. После каждой введенной буквы выводить в консоль загадываемое слово с пропусками букв и сообщение о том, сколько жизней осталось. Рисовать в консоли человечка на виселице как иллюстрацию количества жизней (как это обычно бывает в «Виселице») не обязательно, но будет приветствоваться.

### Описание:
- Данный проект написан на операционной системе Linux (Ubuntu 24.04.1 LTS).
- Используемая версия JDK - 22 (Oracle OPenJDK 22.0.1).
- Сборка проекта осуществляется при помощи Gradle DSL — Kotlin.

### Установка:
1. Зайти в основную директорию проекта: `~/Тестовые задания/Task1`;
2. Воспользоваться командой: `./gradlew installDist`;
3. Переместиться по указанному пути: `build/install/Task1/bin/`;
4. Запустить проект при помощи команды: `./Task1`: