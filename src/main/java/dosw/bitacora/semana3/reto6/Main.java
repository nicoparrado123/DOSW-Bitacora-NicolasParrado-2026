package dosw.bitacora.semana3.reto6;

public class Main {
    public static void main(String[] args) {
        Producto laptop = new Producto("Laptop", 1200.00);
        Producto mouse = new Producto("Mouse", 25.00);
        Producto teclado = new Producto("Teclado", 75.00);
        
        Caja cajaAccesorios = new Caja("Caja de Accesorios");
        cajaAccesorios.agregar(mouse);
        cajaAccesorios.agregar(teclado);
        
        Producto monitor = new Producto("Monitor", 300.00);
        
        Caja cajaPrincipal = new Caja("Caja Principal");
        cajaPrincipal.agregar(laptop);
        cajaPrincipal.agregar(cajaAccesorios);
        cajaPrincipal.agregar(monitor);
        
        System.out.println("Precio total de la caja principal: $" + cajaPrincipal.calcularPrecio());
        System.out.println("Precio de la caja de accesorios: $" + cajaAccesorios.calcularPrecio());
        System.out.println("Precio del laptop: $" + laptop.calcularPrecio());
    }
}
