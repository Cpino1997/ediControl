package cl.pinolabs.ediControl.model.persistence.repository;

import cl.pinolabs.ediControl.model.domain.dto.CajaDTO;
import cl.pinolabs.ediControl.model.domain.repository.CajaDTORepo;
import cl.pinolabs.ediControl.model.persistence.crud.CajaCrud;
import cl.pinolabs.ediControl.model.persistence.entity.Caja;
import cl.pinolabs.ediControl.model.persistence.mapper.CajaMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class CajaRepo implements CajaDTORepo {

    private final CajaCrud crud;
    private final CajaMapper mapper;

    public CajaRepo(CajaCrud crud, CajaMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<CajaDTO>> findAll() {
        return Optional.of(mapper.toCajaDTOs((List<Caja>) crud.findAll()));
    }

    @Override
    public Optional<CajaDTO> findById(int idCaja) {

        return crud.findById(idCaja)
                .map(mapper::toCajaDTO);
    }

    @Override
    public CajaDTO save(CajaDTO cajaDTO) {
        return mapper.toCajaDTO(crud.save(mapper.toCaja(cajaDTO)));
    }

    @Override
    public void delete(int idCaja) {
        crud.deleteById(idCaja);
    }
}
