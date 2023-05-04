package org.example;

public class Base {
protected String nombre;
protected int numAmbulancias;
protected double tiempoAsistencia;

    public Base(String nombre, int numAmbulancias, double tiempoAsistencia) {
        this.nombre = nombre;
        this.numAmbulancias = numAmbulancias;
        this.tiempoAsistencia = tiempoAsistencia;
    }
    public String getNombre() {
        return nombre;
    }
    public int getNumAmbulancias() {
        return numAmbulancias;
    }

    public double getTiempoAsistencia() {
        return tiempoAsistencia;
    }

}
