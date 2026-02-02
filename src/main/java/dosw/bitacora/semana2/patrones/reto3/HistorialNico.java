package dosw.bitacora.semana2.patrones.reto3;

import java.util.ArrayList;
import java.util.List;

public class HistorialNico {
    
    private List<TextoMemento> estados;
    
    public Historial() {
        this.estados = new ArrayList<>();
    }
    
    public void agregar(TextoMemento memento) {
        estados.add(memento);
    }
    
    public TextoMemento obtener(int indice) {
        return estados.get(indice);
    }
    
    public int tamaño() {
        return estados.size();
    }
}
