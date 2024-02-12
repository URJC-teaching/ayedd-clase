package clase.pilas_colas_bolsas;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Dijkstra {
    private static boolean isBinOperator(String op) {
        String ops = "+-*/";
        return ops.contains(op);
    }

    private static double evalOp(Stack<Double> vals, double v1, String op) {
        double v = 0.0;
        double v2 = 0.0;
        if (isBinOperator(op)) {
            v2 = vals.pop();
        }
        if (op.equals("+")) {
            v = v1 + v2;
        } else if (op.equals("-")) {
            v = v1 - v2;
        } else if (op.equals("*")) {
            v = v1 * v2;
        } else if (op.equals("/")) {
            v = v1 / v2;
        } else if (op.equals("sqrt")) {
            v = Math.sqrt(v1);
        }
        return v;
    }

    public static void main(String[] args) {
        Stack<String> ops = new Stack<String>();
        Stack<Double> vals = new Stack<Double>();


        //código para que toda la operación vaya en una sola línea (sólo funciona con números de 1 dígito)
        String input = StdIn.readString();
        for(int i = 0; i < input.length(); i++){
            String s= "" + input.charAt(i);
            if (s.equals("(")) {
                // ignoramos
            } else if (isBinOperator(s) || s.equals("sqrt")) {
                ops.push(s);
            } else if (s.equals(")")) {   // Pop->eval->push(resultado) si el token es ")"
                String op = ops.pop();
                double v = vals.pop();
                v = evalOp(vals, v, op);
                vals.push(v);
            } else {// El token no es un operador o paréntesis, es un operando
                vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
