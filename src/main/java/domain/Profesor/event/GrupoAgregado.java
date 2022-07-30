package domain.Profesor.event;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import domain.Grupo.Adscripta;
import domain.Grupo.Alumno;
import domain.Grupo.HorarioGrupo;
import domain.Grupo.value.Año;
import domain.Grupo.value.IdGrupo;
import domain.Orientación.value.IdOrientacion;
import domain.Profesor.HorarioProfesor;

import java.util.ArrayList;

import org.lsmp.djep.vectorJep.function.Id;

public class GrupoAgregado extends DomainEvent {
    private IdGrupo idGrupo;
    private Adscripto adscripto;
    private HorarioGrupo horarioGrupo;
    private ArrayList<Alumno> alumnos;
    private Anio anio;
    private IdOrientacion idOrientacion;

    public GrupoAgregado(IdGrupo idGrupo, Adscripto adscripto, HorarioGrupo horarioGrupo, ArrayList<Alumno> alumnos, Anio anio, IdOrientacion idOrientacion){
        super(type:"profesor.event.grupoagregado");
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

    public Adscripto adscripto() {
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
