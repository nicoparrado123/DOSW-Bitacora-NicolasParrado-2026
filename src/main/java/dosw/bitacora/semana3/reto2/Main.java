package dosw.bitacora.semana3.reto2;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== PlayStation ===");
        ConsolaFactory playStationFactory = new PlayStationFactory();
        MotorJuego motorPS = new MotorJuego(playStationFactory);
        motorPS.ejecutar();
        
        System.out.println("\n=== Xbox ===");
        ConsolaFactory xboxFactory = new XboxFactory();
        MotorJuego motorXbox = new MotorJuego(xboxFactory);
        motorXbox.ejecutar();
    }
}
