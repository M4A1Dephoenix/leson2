package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Задача №1
        /* Закоментил т.к для 6 задачи нужны переменные
        byte a = 1;
        short b = 128;
        int c = 1129;
        long d = 12345L;
        float e = 1.1f;
        double f = 1.111111111;
        char g = 123;
        boolean i = true;
        */

        // Задача №2
            // Заведение переменных
        float firstBoxer = 78.2f;
        float secondBoxer = 82.7f;
            // Расчёт общего веса
        float summBoxer = firstBoxer + secondBoxer;
            // Вывод ответа по сумме, добавил пустую строку для удобства отображения
        System.out.println("Задание 2");
        System.out.println("Суммарная масса боксёров " + summBoxer + "КГ");
            // Вывод ответа по разнице
        summBoxer = secondBoxer - firstBoxer;
        System.out.println("Разница веса боксёров " + summBoxer + "КГ");

        // Задача №3
            // Ввод переменных.
        var banana = 5;
        var weightBanana = 80;
        var milk = 2;
        var weightMilk = 105;
        var icecreame = 2;
        var weightIcecream = 100;
        var egg = 4;
        var weightEgg = 70;
            // Расчёт суммы по граммам.
        float summInBlender = banana * weightBanana + milk * weightMilk + icecreame * weightIcecream + egg * weightEgg;
        System.out.println();
        System.out.println("Заданиие 3");
        System.out.println("Итого граммов " + summInBlender);

        /* Почему данный вариант не работает?
        SummInBlender = (5 * Banana + 2 * Milk + 2 * Icecreame + 4 * Egg) / 1000;
        System.out.println();
        System.out.println("Итого граммов " + SummInBlender);
        */
            // Расчёт суммы в КГ
        summInBlender = summInBlender / 1000;
        System.out.println("Итого КГ " + summInBlender);

        // Задача №4
            // Ввод переменных.
        var needDrop = 7000;
        var ifSportsmenDrop1 = 250;
        var ifSportsmenDrop2 = 500;

            // Расчёт
        var drop1 = needDrop / ifSportsmenDrop1;
        var drop2 = needDrop / ifSportsmenDrop2;
            // Вывод значений
        System.out.println();
        System.out.println("Заданиие 4");
        System.out.println("Если скидывает по 250 грамм, то " + drop1 + " Если скидывает по 500 грамм, то " + drop2 );
        var midl = (drop1 + drop2)/2;
        System.out.println("В среднем потребуется " + midl + " День");

        // Задача №5
            // Ввод переменных.
        var Masha = 67760;
        var Denis = 83690;
        var Kristina = 76230;
        double koef = 1.1;
            // Расчёт
        double zpMasha = Masha * koef;
        double zpDenisa = Denis * koef;
        double zpKristina = Kristina * koef;
            // Вывод+дорасчёт
        System.out.println();
        System.out.println("Задание 5");
        System.out.println("Маша теперь получает " + zpMasha + " Рублей. Годовой доход вырос на " + (Masha*(koef - 1)) + " Рублей.");
        System.out.println("Денис теперь получает " + zpDenisa + " Рублей. Годовой доход вырос на " + (Denis*(koef - 1)) + " Рублей.");
        System.out.println("Кристина теперь получает " + zpKristina + " Рублей. Годовой доход вырос на " + (Kristina*(koef - 1)) + " Рублей.");

        // Задача №6
            // Ввод переменных
        var a = 12;
        var b = 27;
        var c = 44;
        var e = 9;
        var d = 15;
            // Расчёт
        var result = -(a * (b + (c - d * e)));
        System.out.println();
        System.out.println("Задание 6");
        System.out.println("Результат c инверсией " + result);
        System.out.println("Результат без инверсии " + -result);

        // Задача №7
            //Ввод переменных
        var q = 5;
        var w = 7; // Использованы другие переменные т.к предедущие заняты в задаче выше.
        w = 5;
        q = 7;
            // Надеюсь тут и надо было использовать переприсвоение.
        System.out.println();
        System.out.println("Задача №7");
        System.out.println(w);
        System.out.println(q);

        // Задача №8
            //Ввод переменных
        var s = 789;
        var k = 0;
            // действия
        k = (s-(s/100)*100)/10;
        System.out.println();
        System.out.println("Задача №8");
        System.out.println(k);



    }
}
