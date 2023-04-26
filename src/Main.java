public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int age = 31;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + " он совершеннолетний ");
        }
        if (age < 18) {
            System.out.println("Если возраст человека равен " + age + " он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int temp = 3;
        if (temp <= 5) {
        System.out.println("На улице " + temp + " градусов, нужно надеть шапку.");
        }
        if (temp > 5 ) {
        System.out.println("На улице " + temp + " градусов, можно идти без шапки.");
} }
    public static void task3() {
        System.out.println("Задача 3");
        int speed = 67;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + " то придется заплатить штраф.");
        }
        if ( speed < 60 ) {
            System.out.println("Если скорость " + speed + " то можно ездить спокойно.");
        } }
    public static void task4() {
        System.out.println("Задача 4");
        int age = 24;
        if (age > 0 && age < 2) {
        System.out.println("Если возраст человека равен " + age + " то ему пора спать.");
    }
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в детский сад.");
        }
        if (age >= 7 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " то ему нужно ходить в школу.");
        }
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " то его место в университете.");
        }
        if (age > 24 && age <= 60) {
            System.out.println("Если возраст человека равен " + age + " то ему пора ходить на работу.");
        }
        if (age > 60 ) {
            System.out.println("Если возраст человека равен " + age + " то он может отдохнуть.");
        } }
        public static void task5() {
            System.out.println("Задача 5");
            int age = 14;
            if (age < 5 ) {
                System.out.println("Если возраст ребенка равен " + age + " то ему нельзя кататься на аттракционе.");
            }
                if (age > 5 && age < 14) {
                    System.out.println("Если возраст ребенка равен " + age + " то он может кататься на аттракционе только в сопровождении взрослого.");
                }
            if (age >= 14) {
                System.out.println("Если возраст ребенка равен " + age + " то он может кататься на аттракционе без сопровождения взрослого.");
            }
}       public static void task6() {
        System.out.println("Задача 6");
        int place = 103;
        if (place > 1 && place <=60) {
            System.out.println("В вагоне есть сидячие места.");}
        if (place > 60 && place <= 102) {
            System.out.println("В вагоне есть стоячие места.");}
        if ( place < 103) {System.out.println();
        } else {
                System.out.println("Мест нет.");
            }
        }
    public static void task7() {
        System.out.println("Задача 7");
        int one = 1;
        int two = 13;
        int three = 2;
       if (three > two && two > one) {
           System.out.println("Большее число  " + three);
       } else {
           System.out.println("Большее число " + two);
       }
}
    }
