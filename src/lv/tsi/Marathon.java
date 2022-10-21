package lv.tsi;

public class Marathon {
    static public void printResults(String[] names, int[] times) {
        for (int i = 0; i < times.length; ++i) {
            System.out.printf("%1$-8s", names[i] );
            System.out.println( "\t" + times[i]);
        }
    }
}
