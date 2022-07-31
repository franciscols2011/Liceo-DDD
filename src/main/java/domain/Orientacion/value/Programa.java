package domain.Orientacion.value;

import co.com.sofka.domain.generic.ValueObject;
import domain.Profesor.value.Nombre;

public class Programa implements ValueObject<Programa.Props> {
    private final String modulo;
    private final String programa;
    private final String material;

    public Programa(String modulo, String programa, String material) {
        this.programa = programa;
        this.modulo = modulo;
        this.material = material;
    }

    @Override
    public Props value() {
        return new Props() {
            public String programa() {
                return programa;
            }

            public String modulo() {
                return modulo;
            }

            public String material() {
                return material;
            }
        };
    }

    public interface Props {
        String programa();

        String modulo();

        String material();
    }
}
