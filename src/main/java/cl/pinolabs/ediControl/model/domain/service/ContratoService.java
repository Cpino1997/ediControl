package cl.pinolabs.ediControl.model.domain.service;

import cl.pinolabs.ediControl.model.domain.dto.ContratoDTO;
import cl.pinolabs.ediControl.model.domain.repository.ContratoDTORepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContratoService {
    private final ContratoDTORepo repo;

    public ContratoService(ContratoDTORepo repo) {
        this.repo = repo;
    }

    public Optional<List<ContratoDTO>> findAll(){
        return repo.findAll();
    }

    public Optional<ContratoDTO> findById(int idContrato){
        return repo.findById(idContrato);
    }

    public ContratoDTO save(ContratoDTO contratoDTO){
        return repo.save(contratoDTO);
    }

    public boolean delete(int idContrato){
        return findById(idContrato)
                .map(contratoDTO -> {
                    repo.delete(idContrato);
                    return true;})
                .orElse(false);
    }
}
