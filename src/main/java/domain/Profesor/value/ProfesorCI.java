package domain.Profesor.value;

import co.com.sofka.domain.generic.Identity;

public class ProfesorCI extends Identity {
    private ProfesorCI(String valor) {
        super(valor);
    }

    public ProfesorCI() {
    }

    public static ProfesorCI of(String valor) {
        return new ProfesorCI(valor);
    }
}
