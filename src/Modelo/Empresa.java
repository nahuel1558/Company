package Modelo;

import Interfaz.IEmpleado;
import java.util.List;

public abstract class Empresa {
    public Empresa() {

    }

    public abstract List<IEmpleado> getEmpleados();

    public abstract void crearSoftware();
    
    public abstract void acomodarEmpleado(IEmpleado empleado);
}
