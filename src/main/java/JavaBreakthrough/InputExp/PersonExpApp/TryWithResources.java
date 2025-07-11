package JavaBreakthrough.InputExp.PersonExpApp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TryWithResources {

    public static void main(String[] args) {
        // Это та же запись, что в классе WriteObject, только другой вариант. Его преимущество, что его закрывать не надо. Это Try с ресурсами
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("какое-то имя"))) {
            // какая-то логика
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Опять же та же запись, что в классе ReadObject, только другой вариант. Опять же не надо закрывать + компактней пишется
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("какое-то имя"))) {
            // логика
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
