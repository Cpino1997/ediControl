package cl.pinolabs.ediControl.model.persistence.crud;

import cl.pinolabs.ediControl.model.persistence.entity.Caja;
import org.springframework.data.repository.CrudRepository;

public interface CajaCrud extends CrudRepository<Caja, Integer> {
}
