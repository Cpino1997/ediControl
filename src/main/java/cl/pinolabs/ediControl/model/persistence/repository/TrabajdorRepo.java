package cl.pinolabs.ediControl.model.persistence.repository;

import cl.pinolabs.ediControl.model.domain.dto.TrabajadorDTO;
import cl.pinolabs.ediControl.model.domain.repository.TrabajadorDTORepo;
import cl.pinolabs.ediControl.model.persistence.crud.TrabajadorCrud;
import cl.pinolabs.ediControl.model.persistence.entity.Trabajador;
import cl.pinolabs.ediControl.model.persistence.mapper.TrabajadorMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class TrabajdorRepo implements TrabajadorDTORepo {

    private final TrabajadorCrud crud;
    private final TrabajadorMapper mapper;

    public TrabajdorRepo(TrabajadorCrud crud, TrabajadorMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<TrabajadorDTO>> findAll() {
        return Optional.of(mapper.toTrabajadorDTOs((List<Trabajador>) crud.findAll()));
    }

    @Override
    public Optional<TrabajadorDTO> findById(int idTrabajador) {

        return crud.findById(idTrabajador)
                .map(mapper::toTrabajadorDTO);
    }

    @Override
    public TrabajadorDTO save(TrabajadorDTO trabajadorDTO) {
        return mapper.toTrabajadorDTO(crud.save(mapper.toTrabajador(trabajadorDTO)));
    }

    @Override
    public void delete(int idTrabajador) {
        crud.deleteById(idTrabajador);
    }
}
