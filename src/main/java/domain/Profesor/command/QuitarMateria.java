package domain.Profesor.command;

import co.com.sofka.domain.generic.Command;
import domain.Profesor.Profesor;
import domain.Grupo.value.Anio;
import domain.Orientacion.value.IdMateria;
import domain.Orientacion.value.Programa;

import java.util.ArrayList;

public class QuitarMateria extends Command {

    private IdMateria idMateria;

    public QuitarMateria(IdMateria idMateria, Anio anio, ArrayList<Profesor> profes, Programa programa) {
        this.idMateria = idMateria;
    }

    public IdMateria getIdMateria() {
        return idMateria;
    }
}
