package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;

public class Ejercicio3UsuariosActivos {
    
    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(
            new Usuario(1, "carlos", 25, true),
            new Usuario(2, "maria", 30, false),
            new Usuario(3, "juan", 22, true),
            new Usuario(4, "ana", 28, true),
            new Usuario(5, "pedro", 35, false)
        );
        
        usuarios.stream()
                .filter(Usuario::isActive)
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .forEach(System.out::println);
    }
}
