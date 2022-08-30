package cl.pinolabs.ediControl.model.persistence.repository;

import cl.pinolabs.ediControl.model.domain.dto.AFPDTO;
import cl.pinolabs.ediControl.model.domain.repository.AFPDTORepo;
import cl.pinolabs.ediControl.model.persistence.crud.AFPCrud;
import cl.pinolabs.ediControl.model.persistence.entity.AFP;
import cl.pinolabs.ediControl.model.persistence.mapper.AFPMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AFPRepo implements AFPDTORepo {

    private final AFPCrud crud;
    private final AFPMapper mapper;

    public AFPRepo(AFPCrud crud, AFPMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<AFPDTO>> findAll() {
        return Optional.of(mapper.toAFPDTOs((List<AFP>) crud.findAll()));
    }

    @Override
    public Optional<AFPDTO> findById(int idAfp) {

        return crud.findById(idAfp)
                .map(mapper::toAFPDTO);
    }

    @Override
    public AFPDTO save(AFPDTO afpdto) {
        return mapper.toAFPDTO(crud.save(mapper.toAFP(afpdto)));
    }

    @Override
    public void delete(int idAfp) {
        crud.deleteById(idAfp);
    }
}
