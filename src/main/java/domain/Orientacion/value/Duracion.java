package domain.Orientacion.value;

import co.com.sofka.domain.generic.ValueObject;

public class Duracion implements ValueObject<Duracion> {
    private final Duracion value;

    public Duracion(Duracion value) {
        this.value = value;
    }

    @Override
    public Duracion value() {
        return value;
    }
}
