package domain.Grupo.value;

import co.com.sofka.domain.generic.Identity;

public class IdGrupo extends Identity {

    private IdGrupo(String valor) {
        super(valor);
    }

    public IdGrupo() {
    }

    public static IdGrupo of(String valor) {
        return new IdGrupo(valor);
    }
}
