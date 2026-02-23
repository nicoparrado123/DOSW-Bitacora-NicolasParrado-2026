package dosw.bitacora.semana3.reto6;

import java.util.ArrayList;
import java.util.List;

public class Caja implements ItemBodega {
    private String nombre;
    private List<ItemBodega> items;
    
    public Caja(String nombre) {
        this.nombre = nombre;
        this.items = new ArrayList<>();
    }
    
    public void agregar(ItemBodega item) {
        items.add(item);
    }
    
    @Override
    public double calcularPrecio() {
        double total = 0;
        for (ItemBodega item : items) {
            total += item.calcularPrecio();
        }
        return total;
    }
    
    public String getNombre() {
        return nombre;
    }
}
