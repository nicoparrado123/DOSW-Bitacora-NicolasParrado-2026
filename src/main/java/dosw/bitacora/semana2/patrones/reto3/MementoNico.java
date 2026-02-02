package dosw.bitacora.semana2.patrones.reto3;

public class MementoNico {
    
    public static void main(String[] args) {
        Editor editor = new Editor();
        HistorialNico historial = new HistorialNico();
        
        editor.escribir("Version 1");
        historial.agregar(editor.guardar());
        System.out.println("Estado guardado: " + editor.getContenido());
        
        editor.escribir("Version 2");
        historial.agregar(editor.guardar());
        System.out.println("Estado guardado: " + editor.getContenido());
        
        editor.escribir("Version 3");
        historial.agregar(editor.guardar());
        System.out.println("Estado guardado: " + editor.getContenido());
        
        System.out.println("\n=== Deshaciendo cambios ===");
        
        editor.restaurar(historial.obtener(1));
        System.out.println("Restaurado a: " + editor.getContenido());
        
        editor.restaurar(historial.obtener(0));
        System.out.println("Restaurado a: " + editor.getContenido());
    }
}
