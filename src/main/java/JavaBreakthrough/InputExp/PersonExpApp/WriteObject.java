package JavaBreakthrough.InputExp.PersonExpApp;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        // Находятся в оперативной памяти во время исполнения программы, к ним нет доступа
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");
        // Также можно записывать массивы, для этого создадим массив
        Person[] people = {new Person(3, "Artem"), new Person(4, "Tom")};
        Person[] people2 = {new Person(5, "Artem2"), new Person(6, "Tom2")};

        // Сериализация. Чтобы записать наши объекты на жесткий диск и иметь к ним доступ
        try {
            // FileOutputStream - предназначен для записи последовательности байтов. Не важно картинка, объект, звуки, что угодно
            FileOutputStream fos = new FileOutputStream("people.bin"); // Когда мы записываем бинарные данные, мы создаем файл типа bin. Тут нужно обработать исключение
            // ObjectOutputStream - предназначен для записи объектов, т.е. он более конкретный, но для работы ему нужен FileOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            // Тут мы записываем объект
            oos.writeObject(person1);
            oos.writeObject(person2);

            System.out.println();

            // Первый метод записывания массива. Буквально перебирая каждый объект в массиве
            // Тут записываем массив, число объектов в массиве. Сначала будет записано число, после объект
            oos.writeInt(people.length);
            // Пройдемся по всем объектам в массиве Person и записываем их в файл
            for (Person person : people) {
                oos.writeObject(person);
            }

            System.out.println();

            // Второй метод записывания массива. Сразу записываем массив
            // Более простой способ, работает по сути также, так как массив является объектом тоже
            oos.writeObject(people2);

            oos.close(); // обязательно надо закрыть stream
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
