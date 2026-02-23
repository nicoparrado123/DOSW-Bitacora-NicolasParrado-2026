package dosw.bitacora.semana3.reto11;

public class RutaCaminando implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Calculando ruta caminando de " + origen + " a " + destino);
        System.out.println("Ruta: Calles peatonales - 2 horas");
    }
}
