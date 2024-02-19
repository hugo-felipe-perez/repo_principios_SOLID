package co.edu.uniquindio.solid;

import co.edu.uniquindio.solid.EjemploSRP.Vehiculo;

public class Main {
    public static void main(String[] args) {
        Vehiculo vehiculo1 = new Vehiculo("mazda", "2020",12500);
        vehiculo1.calcularCambioAceite();
    }
}