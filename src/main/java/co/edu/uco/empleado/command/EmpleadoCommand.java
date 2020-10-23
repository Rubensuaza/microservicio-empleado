package co.edu.uco.empleado.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor
public class EmpleadoCommand {

    private Integer idEmpleado;
    private String nombre;
    private String apellido;
    private String cargo;
    private boolean activo;


}
