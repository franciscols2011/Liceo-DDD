package domain.Grupo.value;

import co.com.sofka.domain.generic.ValueObject;

public class Anio implements ValueObject<Anio> {
    private final Anio value;

    public Anio(Anio value) {
        this.value = value;
    }

    @Override
    public Anio value() {
        return value;
    }
}
