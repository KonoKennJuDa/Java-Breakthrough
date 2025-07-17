package Practice.Day2;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int florCount = scanner.nextInt();

        if (florCount >= 1 && florCount <= 4) {
            System.out.println("Малоэтажный дом");
        } else if (florCount >= 5 && florCount <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (florCount >= 9) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Некорректный ввод");
        }
    }
}
