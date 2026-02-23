package dosw.bitacora.semana3.reto10;

import java.util.ArrayList;
import java.util.List;

public class TourRoute implements Aggregate {
    private List<Lugar> lugares;
    
    public TourRoute() {
        this.lugares = new ArrayList<>();
    }
    
    public void agregarLugar(Lugar lugar) {
        lugares.add(lugar);
    }
    
    @Override
    public Iterator crearIterator() {
        return new RomeIterator();
    }
    
    private class RomeIterator implements Iterator {
        private int posicion = 0;
        
        @Override
        public boolean hasNext() {
            return posicion < lugares.size();
        }
        
        @Override
        public Lugar next() {
            if (hasNext()) {
                return lugares.get(posicion++);
            }
            return null;
        }
    }
}
