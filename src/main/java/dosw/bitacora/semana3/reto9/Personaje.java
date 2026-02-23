package dosw.bitacora.semana3.reto9;

public class Personaje {
    private String nombre;
    
    public Personaje(String nombre) {
        this.nombre = nombre;
    }
    
    public void caminar() {
        System.out.println(nombre + " esta caminando");
    }
    
    public void saltar() {
        System.out.println(nombre + " esta saltando");
    }
    
    public void atacar() {
        System.out.println(nombre + " esta atacando");
    }
    
    public void defender() {
        System.out.println(nombre + " se esta defendiendo");
    }
}
