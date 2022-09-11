package cl.pinolabs.ediControl.model.domain.repository;

import cl.pinolabs.ediControl.model.domain.dto.TrabajadorDTO;

import java.util.List;
import java.util.Optional;

public interface TrabajadorDTORepo {
    Optional<List<TrabajadorDTO>> findAll();
    Optional<TrabajadorDTO> findById(int idTrabajador);
    TrabajadorDTO save(TrabajadorDTO trabajadorDTO);
    void delete(int idTrabajador);
}
