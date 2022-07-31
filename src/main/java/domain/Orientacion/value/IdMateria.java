package domain.Orientacion.value;

import co.com.sofka.domain.generic.Identity;

public class IdMateria extends Identity {

    private IdMateria(String valor) {
        super(valor);
    }

    public IdMateria() {
    }

    public static IdMateria of(String valor) {
        return new IdMateria(valor);
    }

}
