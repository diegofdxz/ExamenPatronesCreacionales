package org.example;

import java.util.ArrayList;
import java.util.List;
public class BaseCompuesta extends Base {
    public BaseCompuesta(String nombre, int numAmbulancias, double tiempoAsistencia) {
        super(nombre, numAmbulancias, tiempoAsistencia);
    }

    private List<Base> bases = new ArrayList<>();
    public void addBase(Base base) {
        bases.add(base);
    }
    public void removeBase(Base base) {
        bases.remove(base);
    }
    @Override
    public String getNombre() {
        String nombre = "";
        for (Base base : bases) {
            nombre += base.getNombre() + " ";
        }
        return nombre;
    }
    @Override
    public int getNumAmbulancias() {
        int numAmbulancias = 0;
        for (Base base : bases) {
            numAmbulancias += base.getNumAmbulancias();
        }
        return numAmbulancias;
    }
    @Override
    public double getTiempoAsistencia() {
        double tiempoAsistencia = 0;
        for (Base base : bases) {
            tiempoAsistencia += base.getTiempoAsistencia();
        }
        return tiempoAsistencia;
    }
}
