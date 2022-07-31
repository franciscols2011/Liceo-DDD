package domain.Profesor.command;

import co.com.sofka.domain.generic.Command;
import domain.Profesor.Profesor;
import domain.Grupo.value.Anio;
import domain.Orientacion.value.IdMateria;
import domain.Orientacion.value.Programa;

import java.util.ArrayList;

public class AgregarMateria extends Command {

    private IdMateria idMateria;
    private Anio anio;
    private ArrayList<Profesor> profes;
    private Programa programa;

    public AgregarMateria(IdMateria idMateria, Anio anio, ArrayList<Profesor> profes, Programa programa) {
        this.idMateria = idMateria;
        this.anio = anio;
        this.profes = profes;
        this.programa = programa;
    }

    public IdMateria getIdMateria() {
        return idMateria;
    }

    public Anio getAnio() {
        return anio;
    }

    public ArrayList<Profesor> getProfes() {
        return profes;
    }

    public Programa getPrograma() {
        return programa;
    }
}
