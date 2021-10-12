package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Задача №1
        byte a = 1;
        short b = 128;
        int c = 1129;
        long d = 12345L;
        float e = 1.1f;
        double f = 1.111111111;
        char g = 123;
        boolean i = true;

        // Задача №2
            // Заведение переменных
        float FirstBoxer = 78.2f;
        float SecondBoxer = 82.7f;
            // Расчёт общего веса
        float SummBoxer = FirstBoxer + SecondBoxer;
            // Вывод ответа по сумме, добавил пустую строку для удобства отображения
        System.out.println("Задание 2");
        System.out.println("Суммарная масса боксёров " + SummBoxer + "КГ");
            // Вывод ответа по разнице
        SummBoxer = SecondBoxer - FirstBoxer;
        System.out.println("Разница веса боксёров " + SummBoxer + "КГ");

        // Задача №3
            // Ввод переменных.
        var Banana = 5;
        var WeightBanana = 80;
        var Milk = 2;
        var WeightMilk = 105;
        var Icecreame = 2;
        var WeightIcecream = 100;
        var Egg = 4;
        var WeightEgg = 70;
            // Расчёт суммы по граммам.
        float SummInBlender = Banana * WeightBanana + Milk * WeightMilk + Icecreame * WeightIcecream + Egg * WeightEgg;
        System.out.println();
        System.out.println("Заданиие 3");
        System.out.println("Итого граммов " + SummInBlender);

        /* Почему данный вариант не работает?
        SummInBlender = (5 * Banana + 2 * Milk + 2 * Icecreame + 4 * Egg) / 1000;
        System.out.println();
        System.out.println("Итого граммов " + SummInBlender);
        */
            // Расчёт суммы в КГ
        SummInBlender = SummInBlender / 1000;
        System.out.println("Итого КГ " + SummInBlender);

        // Задача №4
            // Ввод переменных.
        var NeedDrop = 7000;
        var IfSportsmenDrop1 = 250;
        var IfSportsmenDrop2 = 500;

            // Расчёт
        var Drop1 = NeedDrop / IfSportsmenDrop1;
        var Drop2 = NeedDrop / IfSportsmenDrop2;
            // Вывод значений
        System.out.println();
        System.out.println("Заданиие 4");
        System.out.println("Если скидывает по 250 грамм, то " + Drop1 + " Если скидывает по 500 грамм, то " + Drop2 );
        var Midl = (Drop1 + Drop2)/2;
        System.out.println("В среднем потребуется " + Midl + " День");

        // Задача №5
            // Ввод переменных.
        var Masha = 67760;
        var Denis = 83690;
        var Kristina = 76230;
        double Koef = 1.1;
            // Расчёт
        double ZpMasha = Masha * Koef;
        double ZpDenisa = Denis * Koef;
        double ZpKristina = Kristina * Koef;
            // Вывод+дорасчёт
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Маша теперь получает " + ZpMasha + " Рублей. Годовой доход вырос на " + (Masha*(Koef - 1)) + " Рублей.");
        System.out.println("Денис теперь получает " + ZpDenisa + " Рублей. Годовой доход вырос на " + (Denis*(Koef - 1)) + " Рублей.");
        System.out.println("Кристина теперь получает " + ZpKristina + " Рублей. Годовой доход вырос на " + (Kristina*(Koef - 1)) + " Рублей.");





    }
}
