package cl.pinolabs.ediControl.model.domain.repository;

import cl.pinolabs.ediControl.model.domain.dto.AsistenciaDTO;

import java.util.List;
import java.util.Optional;

public interface AsistenciaDTORepo {
    Optional<List<AsistenciaDTO>> findAll();
    Optional<AsistenciaDTO> findById(int idAsistencia);
    AsistenciaDTO save(AsistenciaDTO asistenciaDTO);
    void delete(int idAsistencia);
}
