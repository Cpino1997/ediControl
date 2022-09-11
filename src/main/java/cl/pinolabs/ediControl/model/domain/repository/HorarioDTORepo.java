package cl.pinolabs.ediControl.model.domain.repository;

import cl.pinolabs.ediControl.model.domain.dto.HorarioDTO;

import java.util.List;
import java.util.Optional;

public interface HorarioDTORepo {
    Optional<List<HorarioDTO>> findAll();
    Optional<HorarioDTO> findById(int idHorario);
    HorarioDTO save(HorarioDTO horarioDTO);
    void delete(int idHorario);
}
