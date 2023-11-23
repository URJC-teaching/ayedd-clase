package clase.ordenacion;

import edu.princeton.cs.algs4.*;

public class StringSorter {

    public static void main(String[] args) {
	String[] a = StdIn.readAllStrings();
	Insertion.sort(a);
	for (int i = 0; i < a.length; i++)
	    StdOut.println(a[i]);
    }
}
