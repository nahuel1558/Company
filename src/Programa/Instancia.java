package Programa;

import Interfaz.IEmpleado;
import Modelo.Artista;
import Modelo.Diseñador;
import Modelo.Empresa;
import Modelo.EmpresaGameDev;
import Modelo.EmpresaOutSourcing;
import Modelo.Programador;
import Modelo.Tester;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nahue
 */
public abstract class Instancia {

    private static List<Empresa> empresas = new ArrayList<>();
    private static List<IEmpleado> empleados = new ArrayList<>();

    public static void instanciar() {
        instanciarEmpresas();
        instanciarEmpleados();
    }

    private static void instanciarEmpresas() {
        empresas.add(new EmpresaGameDev("Empresa GAME DEV"));
        empresas.add(new EmpresaOutSourcing("Empresa OUT SOURCING"));
    }

    private static void instanciarEmpleados() {
        empleados.add(new Tester("Nahuel"));
        empleados.add(new Programador("Juan"));
        empleados.add(new Artista("Nicolas"));
        empleados.add(new Diseñador("Manuel"));

        empresas.get(0).acomodarEmpleado(empleados.get(3)); // Manuel, Diseñador
        empresas.get(0).acomodarEmpleado(empleados.get(2)); // Nicolas, Artista
        empresas.get(1).acomodarEmpleado(empleados.get(1)); // Juan, Programador
        empresas.get(1).acomodarEmpleado(empleados.get(0)); // Nahuel, Tester
    }

    public static List<Empresa> getEmpresas() {
        return empresas;
    }

    public static List<IEmpleado> getEmpleados() {
        return empleados;
    }
}
