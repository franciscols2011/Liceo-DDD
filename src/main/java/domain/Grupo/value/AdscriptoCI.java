package domain.Grupo.value;

import co.com.sofka.domain.generic.Identity;

public class AdscriptoCI extends Identity {

    private AdscriptoCI(String valor) {
        super(valor);
    }

    public AdscriptoCI() {
    }

    public static AdscriptoCI of(String valor) {
        return new AdscriptoCI(valor);
    }
}
