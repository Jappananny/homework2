public class Main {
    public static void main(String[] args) {
        //Задача 1
        System.out.println("Задача 1");
        int astronautsNasa = 2;
        System.out.println("Значение переменной astronautsNasa с типом int равно " +astronautsNasa);
        byte apolloMoonShip = 11;
        System.out.println("Значение переменной apolloMoonShip с типом byte равно " + apolloMoonShip);
        short inTime = 2007;
        System.out.println("Значение переменной inTime с типом short равно " + inTime);
        long inYear = 1969L;
        System.out.println("Значение переменной inYear с типом long равно " + inYear);
        float moonDistanse = 238.9F;
        System.out.println("Значение переменной moonDistanse с типом float равно " + moonDistanse);
        double itIsHappened = 21.07025615;
        System.out.println("Значение переменной itIsHappened с типом double равно " + itIsHappened);
        //Задача 2
        System.out.println("Задача 2");

        boolean yes = false;
        System.out.println(yes);
        byte a = 67;
        System.out.println(a);
        char b = 27897;
        System.out.println(b);
        double c = 2.786;
        System.out.println(c);
        float d = 27.12F;
        System.out.println(d);
        long f = 987_678_965_549L;
        System.out.println(f);
        int g = 569;
        System.out.println(g);
        short h = -159;
        System.out.println(h);
        //Задача 3
        System.out.println("Задача 3");
        int lP = 23;
        int aS = 27;
        int eA = 30;
        int paper = 480;
        int paperFstudent = paper / (lP + aS + eA);
        System.out.println("На каждого ученика рассчитано "+paperFstudent+" листов бумаги");
        //Задача 4
        System.out.println("Задача 4");
        int bottles = 16;
        int time1 = 2;
        int time2 = 20;
        int timeDay = 1440;
        int timeDay3 = 4320;
        int timeMounth = 43200;
        int bottelInTime = bottles / time1;
        int result = time2 * bottelInTime;
        System.out.println("За 20 минут машина произвела " + result + " штук бутылок");
        int result1 = timeDay * bottelInTime;
        System.out.println("За 1 сутки машина произвела " + result1 + " штук бутылок");
        int result3 = timeDay3 * bottelInTime;
        System.out.println("За 3 дня машина произвела " + result3 + " штук бутылок");
        int result4 = timeMounth * bottelInTime;
        System.out.println("За 1 месяц машина произвела " + result4 + " штук бутылок");

        //Другой способ
        System.out.println("Другой способ");

        int bottles1 = 16;
        int perfomance = 2;
        int minInHour = 60;
        int hourInDay = 24;
        int daysInMonth = 30;
        int input1 = 20;
        int input2 = 1;
        int input3 = 3;
        int input4 = 1;
        String inputVal1 = input1 + " минут";
        String inputVal2 = input2 + " сутки";
        String inputVal3 = input3 + " дня";
        String inputVal4 = input4 + " месяц";

        int minsInDay = hourInDay * minInHour;
        int minsInMonth = minsInDay * daysInMonth;
        int perfomancePerMinute = bottles1 / perfomance;

        int resultData1 = input1 * perfomancePerMinute;
        int resultData2 = input2 * minsInDay * perfomancePerMinute;
        int resultData3 = input3 * minsInDay * perfomancePerMinute;
        int resultData4 = input4 * minsInMonth * perfomancePerMinute;

        System.out.println("За " + inputVal1 + " машина произвела " + resultData1 + " штук бутылок");
        System.out.println("За " + inputVal2 + " машина произвела " + resultData2 + " штук бутылок");
        System.out.println("За " + inputVal3 + " машина произвела " + resultData3 + " штук бутылок");
        System.out.println("За " + inputVal4 + " машина произвела " + resultData4 + " штук бутылок");

        //Задача 5
        System.out.println("Заадача 5");
        int whiteDye = 2;
        int brownDye = 4;
        int allDye = 120;
        int classesRoom = allDye / (whiteDye + brownDye);
        int whiteDyeForClassRoom = classesRoom * whiteDye;
        int brownDyeForClassRoom = classesRoom * brownDye;
        System.out.println("В школе, где " + classesRoom + " классов, нужно " + whiteDyeForClassRoom + " банок белой  краски и " + brownDyeForClassRoom + " банок коричневой краски");



    }
}

