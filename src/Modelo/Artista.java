package Modelo;

import Interfaz.IEmpleado;

/**
 *
 * @author nahue
 */
public class Artista implements IEmpleado {

    private String nombre;

    public Artista(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        System.out.println("Hola, ahora empieza mi trabajo. ARTISTA: " + nombre);
    }

    @Override
    public String toString() {
        return "Artista: " + nombre;
    }

}
