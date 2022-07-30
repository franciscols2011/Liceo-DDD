package domain.Profesor;

import co.com.sofka.domain.generic.Entity;
import domain.Profesor.value.*;
import domain.Grupo.value.AlumnoCI;
import domain.Orientacion.value.IdMateria;

import java.util.ArrayList;

public class Examen extends Entity<IdExamen> {
    private Fecha fecha;
    private IdMateria idMateria;
    private ArrayList<AlumnoCI> alumnos;
    private ArrayList<ProfesorCI> profes;

    public Examen(IdExamen idExamen, Fecha fecha, IdMateria idMateria, ArrayList<AlumnoCI> alumnos,
            ArrayList<ProfesorCI> profes) {
        super(idExamen);
        this.fecha = fecha;
        this.idMateria = idMateria;
        this.alumnos = alumnos;
        this.profes = profes;
    }
}
