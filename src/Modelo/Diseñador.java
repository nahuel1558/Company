package Modelo;

import Interfaz.IEmpleado;

public class Diseñador implements IEmpleado {

    private String nombre;

    public Diseñador(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void trabajar() {
        System.out.println("Empiezo a diseñar. DISEÑADOR: " + nombre);
    }

    @Override
    public String toString() {
        return "Diseñador: " + nombre;
    }
}
