package cl.pinolabs.ediControl.web.restController;

import cl.pinolabs.ediControl.model.domain.dto.CajaDTO;
import cl.pinolabs.ediControl.model.domain.service.CajaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/cajas")
public class CajaRestController {
    private final CajaService service;

    public CajaRestController(CajaService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<CajaDTO>> findAll(){
        return service.findAll()
                .map(cajas -> new ResponseEntity<>(cajas, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{idCaja}")
    public ResponseEntity<CajaDTO> findById(@PathVariable("idCaja") int idCaja){
        return service.findById(idCaja)
                .map(cajaDTO -> new ResponseEntity<>(cajaDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<CajaDTO> save(@RequestBody CajaDTO cajaDTO){
        return new ResponseEntity<>(service.save(cajaDTO), HttpStatus.OK);
    }
    @DeleteMapping("/del/{idCaja}")
    public ResponseEntity delete(@PathVariable("idCaja") int idCaja){
        if (service.delete(idCaja)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
