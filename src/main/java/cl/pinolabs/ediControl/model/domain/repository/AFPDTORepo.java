package cl.pinolabs.ediControl.model.domain.repository;

import cl.pinolabs.ediControl.model.domain.dto.AFPDTO;

import java.util.List;
import java.util.Optional;

public interface AFPDTORepo {
    Optional<List<AFPDTO>> findAll();
    Optional<AFPDTO> findById(int idAfp);
    AFPDTO save(AFPDTO afpdto);
    void delete(int idAfp);
}
