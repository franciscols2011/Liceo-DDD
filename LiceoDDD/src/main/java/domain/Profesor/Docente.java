package domain.Profesor;

import co.com.sofka.domain.generic.AggregateEvent;
import co.com.sofka.domain.generic.DomainEvent;
import domain.Profesor.event.MateriaAñadida;
import domain.Grupo.value.AlumnoCI;
import domain.Grupo.value.Año;
import domain.Orientación.Materia;
import domain.Orientación.value.IdMateria;
import domain.Orientación.value.Programa;

import java.util.ArrayList;
import java.util.List;

public class Docente extends AggregateEvent<DocenteCI> {
    private Nombre nombre;
    private Edad edad;
    private Mail mail;
    protected ArrayList<Materia> materias;
    private ArrayList<AlumnoCI> alumnos;
    private Libreta libreta;

    public Docente(DocenteCI docenteId, Nombre nombre, Edad edad, Mail mail, ArrayList<Materia> materias, ArrayList<AlumnoCI> alumnos, Libreta libreta) {
        super(docenteId);
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.materias = materias;
        this.alumnos = alumnos;
        this.libreta = libreta;
    }

    public Docente(DocenteCI docenteCI){
        super(docenteCI);
        subscribe(new DocenteEventChange(this));
    }

    public static Docente from(DocenteCI docenteCI, List<DomainEvent> events){
        var docente = new Docente(docenteCI);
        events.forEach(docente::applyEvent);
        return docente;
    }

    public void AñadirMateria(IdMateria idMateria, Año año, ArrayList<Docente> docentes, Programa programa) {
        appendChange(new MateriaAñadida(idMateria, año, docentes, programa)).apply();
    }
}
