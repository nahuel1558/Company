package Programa;

import Interfaz.IEmpleado;
import Modelo.Empresa;

public class Programa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Instancia.instanciar();

        for (Empresa empresa : Instancia.getEmpresas()) {
            System.out.println("Empresa: " + empresa.toString());
            System.out.println("Empleados: ");
            for (IEmpleado empleado : empresa.getEmpleados()) {
                System.out.println(empleado);
            }
            empresa.crearSoftware();
            System.out.println("\n");
        }
    }
}
