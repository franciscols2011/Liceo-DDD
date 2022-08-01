package domain.Profesor.event;

import co.com.sofka.domain.generic.Command;
import domain.Profesor.Profesor;
import domain.Grupo.value.Anio;
import domain.Orientacion.value.IdMateria;
import domain.Orientacion.value.Programa;

import java.util.ArrayList;

public class MateriaQuitada extends Command {
    private IdMateria idMateria;

    public MateriaQuitada(IdMateria idMataria, Anio anio, ArrayList<Profesor> profes, Programa programa) {
        this.idMateria = idMataria;
    }

    public IdMateria getIdMateria() {
        return idMateria;
    }
}
