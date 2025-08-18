package Practice.Day4;

import java.util.Random;

public class Task3 {

    public static void main(String[] args) {

        int[][] matrix = new int[12][8];

        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
             matrix[i][j] = random.nextInt();
            }
        }
    }
}
