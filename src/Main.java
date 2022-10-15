import lv.tsi.*;
import lv.tsi.animals.Animals;

public class Main {
        public Main() {
        }

        public static void main(String[] args) throws Exception {
            GravityCalculator da = new GravityCalculator();
            float t = 93.99F;
            float v = 2.99F;
            float p = 91.2F;
            da.Converter(t, p, v);
            System.out.println("#############################################\n1 exercise\n");
            System.out.println("Position in " + da.fallingTime + " seconds:" + da.finalPosition());
            System.out.println("\n#############################################\n2 exercise\n");
            long n = 10;
            System.out.println("Factorial(Loop) of "+ n +" is "+ FactorialCalculator.factorialLoop(n));
            System.out.println("Factorial(Recursion) of "+ n +" is "+ FactorialCalculator.factorialRecursion(n));
            System.out.println("\n#############################################\n3 exercise\n");
            int size = 3;
            double[][] array = OneDimensionalArray.createRandomArray(size);
            for (double[] i : array) {
                for (double j : i) {
                    System.out.print(j + "\t");
                }
                System.out.println();
            }
            System.out.println();
            System.out.println("Average value of array is " + OneDimensionalArray.averageValueOfArray(array));
            System.out.println("MAX value of array is " + OneDimensionalArray.maxValueOfArray(array));
            System.out.println("MIN value of array is " + OneDimensionalArray.minValueOfArray(array));
            System.out.println("\n#############################################\n4 exercise\n");
            String [] names = {"Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                    "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda", "Aaron", "Kate"};
            int [] times = {341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                    343, 317, 265};
            Marathon.printResults(names, times);
            System.out.println("\n#############################################\n5 exercise\n");
            int[][] array2d = TwoDimensionalArray.createRandomArray(size);
            System.out.printf("Average value of array2d is " + TwoDimensionalArray.averageValueOf2DArray(array2d)+"\n");
            TwoDimensionalArray.print2DArrayInfo(array2d);
            System.out.println("\n#############################################\n6 exercise\n");
            Animals animals = new Animals();
            animals.cat.animalSound();
            animals.dog.animalSound();
            animals.fox.animalSound();
            System.out.println("\n#############################################\n7 exercise\n");
            animals.fox.printName();
            animals.dog.printName();
            animals.cat.printName();

        }
}
