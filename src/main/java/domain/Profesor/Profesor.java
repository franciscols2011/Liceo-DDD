package domain.Profesor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.Profesor.event.MateriaAgregada;
import domain.Profesor.value.*;
import domain.Grupo.value.AlumnoCI;
import domain.Grupo.value.Anio;
import domain.Orientacion.Materia;
import domain.Orientacion.value.IdMateria;
import domain.Orientacion.value.Programa;

import java.util.ArrayList;

import java.util.List;

public class Profesor extends AggregateEvent<ProfesorCI> {
    private Nombre nombre;
    private Edad edad;
    private Mail mail;
    protected ArrayList<Materia> materias;
    private ArrayList<AlumnoCI> alumnos;
    private Libreta libreta;

    public Profesor(ProfesorCI profesorCI) {
        super(profesorCI);
        subscribe(new ProfesorEventChange(this));
    }

    public static Profesor from(ProfesorCI profesorCI, List<DomainEvent> events) {
        var profesor = new Profesor(profesorCI);
        events.forEach(profesor::applyEvent);
        return profesor;
    }

    public void AgregarMateria(IdMateria idMateria, Anio anio, ArrayList<Profesor> profes, Programa programa) {
        appendChange(new MateriaAgregada(idMateria, anio, profes, programa)).apply();
    }
}
