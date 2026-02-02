package dosw.bitacora.semana2.patrones.reto2;

public class ImpresoraSimpleAdapter implements Impresora {
    
    private ImpresoraSimple impresoraSimple;
    
    public ImpresoraSimpleAdapter(ImpresoraSimple impresoraSimple) {
        this.impresoraSimple = impresoraSimple;
    }
    
    @Override
    public void imprimir(String mensaje) {
        impresoraSimple.imprimirTexto(mensaje);
    }
}
