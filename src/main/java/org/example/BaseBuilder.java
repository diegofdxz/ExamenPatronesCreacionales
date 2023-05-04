package org.example;

public interface BaseBuilder {
    BaseIndividual createBaseIndividual();

    BaseIndividual createBaseIndividual(String nombre, int numeroAmbulancias, double tiempoMedioAsistencia);

    abstract BaseCompuesta createBaseCompuesta(String nombre);

    BaseCompuesta createBaseCompuesta(String nombre, int numeroAmbulancias, double tiempoMedioAsistencia);
}
