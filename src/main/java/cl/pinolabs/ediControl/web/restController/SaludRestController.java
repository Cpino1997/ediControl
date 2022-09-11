package cl.pinolabs.ediControl.web.restController;

import cl.pinolabs.ediControl.model.domain.dto.SaludDTO;
import cl.pinolabs.ediControl.model.domain.service.SaludService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/saluds")
public class SaludRestController {
    private final SaludService service;

    public SaludRestController(SaludService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<SaludDTO>> findAll(){
        return service.findAll()
                .map(saluds -> new ResponseEntity<>(saluds, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{idSalud}")
    public ResponseEntity<SaludDTO> findById(@PathVariable("idSalud") int idSalud){
        return service.findById(idSalud)
                .map(saludDTO -> new ResponseEntity<>(saludDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<SaludDTO> save(@RequestBody SaludDTO saludDTO){
        return new ResponseEntity<>(service.save(saludDTO), HttpStatus.OK);
    }
    @DeleteMapping("/del/{idSalud}")
    public ResponseEntity delete(@PathVariable("idSalud") int idSalud){
        if (service.delete(idSalud)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
