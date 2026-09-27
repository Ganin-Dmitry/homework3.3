public class Main {
    public static void main(String[] args) {

        //Задача 1
        int varInt = 100000000;
        byte varByte = 124;
        short varShort = 30555;
        long varLong = 8999999999999999999L;
        float varFloat = 2.5f;
        double varDouble = 1.12345678901234567890123456789012345678900987654321;
        System.out.println("Значение переменной varInt с типом int равно " + varInt);
        System.out.println("Значение переменной varByte с типом byte равно " + varByte);
        System.out.println("Значение переменной varShort с типом short равно " + varShort);
        System.out.println("Значение переменной varLong с типом long равно " + varLong);
        System.out.println("Значение переменной varFloat с типом float равно " + varFloat);
        System.out.println("Значение переменной varDouble с типом double равно " + varDouble);

        //Задача 2
        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        short e = -159;
        int f = 27897;
        byte g = 67;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);

        //Задача 3
        int ludmilaPavlovnaStudents = 23;
        int annaSergevnaStudents = 27;
        int ekaterinaAndrevnaStudents = 30;
        int paper = 480;
        int totalStudents = ludmilaPavlovnaStudents + annaSergevnaStudents + ekaterinaAndrevnaStudents;
        int paperForStudent = paper / totalStudents;
        System.out.println("На каждого ученика рассчитано по " + paperForStudent + " листов бумаги");

        //Задача 4
        int bottle = 16;
        int machineTime = 2;
        int machinePower = bottle / machineTime;
        System.out.println("За 20 минут машина произвела " + (machinePower * 20) + " штук бутылок.");
        System.out.println("За сутки машина произвела " + (machinePower * 24 * 60) + " штук бутылок.");
        System.out.println("За 3 суток машина произвела " + (machinePower * 24 * 60 * 3) + " штук бутылок.");
        System.out.println("За месяц машина произвела " + (machinePower * 24 * 60 * 30) + " штук бутылок.");

        //Задача 5
        int totalPaintJar = 120;
        int whitePaintForOneClassroom = 2;
        int brownPaintForOneClassroom = 4;
        int classroom = totalPaintJar / (whitePaintForOneClassroom + brownPaintForOneClassroom);
        int whitePaintJar = classroom * whitePaintForOneClassroom;
        int brownPaintJar = classroom * brownPaintForOneClassroom;
        System.out.println("В школе, где " + classroom + " классов, нужно " + whitePaintJar + " банок белой краски и " + brownPaintJar + " банок коричневой краски.");

        //Задача 6
        int bananaQuantity = 5;
        int bananaWeight = 80;
        int milkQuantity = 200 / 100;
        int milkWeight = 105;
        int iceCreamQuantity = 2;
        int iceCreamWeight = 100;
        int eggQuantity = 4;
        int eggWeight = 70;
        int totalWeightG = bananaWeight * bananaQuantity + milkWeight * milkQuantity + iceCreamWeight * iceCreamQuantity + eggWeight * eggQuantity;
        System.out.println("Общая масса коктейля " + totalWeightG + " г.");
        float totalWeightKg = totalWeightG / 1000f;
        System.out.println("Общая масса коктейля " + totalWeightKg + " кг.");

        //Задача 7
        int weight = 7;
        float shortageOne = 0.25f;
        float shortageTwo = 0.5f;
        float daysOne = weight / shortageOne;
        float daysTwo = weight / shortageTwo;
        float daysMiddle = (daysOne + daysTwo) / 2;
        System.out.println("Если спортсмен будет терять в день по 250 г, то ему для поххудения понадобится " + daysOne + " дней.");
        System.out.println("Если спортсмен будет терять в день по 500 г, то ему для поххудения понадобится " + daysTwo + " дней.");
        System.out.println("В среднем спортсмену понадобится " + daysMiddle + " дней.");

        //Задача 8
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float mashaNew = masha * 1.1f;
        float denisNew = denis * 1.1f;
        float kristinaNew = kristina * 1.1f;
        float differenceMasha = (mashaNew - masha) * 12;
        float differenceDenis = (denisNew - denis) * 12;
        float differenceKristina = (kristinaNew - kristina) * 12;
        System.out.println("Маша теперь получает " + mashaNew + " рублей в месяц. Годовой доход увеличился на " + differenceMasha + " рублей.");
        System.out.println("Маша теперь получает " + denisNew + " рублей в месяц. Годовой доход увеличился на " + differenceDenis + " рублей.");
        System.out.println("Маша теперь получает " + kristinaNew + " рублей в месяц. Годовой доход увеличился на " + differenceKristina + " рублей.");

    }
}