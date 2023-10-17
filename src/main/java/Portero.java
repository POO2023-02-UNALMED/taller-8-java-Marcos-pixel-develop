package Futbol;

public class Portero extends Futbolista {
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }

    @Override
    public boolean jugarConLasManos() {
        return true;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos + " goles.";
    }

    @Override
    public int compareTo(Futbolista otroFutbolista) {
        if (otroFutbolista instanceof Portero) {
            Portero otroPortero = (Portero) otroFutbolista;
            return Math.abs(this.golesRecibidos - otroPortero.golesRecibidos);
        }
        return super.compareTo(otroFutbolista);
    }
}