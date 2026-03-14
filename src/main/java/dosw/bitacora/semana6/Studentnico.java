package dosw.bitacora.semana6;

import java.util.List;

// clase que representa un estudiante con sus datos basicos
public class Studentnico {
    private String id;
    private String name;
    private String team; // naranja, azul, verde
    private List<Gradenico> grades;

    public Studentnico(String id, String name, String team, List<Gradenico> grades) {
        this.id = id;
        this.name = name;
        this.team = team;
        this.grades = grades;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public List<Gradenico> getGrades() {
        return grades;
    }

    public void setGrades(List<Gradenico> grades) {
        this.grades = grades;
    }
}
