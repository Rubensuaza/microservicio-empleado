package co.edu.uco.empleado.service.impl;

import co.edu.uco.empleado.command.EmpleadoCommand;
import co.edu.uco.empleado.entity.EmpleadoEntity;
import co.edu.uco.empleado.fabrica.EmpleadoFabrica;
import co.edu.uco.empleado.repository.EmpleadoRepository;
import co.edu.uco.empleado.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImpl implements EmpleadoService {

    @Autowired
    private EmpleadoRepository empleadoRepository;

    @Autowired
    private EmpleadoFabrica empleadoFabrica;

    @Override
    public List<EmpleadoCommand> findAll() {
        return empleadoFabrica.entityToCommand(empleadoRepository.findAll());
    }

    @Override
    public EmpleadoEntity findById(int idEmpleado) {
        return empleadoRepository.findById(idEmpleado).orElse(null);
    }
}
