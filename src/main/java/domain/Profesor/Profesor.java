package domain.Profesor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import co.com.sofka.domain.generic.Entity;
import domain.Profesor.event.MateriaAgregada;
import domain.Profesor.value.*;
import domain.Grupo.value.Dia;
import domain.Grupo.value.HorarioEntrada;
import domain.Grupo.value.HorarioSalida;
import domain.Orientacion.Materia;
import domain.Orientacion.value.IdMateria;

import java.util.ArrayList;

import org.lsmp.djep.vectorJep.function.Id;

public class Profesor extends AggregateEvent<ProfesorCI> {
    private Nombre nombre;
    private Edad edad;
    private Mail mail;
    private ArrayList<Materia> materias;
    private ArrayList<AlumnoCI> alumnos;
    private Libreta libreta;

    public Profesor(ProfesorCI profesorId, Nombre nombre, Edad edad, Mail mail, ArrayList<Materia> materias,
            ArrayList<AlumnoCI> alumnos, Libreta libreta) {
        super(profesorId);
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.materias = materias;
        this.alumnos = alumnos;
        this.libreta = libreta;
    }

    public Profesor(ProfesorCI profesorCI) {
        super(profesorCI);
        subscribe(new ProfesorEventChange(this));
    }

    public static Profesor from(ProfesorCI profesorCI, List<DomainEvent> events) {
        var profesor = new Profesor(profesorCI);
        events.forEach(profesor::applyEvent);
        return profesor;
    }

    public void AgregaMateria(IdMateria idMateria, Anio anio, ArrayList<Profesor> profes, Programa programa) {
        appendChange(new MateriaAgregada(idMateria, anio, profes, programa)).apply();
    }

}