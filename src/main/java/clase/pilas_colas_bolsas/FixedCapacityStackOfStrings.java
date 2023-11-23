package clase.pilas_colas_bolsas;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class FixedCapacityStackOfStrings
{
    private String[] a;     // elementos de la pila
    private int      n = 0; // número de elementos en la pila

    public FixedCapacityStackOfStrings(int capacity)
    {  a = new String[capacity]; }

    public boolean isEmpty() { return n == 0; }
    public int size()        { return n; }

    public void push(String item)
    { a[n++] = item; }

    public String pop()
    { return a[--n]; }

    public static void main (String[] args)
    {
        FixedCapacityStackOfStrings s;
        s = new FixedCapacityStackOfStrings(100);
        while (!StdIn.isEmpty())
        {
            String item = StdIn.readString();
            if (!item.equals("-")) { s.push(item); }
            else if (!s.isEmpty()) { StdOut.print(s.pop() + " "); }
        }
        StdOut.println("(" + s.size() + " elements on the stack)");
    }
}
