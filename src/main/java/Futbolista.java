package Futbol;

import java.util.Objects;

public abstract class Futbolista implements Comparable<Futbolista> {
    private String nombre;
    protected int edad;
    private final String posicion;

    public Futbolista(String nombre, int edad, String posicion) {
        this.nombre = nombre;
        this.edad = edad;
        this.posicion = posicion;
    }

    public Futbolista() {
        this("Maradona", 30, "delantero");
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public abstract boolean jugarConLasManos()
    
    ;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Futbolista that = (Futbolista) o;
        return edad == that.edad &&
                Objects.equals(nombre, that.nombre) &&
                Objects.equals(posicion, that.posicion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, edad, posicion);
    }

    @Override
    public String toString() {
        return "El futbolista " + nombre + " tiene " + edad + " y juega de " + posicion;
    }

    @Override
    public int compareTo(Futbolista otroFutbolista) {
        return Math.abs(this.edad - otroFutbolista.getEdad());
    }
}

