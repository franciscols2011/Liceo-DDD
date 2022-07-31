package domain.Grupo.value;

import co.com.sofka.domain.generic.ValueObject;

public class HorarioSalida implements ValueObject<HorarioSalida> {
    private final HorarioSalida value;

    public HorarioSalida(HorarioSalida value) {
        this.value = value;
    }

    @Override
    public HorarioSalida value() {
        return value;
    }
}
