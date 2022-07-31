package domain.Profesor.value;

import co.com.sofka.domain.generic.Identity;

public class IdLibreta extends Identity {
    private IdLibreta(String valor) {
        super(valor);
    }

    public IdLibreta() {
    }

    public static IdLibreta of(String valor) {
        return new IdLibreta(valor);
    }
}
