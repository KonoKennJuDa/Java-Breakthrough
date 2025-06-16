package JavaBreakthrough.SettersAndGetters;

public class UserApp {

    public static void main(String[] args) {

        User user = new User();
        user.setName("Михаил");
        user.setAge(20);
        System.out.println("У первого человека имя: " + user.getName()); // Выводим значение в main методе
        System.out.println("Первому человеку " + user.getAge() + " лет");
        user.speak();
        int year = user.calculateYearsToRetirement();
        System.out.println("Первому человеку до пенсии осталось: " + year + " лет");

        System.out.println();

        User user1 = new User();
        user1.setName("");
        user1.setAge(-1);
        System.out.println("У второго человека имя: " + user1.getName());
        System.out.println("Второму человеку " + user1.getAge() + " лет");
        user1.speak();

        System.out.println();



    }
}
