package co.edu.uniquindio.solid.EjemploSRP;

// Clase Vehiculo con una sola responsabilidad
public class Vehiculo {
    private String marca;
    private String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String obtenerDetallesDelVehiculo() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}
