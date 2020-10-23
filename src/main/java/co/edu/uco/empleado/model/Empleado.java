package co.edu.uco.empleado.model;

import co.edu.uco.empleado.mensajes.MensajesException;
import co.edu.uco.empleado.model.businessexception.BusinessException;
import co.edu.uco.empleado.util.Validator;


public class Empleado {

    private Integer idEmpleado;
    private String nombre;
    private String apellido;
    private String cargo;
    private boolean activo;

    private Empleado() {
        super();
    }

    public  static class EmpleadoBuilder{

        private Integer idEmpleado;
        private String nombre;
        private String apellido;
        private String cargo;
        private boolean activo;

        public EmpleadoBuilder setIdEmpleado(Integer idEmpleado) {
            this.idEmpleado = idEmpleado;
            return this;
        }

        public EmpleadoBuilder setNombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EmpleadoBuilder setApellido(String apellido) {
            this.apellido = apellido;
            return this;
        }

        public EmpleadoBuilder setCargo(String cargo) {
            this.cargo = cargo;
            return this;
        }

        public EmpleadoBuilder setActivo(boolean activo) {
            this.activo = activo;
            return this;
        }

        public Empleado build()throws BusinessException {
            Empleado empleado=new Empleado();
            Validator.numberNull(idEmpleado, MensajesException.MensajesEmpleadoException.ID_VACIO);
            empleado.idEmpleado = idEmpleado;
            Validator.textNull(nombre, MensajesException.MensajesEmpleadoException.CAMPO_VACIO);
            empleado.nombre = nombre;
            Validator.textNull(apellido, MensajesException.MensajesEmpleadoException.CAMPO_VACIO);
            empleado.apellido = apellido;
            Validator.textNull(cargo, MensajesException.MensajesEmpleadoException.CAMPO_VACIO);
            empleado.cargo = cargo;
            empleado.activo = activo;
            return empleado;
        }




    }



    public Integer getIdEmpleado() {
        return idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public boolean isActivo() {
        return activo;
    }


}
