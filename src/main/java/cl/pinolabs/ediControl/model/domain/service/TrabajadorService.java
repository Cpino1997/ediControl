package cl.pinolabs.ediControl.model.domain.service;

import cl.pinolabs.ediControl.model.domain.dto.TrabajadorDTO;
import cl.pinolabs.ediControl.model.domain.repository.TrabajadorDTORepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrabajadorService {
    private final TrabajadorDTORepo repo;

    public TrabajadorService(TrabajadorDTORepo repo) {
        this.repo = repo;
    }

    public Optional<List<TrabajadorDTO>> findAll(){
        return repo.findAll();
    }

    public Optional<TrabajadorDTO> findById(int idTrabajador){
        return repo.findById(idTrabajador);
    }

    public TrabajadorDTO save(TrabajadorDTO trabajadorDTO){
        return repo.save(trabajadorDTO);
    }

    public boolean delete(int idTrabajador){
        return findById(idTrabajador)
                .map(trabajadorDTO -> {
                    repo.delete(idTrabajador);
                    return true;})
                .orElse(false);
    }
}
