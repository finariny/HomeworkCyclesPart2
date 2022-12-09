public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int total = 0;
        int monthlySum = 15_000;
        int months = 0;
        double percent = 0.01;
        while (total <= 2_459_000) {
            total += (total * percent);
            total += monthlySum;
            months += 1;
            System.out.println("Месяц " + months + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int one = 1;
        while (one <= 10) {
            System.out.print(one + " ");
            one += 1;
        }
        System.out.println();
        for (int i = one - 1; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3 () {
        System.out.println(); // чтобы перенести "Задача 3" на следующую строку
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthrate = population / 1_000 * 17;
        int mortality = population / 1_000 * 8;
        int year = 1;
        while (year <= 10) {
            population += birthrate - mortality;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year += 1;
        }
    }

    public static void task4 () {
        System.out.println("Задача 4");
        long sum = 15_000L;
        float monthlyPercent = 0.07F;
        int months = 1;
        while (sum <= 12_000_000) {
            sum += (sum * monthlyPercent);
            System.out.println("Месяц " + months + ", сумма накоплений равна " + sum + " рублей");
            months += 1;
        }
    }

    public static void task5 () {
        System.out.println("Задача 5");
        long sum = 15_000L;
        float monthlyPercent = 0.07F;
        int months = 1;
        while (sum <= 12_000_000) {
            sum += (sum * monthlyPercent);
            if (months % 6 == 0) {
                System.out.println("Месяц " + months + ", сумма накоплений равна " + sum + " рублей");
            }
            months += 1;
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        long sum = 15_000L;
        float monthlyPercent = 0.07F;
        int months = 1;
        while (months <= 9 * 12) {
            sum += (sum * monthlyPercent);
            if (months % 6 == 0) {
                System.out.println("Прошло полгода! Сумма накоплений равна " + sum  + " рублей");
            }
            months += 1;
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int fridayDate = 2;
        while (fridayDate <= 31) {
            System.out.println("Сегодня пятница, " + fridayDate + "-е число. Необходимо подготовить отчет");
            fridayDate += 7;
        }
    }

    public static void task8 () {
        System.out.println("Задача 8");
        int beforeCurrentYear = 1822;
        int afterCurrentYear = 2122;
        for (int cometYear = 0; cometYear <= afterCurrentYear; cometYear+= 79) {
            if (cometYear >= beforeCurrentYear) {
                System.out.println(cometYear);
            }
        }
    }
}