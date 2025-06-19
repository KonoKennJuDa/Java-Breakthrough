package JavaBreakthrough.ArraysExp;

public class Multidimensional_Arrays {

    public static void main(String[] args) {

        int[] number = {1, 2, 3}; // Одномерный массив, просто линия чисел
        System.out.println(number[1]);
        /**
         * 1, 2, 3
         * Одномерный массив.
         */
        System.out.println();

        int[][] matrice = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}; // Двумерный массив. Могут быть и трехмерные массив и четырехмерные, работают они по той же логике
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);
        /**
         * 1, 2, 3
         * 4, 5, 6
         * 7, 8, 9
         * Двумерный массив.
         */

        System.out.println();

        int[][] matrice2 = {{1,2,3,4,5}, {4}, {7,8,9}};
        System.out.println(matrice2[0][4]);

        System.out.println();

        String[][] strings = new String[2][3];
        strings[0][1] = "Привет";
        System.out.println(strings[0][1]);

        for (int i = 0; i < matrice.length; i++) {
            for (int j = 0; j < matrice[i].length; j++) {
                System.out.print(matrice[i][j] + " ");
            }
            System.out.println();
        }
    }
}
