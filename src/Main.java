import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        checkYear(2024);
        showVersionAppMessage(2, 3000);
        showNotificationDeliveryDates(72);
    }

    public static void checkYear(int year) {
        System.out.println("Задача № 1");

        if ((year % 4 == 0) && year % 100 != 0) {
            System.out.println(year + " год является високосным.");
        } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0)) {
            System.out.println(year + " год является високосным.");
        } else {
            System.out.println(year + " год не является високосным.");
        }

    }

    public static void showVersionAppMessage(int numberTypeOfOs, int yearRelease) {
        System.out.println("Задача № 2");

        int currentYear = LocalDate.now().getYear();

        if (numberTypeOfOs == 0) {
            if (yearRelease < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");

            }
        } else if (numberTypeOfOs == 1) {
            if (yearRelease < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");

            }
        }
        else {
            System.out.printf("Не трынди! %d год еще не наступил!%n", yearRelease);
        }
    }

    public static void showNotificationDeliveryDates(int distance) {
        System.out.println("Задача № 3");

        int amountDeliveryDays;

        if (distance <= 20) {
            amountDeliveryDays = 1;
            System.out.printf("Потребуется дней: %d ", amountDeliveryDays);
        } else if (distance <= 60) {
            amountDeliveryDays = 2;
            System.out.printf("Потребуется дней: %d ", amountDeliveryDays);
        } else if (distance <= 100) {
            amountDeliveryDays = 3;
            System.out.printf("Потребуется дней: %d ", amountDeliveryDays);
        } else {
            System.out.println("На расстояние свыше 100 км доставка не осуществляется");
        }

    }
}