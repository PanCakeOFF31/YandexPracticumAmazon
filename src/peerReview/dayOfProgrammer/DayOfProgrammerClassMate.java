package peerReview.dayOfProgrammer;

import java.util.Scanner;

public class DayOfProgrammerClassMate {
    public static void dayOfProgrammerClassMate() {

        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Введите год:");
            int year = scanner.nextInt();
            if (isLeapYear(year)) {
                System.out.println("12.09." + year);// здесь нужно вывести результат
            } else {
                System.out.println("13.09." + year);
            }
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 4 == 0 & year % 400 == 0) || (year % 4 == 0 & year % 100 != 0));
    }
}

