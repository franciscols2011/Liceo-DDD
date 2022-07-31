package domain.Grupo.value;

import co.com.sofka.domain.generic.Identity;

public class AlumnoCI extends Identity {
    private AlumnoCI(String valor) {
        super(valor);
    }

    public AlumnoCI() {
    }

    public static AlumnoCI of(String valor) {
        return new AlumnoCI(valor);
    }
}
