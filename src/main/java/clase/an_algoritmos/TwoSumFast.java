package clase.an_algoritmos;

import edu.princeton.cs.algs4.*;
import java.util.Arrays;

public class TwoSumFast {

    // return number of distinct pairs (i, j)
    // such that a[i] + a[j] = 0
    public static int count(int[] a) {
        int n = a.length;
        Arrays.sort(a);
        if (containsDuplicates(a)) throw new IllegalArgumentException("array contains duplicate integers");
        int count = 0;
        for (int i = 0; i < n; i++) {
            int j = Arrays.binarySearch(a, -a[i]);
            if (j > i) count++;
        }
        return count;
    } 

    // returns true if the sorted array a[] contains
    // any duplicated integers
    private static boolean containsDuplicates(int[] a) {
        for (int i = 1; i < a.length; i++)
            if (a[i] == a[i-1]) return true; // el array ya está ordenado
        return false;
    }

    public static void main(String[] args)  { 
        In in = new In(args[0]);
        int[] a = in.readAllInts();
        Stopwatch timer = new Stopwatch();
        int count = count(a);
        StdOut.println("elapsed time = " + timer.elapsedTime());
        StdOut.println(count);;
    } 
} 

