public class Arquero extends Personaje {
    private int precision;

    public Arquero(String nombre, int nivel, int vida, int velocidad, int precision) {
        super(nombre, nivel, vida, velocidad);
        this.precision = precision;
    }

    public int getPrecision() {return precision;}

    public void setPrecision(int precision) {this.precision = precision;}

    public void atacar(Personaje objetivo) {
        int daño = (int)((precision * nivel) / 100.0);
        objetivo.recibirGolpe(daño);
        System.out.printf("[ARQUERO] %s dispara a %s con %d de daño%n",
                nombre, objetivo.getNombre(), daño);
    }

    public boolean recibirGolpe(int daño) {
        return super.recibirGolpe(daño * 2);
    }

    public String toString() {
        return String.format("Arquero{nombre='%s', nivel=%d, vida=%d, velocidad=%d, precision=%d}",
                nombre, nivel, vida, velocidad, precision);
    }
}