package clase.intro;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StaticSETofInts;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Whitelist
{
    public static void main(String[] args)
    {
		In in = new In(args[0]);
		int[] a = in.readAllInts();
		StaticSETofInts set = new StaticSETofInts(a);
		while (!StdIn.isEmpty()) {
			// Leer key
			int key = StdIn.readInt();
			// Mostrar key si no está en la lista blanca
			if (!set.contains(key)) {
				StdOut.println(key);
			}
		}
    }
}
    
