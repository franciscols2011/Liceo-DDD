package domain.Grupo;

import co.com.sofka.domain.generic.Entity;
import domain.Profesor.value.Edad;
import domain.Profesor.value.Mail;
import domain.Profesor.value.Nombre;
import domain.Orientacion.value.IdOrientacion;
import domain.Grupo.value.AlumnoCI;

public class Alumno extends Entity<AlumnoCI> {
    private Nombre nombre;
    private Edad edad;
    private Mail mail;
    private IdOrientacion idOrientacion;

    public Alumno(AlumnoCI alumnoCI, Nombre nombre, Edad edad, Mail mail, IdOrientacion idOrientacion) {
        super(alumnoCI);
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.idOrientacion = idOrientacion;
    }
}
