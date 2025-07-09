package JavaBreakthrough.InputExp.WriteExp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterToFile {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("testFile");
        // Класс PrintWriter из пакета Java.io
        PrintWriter printWriter = new PrintWriter(file); // Нужно обработать исключение, мы его обрабатываем в методе, но можно и try/catch

        // System.out.println(System.in); действует точно также, выводит данные в поток
        // Только в этом случае мы выводим данные в файл, а не в консоль(System.in)
        printWriter.println("Test row 1");
        printWriter.println("Test row 2");
        printWriter.println("Test row 3");
        printWriter.println("Test row 4");

        printWriter.close(); // Его обязательно надо закрыть, как и в случае чтения файлов мы закрывали Scanner

    }
}
