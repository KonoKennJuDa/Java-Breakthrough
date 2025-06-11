package com.javabreakthrough.Lesson3.Cycles;

public class If {

    public static void main(String[] args) {

        if (5 < 4) { // false
            System.out.println("Верное");
        } else { // Будет выполнено это условие
            System.out.println("Не верно");
        }

        System.out.println();

        int x = 15;
        if (x < 10) { // false
            System.out.println("Так и есть");
        } else if (x > 20) { // false
            System.out.println("Нет, не так");
        } else { // Выполнится это условие, потому что не подходит под другие
            System.out.println("Ни один из предыдущих случаев");
        }

        System.out.println();

        int y = 5;
        if (y < 10) { // Будет выполнено это условие, потому что идем сверху вниз, код снизу уже не учитывается
            System.out.println("Так, ну да");
        } else if (y > 20) { // true
            System.out.println("Нет, не оно");
        } else { // false
            System.out.println("Ни один из предыдущих случаев я думаю");
        }
    }
}
