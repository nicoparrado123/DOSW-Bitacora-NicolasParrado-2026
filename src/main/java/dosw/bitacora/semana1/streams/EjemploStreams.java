package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class EjemploStreams {
    
    public static void main(String[] args) {
        // Ejemplo básico de streams
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        // Filtrar números pares y multiplicarlos por 2
        numeros.stream()
               .filter(n -> n % 2 == 0)
               .map(n -> n * 2)
               .forEach(System.out::println);
    }
}
