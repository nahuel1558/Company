package Modelo;

import Interfaz.IEmpleado;

public class Programador implements IEmpleado {

    private String nombre;

    public Programador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        System.out.println("Ahora toca programar. PROGRAMADOR: " + nombre);
    }

    @Override
    public String toString() {
        return "Programador: " + nombre;
    }
}
