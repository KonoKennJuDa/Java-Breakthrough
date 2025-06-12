package com.javabreakthrough.Lesson3.Cycles;

public class Break_Continue {

    public static void main(String[] args) {

        // Оператор break мгновенно выходит из цикла
        int i = 0;
        while (true) {
            if (i == 15) {
                break;
            }
            System.out.println(i);
            i++;
        }
        System.out.println("Мы вышли из цикла");

        System.out.println();

        // Оператор continue еще раз инкрементирует переменную счетчик. Буквально "продолжить"
        for (int j = 0; j <= 15; j++) {
            if (j % 2 == 0) {
                continue;
            }
            System.out.println("Это нечетное число " + j);
        }
    }
}
