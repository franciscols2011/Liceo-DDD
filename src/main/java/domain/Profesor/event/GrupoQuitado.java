package domain.Profesor.event;

import co.com.sofka.domain.generic.Command;
import co.com.sofka.domain.generic.DomainEvent;
import domain.Grupo.Adscripto;
import domain.Grupo.Alumno;
import domain.Grupo.HorarioGrupo;
import domain.Grupo.value.Anio;
import domain.Grupo.value.IdGrupo;
import domain.Orientacion.value.IdOrientacion;


import java.util.ArrayList;
public class GrupoQuitado extends DomainEvent{
    private IdGrupo idGrupo;

    public GrupoQuitado(IdGrupo idGrupo){
        super("profesor.event.GrupoQuitado");
        this.idGrupo = idGrupo;
    }
    public IdGrupo idGrupo(){
        return idGrupo;
    }

}
