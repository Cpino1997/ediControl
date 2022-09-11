package cl.pinolabs.ediControl.model.persistence.crud;

import cl.pinolabs.ediControl.model.persistence.entity.Horario;
import org.springframework.data.repository.CrudRepository;

public interface HorarioCrud extends CrudRepository<Horario, Integer> {
}
