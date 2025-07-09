package controllers;

import java.util.Map;
import java.util.TreeMap;
import models.Empleado;

public  class EmpleadoDaoTreeMap implements  EmpleadoDao {

    public Map<Empleado, Empleado> empleadosTree; // me imprime por nombres, el comparador te dice el orden de inserccion

    public EmpleadoDaoTreeMap(Map<Empleado, Empleado> mapaEmpleado) {
        this.empleadosTree = new TreeMap<>();
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
