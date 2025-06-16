package JavaBreakthrough.SettersAndGetters;

public class User {

    private String name;
    private int age;

    // setter - метод для назначения переменной, куда можно сделать проверку
    public void setName(String userName) {
        if (userName.isEmpty()) { // проверка, в данном случае проверяется пустое значение
            System.out.println("Введено пустое имя");
        } else {
            name = userName;
        }
    }

    // getter - метод для получения, чтения переменной, измененной ли еще нет, где тоже может быть проверка
    public String getName() {
        return name;
    }

    public void setAge(int userAge) {
        if (userAge <= 0) {
            System.out.println("Возраст должен быть положительным");
        } else {
            age = userAge;
        }
    }

    public int getAge() {
        return age;
    }

    int calculateYearsToRetirement() {
        return 65 - age;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + ", мне " + age + " лет");
        }
    }
}
