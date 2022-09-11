package cl.pinolabs.ediControl.model.persistence.repository;

import cl.pinolabs.ediControl.model.domain.dto.ContratoDTO;
import cl.pinolabs.ediControl.model.domain.dto.ParticipanteDTO;
import cl.pinolabs.ediControl.model.domain.repository.ParticipanteDTORepo;
import cl.pinolabs.ediControl.model.persistence.crud.ContratoCrud;
import cl.pinolabs.ediControl.model.persistence.crud.ParticipanteCrud;
import cl.pinolabs.ediControl.model.persistence.entity.Contrato;
import cl.pinolabs.ediControl.model.persistence.entity.Participante;
import cl.pinolabs.ediControl.model.persistence.mapper.ContratoMapper;
import cl.pinolabs.ediControl.model.persistence.mapper.ParticipanteMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ParticipanteRepo implements ParticipanteDTORepo {
    private final ParticipanteCrud crud;
    private final ParticipanteMapper mapper;

    public ParticipanteRepo(ParticipanteCrud crud, ParticipanteMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<ParticipanteDTO>> findAll() {
        return Optional.of(mapper.toParticipanteDTOs((List<Participante>) crud.findAll()));
    }

    @Override
    public Optional<ParticipanteDTO> findById(int idParticipante) {

        return crud.findById(idParticipante)
                .map(mapper::toParticipanteDTO);
    }

    @Override
    public ParticipanteDTO save(ParticipanteDTO participanteDTO) {
        return mapper.toParticipanteDTO(crud.save(mapper.toParticipante(participanteDTO)));
    }

    @Override
    public void delete(int idParticipante) {
        crud.deleteById(idParticipante);
    }
}
