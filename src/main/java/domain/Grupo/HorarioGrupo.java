package domain.Grupo;

import co.com.sofka.domain.generic.Entity;
import domain.Grupo.value.Dia;
import domain.Grupo.value.HorarioEntrada;
import domain.Grupo.value.HorarioSalida;
import domain.Grupo.value.IdHorarioGrupo;
import domain.Orientacion.value.IdMateria;

import java.util.ArrayList;

public class HorarioGrupo extends Entity<IdHorarioGrupo> {
    private Dia dia;
    private HorarioEntrada horarioEntrada;
    private HorarioSalida horarioSalida;
    private ArrayList<IdMateria> materias;

    public HorarioGrupo(IdHorarioGrupo idHorarioGrupo, Dia dia, HorarioEntrada horarioEntrada,
            HorarioSalida horarioSalida, ArrayList<IdMateria> materias) {
        super(idHorarioGrupo);
        this.dia = dia;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
        this.materias = materias;
    }

    public Dia getDia() {
        return dia;
    }

    public HorarioSalida getHorarioSalida() {
        return horarioSalida;
    }

    public HorarioEntrada getHorarioEntrada() {
        return horarioEntrada;
    }

    public ArrayList<IdMateria> getMaterias() {
        return materias;
    }
}
