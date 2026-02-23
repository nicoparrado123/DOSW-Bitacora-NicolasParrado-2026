package dosw.bitacora.semana3.reto9;

public class ComandoDefender implements Comando {
    private Personaje personaje;
    
    public ComandoDefender(Personaje personaje) {
        this.personaje = personaje;
    }
    
    @Override
    public void ejecutar() {
        personaje.defender();
    }
}
