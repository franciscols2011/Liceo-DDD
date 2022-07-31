package domain.Profesor.event;

import co.com.sofka.domain.generic.Command;
import domain.Profesor.Profesor;

import java.util.ArrayList;

public class MateriaQuitada extends Command {
    private IdMataria idMateria;

    public MateriaQuitada(IdMataria idMataria, Anio anio, ArrayList<Profesor> profes, Programa programa) {
        this.idMateria = idMataria;
    }

    public IdMateria getIdMateria() {
        return idMateria;
    }
}
