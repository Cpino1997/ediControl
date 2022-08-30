package cl.pinolabs.ediControl.model.persistence.crud;

import cl.pinolabs.ediControl.model.persistence.entity.AFP;
import org.springframework.data.repository.CrudRepository;

public interface AFPCrud extends CrudRepository<AFP, Integer> {
}
