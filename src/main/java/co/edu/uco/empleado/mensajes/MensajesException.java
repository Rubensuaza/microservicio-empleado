package co.edu.uco.empleado.mensajes;

public class MensajesException {


    public  class MensajesEmpleadoException{

        private MensajesEmpleadoException() {super();
        }

        public static final String ID_VACIO="El campo id no puede ser nulo";
        public static final String CAMPO_VACIO="los campos nombre, apellido, cargo  no pueden ser nulos";
        public static final String EMPLEADO_NO_EXISTE="El empleado no existe";
        public static final String EMPLEADO_ASIGANDO="El empleado se encuentra asignado";
        public static final String EMPLEADO_NO_ASIGANDO="El empleado no se encuentra asignado en alguna tarea";

    }



}
