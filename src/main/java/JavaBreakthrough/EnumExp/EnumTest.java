package JavaBreakthrough.EnumExp;

public class EnumTest {

    // Так было раньше и так делать не надо. Это плохое перечисление
    private static final int Dog = 0;
    private static final int Cat = 1;
    private static final int Frog = 2;

    public static void main(String[] args) {

        int animal = Dog; // это проблемное место

        switch (animal) {
            case Dog:
                System.out.println("Это собака");
                break;
            case Cat:
                System.out.println("Это кот");
                break;
            case Frog:
                System.out.println("Это лягушка");
                break;
            default:
                System.out.println("Это не животное");
        }

    }
}
