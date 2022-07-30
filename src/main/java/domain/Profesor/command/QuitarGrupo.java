package domain.Profesor.command;

import co.com.sofka.domain.generic.Command;

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
