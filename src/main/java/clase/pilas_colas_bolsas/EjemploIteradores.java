package clase.pilas_colas_bolsas;

import clase.intro.Transaction;
import edu.princeton.cs.algs4.StdOut;

import java.util.Iterator;

public class EjemploIteradores {

    public static void main(String[] args){

        Queue<Transaction> q = new Queue<>();

        q.enqueue(new Transaction("Yo 01/01/2001 31"));
        q.enqueue(new Transaction("Tú 01/01/2001 32"));
        q.enqueue(new Transaction("Él 01/01/2001 33"));

        StdOut.println("Impresión del contenido utilizando foreach");

        for(Transaction tr: q){
            StdOut.println(tr);
        }

        StdOut.println("\nImpresión del contenido utilizando el iterador");

        Iterator<Transaction> i = q.iterator();

        while(i.hasNext()){
            StdOut.println(i.next());
        }

    }

}
