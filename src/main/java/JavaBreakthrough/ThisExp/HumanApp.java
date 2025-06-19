package JavaBreakthrough.ThisExp;

public class HumanApp {

    public static void main(String[] args) {

        Human human = new Human();
        human.setName("Артем");
        human.setAge(30);
        human.getInfo();

        System.out.println();

        Human human1 = new Human();
        human1.setName("Олег");
        human1.setAge(40);
        human1.getInfo();

    }
}
