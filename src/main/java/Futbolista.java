package futbol;

public abstract class Futbolista implements Comparable {
    private String nombre;
    private int edad;
    private final String posicion;

    public Futbolista() {
        nombre = "Maradona";
        edad = 30;
        posicion = "delantero";
    }

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public abstract boolean jugarConLasManos();

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + ", y juega de " + posicion;
    }

    @Override
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override
    public int compareTo(Object o) {
        return Math.abs(this.edad - ((Futbolista) o).edad);
    }


}
