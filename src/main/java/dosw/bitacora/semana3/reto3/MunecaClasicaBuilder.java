package dosw.bitacora.semana3.reto3;

public class MunecaClasicaBuilder implements MunecoBuilder {
    private Muneco muneco;
    
    public MunecaClasicaBuilder() {
        this.muneco = new Muneco();
    }
    
    @Override
    public void construirCabeza() {
        muneco.setCabeza("Cabeza con cabello largo");
    }
    
    @Override
    public void construirCuerpo() {
        muneco.setCuerpo("Cuerpo delgado");
    }
    
    @Override
    public void construirBrazos() {
        muneco.setBrazos("Brazos delicados");
    }
    
    @Override
    public void construirPiernas() {
        muneco.setPiernas("Piernas elegantes");
    }
    
    @Override
    public void construirAccesorios() {
        muneco.setAccesorios("Vestido y zapatos");
    }
    
    @Override
    public Muneco obtenerMuneco() {
        return this.muneco;
    }
}
