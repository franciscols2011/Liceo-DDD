package domain.Orientacion.value;

import co.com.sofka.domain.generic.Identity;

public class IdOrientacion extends Identity {

    private IdOrientacion(String valor) {
        super(valor);
    }

    public IdOrientacion() {
    }

    public static IdOrientacion of(String valor) {
        return new IdOrientacion(valor);
    }
}
