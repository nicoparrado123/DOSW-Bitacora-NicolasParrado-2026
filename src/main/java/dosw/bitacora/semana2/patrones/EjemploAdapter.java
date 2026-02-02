package dosw.bitacora.semana2.patrones;

public class EjemploAdapter {
    
    public static void main(String[] args) {
        ImpresoraSimple simple = new ImpresoraSimple();
        Impresora impresora1 = new ImpresoraSimpleAdapter(simple);
        
        ImpresoraDetallada detallada = new ImpresoraDetallada();
        Impresora impresora2 = new ImpresoraDetalladaAdapter(detallada, "Nicolas Parrado");
        
        System.out.println("=== Usando impresora simple ===");
        impresora1.imprimir("Hola mundo");
        
        System.out.println("\n=== Usando impresora detallada ===");
        impresora2.imprimir("Hola mundo");
    }
}
