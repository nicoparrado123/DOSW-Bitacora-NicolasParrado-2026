package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio5Transacciones {
    
    public static void main(String[] args) {
        List<Transaction> transacciones = Arrays.asList(
            new Transaction("T001", 1500.0, true),
            new Transaction("T002", 2500.0, true),
            new Transaction("T003", 500.0, false),
            new Transaction("T004", 3000.0, true),
            new Transaction("T005", 1000.0, true)
        );
        
        boolean loteValido = !transacciones.stream()
                .peek(t -> System.out.println("Procesando: " + t))
                .anyMatch(t -> !t.isApproved());
        
        System.out.println("\nLote valido: " + loteValido);
    }
}
