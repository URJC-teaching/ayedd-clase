package clase.intro;

public class EjemploThis {

    private int valor;

    public EjemploThis(int valor) {
        this.valor = valor;
    }

    public EjemploThis() { valor = 0; }

    public int suma(int valor) {
        return this.valor + valor;
    }

    public int resta(int v) {
        return valor - v;
    }

    public static void main(String[] args) {
        EjemploThis ejemplo_1 = new EjemploThis(10);
        System.out.println(ejemplo_1.suma(5));
        System.out.println(ejemplo_1.resta(5));

        EjemploThis ejemplo_2 = new EjemploThis();
        System.out.println(ejemplo_2.suma(1));
        System.out.println(ejemplo_2.resta(1));
    }
}
