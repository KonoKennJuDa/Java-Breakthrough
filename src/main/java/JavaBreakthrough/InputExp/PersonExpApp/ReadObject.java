package JavaBreakthrough.InputExp.PersonExpApp;

import JavaBreakthrough.ArraysExp.ArraysExpApp;

import java.io.*;
import java.util.Arrays;

public class ReadObject {

    // Методов main может быть сколько угодно в программе, просто будет разные параметры и разные точки входа. Это точка входа в программу
    public static void main(String[] args) {

        try {
            // Тут все также как в записи файлов, только чтение. Этот метод последовательно считывает байты
            FileInputStream fis = new FileInputStream("people.bin");
            // Этот метод работает с объектами, считывает объекты, но для его работы нужен класс выше
            ObjectInputStream ois = new ObjectInputStream(fis);

            // Обязательно надо сделать даункастинг до класса Person, иначе выведется Object.
            // Также нужно обработать исключение, которые возникает при отсутствии класса
            Person person1 = (Person) ois.readObject();
            Person person2 = (Person) ois.readObject();

            // Выводим в консоль наши объекты из записанного файла
            System.out.println(person1);
            System.out.println(person2);

            System.out.println();

            // Читаем из файла массив объектов
            int personCount = ois.readInt();
            // Массив, куда мы будем записывать считанные объекты
            Person[] people = new Person[personCount];

            // Цикл считывания
            for (int i = 0; i < personCount; i++) {
                // Обязательно нужно даункастить от Object до Person
                people[i] = (Person) ois.readObject();
            }

            // Выводим массив в консоль методов toString вызванным у класса Arrays
            System.out.println(Arrays.toString(people));

            System.out.println();

            // Массив куда записывается считанный массив, обязаткльно даункаст от Object до Person
            Person[] people2 = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(people2));

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
