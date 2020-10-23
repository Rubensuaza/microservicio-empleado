package co.edu.uco.empleado.repository;

import co.edu.uco.empleado.entity.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepository extends JpaRepository<EmpleadoEntity, Integer>{

}