public class Guerrero extends Personaje {
    private int fuerza;

    public Guerrero(String nombre, int nivel, int vida, int velocidad, int fuerza) {
        super(nombre, nivel, vida, velocidad);
        this.fuerza = fuerza;
    }

    public int getFuerza() {return fuerza;}

    public void setFuerza(int fuerza) {this.fuerza = fuerza;}

    public void atacar(Personaje objetivo) {
        int daño = (getFuerza() * getNivel()) / getVida();
        objetivo.recibirGolpe(daño);
        System.out.printf("[GUERRERO] %s ataca a %s con %d de daño%n",
                nombre, objetivo.getNombre(), daño);
    }

    public String toString() {
        return String.format("Guerrero{nombre='%s', nivel=%d, vida=%d, velocidad=%d, fuerza=%d}",
                nombre, nivel, vida, velocidad, fuerza);
    }
}