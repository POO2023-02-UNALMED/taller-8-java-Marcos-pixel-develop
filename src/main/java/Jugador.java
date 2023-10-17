package Futbol;
public class Jugador extends Futbolista {
    public short golesMarcados;
    public byte dorsal;

    public Jugador(String nombre, int edad, String posicion,short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }

    public Jugador(String nombre, int edad, String posicion) {
        super(nombre, edad, posicion);

        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public String toString() {
        return "El futbolista " + getNombre() + " tiene " + getEdad() + " y juega de " + getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados + " goles.";
    }
    public int compareTo(Futbolista otroFutbolista) {
        return Math.abs(super.getEdad() - otroFutbolista.getEdad());
    }
	@Override
	public boolean jugarConLasManos() {
		// TODO Auto-generated method stub
		return false;
	}
}