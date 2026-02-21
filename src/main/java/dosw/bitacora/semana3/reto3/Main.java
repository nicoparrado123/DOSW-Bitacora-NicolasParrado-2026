package dosw.bitacora.semana3.reto3;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        
        MunecoBuilder builderAccion = new MunecoAccionBuilder();
        director.setBuilder(builderAccion);
        Muneco munecoAccion = director.construirMuneco();
        System.out.println(munecoAccion);
        
        MunecoBuilder builderClasica = new MunecaClasicaBuilder();
        director.setBuilder(builderClasica);
        Muneco munecaClasica = director.construirMuneco();
        System.out.println(munecaClasica);
    }
}
