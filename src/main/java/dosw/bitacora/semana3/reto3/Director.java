package dosw.bitacora.semana3.reto3;

public class Director {
    private MunecoBuilder builder;
    
    public void setBuilder(MunecoBuilder builder) {
        this.builder = builder;
    }
    
    public Muneco construirMuneco() {
        builder.construirCabeza();
        builder.construirCuerpo();
        builder.construirBrazos();
        builder.construirPiernas();
        builder.construirAccesorios();
        return builder.obtenerMuneco();
    }
}
