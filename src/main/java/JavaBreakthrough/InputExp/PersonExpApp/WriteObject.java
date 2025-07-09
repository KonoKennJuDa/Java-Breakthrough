package JavaBreakthrough.InputExp.PersonExpApp;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {

        // Находятся в оперативной памяти во время исполнения программы, к ним нет доступа
        Person person1 = new Person(1, "Bob");
        Person person2 = new Person(2, "Mike");

        // Сериализация. Чтобы записать наши объекты на жесткий диск и иметь к ним доступ
        try {
            // FileOutputStream - предназначен для записи последовательности байтов. Не важно картинка, объект, звуки, что угодно
            FileOutputStream fos = new FileOutputStream("people.bin"); // Когда мы записываем бинарные данные, мы создаем файл типа bin. Тут нужно обработать исключение
            // ObjectOutputStream - предназначен для записи объектов, т.е. он более конкретный, но для работы ему нужен FileOutputStream
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close(); // обязательно надо закрыть stream
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
