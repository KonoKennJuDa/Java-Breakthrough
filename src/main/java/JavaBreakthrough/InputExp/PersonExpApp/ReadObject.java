package JavaBreakthrough.InputExp.PersonExpApp;

import java.io.*;

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

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }

}
