package cl.pinolabs.ediControl.model.persistence.crud;

import cl.pinolabs.ediControl.model.persistence.entity.Asistencia;
import org.springframework.data.repository.CrudRepository;

public interface AsistenciaCrud extends CrudRepository<Asistencia, Integer> {
}
