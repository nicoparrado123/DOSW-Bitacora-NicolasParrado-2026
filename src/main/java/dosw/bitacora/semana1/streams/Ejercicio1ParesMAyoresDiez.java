package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio1ParesMAyoresDiez {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 12, 8, 20, 3, 15, 7, 25, 10, 30);
        
        numeros.stream()
                .filter(n -> n % 2 == 0 && n > 10)
                .forEach(System.out::println);
    }
}
