package domain.Grupo.value;

import co.com.sofka.domain.generic.ValueObject;

public class HorarioEntrada implements ValueObject<HorarioEntrada> {
    private final HorarioEntrada value;

    public HorarioEntrada(HorarioEntrada value) {
        this.value = value;
    }

    @Override
    public HorarioEntrada value() {
        return value;
    }
}
