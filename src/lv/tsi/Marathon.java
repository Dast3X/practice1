package lv.tsi;

public class Marathon {
    static public void printResults(String[] names, int[] times) {
        for (int i = 0; i < times.length; ++i) {
            System.out.println(names[i] + "\t" + times[i]);
        }
    }
}
