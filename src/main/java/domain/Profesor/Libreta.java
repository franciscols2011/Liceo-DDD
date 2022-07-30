package domain.Profesor;

import co.com.sofka.domain.generic.Entity;
import domain.Docente.value.*;
import domain.Grupo.value.Anio;
import domain.Grupo.value.IdGrupo;
import domain.Orientacion.value.IdMateria;

import java.util.ArrayList;

public class Libreta extends Entity<IdLibreta> {
    private ProfesorCi profesorCi;
    private IdGrupo idGrupo;
    private Anio anio;

    public Libreta(IdLibreta idLibreta, ProfesorCi profesorCi, IdGrupo idGrupo, Anio anio) {
        super(idLibreta);
        this.profesorCi = profesorCi;
        this.idGrupo = idGrupo;
        this.anio = anio;
    }
}