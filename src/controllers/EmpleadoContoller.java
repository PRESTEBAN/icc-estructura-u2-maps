package controllers;

import models.Empleado;

public class EmpleadoContoller {

    private EmpleadoDao empleadoDao;

    public EmpleadoContoller(EmpleadoDao empleadoDao) {
        this.empleadoDao = empleadoDao;
    }

     public void addEmpleado(Empleado emp) {
        empleadoDao.add(emp);
    }

    public void eliminarEmpleado(int id) {
        empleadoDao.eliminarUser(id);
    }

    public void listarEmpleados() {
        empleadoDao.list();
    }

   
}