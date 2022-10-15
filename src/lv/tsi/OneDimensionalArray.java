package lv.tsi;

import java.util.Random;

public class OneDimensionalArray {
    static public double[][] createRandomArray(int size)
    {
        double[][] randomArray = new double[size][size];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; ++i)
            for(int j = 0; j < randomArray[i].length; ++j)
                randomArray[i][j] = random.nextDouble(0,100);
        return randomArray;
    }
    static public double averageValueOfArray(double[][] randomArray)
    {
        double sum = 0;
        int div = 0;
        for (double[] i : randomArray)
            for (double j : i) {
                sum += j;
                div += 1;
            }
        return sum/div;
    }
    static public double maxValueOfArray(double[][] randomArray)
    {
        double max = 0;
        for (double[] i : randomArray)
            for (double j : i) {
                if (max < j){
                    max = j;
                }
            }
        return max;
    }
    static public double minValueOfArray(double[][] randomArray)
    {
        double min = 100;
        for (double[] i : randomArray)
            for (double j : i) {
                if (min > j){
                    min = j;
                }
            }
        return min;
    }
}
