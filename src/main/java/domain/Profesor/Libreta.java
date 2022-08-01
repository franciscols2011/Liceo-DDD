package domain.Profesor;

import co.com.sofka.domain.generic.Entity;
import domain.Profesor.value.*;
import domain.Grupo.value.Anio;
import domain.Grupo.value.IdGrupo;
import domain.Orientacion.value.IdMateria;

import java.util.ArrayList;

public class Libreta extends Entity<IdLibreta> {
    private ProfesorCI profesorCI;
    private IdGrupo idGrupo;
    private Anio anio;

    public Libreta(IdLibreta idLibreta, ProfesorCI profesorCI, IdGrupo idGrupo, Anio anio) {
        super(idLibreta);
        this.profesorCI = profesorCI;
        this.idGrupo = idGrupo;
        this.anio = anio;
    }

    public ProfesorCI getProfesorCI() {
        return profesorCI;
    }

    public void setProfesorCI(ProfesorCI profesorCI) {
        this.profesorCI = profesorCI;
    }

    public IdGrupo getIdGrupo() {
        return idGrupo;
    }

    public void setIdGrupo(IdGrupo idGrupo) {
        this.idGrupo = idGrupo;
    }

    public Anio getAnio() {
        return anio;
    }

    public void setAnio(Anio anio) {
        this.anio = anio;
    }
}