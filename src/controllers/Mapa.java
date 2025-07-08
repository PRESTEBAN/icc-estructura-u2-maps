package controllers;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

import models.Empleado;

public class Mapa {

  

    public Mapa() {
    }

    public void ejemploConHashMap(){
        Map<String, String> capitales = new HashMap<>();
        capitales.put("Ecuador", "Quito");
        capitales.put("Colombia", "Bogotá");
        capitales.put("Perú", "Lima");
        


        System.out.println("Mapa de capitales");
        for (String pais : capitales.keySet()) {
            System.out.println("País: " + pais + "Capital " + capitales.get(pais));
        }

        //EJEMPLO DE ACCESO DIRECTO
        String capital = capitales.get("Ecuador");
        System.out.println("La capital de Ecuador es: " + capital);

        System.out.println("\n");

        Map<Integer, Empleado> empleados = new HashMap<>();
        empleados.put(3, new Empleado(3, "Pedro", "Tester"));
        empleados.put(1, new Empleado(1, "Ana", "Dev"));
        empleados.put(1, new Empleado(2, "Luis", "Diseñador"));
        empleados.put(1, new Empleado(3, "Pedro", "Tester"));

        for (Map.Entry<Integer,Empleado> entry : empleados.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + ", Valor: " + entry.getValue());
        }

         System.out.println("\n");

        Map<Empleado, Integer> empleadosDos = new HashMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        empleadosDos.put(emp4, 2000);

        for (Map.Entry<Empleado,Integer> entry : empleadosDos.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " => " + entry.getValue());
        }
         System.out.println("\n");
    }

    public void ejemploConLinkedHashMap(){
        Map<String, Integer> productos = new LinkedHashMap<>();
        productos.put("Leche", 2);
        productos.put("Huevos",3);
        productos.put("Pan", 1);
        productos.put("Frutas",5 );
        productos.put("papel", 3);

        System.out.println("Mapa de productos");

        for (String producto : productos.keySet()) {
            System.out.println("Producto: " + producto + " Precio: " + productos.get(producto));
        }

        int productoP = productos.get("Huevos");
        System.out.println("El producto: " + productoP);


        Map<Empleado, Integer> empleadosDos = new TreeMap<>();
        Empleado emp1 = new Empleado(1, "Ana", "Dev");
        Empleado emp2 = new Empleado(2, "Pedro", "Dev");
        Empleado emp3 = new Empleado(3, "Ana", "Dev");
        Empleado emp4 = new Empleado(3, "Ana", "Dev");

        empleadosDos.put(emp1, 1000);
        empleadosDos.put(emp2, 1200);
        empleadosDos.put(emp3, 1500);
        empleadosDos.put(emp4, 2000);

        for (Map.Entry<Empleado,Integer> entry : empleadosDos.entrySet()) {
            System.out.println("Clave: " + entry.getKey() + " => " + entry.getValue());
        }
         System.out.println("");

    }

    public void ejemploConTreeMap(){
        Map<Integer, String> personas = new LinkedHashMap<>();
        personas.put(0, "Pablo");
        personas.put(1, "Juan");
        personas.put(2, "Pedro");
        personas.put(3, "Diana");
        personas.put(4, "Esteban");
        
        for (int  personaN : personas.keySet()) {
             System.out.println("Numero de persona: " + personaN  + " Nombre: " + personas.get(personaN));
        }

        String nombreP = personas.get(0);

        System.out.println("Nombre de la persona: " + nombreP);
        
    }
}
