package clase.intro;

import java.util.Arrays;

public class StaticSETofInts
{
    private int[] a;

    public StaticSETofInts(int[] keys)
    {
	a = new int[keys.length];
	for (int i = 0; i < keys.length; i++){
	    a[i] = keys[i];  // copia defensiva
	                     // para que el tipo
	                     // sea inmutable
	}
	Arrays.sort(a);
    }

    public boolean contains(int key)
    {   return indexOf(key) != -1;   }

    private int indexOf(int key)
    {   // Binary search.
	int lo = 0;
	int hi = a.length - 1;
	while (lo <= hi) {
	    // ¿está key en a[lo..hi]?
	    int mid = lo + (hi - lo) / 2;
	    if      (key < a[mid]) { hi = mid - 1; }
	    else if (key > a[mid]) { lo = mid + 1; }
	    else                   { return mid;   }
	}
	return -1;
    }
}
	    
