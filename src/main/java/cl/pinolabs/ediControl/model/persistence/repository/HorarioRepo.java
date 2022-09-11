package cl.pinolabs.ediControl.model.persistence.repository;

import cl.pinolabs.ediControl.model.domain.dto.HorarioDTO;
import cl.pinolabs.ediControl.model.domain.repository.HorarioDTORepo;
import cl.pinolabs.ediControl.model.persistence.crud.HorarioCrud;
import cl.pinolabs.ediControl.model.persistence.entity.Horario;
import cl.pinolabs.ediControl.model.persistence.mapper.HorarioMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class HorarioRepo implements HorarioDTORepo {

    private final HorarioCrud crud;
    private final HorarioMapper mapper;

    public HorarioRepo(HorarioCrud crud, HorarioMapper mapper) {
        this.crud = crud;
        this.mapper = mapper;
    }
    @Override
    public Optional<List<HorarioDTO>> findAll() {
        return Optional.of(mapper.toHorarioDTOs((List<Horario>) crud.findAll()));
    }

    @Override
    public Optional<HorarioDTO> findById(int idHorario) {
        return crud.findById(idHorario)
                .map(mapper::toHorarioDTO);
    }

    @Override
    public HorarioDTO save(HorarioDTO horarioDTO) {
        return mapper.toHorarioDTO(crud.save(mapper.toHorario(horarioDTO)));
    }

    @Override
    public void delete(int idHorario) {
        crud.deleteById(idHorario);
    }
}
