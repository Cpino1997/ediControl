package cl.pinolabs.ediControl.web.restController;

import cl.pinolabs.ediControl.model.domain.dto.SaludDTO;
import cl.pinolabs.ediControl.model.domain.dto.TrabajadorDTO;
import cl.pinolabs.ediControl.model.domain.service.SaludService;
import cl.pinolabs.ediControl.model.domain.service.TrabajadorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/trabajadores")
public class TrabajadorRestController {
    private final TrabajadorService service;

    public TrabajadorRestController(TrabajadorService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<TrabajadorDTO>> findAll(){
        return service.findAll()
                .map(trabadors -> new ResponseEntity<>(trabadors, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{idTrabajador}")
    public ResponseEntity<TrabajadorDTO> findById(@PathVariable("idTrabajador") int idTrabajador){
        return service.findById(idTrabajador)
                .map(trabajadorDTO -> new ResponseEntity<>(trabajadorDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<TrabajadorDTO> save(@RequestBody TrabajadorDTO trabajadorDTO){
        return new ResponseEntity<>(service.save(trabajadorDTO), HttpStatus.OK);
    }
    @DeleteMapping("/del/{idTrabajador}")
    public ResponseEntity delete(@PathVariable("idTrabajador") int idTrabajador){
        if (service.delete(idTrabajador)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
