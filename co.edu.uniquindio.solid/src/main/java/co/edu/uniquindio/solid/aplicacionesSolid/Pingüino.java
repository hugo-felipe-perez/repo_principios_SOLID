package co.edu.uniquindio.solid.aplicacionesSolid;

/**
 * Clase que representa un Pinguino que extiede de la clase Animal.
 *
 * @author Área de programación UQ - Sebastián Torres y Hugo Pérez
 * @since 2024-02
 *
 */
public class Pingüino extends Animal {
    public Pingüino(String nombre) {
        super(nombre);
    }

    public String hacerSonido() {
        return "Grito";
    }
}
