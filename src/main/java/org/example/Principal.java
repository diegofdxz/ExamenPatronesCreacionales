package org.example;

public class Principal {
    public static void run() {
        BaseBuilder builder1 = new BaseBuilder();  // BaseBuilderImpl
        BaseBuilder builder2 = new BaseBuilder();  // BaseBuilderImpl

        BaseIndividual baseIndividual1 = builder1.createBaseIndividual("Base Individual 1", 2, 30.0);
        BaseIndividual baseIndividual2 = builder1.createBaseIndividual("Base Individual 2", 1, 40.0);
        BaseCompuesta baseCompuesta = builder2.createBaseCompuesta("Base Compuesta");
        baseCompuesta.addBase(baseIndividual1);
        baseCompuesta.addBase(baseIndividual2);
        System.out.println("Nombre de la base compuesta: " + baseCompuesta.getNombre());
        System.out.println("Número de ambulancias en la base compuesta: " + baseCompuesta.getNumAmbulancias());
        System.out.println("Tiempo medio de asistencia en la base compuesta: " + baseCompuesta.getTiempoAsistencia());
    }



}
