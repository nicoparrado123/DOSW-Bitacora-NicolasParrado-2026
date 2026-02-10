package dosw.bitacora.semana2.solid.reto4;

public class SolidNico {
    
    public static void main(String[] args) {
        CalculadoraNico calc = new CalculadoraNico();
        
        System.out.println("=== Operaciones con enteros ===");
        System.out.println("10 + 5 = " + calc.calcular(new Suma(), 10, 5));
        System.out.println("10 - 5 = " + calc.calcular(new Resta(), 10, 5));
        System.out.println("10 * 5 = " + calc.calcular(new Multiplicacion(), 10, 5));
        System.out.println("10 / 5 = " + calc.calcular(new Division(), 10, 5));
        
        System.out.println("\n=== Operaciones con decimales ===");
        System.out.println("10.5 + 3.2 = " + calc.calcular(new Suma(), 10.5, 3.2));
        System.out.println("10.5 - 3.2 = " + calc.calcular(new Resta(), 10.5, 3.2));
        System.out.println("10.5 * 3.2 = " + calc.calcular(new Multiplicacion(), 10.5, 3.2));
        System.out.println("10.5 / 3.2 = " + calc.calcular(new Division(), 10.5, 3.2));
    }
}
