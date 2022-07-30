package domain.Profesor;

import co.com.sofka.domain.generic.Entity;
import domain.Profesor.value.*;
import domain.Grupo.value.Dia;
import domain.Grupo.value.HorarioEntrada;
import domain.Grupo.value.HorarioSalida;
import domain.Orientacion.value.IdMateria;

import java.util.ArrayList;

public class Profesor extends Entity<ProfesorCi> {
    private Nombre nombre;
    private Edad edad;
    private Mail mail;
    private ArrayList<IdMateria> materias;

    public Profesor(ProfesorCi profesorCi, Nombre nombre, Edad edad, Mail mail, ArrayList<IdMateria> materias) {
        super(profesorCi);
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.materias = materias;
    }
}