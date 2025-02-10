package clase.intro;

public class WrappersExample {

    public static void main (String args[]) {

        // Autoboxing
        String integer_str = "10";
        int integ = Integer.parseInt(integer_str);
        System.out.println(integ);

        String double_str = "10.5";
        double doub = Double.parseDouble(double_str);
        System.out.println(doub);

        // Auto-unboxing
        Integer integer = new Integer(11);
        int integ2 = integer;
        System.out.println(integ2);
    }

}
