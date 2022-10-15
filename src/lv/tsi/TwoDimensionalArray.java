package lv.tsi;

import java.util.Random;

public class TwoDimensionalArray {
    static public int[][] createRandomArray(int size) {
        int[][] randomArray = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; ++i)
            for (int j = 0; j < randomArray[i].length; ++j)
                randomArray[i][j] = random.nextInt(0, 100);
        return randomArray;
    }

    static public double averageValueOf2DArray(int[][] array) {
        double sum = 0;
        int div = 0;
        for (int[] i : array)
            for (int j : i) {
                sum += j;
                div += 1;
            }
        return sum / div;
    }

    static public void print2DArrayInfo(int[][] array) {

        for (int[] i : array) {
            for (int j : i) {
                System.out.print(j + "\t");
            }
            System.out.println();
        }
        System.out.println();
        int count = 1;
        for (int[] i : array) {
            double sum = 0;
            for (int j : i) sum += j;
            System.out.println(count++ + " row average value: " + sum / array.length);
        }
        System.out.println();
        count = 1;
        for (int i = 0; i < array.length; ++i)
        {
            double sum = 0;
            for (int j = 0; j < array[i].length; ++j)
                sum += array[j][i];
            System.out.println(count+++" column average value: " +sum / array.length);
        }


    }


}
