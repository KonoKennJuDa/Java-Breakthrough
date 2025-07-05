package JavaBreakthrough.InputExp.WriteExp;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class WriterToFile {

    public static void main(String[] args) throws FileNotFoundException {


        File file = new File("testFile");
        PrintWriter printWriter = new PrintWriter(file);

        // System.out.println(System.in);
        printWriter.println("Test row 1");
        printWriter.println("Test row 2");
        printWriter.println("Test row 3");
        printWriter.println("Test row 4");

        printWriter.close(); // Его обязательно надо закрыть

    }
}
