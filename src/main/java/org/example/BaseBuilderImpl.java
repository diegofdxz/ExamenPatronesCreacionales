package org.example;

public abstract class BaseBuilderImpl implements BaseBuilder {




    @Override
    public BaseIndividual createBaseIndividual(String nombre, int numeroAmbulancias, double tiempoMedioAsistencia) {
        return new BaseIndividual(nombre, numeroAmbulancias, tiempoMedioAsistencia);
    }



    @Override
    public BaseCompuesta createBaseCompuesta(String nombre, int numeroAmbulancias, double tiempoMedioAsistencia) {
        return new BaseCompuesta(nombre, numeroAmbulancias, tiempoMedioAsistencia);
    }
}