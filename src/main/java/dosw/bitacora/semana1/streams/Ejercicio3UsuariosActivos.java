package dosw.bitacora.semana1.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio3UsuariosActivos {
    
    public static void main(String[] args) {
        List<Usuario> usuarios = Arrays.asList(
            new Usuario(1, "carlos", 25, true),
            new Usuario(2, "maria", 30, false),
            new Usuario(3, "juan", 22, true),
            new Usuario(4, "ana", 28, true),
            new Usuario(5, "pedro", 35, false)
        );
        
        List<String> nombresActivos = usuarios.stream()
                .filter(Usuario::isActive)
                .map(u -> u.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
        
        System.out.println("Usuarios activos: " + nombresActivos);
    }
}
