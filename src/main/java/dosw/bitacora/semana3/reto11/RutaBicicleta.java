package dosw.bitacora.semana3.reto11;

public class RutaBicicleta implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Calculando ruta en bicicleta de " + origen + " a " + destino);
        System.out.println("Ruta: Ciclorruta - 1 hora");
    }
}
