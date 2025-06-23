package JavaBreakthrough.Variables;

public class PTypeExp {

    public static void main(String[] args) {

        int age = 28;
        short year = 2025;
        long bigNum = 1000000000L; // long l = 1231231231231231231; без L в конце java не поймет это int или long
        byte smallNum = 100;
        double price = 99.99;
        float pi = 3.14F; // float f = 123.2; без F в конце java не поймет это double или float

        System.out.println();

        // Приведение типов явное, мы объясняем к чему мы приводим и откуда
        long y = 100000000000L;
        //int x = y; Так не получится, int не может вместить в себя long
        int x = (int) y;
        System.out.println(x);

        // Приведение типов неявное
        int x1 = 140;
        long y1 = x1; // Любой int может поместить в long, так как int явно меньше
        System.out.println(y1);

        System.out.println();

        int a = 123;
        double z = a;
        System.out.println(z);

        double d = 124.5;
        //int s = d; так нельзя опять же, потому что double вмещает вещественные числа
        int s = (int) d; // Мы определяем к какой переменной мы приводим, к какому типу

        // Классом round можно округлить число и вывести int, округление идет в большую сторону
        long m = Math.round(d);
        System.out.println(m);

        System.out.println();

        // Надо быть осторожней и понимать что то, что справа, точно влезает в то, что слева
        byte g = (byte) 128; // Что будет, если впихнуть невпихуемое
        System.out.println(g); // Мы окажемся в конце, т.е. в отрицательном числе вмещаемом в byte

    }
}
