package clase.pilas_colas_bolsas;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;
import java.util.Arrays;

public class TestQueue {
    public static int[] readAllInts()
    {
        Queue<Integer> queue = new Queue<Integer>();
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
        StdOut.println(Arrays.toString(a));
    }
}
