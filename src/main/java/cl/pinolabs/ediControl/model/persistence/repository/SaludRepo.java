package cl.pinolabs.ediControl.model.persistence.repository;

import cl.pinolabs.ediControl.model.domain.dto.SaludDTO;
import cl.pinolabs.ediControl.model.domain.repository.SaludDTORepo;
import cl.pinolabs.ediControl.model.persistence.crud.SaludCrud;
import cl.pinolabs.ediControl.model.persistence.entity.Salud;
import cl.pinolabs.ediControl.model.persistence.mapper.SaludMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class SaludRepo implements SaludDTORepo {

    private final SaludCrud crud;
    private final SaludMapper mapper;

    public SaludRepo(SaludCrud crud, SaludMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<SaludDTO>> findAll() {
        return Optional.of(mapper.toSaludDTOs((List<Salud>) crud.findAll()));
    }

    @Override
    public Optional<SaludDTO> findById(int idSalud) {

        return crud.findById(idSalud)
                .map(mapper::toSaludDTO);
    }

    @Override
    public SaludDTO save(SaludDTO saludDTO) {
        return mapper.toSaludDTO(crud.save(mapper.toSalud(saludDTO)));
    }

    @Override
    public void delete(int idSalud) {
        crud.deleteById(idSalud);
    }
}
