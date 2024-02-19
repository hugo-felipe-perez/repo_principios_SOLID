package co.edu.uniquindio.solid.aplicacionesSolid;

import co.edu.uniquindio.solid.aplicacionesSolid.service. IAnimalAcuatico;
import co.edu.uniquindio.solid.aplicacionesSolid.service.IAnimalAcuatico;

/**
 * Clase que representa un Pinguino que extiede de la clase Animal.
 *
 * @author Área de programación UQ - Sebastián Torres y Hugo Pérez
 * @since 2024-02
 *
 */
public class Ballena extends Animal implements IAnimalAcuatico {
    public Ballena(String nombre) {
        super(nombre);
    }

    public String hacerSonido() {
        return "canto";
    }
    public void nadar (){

    }
}
