package co.edu.uniquindio.solid.EjemploSRP;

import java.util.Scanner;

// Clase Vehiculo con una sola responsabilidad
public class Vehiculo {
    private String marca;
    private String modelo;
    private double kilometraje;

    public Vehiculo(String marca, String modelo, double kilometraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.kilometraje = kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String obtenerDetallesDelVehiculo() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Kilometraje: " + kilometraje;
    }
    public void calcularCambioAceite (){
        Scanner a = new Scanner(System.in);
        System.out.print("Ingrese el kilometraje antes de cambio del cambio de aceite: ");
        double kilometrajeAntesCambio = a.nextDouble();
        if (kilometraje >= kilometrajeAntesCambio + 5000){
            System.out.println("¡¡ Debe hacer cambio de aceite !!");
        }
        else if (kilometrajeAntesCambio > kilometraje) {
            while (kilometrajeAntesCambio > kilometraje) {
                Scanner b = new Scanner(System.in);
                System.out.print("el kilometraje antes del cambio no puede ser mayor al actual, ingrese de nuevo: ");
                kilometrajeAntesCambio = b.nextDouble();
            }
        }
        System.out.println("Relajado");

    }


}
