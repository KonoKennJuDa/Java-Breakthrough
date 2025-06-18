package JavaBreakthrough.StringExp;

public class PrintlnExp {

    public static void main(String[] args) {

        System.out.println("Hello"); // print line - выводит на консоль введенные параметры и переносит строку
        System.out.println("Hello again"); // Строка будет следующая, так как выше println

        System.out.println();

        System.out.print("Hello, nt,"); // print - выводит на консоль введенные параметры, но не переносит строку
        System.out.println(" he-he"); // Снова будет следом

        System.out.println();

        System.out.printf("This is a string, %s", "NICE");// printf - нужен для изменения строки. %s - означает, что будет вставлена строка
        System.out.println();
        System.out.printf("This is a string, %d", 10); // %d - означает, что будет вставлена цифра/число
        System.out.println();
        System.out.printf("This is a string, %f", 11.2); // %f - означает, что будет вставлено вещественное число
        System.out.println();
        System.out.printf("%f This is a %s string, %d", 11.45, "NICE", 10); // пример

        System.out.println();

        System.out.printf("String %10d \n", 534); // \n - означает перенос строки, т.е как у println
        // %10d - 10 перед d означает, что число будет 10, т.е. это выделенный размер
        System.out.printf("String %-10d \n", 5); // Также может быть -10, минус переворачивает число, ну, как я понял, т.е. пустое место будет справа, а не слева
        System.out.printf("String %10d \n", 123456781);

        System.out.println();

        System.out.printf("String %.2f \n", 12.244574575478); // %f - также можем ограничивать и округлять вещественные числа, если вставим условие перед f
        System.out.printf("String %.2f \n", 12.24123124535); // .2 - количество цифр после запятой
        System.out.printf("String %.2f \n", 12.2412314);
        System.out.printf("String %.2f \n", 12.246646);

    }
}
