package domain.Grupo.value;

import co.com.sofka.domain.generic.ValueObject;

public class Dia implements ValueObject<Dia> {
    private final Dia value;

    public Dia(Dia value) {
        this.value = value;
    }

    @Override
    public Dia value() {
        return value;
    }
}
