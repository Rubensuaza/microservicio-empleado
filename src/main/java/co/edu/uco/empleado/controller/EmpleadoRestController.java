package co.edu.uco.empleado.controller;


import co.edu.uco.empleado.command.EmpleadoCommand;
import co.edu.uco.empleado.entity.EmpleadoEntity;
import co.edu.uco.empleado.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empleado")
public class EmpleadoRestController {

    @Autowired
    private EmpleadoService empleadoService;


    @GetMapping("/v1/listado-empleados")
    public List<EmpleadoCommand> findAll(){
        return empleadoService.findAll();
    }

    @GetMapping("/v1/{id}/empleado")
    private EmpleadoCommand findById(@PathVariable  int id){
        return empleadoService.findById(id);
    }


}
