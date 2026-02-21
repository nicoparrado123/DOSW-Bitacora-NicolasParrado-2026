package dosw.bitacora.semana3.reto3;

public class MunecoAccionBuilder implements MunecoBuilder {
    private Muneco muneco;
    
    public MunecoAccionBuilder() {
        this.muneco = new Muneco();
    }
    
    @Override
    public void construirCabeza() {
        muneco.setCabeza("Cabeza de héroe");
    }
    
    @Override
    public void construirCuerpo() {
        muneco.setCuerpo("Cuerpo musculoso");
    }
    
    @Override
    public void construirBrazos() {
        muneco.setBrazos("Brazos articulados");
    }
    
    @Override
    public void construirPiernas() {
        muneco.setPiernas("Piernas fuertes");
    }
    
    @Override
    public void construirAccesorios() {
        muneco.setAccesorios("Espada y escudo");
    }
    
    @Override
    public Muneco obtenerMuneco() {
        return this.muneco;
    }
}
