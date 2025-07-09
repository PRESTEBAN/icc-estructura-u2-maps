package controllers;

import models.Empleado;

public interface EmpleadoDao {

    void add(Empleado emp);

    void eliminarUser(int id);

    void list();

}
