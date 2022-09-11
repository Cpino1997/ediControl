package cl.pinolabs.ediControl.model.domain.service;

import cl.pinolabs.ediControl.model.domain.dto.SaludDTO;
import cl.pinolabs.ediControl.model.domain.repository.SaludDTORepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SaludService {
    private final SaludDTORepo repo;

    public SaludService(SaludDTORepo repo) {
        this.repo = repo;
    }
    public Optional<List<SaludDTO>> findAll(){
        return repo.findAll();
    }

    public Optional<SaludDTO> findById(int idSalud){
        return repo.findById(idSalud);
    }

    public SaludDTO save(SaludDTO saludDTO){
        return repo.save(saludDTO);
    }

    public boolean delete(int idSalud){
        return findById(idSalud)
                .map(saludDTO -> {
                    repo.delete(idSalud);
                    return true;})
                .orElse(false);
    }
}
