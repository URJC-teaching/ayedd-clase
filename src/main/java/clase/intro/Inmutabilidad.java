package clase.intro;

public class Inmutabilidad {


    public static void main(String[] args) {
        int[] a = {1, 2, 3};

        Vmutable vm = new Vmutable(a);
        Vinmutable vim = new Vinmutable(a);

        System.out.println(vm);
        System.out.println(vim);

        a[0] = 10;
        System.out.println("------------------");

        System.out.println(vm);
        System.out.println(vim);
    }
}
