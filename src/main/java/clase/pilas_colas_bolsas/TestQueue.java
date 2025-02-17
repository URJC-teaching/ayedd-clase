package clase.pilas_colas_bolsas;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class TestQueue {
    public static int[] readAllInts()
    {
        Queue<Integer> queue = new Queue<Integer>();
        System.out.println("Enter integers, one at a time, followed by <Ctrl-d> (EOF):");
        while (!StdIn.isEmpty()) {
            queue.enqueue(StdIn.readInt());
        }
        int n = queue.size();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = queue.dequeue();
        }
        return a;
    }

    public static void main (String[] args) {
        int[] a = readAllInts();
        System.out.println(Arrays.toString(a));
    }
}
