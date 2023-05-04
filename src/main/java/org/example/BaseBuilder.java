package org.example;

public interface BaseBuilder {
    BaseBuilder nombre(String nombre);
    BaseBuilder numeroAmbulancias(int numeroAmbulancias);
    BaseBuilder tiempoMedioAsistencia(double tiempoMedioAsistencia);
    Base build();
}
