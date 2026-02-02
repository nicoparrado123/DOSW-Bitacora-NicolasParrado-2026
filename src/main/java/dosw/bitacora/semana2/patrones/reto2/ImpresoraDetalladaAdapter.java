package dosw.bitacora.semana2.patrones.reto2;

import java.time.LocalDate;

public class ImpresoraDetalladaAdapter implements Impresora {
    
    private PrintDetalle impresoraDetallada;
    private String autor;
    
    public ImpresoraDetalladaAdapter(PrintDetalle impresoraDetallada, String autor) {
        this.impresoraDetallada = impresoraDetallada;
        this.autor = autor;
    }
    
    @Override
    public void imprimir(String mensaje) {
        String fecha = LocalDate.now().toString();
        impresoraDetallada.imprimirConDetalles(mensaje, autor, fecha);
    }
}
