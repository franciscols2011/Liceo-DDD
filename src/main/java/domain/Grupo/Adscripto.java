package domain.Grupo;

import java.util.ArrayList;

import co.com.sofka.domain.generic.Entity;
import domain.Profesor.value.Edad;
import domain.Profesor.value.Mail;
import domain.Profesor.value.Nombre;
import domain.Grupo.value.AdscriptoCI;
import domain.Grupo.value.IdGrupo;

public class Adscripto extends Entity<AdscriptoCI> {
    private Nombre nombre;
    private AdscriptoCI adscriptoCI;
    private Edad edad;
    private Mail mail;
    private ArrayList<IdGrupo> grupos;

    public Adscripto(Nombre nombre, AdscriptoCI adscriptoCI, Edad edad, Mail mail, ArrayList<IdGrupo> grupos) {
        super(adscriptoCI);
        this.nombre = nombre;
        this.edad = edad;
        this.mail = mail;
        this.grupos = grupos;
    }

    public Nombre getNombre() {
        return nombre;
    }

    public Edad getEdad() {
        return edad;
    }

    public Mail getMail() {
        return mail;
    }

    public ArrayList<IdGrupo> getGrupos() {
        return grupos;
    }
}
