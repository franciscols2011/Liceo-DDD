package domain.Orientacion;

import co.com.sofka.domain.generic.Entity;
import domain.Orientacion.value.IdMateria;
import domain.Profesor.Profesor;

import java.util.ArrayList;

public class Materia extends Entity<IdMateria> {

    private Anio anio;
    private ArrayList<Profesor> profes;
    private Programa programa;

    public Materia(IdMateria idMateria, Anio anio, ArrayList<Profesor> profes, Programa programa) {
        super(idMateria);
        this.anio = anio;
        this.profes = profes;
        this.programa = programa;
    }

}
