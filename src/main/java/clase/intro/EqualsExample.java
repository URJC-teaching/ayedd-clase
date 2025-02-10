package clase.intro;

public class EqualsExample {

    public static void main (String args[]) {

        Date d1 = new Date(1, 2, 2020);
        Date d2 = new Date(1, 2, 2020);

        System.out.println(d1.equals(d2));
        System.out.println(d1 == d2);

    }

}
