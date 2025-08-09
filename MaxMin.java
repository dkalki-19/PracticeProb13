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

    
    public static void main(String[] args) {
        System.out.println("=== UC 1: Integers ===");
        System.out.println(max(5, 3, 2)); // Max at 1st
        System.out.println(max(3, 7, 2)); // Max at 2nd
        System.out.println(max(3, 2, 9)); // Max at 3rd
        
        System.out.println("\n=== UC 2: Floats ===");
        System.out.println(max(5.5f, 3.3f, 2.2f));
        System.out.println(max(3.3f, 7.7f, 2.2f));
        System.out.println(max(3.3f, 2.2f, 9.9f));
    }
}
