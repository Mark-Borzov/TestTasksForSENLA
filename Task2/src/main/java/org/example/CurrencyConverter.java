package org.example;

public class CurrencyConverter {
    // Конвертация евро:
    private final double fromEuroToDollar = 1.08;
    private final double fromEuroToRussianRuble = 104.4;
    private final double fromEuroToBelarusianRuble = 3.57;
    private final double fromEuroToChineseYuan = 7.71;

    // Конвертация доллара:
    private final double fromDollarToEuro = 0.9236;
    private final double fromDollarToRussianRuble = 96.09;
    private final double fromDollarToBelarusianRuble = 3.29;
    private final double fromDollarToChineseYuan = 7.12;

    // Конвертация Российского рубля:
    private final double fromRussianRubleToEuro = 0.009578;
    private final double fromRussianRubleToDollar = 0.010407;
    private final double fromRussianRubleToBelarusianRuble = 0.034249;
    private final double fromRussianRubleToChineseYuan = 0.074221;

    // Конвертация Белорусского рубля:
    private final double fromBelarusianRubleToEuro = 0.280332;
    private final double fromBelarusianRubleToDollar = 0.304035;
    private final double fromBelarusianRubleToRussianRuble = 29.2;
    private final double fromBelarusianRubleToChineseYuan = 2.16;

    // Конвертация Китайского юаня:
    private final double fromChineseYuanToEuro = 0.129706;
    private final double fromChineseYuanToDollar = 0.140436;
    private final double fromChineseYuanToRussianRubles = 13.47;
    private final double fromChineseYuanToBelarusianRuble = 0.46343;

    // Поле "номер валюты":
    private int currencyNumber;

    // Поле "сумма конвертации":
    private double conversionAmount = 0;

    // Конструктор класса "номер валюты для конвертации":
    public CurrencyConverter(int currencyNumber) {
        this.currencyNumber = currencyNumber;
    }

    // Метод инициализации поля "сумма конвертации":
    public void conversionAmount(double conversionAmount) {
        this.conversionAmount = conversionAmount;
    }

    // Метод результата конвертации:
    public void conversionResult() {
        String amountInEuros = "Cумма в евро:";
        String amountInDollars = "Сумма в долларах:";
        String amountInRussianRubles = "Сумма в Российских рублях:";
        String amountInBelarusianRubles = "Сумма в Белорусских рублях:";
        String amountInChineseYuan = "Сумма в Китайских юанях:";

        if (this.currencyNumber == 1) {
            System.out.printf("%s %.6f\n", amountInDollars, this.conversionAmount * this.fromEuroToDollar);
            System.out.printf("%s %.6f\n", amountInRussianRubles, this.conversionAmount * this.fromEuroToRussianRuble);
            System.out.printf("%s %.6f\n", amountInBelarusianRubles, this.conversionAmount * this.fromEuroToBelarusianRuble);
            System.out.printf("%s %.6f\n", amountInChineseYuan, this.conversionAmount * this.fromEuroToChineseYuan);
        } else if (this.currencyNumber == 2) {
            System.out.printf("%s %.6f\n", amountInEuros, this.conversionAmount * this.fromDollarToEuro);
            System.out.printf("%s %.6f\n", amountInRussianRubles, this.conversionAmount * this.fromDollarToRussianRuble);
            System.out.printf("%s %.6f\n", amountInBelarusianRubles, this.conversionAmount * this.fromDollarToBelarusianRuble);
            System.out.printf("%s %.6f\n", amountInChineseYuan, this.conversionAmount * this.fromDollarToChineseYuan);
        } else if (this.currencyNumber == 3) {
            System.out.printf("%s %.6f\n", amountInEuros, this.conversionAmount * this.fromRussianRubleToEuro);
            System.out.printf("%s %.6f\n", amountInDollars, this.conversionAmount * this.fromRussianRubleToDollar);
            System.out.printf("%s %.6f\n", amountInBelarusianRubles, this.conversionAmount * this.fromRussianRubleToBelarusianRuble);
            System.out.printf("%s %.6f\n", amountInChineseYuan, this.conversionAmount * this.fromRussianRubleToChineseYuan);
        } else if (this.currencyNumber == 4) {
            System.out.printf("%s %.6f\n", amountInEuros, this.conversionAmount * this.fromBelarusianRubleToEuro);
            System.out.printf("%s %.6f\n", amountInDollars, this.conversionAmount * this.fromBelarusianRubleToDollar);
            System.out.printf("%s %.6f\n", amountInRussianRubles, this.conversionAmount * this.fromBelarusianRubleToRussianRuble);
            System.out.printf("%s %.6f\n", amountInChineseYuan, this.conversionAmount * this.fromBelarusianRubleToChineseYuan);
        } else if (this.currencyNumber == 5) {
            System.out.printf("%s %.6f\n", amountInEuros, this.conversionAmount * this.fromChineseYuanToEuro);
            System.out.printf("%s %.6f\n", amountInDollars, this.conversionAmount * this.fromChineseYuanToDollar);
            System.out.printf("%s %.6f\n", amountInRussianRubles, this.conversionAmount * this.fromChineseYuanToRussianRubles);
            System.out.printf("%s %.6f\n", amountInBelarusianRubles, this.conversionAmount * this.fromChineseYuanToBelarusianRuble);
        }
    }
}