package dosw.bitacora.semana3.reto7;

public class Main {
    public static void main(String[] args) {
        Barco barco = new BarcoBasico();
        System.out.println(barco.obtenerDescripcion());
        System.out.println("Ataque: " + barco.obtenerAtaque() + " | Defensa: " + barco.obtenerDefensa());
        
        System.out.println("\n--- Agregando mejoras ---\n");
        
        barco = new RadarAvanzado(barco);
        barco = new Misiles(barco);
        barco = new BlindajeReforzado(barco);
        barco = new SistemaAntitorpedos(barco);
        
        System.out.println(barco.obtenerDescripcion());
        System.out.println("Ataque: " + barco.obtenerAtaque() + " | Defensa: " + barco.obtenerDefensa());
    }
}
