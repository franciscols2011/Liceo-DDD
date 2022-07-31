package domain.Profesor.value;

import co.com.sofka.domain.generic.ValueObject;

public class Nombre implements ValueObject<Nombre.Props> {
    private final String nombres;
    private final String apellidos;

    public Nombre(String nombres, String apellidos) {
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    @Override
    public Props value() {
        return new Props() {
            public String nombres() {
                return nombres;
            }

            public String apellidos() {
                return apellidos;
            }
        };
    }

    public interface Props {
        String nombres();

        String apellidos();
    }
}
