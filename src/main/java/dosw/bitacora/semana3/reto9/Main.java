package dosw.bitacora.semana3.reto9;

public class Main {
    public static void main(String[] args) {
        Personaje personaje = new Personaje("Mario");
        
        Comando caminar = new ComandoCaminar(personaje);
        Comando saltar = new ComandoSaltar(personaje);
        Comando atacar = new ComandoAtacar(personaje);
        Comando defender = new ComandoDefender(personaje);
        
        ControlJuego control = new ControlJuego();
        
        System.out.println("=== Secuencia de acciones ===");
        
        control.setComando(caminar);
        control.presionarBoton();
        
        control.setComando(saltar);
        control.presionarBoton();
        
        control.setComando(atacar);
        control.presionarBoton();
        
        control.setComando(defender);
        control.presionarBoton();
        
        control.setComando(saltar);
        control.presionarBoton();
        
        control.setComando(atacar);
        control.presionarBoton();
    }
}
