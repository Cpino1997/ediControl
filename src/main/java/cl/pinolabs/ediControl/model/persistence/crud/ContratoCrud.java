package cl.pinolabs.ediControl.model.persistence.crud;

import cl.pinolabs.ediControl.model.persistence.entity.Contrato;
import org.springframework.data.repository.CrudRepository;

public interface ContratoCrud extends CrudRepository<Contrato , Integer> {
}
