package cl.pinolabs.ediControl.model.persistence.crud;

import cl.pinolabs.ediControl.model.persistence.entity.Salud;
import org.springframework.data.repository.CrudRepository;

public interface SaludCrud extends CrudRepository<Salud, Integer> {
}
