package com.javabreakthrough.Lesson6;

// public - главный класс
public class ClassesAndObjects {

    public static void main(String[] args) {

        Person person = new Person(); // По созданному нами шаблону, мы создали объект и в переменные, которые были у шаблона, поместили данные
        person.name = "Роман";
        person.age = 50;
        // System.out.println("Меня зовут " + person.name + ", " + "мне " + person.age + " лет");
        person.speak(); // Мы перенесли функционал, который делается постоянно, в метод
        int year = person.calculateYearsToRetirement();
        System.out.println("До пенсии " + year + " лет");

        System.out.println();

        Person person1 = new Person(); // Можно создавать несколько объектов из одного шаблона
        person1.name = "Михаил";
        person1.age = 20;
        // System.out.println("Меня зовут " + person1.name + ", " + "мне " + person1.age + " лет");
        person1.speak();
        person1.sayHello();
        int year1 = person1.calculateYearsToRetirement();
        System.out.println("До пенсии " + year1 + " лет");
    }
}

// class - вложенные класс
class Person {
    // У класса могут быть:
    // 1. Данные (поля)
    // 2. Действия, которые он может совершать (методы)
    String name;
    int age;

    int calculateYearsToRetirement() { // Возвращает переменную int, которую мы можем присвоить и использовать далее
        int years = 65 - age;
        // String s = "Привет"; мы не сможем вернуть строку, потому что метод int типа
        return years; // Сразу выходит из метода, метод на нем завершается
    }

    void speak() { // void - значит, что метод ничего не возвращает
        for (int i = 0; i < 3; i++) { // Просто по фану прикрутили цикл, чтобы выводилось три раза
            System.out.println("Меня зовут " + name + ", мне " + age + " лет.");
        }
    }

    void sayHello() { // Этому методы данные не нужны. У всех этот метод будет вызываться одинаково
        System.out.println("Привет!");
    }

}