package co.edu.uco.empleado.model;

import co.edu.uco.empleado.mensajes.MensajesException;
import co.edu.uco.empleado.model.businessexception.BusinessException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmpleadoTest {

    @Test
    public void requerirIdEmpleado(){
        try{
            Empleado empleado=new Empleado.EmpleadoBuilder().build();
        }catch (BusinessException ex){
            assertEquals(MensajesException.MensajesEmpleadoException.ID_VACIO,ex.getMessage());
        }
    }

    @Test
    public void requerirNombreEmpleado(){
        try{
            Empleado empleado=new Empleado.EmpleadoBuilder().setIdEmpleado(1).build();
        }catch (BusinessException ex){
            assertEquals(MensajesException.MensajesEmpleadoException.CAMPO_VACIO,ex.getMessage());
        }
    }

    @Test
    public void requerirApellidoEmpleado(){
        try{
            Empleado empleado=new Empleado.EmpleadoBuilder().setIdEmpleado(1).setNombre("Ruben").build();
        }catch (BusinessException ex){
            assertEquals(MensajesException.MensajesEmpleadoException.CAMPO_VACIO,ex.getMessage());
        }
    }

    @Test
    public void requerirCargoEmpleado(){
        try{
            Empleado empleado=new Empleado.EmpleadoBuilder()
                    .setIdEmpleado(1)
                    .setNombre("Ruben")
                    .setApellido("Suaza").build();
        }catch (BusinessException ex){
            assertEquals(MensajesException.MensajesEmpleadoException.CAMPO_VACIO,ex.getMessage());
        }
    }

}