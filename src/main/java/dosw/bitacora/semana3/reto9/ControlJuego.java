package dosw.bitacora.semana3.reto9;

public class ControlJuego {
    private Comando comando;
    
    public void setComando(Comando comando) {
        this.comando = comando;
    }
    
    public void presionarBoton() {
        if (comando != null) {
            comando.ejecutar();
        }
    }
}
