package domain.Profesor.value;

import co.com.sofka.domain.generic.Identity;

public class IdExamen extends Identity {
    private IdExamen(String valor) {
        super(valor);
    }

    public IdExamen() {
    }

    public static IdExamen of(String valor) {
        return new IdExamen(valor);
    }
}
