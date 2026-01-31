package dosw.bitacora.semana1.streams;

public class Usuario {
    private int id;
    private String name;
    private int age;
    private boolean active;
    
    public Usuario(int id, String name, int age, boolean active) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.active = active;
    }
    
    public int getId() {
        return id;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public boolean isActive() {
        return active;
    }
}
