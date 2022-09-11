package cl.pinolabs.ediControl.model.persistence.crud;

import cl.pinolabs.ediControl.model.persistence.entity.Participante;
import org.springframework.data.repository.CrudRepository;

public interface ParticipanteCrud extends CrudRepository<Participante, Integer> {
}
