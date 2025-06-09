package com.javabreakthrough.Lesson1.Cycles;

public class Cycles {

    public static void main(String[] args) {

        /**
         * Цикл while.
         */

        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }

        /**
         * Цикл do-while.
         */

        int iii = 0;
        do {
            System.out.println(iii);
            iii++;
        } while (iii < 5);

        /**
         * Цикл for.
         */

        for (int ii = 0; ii < 5; i++) {
            System.out.println(i);
        }

        /**
         * Улучшенный цикл for (for-each).
         * Используется для перебора элементов массива или коллекций:
         */

        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println(num);
        }

        /**
         * Управление циклами.
         */

        // break - прерывает выполнение цикла
        // continue - пропускает текущую итерацию цикла
        // return - выходит из метода (и цикла)

        for (int iiii = 0; iiii < 10; iiii++) {
            if (iiii == 5) {
                break; // прервет цикл при i = 5
            }
            if (iiii % 2 == 0) {
                continue; // пропустит четные числа
            }
            System.out.println(i);
        }

        //Выбор типа цикла зависит от конкретной задачи. for обычно используют, когда известно количество итераций,
        //while - когда условие выхода определяется во время выполнения.

    }
}
