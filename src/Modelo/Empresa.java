package Modelo;

import Interfaz.IEmpleado;
import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private List<IEmpleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public void crearSoftware() {
        empleados.add(new Diseñador());
        empleados.add(new Programador());
        empleados.add(new Tester());

        for (IEmpleado e : empleados) {
            e.trabajar();
        }
    }

}
