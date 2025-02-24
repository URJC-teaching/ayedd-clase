package clase.pilas_colas_bolsas;

import edu.princeton.cs.algs4.StdOut;

public class Node
{  
    String item;
    Node   next;

    public static void main(String[] args) {
        Node first = new Node();
        first.item = "to";

        Node second = new Node();
        second.item = "be";

        first.next = second;

        Node third = new Node();
        third.item = "or...";

        second.next = third;

        Node aux = first;
        System.out.println(aux.item);
        while(aux.next != null){
            aux = aux.next;
            System.out.println(aux.item);
        }
    }
}
