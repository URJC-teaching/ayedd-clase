package clase.intro;

/******************************************************************************
 *  Compilation:  javac Rolls.java
 *  Execution:    java Rolls n
 *  Dependencies: Counter.java StdRandom.java StdOut.java
 *
 *  Simulate the rolling of n 6-sided dice.
 *
 *  % java Rolls 1000000
 *  167308 1s
 *  166540 2s
 *  166087 3s
 *  167051 4s
 *  166422 5s
 *  166592 6s
 *
 ******************************************************************************/
import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdOut;

public class Rolls {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int SIDES = 6;

        // initialize counters
        Counter[] rolls = new Counter[SIDES];
        for (int i = 0; i < SIDES; i++) {
            rolls[i] = new Counter(i + 1 + "s");
        }

        // flip dice
        for (int j = 0; j < n; j++) {
            int result = StdRandom.uniform(0, SIDES);
            rolls[result].increment();
        }

        // print results
        for (int i = 0; i < SIDES; i++) {
            StdOut.println(rolls[i]);
        }
    }
}
