package controllers;

import java.util.Map;
import models.Empleado;

public class EmpleadoDaoTreeMap implements EmpleadoDao {

    public Map<Empleado, Empleado> empleadosTree; // me imprime por nombres, el comparador te dice el orden de inserccion
  
    public EmpleadoDaoTreeMap(Map<Empleado, Empleado> empleadosTree) {
        this.empleadosTree = empleadosTree; // Usamos el mapa recibido
    }


    @Override
    public void add(Empleado emp) {
        empleadosTree.put(emp, emp);
    }

    @Override
    public void eliminarUser(int id) {
       Empleado temp = new Empleado(id);

       empleadosTree.remove(temp);
    }

    @Override
    public void list() {
        for (Empleado e : empleadosTree.keySet()) {
            System.out.println(e);
        }
    }    
}
