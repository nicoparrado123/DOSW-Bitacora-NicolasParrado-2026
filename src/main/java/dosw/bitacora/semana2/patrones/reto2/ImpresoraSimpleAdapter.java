package dosw.bitacora.semana2.patrones.reto2;

public class ImpresoraSimpleAdapter implements Impresora {
    
    private PrintSimple impresoraSimple;
    
    public ImpresoraSimpleAdapter(PrintSimple impresoraSimple) {
        this.impresoraSimple = impresoraSimple;
    }
    
    @Override
    public void imprimir(String mensaje) {
        impresoraSimple.imprimirTexto(mensaje);
    }
}
