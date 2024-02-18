package co.edu.uniquindio.solid.aplicacionesSolid;

/**
 * Clase que representa un Cuidador.
 *
 * @author Área de programación UQ - Sebastián Torres y Hugo Pérez
 * @since 2024-02
 *
 */
public class Cuidador {
    private Animal animal;

    public Cuidador(Animal animal) {
        this.animal = animal;
    }

    public void cuidar() {
        System.out.println(animal.hacerSonido());
    }
}
