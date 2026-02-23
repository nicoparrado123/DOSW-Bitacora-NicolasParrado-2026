package dosw.bitacora.semana3.reto7;

public class BarcoBasico implements Barco {
    @Override
    public int obtenerAtaque() {
        return 50;
    }
    
    @Override
    public int obtenerDefensa() {
        return 30;
    }
    
    @Override
    public String obtenerDescripcion() {
        return "Barco básico";
    }
}
