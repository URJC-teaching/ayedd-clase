package clase.intro;

public class ThisExample {

    private int valor;

    public ThisExample(int valor) {
        this.valor = valor;
    }

    public ThisExample() { valor = 0; }

    public int suma(int valor) {
        return this.valor + valor;
    }

    public int resta(int v) {
        return valor - v;
    }

    public static void main(String[] args) {
        ThisExample ejemplo_1 = new ThisExample(10);
        System.out.println(ejemplo_1.suma(5));
        System.out.println(ejemplo_1.resta(5));

        ThisExample ejemplo_2 = new ThisExample();
        System.out.println(ejemplo_2.suma(1));
        System.out.println(ejemplo_2.resta(1));
    }
}
