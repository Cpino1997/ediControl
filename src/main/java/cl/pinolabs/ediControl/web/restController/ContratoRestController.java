package cl.pinolabs.ediControl.web.restController;

import cl.pinolabs.ediControl.model.domain.dto.ContratoDTO;
import cl.pinolabs.ediControl.model.domain.dto.SaludDTO;
import cl.pinolabs.ediControl.model.domain.service.ContratoService;
import cl.pinolabs.ediControl.model.domain.service.SaludService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contratos")
public class ContratoRestController {
    private final ContratoService service;

    public ContratoRestController(ContratoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ContratoDTO>> findAll(){
        return service.findAll()
                .map(contratos -> new ResponseEntity<>(contratos, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{idContrato}")
    public ResponseEntity<ContratoDTO> findById(@PathVariable("idContrato") int idContrato){
        return service.findById(idContrato)
                .map(contratoDTO -> new ResponseEntity<>(contratoDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<ContratoDTO> save(@RequestBody ContratoDTO contratoDTO){
        return new ResponseEntity<>(service.save(contratoDTO), HttpStatus.OK);
    }
    @DeleteMapping("/del/{idContrato}")
    public ResponseEntity delete(@PathVariable("idContrato") int idContrato){
        if (service.delete(idContrato)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
