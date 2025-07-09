
import controllers.EmpleadoContoller;
import controllers.EmpleadoDaoHashMap;
import controllers.Mapa;
import java.util.HashMap;
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
        
       EmpleadoDaoHashMap empleadoDaoHashMap = new EmpleadoDaoHashMap(new HashMap<>());
       EmpleadoDaoHashMap empleadoDaoTreemap = new EmpleadoDaoHashMap(new TreeMap<>());

       EmpleadoContoller empleadoContoller  = new EmpleadoContoller(empleadoDaoHashMap);
       EmpleadoContoller empleadoController2 = new EmpleadoContoller(empleadoDaoTreemap);

       
       Empleado emp1 = new Empleado(5, "Pedro", "Dev");
       Empleado emp2 = new Empleado(3, "Juan", "Dev");
       Empleado emp3 = new Empleado(1, "José", "Dev");
       Empleado emp4 = new Empleado(2, "Pedro", "Dev");
       Empleado emp5 = new Empleado(4, "Pedro", "Dev");

       empleadoContoller.

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
