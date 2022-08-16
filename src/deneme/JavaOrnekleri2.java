package deneme;

import java.util.Scanner;

class JavaOrnekleri2 {
    public static <int1> void main(String args[]) {

        int i, s = 0;
        int[][] arr1 = {{0, 2, -1}, {3, 8, 4}, {7},{0, 6, -1}, {3, -2, 9}, {7},{0, 2, -1}, {3, 8, 4}, {7},{0, 6, -1}, {3, -2, 9}, {7}};
        int[][] arr2 = {{-7, 6, -9}, {0, 12}, {19},{-7, 6, -5}, {6, 12}, {-19},{3, -2, 9}, {7},{0, 2, -1}, {3, 8, 4}};

        for (i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                s = s + arr1[i][j];
            }
        }
        for (i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                s = s + arr2[i][j];
            }
        }

        System.out.println("\nDizideki tüm elemanları topla :" + s);

    }
}

