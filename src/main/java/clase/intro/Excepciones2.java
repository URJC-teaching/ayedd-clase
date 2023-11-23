package clase.intro;

import edu.princeton.cs.algs4.StdOut;

public class Excepciones2 {
    public static void main (String[] args)
    {
        int i = 1;
        int j = 0;

        try {
            i = i/j;
        }
        catch (java.lang.ArithmeticException e) {
            System.err.println("División entre 0");
            System.exit(1);
        }

        StdOut.println("Después de excepción");
    }
}
