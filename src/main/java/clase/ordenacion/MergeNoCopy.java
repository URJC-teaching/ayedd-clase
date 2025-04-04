package clase.ordenacion;

import edu.princeton.cs.algs4.*;

public class MergeNoCopy {

    private MergeNoCopy() { }

    private static void merge(Comparable[] src, Comparable[] dest, int lo, int mid, int hi) {
        assert isSorted(src, lo, mid);
        assert isSorted(src, mid+1, hi);

        int i = lo, j = mid + 1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid)              dest[k] = src[j++];
            else if (j > hi)               dest[k] = src[i++];
            else if (less(src[j], src[i])) dest[k] = src[j++];
            else                           dest[k] = src[i++];
        }

        assert isSorted(dest, lo, hi);
    }

    private static void sort(Comparable[] src, Comparable[] dest, int lo, int hi) {
        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(dest, src, lo, mid);
        sort(dest, src, mid + 1, hi);
        merge(src, dest, lo, mid, hi);
    }

    public static void sort(Comparable[] a) {
        Comparable[] aux = a.clone();
        sort(aux, a, 0, a.length - 1);
        assert isSorted(a);
    }

    private static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    private static boolean isSorted(Comparable[] a) {
        return isSorted(a, 0, a.length - 1);
    }

    private static boolean isSorted(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++)
            if (less(a[i], a[i-1])) return false;
        return true;
    }

    private static void show(Comparable[] a) {
        for (Comparable item : a) {
            StdOut.println(item);
        }
    }

    public static void main(String[] args) {
        Integer[] numbers = { 5, 2, 9, 8, 5, 2};
        MergeNoCopy.sort(numbers);
        show(numbers);
    }
}
