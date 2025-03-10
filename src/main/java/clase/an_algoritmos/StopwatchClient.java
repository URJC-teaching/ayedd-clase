package clase.an_algoritmos;

import edu.princeton.cs.algs4.*;

public class StopwatchClient
{
    public static void main(String[] args)
    {
	int n = Integer.parseInt(args[0]);
	int[] a = new int[n];
	for (int i = 0; i < n; i++) {
		a[i] = StdRandom.uniform(-1000000, 1000000);
	}
	Stopwatch timer = new Stopwatch();
	int count = ThreeSum.count(a);
	double time = timer.elapsedTime();
	StdOut.println(count + " triples " + time + " seconds");

    }
}
	
