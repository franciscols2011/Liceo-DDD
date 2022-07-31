package domain.Grupo;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.Entity;
import domain.Profesor.value.Edad;
import domain.Profesor.value.Mail;
import domain.Profesor.value.Nombre;
import domain.Grupo.value.AdscriptoCI;
import domain.Orientacion.value.IdOrientacion;
import domain.Grupo.value.IdGrupo;
import domain.Grupo.value.IdHorarioGrupo;
import domain.Grupo.value.Anio;

import java.util.ArrayList;

public class Grupo extends AggregateEvent<IdGrupo> {
    private Adscripto adscripto;
    private HorarioGrupo horarioGrupo;
    private ArrayList<Alumno> alumnos;
    private Anio anio;
    private IdOrientacion idOrientacion;

    public Grupo(IdGrupo idGrupo, Adscripto adscripto, HorarioGrupo horarioGrupo, ArrayList<Alumno> alumnos, Anio anio,
            IdOrientacion idOrientacion) {
        super(idGrupo);
        this.adscripto = adscripto;
        this.horarioGrupo = horarioGrupo;
        this.alumnos = alumnos;
        this.anio = anio;
        this.idOrientacion = idOrientacion;
    }
}
