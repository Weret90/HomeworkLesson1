package Lesson1;

public class Main {

    public static void main(String[] args) { //2. Создать переменные всех пройденных типов данных и инициализировать их значения
        byte b = 120;
        short s = 15000;
        int i = 2500000;
        long l = 55555555555555l;
        float f = 3.14f;
        double d = -156.5896;
        char c = '\u2242';
        boolean bl = true;

        System.out.println(calculate(1.2f,2.56f,3.23f,4.8f));
        System.out.println(checkingTenAndTwenty(10,5));
        plusOrMinus(5);
        System.out.println(plusOrMinus2(-6));
        helloName("Владислав");
        leapYear(2104);
    }

    //МЕТОДЫ
    public static float calculate (float a, float b, float c, float d) { //3. Написать метод вычисляющий выражение a * (b + (c / d))
        return a * (b + (c / d));
    }

    public static boolean checkingTenAndTwenty (int a, int b) { //4. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void plusOrMinus (int a) { //5. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное
        if (a >= 0) {
            System.out.println("Число " + a + " является положительным");
        } else {
            System.out.println("Число " + a + " является отрицательным");
        }
    }

    public static boolean plusOrMinus2 (int a) { //6. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }

    public static void helloName (String name) { //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя. Метод должен вывести в консоль сообщение
        System.out.println("Привет, " + name + "!");
    }

    public static void leapYear(int year) { //8. Написать метод, который определяет, является ли год високосным, и выводит сообщение в консоль
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) { //условие: если год делится на 4 без остатка и при этом при делении на 100 имеет остаток (т.е. не кратен 100) ИЛИ кратен 400, то этот год ВИСОКОСНЫЙ
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год является НЕ високосным");
        }
    }
}
