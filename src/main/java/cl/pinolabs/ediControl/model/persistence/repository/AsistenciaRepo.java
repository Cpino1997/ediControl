package cl.pinolabs.ediControl.model.persistence.repository;

import cl.pinolabs.ediControl.model.domain.dto.AsistenciaDTO;
import cl.pinolabs.ediControl.model.domain.dto.CajaDTO;
import cl.pinolabs.ediControl.model.domain.repository.AsistenciaDTORepo;
import cl.pinolabs.ediControl.model.persistence.crud.AsistenciaCrud;
import cl.pinolabs.ediControl.model.persistence.crud.CajaCrud;
import cl.pinolabs.ediControl.model.persistence.entity.Asistencia;
import cl.pinolabs.ediControl.model.persistence.entity.Caja;
import cl.pinolabs.ediControl.model.persistence.mapper.AsistenciaMapper;
import cl.pinolabs.ediControl.model.persistence.mapper.CajaMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class AsistenciaRepo implements AsistenciaDTORepo {
    private final AsistenciaCrud crud;
    private final AsistenciaMapper mapper;

    public AsistenciaRepo(AsistenciaCrud crud, AsistenciaMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }

    @Override
    public Optional<List<AsistenciaDTO>> findAll() {
        return Optional.of(mapper.toAsistenciaDTOs((List<Asistencia>) crud.findAll()));
    }

    @Override
    public Optional<AsistenciaDTO> findById(int idAsistencia) {

        return crud.findById(idAsistencia)
                .map(mapper::toAsistenciaDTO);
    }

    @Override
    public AsistenciaDTO save(AsistenciaDTO asistenciaDTO) {
        return mapper.toAsistenciaDTO(crud.save(mapper.toAsistencia(asistenciaDTO)));
    }

    @Override
    public void delete(int idAsistencia) {
        crud.deleteById(idAsistencia);
    }
}
