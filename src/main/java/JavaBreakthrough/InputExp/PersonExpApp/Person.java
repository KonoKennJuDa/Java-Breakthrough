package JavaBreakthrough.InputExp.PersonExpApp;

import java.io.Serial;
import java.io.Serializable;

public class Person implements Serializable { // нужно имплементировать интерфейс Serializable, чтобы Java понимала, что это можно делать

    // Также есть ключевое слово transient, которые запрещает сериализацию
    // private transient int id; пример. Так как это примитивная переменная, будет 0
    private int id;
    private String name; // Переменная ссылочного типа и если запретить сериализацию, выведет Null
    // Новые поля, чтобы показать разницу, изменения класса со временем
    // private int age;
    // private byte type;


    // Также если вы реализуете интерфейс Serializable, нужно реализовать класс serialVersionUID
    // Это нужно для того, чтобы поменять состояние класса. Когда меняется класс, существенно меняется, также должен быть изменен UID
    @Serial
    private static final long serialVersionUID = -3722203743604454371L;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }

}
