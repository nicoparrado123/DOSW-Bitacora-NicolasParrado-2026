package dosw.bitacora.semana3.reto2;

public class XboxFactory implements ConsolaFactory {
    @Override
    public Control crearControl() {
        return new ControlXbox();
    }
    
    @Override
    public Juego crearJuego() {
        return new JuegoXbox();
    }
    
    @Override
    public InterfazGrafica crearInterfazGrafica() {
        return new InterfazGraficaXbox();
    }
}
