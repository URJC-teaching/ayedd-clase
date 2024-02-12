package clase.intro;

public class Vmutable {
    private final int[] coords;

    public Vmutable(int [] a) {
        coords = a;
    }

    public String toString() {
        String s = "";
        for (int i = 0; i < coords.length; i++) {
            s = s + coords[i] + " ";
        }
        return s;
    }

}
