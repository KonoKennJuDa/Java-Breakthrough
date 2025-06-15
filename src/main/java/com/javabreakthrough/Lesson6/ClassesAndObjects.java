package com.javabreakthrough.Lesson6;

// public - главный класс
public class ClassesAndObjects {

    public static void main(String[] args) {

        Person person = new Person(); // По созданному нами шаблону, мы создали объект и в переменные, которые были у шаблона, поместили данные
        person.name = "Роман";
        person.age = 50;
        System.out.println("Меня зовут " + person.name + ", " + "мне " + person.age + " лет");

        Person person1 = new Person(); // Можно создавать несколько объектов из одного шаблона
        person1.name = "Михаил";
        person1.age = 20;
        System.out.println("Меня зовут " + person1.name + ", " + "мне " + person1.age + " лет");
    }
}

// class - вложенные класс
class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)
    String name;
    int age;
}