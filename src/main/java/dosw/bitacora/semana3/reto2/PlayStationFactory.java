package dosw.bitacora.semana3.reto2;

public class PlayStationFactory implements ConsolaFactory {
    @Override
    public Control crearControl() {
        return new ControlPlayStation();
    }
    
    @Override
    public Juego crearJuego() {
        return new JuegoPlayStation();
    }
    
    @Override
    public InterfazGrafica crearInterfazGrafica() {
        return new InterfazGraficaPlayStation();
    }
}
