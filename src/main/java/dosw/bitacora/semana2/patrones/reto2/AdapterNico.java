package dosw.bitacora.semana2.patrones.reto2;

public class AdapterNico {
    
    public static void main(String[] args) {
        PrintSimple simple = new PrintSimple();
        Impresora impresora1 = new ImpresoraSimpleAdapter(simple);
        
        PrintDetalle detallada = new PrintDetalle();
        Impresora impresora2 = new ImpresoraDetalladaAdapter(detallada, "Nicolas Parrado");
        
        System.out.println("=== Usando impresora simple ===");
        impresora1.imprimir("Hola mundo");
        
        System.out.println("\n=== Usando impresora detallada ===");
        impresora2.imprimir("Hola mundo");
    }
}
