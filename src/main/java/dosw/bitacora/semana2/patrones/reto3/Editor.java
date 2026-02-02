package dosw.bitacora.semana2.patrones.reto3;

public class Editor {
    
    private String contenido;
    
    public Editor() {
        this.contenido = "";
    }
    
    public void escribir(String texto) {
        this.contenido = texto;
    }
    
    public String getContenido() {
        return contenido;
    }
    
    public TextoMemento guardar() {
        return new TextoMemento(contenido);
    }
    
    public void restaurar(TextoMemento memento) {
        this.contenido = memento.getContenido();
    }
}
