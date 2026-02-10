package dosw.bitacora.semana2.solid.reto4;

public class Division implements Operacion {
    @Override
    public double ejecutar(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return a / b;
    }
}
