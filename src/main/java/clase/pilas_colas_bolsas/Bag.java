package clase.pilas_colas_bolsas;

import java.util.Iterator;

public class Bag<Item> implements Iterable<Item>
{
    private Node first; // primer nodo de la lista
    private int n;
    private class Node
    {   // clase anidada privada para definir nodos
		Item item;
		Node next;
    }
    public boolean isEmpty() {  return first == null; }
    public int size()        {  return n;             }
    public void add(Item item)
    {   // Añadir item a la bolsa: igual que push() de la pila
		Node oldfirst = first;
		first = new Node();
		first.item = item;
		first.next = oldfirst;
		n++;
    }

    public Iterator<Item> iterator()
    {  return new ListIterator();  }
    private class ListIterator implements Iterator<Item>
    {
		private Node current = first;

		public boolean hasNext() {  return current != null;  }
		public void remove() { }
		public Item next()
		{
			Item item = current.item;
			current = current.next;
			return item;
	}
    }
}    
