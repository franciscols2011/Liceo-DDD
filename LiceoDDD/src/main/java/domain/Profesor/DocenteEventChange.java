package domain.Profesor;

import co.com.sofka.domain.generic.EventChange;
import domain.Profesor.event.MateriaAñadida;
import domain.Profesor.event.MateriaQuitada;
import domain.Orientación.Materia;
import domain.Orientación.value.IdMateria;

public class DocenteEventChange extends EventChange {
    public DocenteEventChange(Docente docente){

        apply((MateriaAñadida event) -> {
            //Validaciones
            docente.materias.add(new Materia(IdMateria.of(event.idMateria().value()), event.año(), event.docentes(), event.programa()));
    });
}}
