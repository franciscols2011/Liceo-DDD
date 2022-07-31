package domain.Profesor.command;

import co.com.sofka.domain.generic.Command;
import domain.Grupo.Adscripto;
import domain.Grupo.Alumno;
import domain.Grupo.HorarioGrupo;
import domain.Grupo.value.Anio;
import domain.Grupo.value.IdGrupo;
import domain.Orientacion.value.IdOrientacion;

import java.util.ArrayList;

public class QuitarGrupo extends Command {
    private IdGrupo idGrupo;

    public QuitarGrupo(IdGrupo idGrupo, Adscripto adscripto, HorarioGrupo horarioGrupo, ArrayList<Alumno> alumnos,
            Anio anio, IdOrientacion idOrientacion) {
        this.idGrupo = idGrupo;
    }

    public IdGrupo idGrupo() {
        return idGrupo;
    }
}
