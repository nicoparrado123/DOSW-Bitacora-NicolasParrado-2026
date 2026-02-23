package dosw.bitacora.semana3.reto11;

public class RutaTransportePublico implements EstrategiaRuta {
    @Override
    public void calcularRuta(String origen, String destino) {
        System.out.println("Calculando ruta en transporte publico de " + origen + " a " + destino);
        System.out.println("Ruta: Bus 45 + Metro Linea 2 - 1 hora 15 minutos");
    }
}
