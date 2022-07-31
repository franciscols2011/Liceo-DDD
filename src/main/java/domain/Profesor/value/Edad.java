package domain.Profesor.value;

import co.com.sofka.domain.generic.ValueObject;

public class Edad implements ValueObject<Edad> {
    private final Edad value;

    public Edad(Edad value) {
        this.value = value;
    }

    @Override
    public Edad value() {
        return value;
    }
}
