package clase.an_algoritmos;
import edu.princeton.cs.algs4.Stopwatch;
import edu.princeton.cs.algs4.*;

public class ThreeSum {
    public static int count(int[] a) {
        int n = a.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                for (int k = j+1; k < n; k++) {
                    if (a[i] + a[j] + a[k] == 0) {
                        count++;
                    }
                }
            }
        }
        return count;
    } 

    public static void main(String[] args)  { 
        In in = new In(args[0]);
        int[] a = in.readAllInts();

        StdOut.println(args[0]);
        Stopwatch sw = new Stopwatch();
        StdOut.println("Found triples: " + count(a));
        StdOut.println("Time: " + sw.elapsedTime() + " seconds");
    } 
} 

