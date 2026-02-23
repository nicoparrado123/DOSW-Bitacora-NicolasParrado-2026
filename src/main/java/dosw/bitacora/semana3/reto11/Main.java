package dosw.bitacora.semana3.reto11;

public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        String origen = "Casa";
        String destino = "Trabajo";
        
        System.out.println("=== Cambiando estrategias de navegacion ===\n");
        
        navegador.setEstrategia(new RutaCarro());
        navegador.calcularRuta(origen, destino);
        
        System.out.println();
        navegador.setEstrategia(new RutaBicicleta());
        navegador.calcularRuta(origen, destino);
        
        System.out.println();
        navegador.setEstrategia(new RutaCaminando());
        navegador.calcularRuta(origen, destino);
        
        System.out.println();
        navegador.setEstrategia(new RutaTransportePublico());
        navegador.calcularRuta(origen, destino);
    }
}
