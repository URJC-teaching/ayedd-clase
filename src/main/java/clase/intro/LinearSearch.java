package clase.intro;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class LinearSearch {
    public static int indexOf(int key, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
        In in = new In(args[0]); // crea un objeto de la clase In para leer el archivo pasado como argumento al programa
        int[] whitelist = in.readAllInts(); // lee todos los enteros del archivo pasado como argumento al programa

        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if (indexOf(key, whitelist) == -1){
                StdOut.println("Not found: " + key);
            } else {
               StdOut.println("Found:" + key);
            }
        }
    }



}
