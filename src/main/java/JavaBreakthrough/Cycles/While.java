package JavaBreakthrough.Cycles;

public class While {

    public static void main(String[] args) {

        int x = 0;
        while (x < 5) { // Пока while true, цикл продолжает работать
            System.out.println("Hello " + x);
            x++; // Тоже самое, что x = x + 1;
        }
    }
}
