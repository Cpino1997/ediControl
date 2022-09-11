package cl.pinolabs.ediControl.model.domain.repository;

import cl.pinolabs.ediControl.model.domain.dto.ContratoDTO;

import java.util.List;
import java.util.Optional;

public interface ContratoDTORepo {
    Optional<List<ContratoDTO>> findAll();
    Optional<ContratoDTO> findById(int idContrato);
    ContratoDTO save(ContratoDTO contratoDTO);
    void delete(int idContrato);
}
