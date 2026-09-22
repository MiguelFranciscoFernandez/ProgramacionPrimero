public class Personaje {
    protected String nombre;
    protected int nivel;
    protected int vida;
    protected int velocidad;

    public Personaje(String nombre, int nivel, int vida, int velocidad) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.vida = vida;
        this.velocidad = velocidad;
    }

    public String getNombre() {return nombre;}

    public int getVida() {return vida;}

    public int getVelocidad() {return velocidad;}

    public int getNivel() {return nivel;}

    public void setNombre(String nombre) {this.nombre = nombre;}

    public void setNivel(int nivel) {this.nivel = nivel;}

    public void setVida(int vida) {this.vida = vida;}

    public void setVelocidad(int velocidad) {this.velocidad = velocidad;}

    public boolean recibirGolpe(int daño) {
        this.vida -= daño;
        return this.vida <= 0;
    }

    public String toString() {
        return String.format("Personaje{nombre='%s', nivel=%d, vida=%d, velocidad=%d}",
                nombre, nivel, vida, velocidad);
    }

    public void atacar(Personaje objetivo) {
    }
}