package domain.Profesor;

import co.com.sofka.domain.generic.Entity;
import domain.Grupo.value.AlumnoCI;
import domain.Orientación.value.IdMateria;

import java.util.ArrayList;

public class Examen extends Entity<IdExamen> {
    private Fecha fecha;
    private IdMateria idMateria;
    private ArrayList<AlumnoCI> alumnos;
    private ArrayList<DocenteCI> docentes;

    public Examen(IdExamen idExamen, Fecha fecha, IdMateria idMateria, ArrayList<AlumnoCI> alumnos, ArrayList<DocenteCI> docentes) {
        super(idExamen);
        this.fecha = fecha;
        this.idMateria = idMateria;
        this.alumnos = alumnos;
        this.docentes = docentes;
    }
}
