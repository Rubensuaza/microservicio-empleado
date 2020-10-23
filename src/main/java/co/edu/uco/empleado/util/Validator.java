package co.edu.uco.empleado.util;

import co.edu.uco.empleado.model.Empleado;
import co.edu.uco.empleado.model.businessexception.BusinessException;

import java.util.Date;

public class Validator {

    public Validator() {super();
    }

    public static void numberNull(Integer valor, String mensaje) throws BusinessException{
        if(valor==null){
            throw new BusinessException(mensaje);

        }
    }

    public static void textNull(String valor, String mensaje) throws BusinessException{
        if(valor==null){
            throw new BusinessException(mensaje);

        }
    }






}
