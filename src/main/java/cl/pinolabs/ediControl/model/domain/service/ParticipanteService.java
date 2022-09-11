package cl.pinolabs.ediControl.model.domain.service;

import cl.pinolabs.ediControl.model.domain.dto.ParticipanteDTO;
import cl.pinolabs.ediControl.model.domain.repository.ParticipanteDTORepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ParticipanteService {
    private final ParticipanteDTORepo repo;

    public ParticipanteService(ParticipanteDTORepo repo) {
        this.repo = repo;
    }

    public Optional<List<ParticipanteDTO>> findAll(){
        return repo.findAll();
    }

    public Optional<ParticipanteDTO> findById(int idParticipante){
        return repo.findById(idParticipante);
    }

    public ParticipanteDTO save(ParticipanteDTO participanteDTO){
        return repo.save(participanteDTO);
    }

    public boolean delete(int idParticipante){
        return findById(idParticipante)
                .map(participanteDTO -> {
                    repo.delete(idParticipante);
                    return true;})
                .orElse(false);
    }
}
