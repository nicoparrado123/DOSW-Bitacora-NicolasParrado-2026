package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio2PalabrasMayusculas {
    
    public static void main(String[] args) {
        List<String> palabras = Arrays.asList("hola", "mundo", "java", "streams", "programacion", "code");
        
        palabras.stream()
                .filter(p -> p.length() > 4)
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
