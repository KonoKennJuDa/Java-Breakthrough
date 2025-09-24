package Practice.Day15;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) throws FileNotFoundException {

        File file = new File("files/shoes.csv");
        Scanner scanner = new Scanner(file);

        File fileOut = new File("files/result.txt");
        PrintWriter printWriter = new PrintWriter(fileOut);

        while (scanner.hasNextLine()) {
            String[] array = scanner.nextLine().split(";");

            if (Integer.parseInt(array[2]) == 0) {
                printWriter.println(array[0] + ", " + array[1] + ", " + array[2]);
            }
        }
        printWriter.close();
        scanner.close();

    }

}
