package controllers;


import java.util.Map;
import models.Empleado;

public class EmpleadoDaoHashMap implements EmpleadoDao {

    public Map<Empleado, Empleado> empleadosHashMap; //No imprime en orden, no me asegura imprimir en orden

     public EmpleadoDaoHashMap(Map<Empleado, Empleado> empleadosHashMap) {
        this.empleadosHashMap = empleadosHashMap;
    }

     @Override
    public void add(Empleado emp) {
        empleadosHashMap.put(emp, emp);
    }

    @Override
    public void eliminarUser(int id) {
       Empleado temp = new Empleado(id);

       empleadosHashMap.remove(temp);
    }

    @Override
    public void list() {
        for (Empleado e : empleadosHashMap.keySet()) {
            System.out.println(e);
        }
    }    

    

    

    



}
