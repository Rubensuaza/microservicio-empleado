package co.edu.uco.empleado.service;

import co.edu.uco.empleado.command.EmpleadoCommand;
import co.edu.uco.empleado.entity.EmpleadoEntity;

import java.util.List;

public interface EmpleadoService {

    List<EmpleadoCommand> findAll();

    EmpleadoCommand findById(int idEmpleado);
}
