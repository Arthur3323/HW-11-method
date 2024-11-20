import java.time.LocalDate;

public class Main {

    public static void printIsLeapYear(int year) {
        boolean yearLeap = checkYear(year);
        printResultYear(year, yearLeap);
    }

    public static boolean checkYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static void printResultYear(int year, boolean yearLeap) {
        if (yearLeap) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }


    public static void printIsVersionOS(int OS, int year) {
        boolean IOS = checkOS(OS);
        boolean yearDevice = checkYearDevice(year);
        printResultDevice(IOS, yearDevice);
    }

    public static boolean checkOS(int OS) {
        return OS == 0;
    }

    public static boolean checkYearDevice(int year) {
        int currentYear = LocalDate.now().getYear();
        return year == currentYear;
    }

    public static void printResultDevice(boolean IOS, boolean yearDevice) {
        if (IOS && yearDevice) {
            System.out.println("Установите обычную версию приложения для iOS по ссылке");
        } else if (IOS && !yearDevice) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (!IOS && yearDevice) {
            System.out.println("Установите обычную версию приложения для Android по ссылке");
        } else if (!IOS && !yearDevice) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }
    }


    public static void printDeliveryDistance(int distance) {
        int distanceDay = checkDistance(distance);
        printResultDelivery(distanceDay);
    }


    public static int checkDistance(int distance) {
        int deliveryDay = 1;
        if (distance > 20) {
            deliveryDay++;
        }
        if (distance > 60) {
            deliveryDay++;
        }
        if (distance > 100) {
            deliveryDay = -1;
        }
        return deliveryDay;
    }

    public static void printResultDelivery(int deliveryDay) {
        switch (deliveryDay) {
            case 1:
            case 2:
            case 3:
                System.out.println("Потребуется дней: " + deliveryDay);
                break;
            case -1:
                System.out.println("Доставка невозможна");
        }


    }


    public static void main(String[] args) {
        System.out.println("Task 1");
        printIsLeapYear(2024);

        System.out.println("Task 2");
        printIsVersionOS(0, 2024);

        System.out.println("Task 3");
        printDeliveryDistance(95);


    }


}