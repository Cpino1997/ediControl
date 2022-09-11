package cl.pinolabs.ediControl.model.persistence.crud;

import cl.pinolabs.ediControl.model.persistence.entity.Trabajador;
import org.springframework.data.repository.CrudRepository;

public interface TrabajadorCrud extends CrudRepository<Trabajador, Integer> {
}
