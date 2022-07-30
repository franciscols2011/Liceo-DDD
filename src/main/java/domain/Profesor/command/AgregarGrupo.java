package domain.Profesor.command;

import co.com.sofka.domain.generic.Command;

import java.util.ArrayList;

import org.lsmp.djep.vectorJep.function.Id;

public class AgregarGrupo extends Command {
    private IdGrupo idGrupo;
    private Adscripto adscripto;
    private HorarioGrupo horarioGrupo;
    private ArrayList<Alumno> alumnos;
    private Anio anio;
    private IdOrientacion idOrientacion;

    public AgregarGrupo(IdGrupo idGrupo, Adscripto adscripto, HorarioGrupo horarioGrupo, ArrayList<Alumno> alumnos,
            Anio anio, IdOrientacion idOrientacion) {
        this.idGrupo = idGrupo;
        this.adscripto = adscripto;
        this.horarioGrupo = horarioGrupo;
        this.alumnos = alumnos;
        this.anio = anio;
        this.idOrientacion = idOrientacion;
    }

    public IdGrupo idGrupo() {
        return idGrupo;
    }

    public Adscripto adscripta() {
        return adscripto;
    }

    public HorarioGrupo horarioGrupo() {
        return horarioGrupo;
    }

    public ArrayList<Alumno> alumnos() {
        return alumnos;
    }

    public Anio getAnio() {
        return anio;
    }

    public IdOrientacion idOrientacion() {
        return idOrientacion;
    }
}
