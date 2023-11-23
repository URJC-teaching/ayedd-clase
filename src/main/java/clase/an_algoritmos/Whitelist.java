package clase.an_algoritmos;

import edu.princeton.cs.algs4.*;
import edu.princeton.cs.algs4.StaticSETofInts;

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
    
