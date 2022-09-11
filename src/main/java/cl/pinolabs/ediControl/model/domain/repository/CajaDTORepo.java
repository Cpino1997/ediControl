package cl.pinolabs.ediControl.model.domain.repository;

import cl.pinolabs.ediControl.model.domain.dto.CajaDTO;

import java.util.List;
import java.util.Optional;

public interface CajaDTORepo {
    Optional<List<CajaDTO>> findAll();
    Optional<CajaDTO> findById(int idCaja);
    CajaDTO save(CajaDTO cajaDTO);
    void delete(int idCaja);
}
