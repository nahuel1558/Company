package Modelo;

import Interfaz.IEmpleado;

public class Tester implements IEmpleado {

    private String nombre;

    public Tester(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        System.out.println("Hola, ahora empieza mi trabajo. TESTER: " + nombre);
    }

    @Override
    public String toString() {
        return "Tester: " + nombre;
    }
}
