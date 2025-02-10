package clase.intro;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdOut;
import edu.princeton.cs.algs4.StdRandom;

public class FlipsBreakReference {

    private static Counter breakReference(Counter c) {
        c.increment();
        c = new Counter("new counter");
        return c;
    }

    private static Counter doNotBreakReference(Counter c) {
        c.increment();
        return c;
    }

    public static void main(String[] args) {
        Counter counter = new Counter("counter");

        StdOut.println("Before breakReference: " + counter);
        counter = breakReference(counter);
        StdOut.println("After breakReference: " + counter);

        StdOut.println("Before doNotBreakReference: " + counter);
        counter = doNotBreakReference(counter);
        StdOut.println("After doNotBreakReference: " + counter);

    }
}
