package domain.Profesor.event;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import domain.Profesor.Profesor;
import domain.Grupo.value.Anio;
import domain.Orientacion.value.IdMateria;
import domain.Orientacion.value.Programa;

import java.util.ArrayList;

public class MateriaAgregada extends DomainEvent {

    private IdMateria idMateria;
    private Anio anio;
    private ArrayList<Profesor> profes;
    private Programa programa;

    public MateriaAgregada(IdMateria idMateria, Anio anio, ArrayList<Profesor> profes, Programa programa){
        super(type:"profesor.event.MateriaAgregada");
        this.idMateria = idMateria;
        this.anio = anio;
        this.profes = profes;
        this.programa = programa;
    }

    public IdMateria idMateria() {
        return idMateria;
    }

    public Anio anio() {
        return anio;
    }

    public ArrayList<Profesor> profes() {
        return profes;
    }

    public Programa programa() {
        return programa;
    }
}
