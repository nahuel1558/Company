package Modelo;

import Interfaz.IEmpleado;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nahue
 */
public class EmpresaOutSourcing extends Empresa {

    private String nombre;
    private List<IEmpleado> empleados;

    public EmpresaOutSourcing(String nombre) {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
    }

    @Override
    public List<IEmpleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<IEmpleado> empleados) {
        this.empleados = empleados;
    }

    @Override
    public void crearSoftware() {
        for (IEmpleado empleado : empleados) {
            empleado.trabajar();
        }
    }

    @Override
    public void acomodarEmpleado(IEmpleado empleado) {
        empleados.add(empleado);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
