public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println("Задание 1");
        int clientOS = 1;
        int iOS = 0;
        int android = 1;
        if (clientOS == iOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == android) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        // Задание 2
        System.out.println("Задание 2");
        int clientOS1 = 1;
        int clientDeviceYear = 2014;
        if (clientDeviceYear >= 2015 && clientOS1 == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS1 == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientDeviceYear <= 2014 && clientOS1 == 0) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear <= 2014 && clientOS1 == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }

        // Задание 3
        System.out.println("Задание 3");
        int year = 3652;
        int result = year % 4;
        int result1 = year % 400;
        int result2 = year % 100;
        if (result == 0 && result1 <= 400 && result2 <= 100) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");

        // Задание 4
        System.out.println("Задание 4");
        int deliveryDistance = 995;
        int deliveryDate = 1;
        if (deliveryDistance > 20) {
            deliveryDate++;
        }
        if (deliveryDistance > 60) {
            deliveryDate++;
        }
        System.out.println("Потребуется дней " + deliveryDate);


        // Задание 5
        System.out.println("Задание 5");
        int monthNumber = 10;
        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}