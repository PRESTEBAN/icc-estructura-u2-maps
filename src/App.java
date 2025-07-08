import controllers.Mapa;

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
      Mapa mapa = new Mapa();
      System.out.println("*****************Ejercicio 1 **************");
      mapa.ejemploConHashMap();
        System.out.println("*****************Ejercicio 2 **************");
      mapa.ejemploConLinkedHashMap();
        System.out.println("*****************Ejercicio 3 **************");
      mapa.ejemploConTreeMap();
    }

    private static void runMapExamlpe() {
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }
}
