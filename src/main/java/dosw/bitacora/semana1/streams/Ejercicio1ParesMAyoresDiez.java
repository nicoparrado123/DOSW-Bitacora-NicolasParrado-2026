package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio1ParesMAyoresDiez {
    
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(5, 12, 8, 20, 3, 15, 7, 25, 10, 30);
        
        List<Integer> resultado = numeros.stream()
                .filter(n -> n % 2 == 0)
                .filter(n -> n > 10)
                .collect(Collectors.toList());
        
        System.out.println("Numeros pares mayores a 10: " + resultado);
    }
}
