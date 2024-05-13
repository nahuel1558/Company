package Modelo;

import Interfaz.IEmpleado;

public class Diseñador implements IEmpleado {

    @Override
    public void trabajar() {
        System.out.println("Empiezo a diseñar. DISEÑADOR");
    }
}
