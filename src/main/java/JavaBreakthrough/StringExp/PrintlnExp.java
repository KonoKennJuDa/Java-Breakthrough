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
        System.out.printf("This is a string, %d", 10); // %d - означает, что будет вставлена цифра
        System.out.println();
        System.out.printf("This is a string, %f", 11.2); // %f - означает, что будет вставлено вещественное число
        System.out.println();
        System.out.printf("%f This is a %s string, %d", 11.45, "NICE", 10); // пример

    }
}
