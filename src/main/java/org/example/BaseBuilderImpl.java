package org.example;

public class BaseBuilderImpl implements BaseBuilder {
    private String nombre;
    private int numeroAmbulancias;
    private double tiempoMedioAsistencia;

    @Override
    public BaseBuilder nombre(String nombre) {
        this.nombre = nombre;
        return this;
    }

    @Override
    public BaseBuilder numeroAmbulancias(int numeroAmbulancias) {
        this.numeroAmbulancias = numeroAmbulancias;
        return this;
    }

    @Override
    public BaseBuilder tiempoMedioAsistencia(double tiempoMedioAsistencia) {
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
        return this;
    }

    @Override
    public Base build() {
        return new Base(nombre, numeroAmbulancias, tiempoMedioAsistencia);
    }
}