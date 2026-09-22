import java.util.ArrayList;
import java.util.List;

public class Servidor{
    private String nombre;
    private List<Personaje> personajes;

    public Servidor() {

    }

    public Servidor(String nombre) {
        this.nombre = nombre;
        this.personajes = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }

    

}