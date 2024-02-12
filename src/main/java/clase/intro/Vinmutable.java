package clase.intro;

public class Vinmutable {
    private int[] coords;

    public Vinmutable(int [] a) {
        coords = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            coords[i] = a[i];
        }
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < coords.length; i++) {
            s = s + coords[i] + " ";
        }
        return s;
    }
}
