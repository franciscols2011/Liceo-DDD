package domain.Profesor;

import co.com.sofka.domain.generic.EventChange;
import domain.Profesor.event.MateriaAgregada;
import domain.Profesor.event.MateriaQuitada;
import domain.Orientacion.Materia;
import domain.Orientacion.value.IdMateria;

public class ProfesorEventChange extends EventChange {
    public ProfesorEventChange(Profesor profesor) {
        apply((MateriaAgregada event) -> {
            // Validaciones
            profesor.materias.add(new Materia(IdMateria.of(event.idMateria().value()), event.anio(), event.profes(),
                    event.programa()));
        });
    }

}
