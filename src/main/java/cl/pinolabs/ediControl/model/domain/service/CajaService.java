package cl.pinolabs.ediControl.model.domain.service;

import cl.pinolabs.ediControl.model.domain.dto.CajaDTO;
import cl.pinolabs.ediControl.model.domain.repository.CajaDTORepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CajaService {
    private final CajaDTORepo repo;

    public CajaService(CajaDTORepo repo) {
        this.repo = repo;
    }
    public Optional<List<CajaDTO>> findAll(){
        return repo.findAll();
    }

    public Optional<CajaDTO> findById(int idCaja){
        return repo.findById(idCaja);
    }

    public CajaDTO save(CajaDTO cajaDTO){
        return repo.save(cajaDTO);
    }

    public boolean delete(int idCaja){
        return findById(idCaja)
                .map(cajaDTO -> {
                    repo.delete(idCaja);
                    return true;})
                .orElse(false);
    }
}
