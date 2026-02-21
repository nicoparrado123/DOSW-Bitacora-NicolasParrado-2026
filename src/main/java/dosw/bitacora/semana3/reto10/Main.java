package dosw.bitacora.semana3.reto10;

public class Main {
    public static void main(String[] args) {
        TourRoute tour = new TourRoute();
        tour.agregarLugar(new Lugar("Coliseo"));
        tour.agregarLugar(new Lugar("Fontana di Trevi"));
        tour.agregarLugar(new Lugar("Vaticano"));
        tour.agregarLugar(new Lugar("Pantheon"));
        tour.agregarLugar(new Lugar("Plaza Navona"));
        
        Tourist turista = new Tourist();
        turista.hacerTour(tour);
    }
}
