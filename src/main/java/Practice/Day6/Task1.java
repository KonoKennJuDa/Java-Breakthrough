package Practice.Day6;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {

        Car car = new Car();
        car.setYear(2023);
        car.info();
        System.out.println(car.yearDiff(1900));
        Motorbike motorbike = new Motorbike();
        motorbike.setYear(2007);
        motorbike.info();
        System.out.println(motorbike.yearDiff(1930));
        Airplane airplane = new Airplane(30, 40000, 2010, "Boeing");
        airplane.setYear(2011);
        airplane.setLength(35);
        airplane.fillUp(1000);
        airplane.fillUp(5000);
        airplane.info();
        Teacher teacher = new Teacher("Иван Иванов Иванович", "География");
        Student student = new Student("Петр Петров Петрович");
        teacher.evaluate(student);

    }
}

class Car {

    private int year;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Это машина");
    }

    public int yearDiff(int inputYear) {
        return Math.abs(inputYear - year);
    }

}

class Motorbike {

    private int year;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDiff(int inputYear) {
        return Math.abs(inputYear - year);
    }

}

class Airplane {


    private int length;
    private int weight;
    private int fuel;
    private int year;
    private String producer;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getFuel() {
        return fuel;
    }

    public void setFuel(int fuel) {
        this.fuel = fuel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public Airplane(int length, int weight, int year, String producer) {
        this.length = length;
        this.weight = weight;
        this.year = year;
        this.producer = producer;
        this.fuel = 0;
    }

    public void info() {
        System.out.println("Изготовитель: " + producer + ", год выпуска: " + year + ", длина: " + length + ", вес " + weight + ", объем бака: " + fuel);
    }

    public void fillUp(int inputFuel) {
        fuel += inputFuel;
    }
}

class Teacher {

    private String fio;
    private String subject;

    public Teacher(String fio, String subject) {
        this.fio = fio;
        this.subject = subject;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        Random random = new Random();
        int randomValue = random.nextInt(4) + 2;

        String evaluation = "";
        switch (randomValue) {
            case 2:
                evaluation = "неудавлетворительно";
                break;
            case 3:
                evaluation = "удовлетворительно";
                break;
            case 4:
                evaluation = "хорошо";
                break;
            case 5:
                evaluation = "отлично";
                break;
        }
        System.out.println("Преподователь " + this.fio + " оценил студента " + student.getFio() + " по предмету " + this.subject + " на оценку " + evaluation);
    }

}

class Student {

    private String fio;

    public Student(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

}