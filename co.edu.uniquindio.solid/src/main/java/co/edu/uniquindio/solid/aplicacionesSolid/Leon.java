package co.edu.uniquindio.solid.aplicacionesSolid;

import co.edu.uniquindio.solid.aplicacionesSolid.service.  IAnimalTerrestre;
import co.edu.uniquindio.solid.aplicacionesSolid.service.IAnimalTerrestre;

/**
 * Clase que representa un Leon que extiende de la clase Animal.
 *
 * @author Área de programación UQ - Sebastián Torres y Hugo Pérez
 * @since 2024-02
 *
 */

public class Leon extends Animal implements IAnimalTerrestre {
    public Leon(String nombre) {
        super(nombre);
    }

    public String hacerSonido() {
        return "Rugido";
    }

    public void caminar() {
        // Implementación de caminar
    }
}
