package cl.pinolabs.ediControl.model.persistence.repository;

import cl.pinolabs.ediControl.model.domain.dto.ContratoDTO;
import cl.pinolabs.ediControl.model.domain.repository.ContratoDTORepo;
import cl.pinolabs.ediControl.model.persistence.crud.ContratoCrud;
import cl.pinolabs.ediControl.model.persistence.entity.Contrato;
import cl.pinolabs.ediControl.model.persistence.mapper.ContratoMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ContratoRepo implements ContratoDTORepo {
    private final ContratoCrud crud;
    private final ContratoMapper mapper;

    public ContratoRepo(ContratoCrud crud, ContratoMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<ContratoDTO>> findAll() {
        return Optional.of(mapper.toContratoDTOs((List<Contrato>) crud.findAll()));
    }

    @Override
    public Optional<ContratoDTO> findById(int idContrato) {

        return crud.findById(idContrato)
                .map(mapper::toContratoDTO);
    }

    @Override
    public ContratoDTO save(ContratoDTO contratoDTO) {
        return mapper.toContratoDTO(crud.save(mapper.toContrato(contratoDTO)));
    }

    @Override
    public void delete(int idContrato) {
        crud.deleteById(idContrato);
    }
}
