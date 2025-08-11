package practiceday13problem.PracticeProb13;

import java.util.Arrays;

public class MaxMin {

    // UC 1, UC 2, UC 3, Refactor 1: Generic Method for 3 variables
    public static <T extends Comparable<T>> T max(T a, T b, T c) {
        T max = a;
        if (b.compareTo(max) > 0) max = b;
        if (c.compareTo(max) > 0) max = c;
        return max;
    }
    
    // UC 4: Generic Method for more than 3 parameters
    @SafeVarargs
    public static <T extends Comparable<T>> T max(T... values) {
        Arrays.sort(values);
        return values[values.length - 1];
    }
    
    // UC 5: Print the maximum
    public static <T extends Comparable<T>> void printMax(T a, T b, T c) {
        System.out.println("Max is: " + max(a, b, c));
    }

    // Refactor 2: Generic Class
    public static class Maximum<T extends Comparable<T>> {
        private T x, y, z;

        public Maximum(T x, T y, T z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public T testMaximum() {
            return MaxMin.max(x, y, z);
        }

        public void printMaximum() {
            MaxMin.printMax(x, y, z);
        }
    }

    
    public static void main(String[] args) {
        System.out.println("=== UC 1: Integers ===");
        System.out.println(max(5, 3, 2)); // Max at 1st
        System.out.println(max(3, 7, 2)); // Max at 2nd
        System.out.println(max(3, 2, 9)); // Max at 3rd
        
        System.out.println("\n=== UC 2: Floats ===");
        System.out.println(max(5.5f, 3.3f, 2.2f));
        System.out.println(max(3.3f, 7.7f, 2.2f));
        System.out.println(max(3.3f, 2.2f, 9.9f));
        
        System.out.println("\n=== UC 3: Strings ===");
        System.out.println(max("Apple", "Peach", "Banana"));
        System.out.println(max("Peach", "Apple", "Banana"));
        System.out.println(max("Banana", "Apple", "Peach"));

        System.out.println("\n=== Refactor 2: Generic Class ===");
        Maximum<Integer> intMax = new Maximum<>(10, 20, 30);
        System.out.println("Max Integer: " + intMax.testMaximum());
        intMax.printMaximum();
        

        Maximum<String> strMax = new Maximum<>("Zebra", "Lion", "Elephant");
        System.out.println("Max String: " + strMax.testMaximum());
        strMax.printMaximum();

        System.out.println("\n=== UC 4: More than Three Parameters ===");
        System.out.println(max(3, 5, 7, 2, 9, 1));
        System.out.println(max("Dog", "Cat", "Horse", "Elephant"));
        
        System.out.println("\n=== UC 5: Print Max ===");
        printMax(10, 40, 30);
        printMax("Java", "Python", "C++");
        
    }
}
