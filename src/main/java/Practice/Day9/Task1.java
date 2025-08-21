package Practice.Day9;

public class Task1 {

    public static void main(String[] args) {


    }
}

class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Это человек с именем" + name);
    }

}

class Student extends Human {
    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

}

class Teacher extends Human {

}