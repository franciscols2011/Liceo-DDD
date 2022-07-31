package domain.Profesor.value;

import co.com.sofka.domain.generic.Identity;

public class IdHorarioProfesor extends Identity {
    private IdHorarioProfesor(String valor) {
        super(valor);
    }

    public IdHorarioProfesor() {
    }

    public static IdHorarioProfesor of(String valor) {
        return new IdHorarioProfesor(valor);
    }
}
