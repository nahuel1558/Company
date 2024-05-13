package Modelo;

import Interfaz.IEmpleado;

public class Programador implements IEmpleado {

    @Override
    public void trabajar() {
        System.out.println("Ahora toca programar. PROGRAMADOR");
    }
}
