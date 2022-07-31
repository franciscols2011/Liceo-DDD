package domain.Grupo.value;

import co.com.sofka.domain.generic.Identity;

public class IdHorarioGrupo extends Identity {
    private IdHorarioGrupo(String valor) {
        super(valor);
    }

    public IdHorarioGrupo() {
    }

    public static IdHorarioGrupo of(String valor) {
        return new IdHorarioGrupo(valor);
    }
}
