package domain.Profesor;

import co.com.sofka.domain.generic.Entity;
import domain.Profesor.value.IdHorarioDocente;
import domain.Grupo.value.Dia;
import domain.Grupo.value.HorarioEntrada;
import domain.Grupo.value.HorarioSalida;

public class HorarioDocente extends Entity<IdHorarioDocente> {
    private Dia dia;
    private HorarioEntrada horarioEntrada;
    private HorarioSalida horarioSalida;

    public HorarioDocente(IdHorarioDocente idHorarioDocente, Dia dia, HorarioEntrada horarioEntrada, HorarioSalida horarioSalida) {
        super(idHorarioDocente);
        this.dia = dia;
        this.horarioEntrada = horarioEntrada;
        this.horarioSalida = horarioSalida;
    }
}
