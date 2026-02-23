package dosw.bitacora.semana3.reto10;

public class Tourist {
    public void hacerTour(TourRoute tour) {
        Iterator iterator = tour.crearIterator();
        System.out.println("Iniciando tour por Roma:");
        while (iterator.hasNext()) {
            Lugar lugar = iterator.next();
            System.out.println("Visitando: " + lugar.getNombre());
        }
        System.out.println("Tour completado!");
    }
}
