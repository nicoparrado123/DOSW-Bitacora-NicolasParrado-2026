package dosw.bitacora.semana3.reto11;

public class RutaCarro implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Calculando ruta en carro de " + origen + " a " + destino);
        System.out.println("Ruta: Autopista principal - 45 minutos");
    }
}
