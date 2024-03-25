package clase.ordenacion;

import edu.princeton.cs.algs4.*;

public class StringSorter {

    public static void main(String[] args) {
	String[] a = StdIn.readAllStrings();
	Insertion.sort(a);
	for (String s : a)
		StdOut.println(s);
    }
}
