package domain.Profesor;

import org.lsmp.djep.vectorJep.function.Id;

import co.com.sofka.domain.generic.Entity;
import domain.Profesor.value.IdHorarioProfesor;
import domain.Grupo.value.Dia;
import domain.Grupo.value.HorarioEntrada;
import domain.Grupo.value.HorarioSalida;

public class HorarioProfesor extends Entity<IdHorarioProfesor> {
    private Dia dia;
    private HorarioEntrada horarioEntrada;
    private HorarioSalida horarioSalida;

    public HorarioProfesor(IdHorarioProfesor idHorarioProfesor, Dia dia, HorarioEntrada horarioEntrada,
            HorarioSalida horarioSalida) {
        super(idHorarioProfesor);
        this.dia = dia;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }
}
