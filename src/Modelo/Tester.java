package Modelo;

import Interfaz.IEmpleado;

public class Tester implements IEmpleado {

    @Override
    public void trabajar() {
        System.out.println("Hola, ahora empieza mi trabajo. TESTER");
    }

}
