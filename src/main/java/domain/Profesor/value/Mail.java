package domain.Profesor.value;

import co.com.sofka.domain.generic.ValueObject;

public class Mail implements ValueObject<Mail> {
    public final Mail value;

    public Mail(Mail value) {
        this.value = value;
    }

    @Override
    public Mail value() {
        return value;
    }
}
