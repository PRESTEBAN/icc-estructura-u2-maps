
import controllers.EmpleadoContoller;
import controllers.EmpleadoDao;
import controllers.EmpleadoDaoHashMap;
import controllers.Mapa;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public class App {

    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();
        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runEmpleadoExample() {

        Map<Empleado, Empleado> mapHash = new HashMap<>();
        Map<Empleado, Empleado> mapTreemap = new TreeMap<>();

        EmpleadoDao empleadoDaoHashMap = new EmpleadoDaoHashMap(mapHash);
        EmpleadoContoller empleadoContoller = new EmpleadoContoller(empleadoDaoHashMap);


        EmpleadoDao empleadoDaoTreemap = new EmpleadoDaoHashMap(mapTreemap);
        EmpleadoContoller empleadoController2 = new EmpleadoContoller(empleadoDaoTreemap);


        Empleado emp1 = new Empleado(5, "Pedro", "Dev");
        Empleado emp2 = new Empleado(3, "Juan", "Dev");
        Empleado emp3 = new Empleado(1, "José", "Dev");
        Empleado emp4 = new Empleado(2, "Pedro", "Dev");
        Empleado emp5 = new Empleado(4, "Pedro", "Dev");

        empleadoContoller.addEmpleado(emp1);
        empleadoContoller.addEmpleado(emp2);
        empleadoContoller.addEmpleado(emp3);
        empleadoContoller.addEmpleado(emp4);
        empleadoContoller.addEmpleado(emp5);

        empleadoController2.addEmpleado(emp1);
        empleadoController2.addEmpleado(emp2);
        empleadoController2.addEmpleado(emp3);
        empleadoController2.addEmpleado(emp4);
        empleadoController2.addEmpleado(emp5);


        empleadoContoller.listarEmpleados();
        System.out.println("************** CON TREEMAP **************");
        empleadoController2.listarEmpleados();
    }

    private static void runMapExamlpe() {
        Mapa mapa = new Mapa();
        System.out.println("*****************Ejercicio 1 **************");
        mapa.ejemploConHashMap();
        System.out.println("*****************Ejercicio 2 **************");
        mapa.ejemploConLinkedHashMap();
        System.out.println("*****************Ejercicio 3 **************");
        mapa.ejemploConTreeMap();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
