package cl.pinolabs.ediControl.web.restController;

import cl.pinolabs.ediControl.model.domain.dto.AsistenciaDTO;
import cl.pinolabs.ediControl.model.domain.service.AsistenciaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/asistencias")
public class AsistenciaRestController {
    private final AsistenciaService service;

    public AsistenciaRestController(AsistenciaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<AsistenciaDTO>> findAll(){
        return service.findAll()
                .map(asistencias -> new ResponseEntity<>(asistencias, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{idAsistencia}")
    public ResponseEntity<AsistenciaDTO> findById(@PathVariable("idAsistencia") int idAsistencia){
        return service.findById(idAsistencia)
                .map(asistenciaDTO -> new ResponseEntity<>(asistenciaDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<AsistenciaDTO> save(@RequestBody AsistenciaDTO asistenciaDTO){
        return new ResponseEntity<>(service.save(asistenciaDTO), HttpStatus.OK);
    }
    @DeleteMapping("/del/{idAsistencia}")
    public ResponseEntity delete(@PathVariable("idAsistencia") int idAsistencia){
        if (service.delete(idAsistencia)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
