package clase.intro;

public class EjemploThis {

    private int valor;

    public EjemploThis(int valor) {
        this.valor = valor;
    }

    public int suma(int valor) {
        return this.valor + valor;
    }

    public int resta(int v) {
        return valor - v;
    }

    public static void main(String[] args) {
        EjemploThis ejemplo = new EjemploThis(10);
        System.out.println(ejemplo.suma(5));
        System.out.println(ejemplo.resta(5));
    }
}
