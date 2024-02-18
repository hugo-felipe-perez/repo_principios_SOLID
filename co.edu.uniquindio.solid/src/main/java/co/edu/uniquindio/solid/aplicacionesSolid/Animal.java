package co.edu.uniquindio.solid.aplicacionesSolid;

/**
 * Clase que representa un Animal.
 *
 * @author Área de programación UQ - Sebastián Torres y Hugo Pérez
 * @since 2024-02
 *
 */
public abstract class Animal {
    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String obtenerNombre() {
        return this.nombre;
    }

    public abstract String hacerSonido();
}
