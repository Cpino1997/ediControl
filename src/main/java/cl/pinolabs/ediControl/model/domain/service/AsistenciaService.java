package cl.pinolabs.ediControl.model.domain.service;

import cl.pinolabs.ediControl.model.domain.dto.AsistenciaDTO;
import cl.pinolabs.ediControl.model.domain.repository.AsistenciaDTORepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AsistenciaService {
    private final AsistenciaDTORepo repo;

    public AsistenciaService(AsistenciaDTORepo repo) {
        this.repo = repo;
    }

    public Optional<List<AsistenciaDTO>> findAll(){
        return repo.findAll();
    }

    public Optional<AsistenciaDTO> findById(int idAsistencia){
        return repo.findById(idAsistencia);
    }

    public AsistenciaDTO save(AsistenciaDTO asistenciaDTO){
        return repo.save(asistenciaDTO);
    }

    public boolean delete(int idAsistencia){
        return findById(idAsistencia)
                .map(asistenciaDTO -> {
                    repo.delete(idAsistencia);
                    return true;})
                .orElse(false);
    }
}
