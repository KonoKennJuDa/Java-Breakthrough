package com.javabreakthrough.Lesson1.Variables;

public class VariablesExample {

    public static void main(String[] args) {
        // Примитивные типы
        int age = 25;
        double weight = 65.5;
        boolean isStudent = true;
        double temperature = -5.3;

        // Ссылочные типы
        String name = "Мария";
        int[] grades = {5, 4, 3};

        System.out.println(name + ", возраст: " + age + ", температура тела: " + temperature);
        System.out.println("Вес: " + weight + " кг");
        System.out.println("Студент: " + isStudent);
    }
}
