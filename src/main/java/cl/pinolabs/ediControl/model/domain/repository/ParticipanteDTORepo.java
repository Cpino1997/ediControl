package cl.pinolabs.ediControl.model.domain.repository;

import cl.pinolabs.ediControl.model.domain.dto.HorarioDTO;
import cl.pinolabs.ediControl.model.domain.dto.ParticipanteDTO;

import java.util.List;
import java.util.Optional;

public interface ParticipanteDTORepo {
    Optional<List<ParticipanteDTO>> findAll();
    Optional<ParticipanteDTO> findById(int idParticipante);
    ParticipanteDTO save(ParticipanteDTO participanteDTO);
    void delete(int idParticipante);
}
