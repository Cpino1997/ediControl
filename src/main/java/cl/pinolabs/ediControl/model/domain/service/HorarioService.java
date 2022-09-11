package cl.pinolabs.ediControl.model.domain.service;

import cl.pinolabs.ediControl.model.domain.dto.HorarioDTO;
import cl.pinolabs.ediControl.model.domain.repository.HorarioDTORepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HorarioService {
    private final HorarioDTORepo repo;

    public HorarioService(HorarioDTORepo repo) {
        this.repo = repo;
    }

    public Optional<List<HorarioDTO>> findAll(){
        return repo.findAll();
    }

    public Optional<HorarioDTO> findById(int idHorario){
        return repo.findById(idHorario);
    }

    public HorarioDTO save(HorarioDTO horarioDTO){
        return repo.save(horarioDTO);
    }

    public boolean delete(int idHorario){
        return findById(idHorario)
                .map(horarioDTO -> {
                    repo.delete(idHorario);
                    return true;})
                .orElse(false);
    }
}
