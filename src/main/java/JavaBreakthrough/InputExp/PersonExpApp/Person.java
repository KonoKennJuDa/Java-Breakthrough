package JavaBreakthrough.InputExp.PersonExpApp;

import java.io.Serializable;

public class Person implements Serializable { // нужно имплементировать интерфейс Serializable, чтобы Java понимала, что это можно делать

    // Также есть ключевое слово transient, которые запрещает сериализацию
    // private transient int id; пример. Так как это примитивная переменная, будет 0
    private int id;
    private String name; // Переменная ссылочного типа и если запретить сериализацию, выведет Null

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return id + " : " + name;
    }

}
