package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio4MayoresEdad {
    
    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(
            new Usuario(1, "carlos", 25, true),
            new Usuario(2, "maria", 17, false),
            new Usuario(3, "juan", 16, true),
            new Usuario(4, "ana", 28, true),
            new Usuario(5, "pedro", 15, false)
        );
        
        usuarios.stream()
                .filter(u -> u.getAge() >= 18)
                .map(Usuario::getName)
                .forEach(System.out::println);
    }
}
