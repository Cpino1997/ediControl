package cl.pinolabs.ediControl.model.domain.repository;

import cl.pinolabs.ediControl.model.domain.dto.AFPDTO;
import cl.pinolabs.ediControl.model.domain.dto.SaludDTO;

import java.util.List;
import java.util.Optional;

public interface SaludDTORepo {
    Optional<List<SaludDTO>> findAll();
    Optional<SaludDTO> findById(int idSalud);
    SaludDTO save(SaludDTO saludDTO);
    void delete(int idSalud);
}
