package cl.pinolabs.ediControl.web.restController;

/* Creado por PinoLabs */

import cl.pinolabs.ediControl.model.domain.dto.AFPDTO;
import cl.pinolabs.ediControl.model.domain.service.AFPService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/afps")
public class AFPRestController {
private final AFPService service;

public AFPRestController(AFPService service) {
    this.service = service;
}

@GetMapping
public ResponseEntity<List<AFPDTO>> findAll(){
    return service.findAll()
            .map(afps -> new ResponseEntity<>(afps, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
}
@GetMapping("/{idAfp}")
public ResponseEntity<AFPDTO> findById(@PathVariable("idAfp") int idAfp){
    return service.findById(idAfp)
            .map(afpdto -> new ResponseEntity<>(afpdto, HttpStatus.OK))
            .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
}

@PostMapping("/save")
public ResponseEntity<AFPDTO> save(@RequestBody AFPDTO afpdto){
    return new ResponseEntity<>(service.save(afpdto), HttpStatus.OK);
}
@DeleteMapping("/del/{idAfp}")
public ResponseEntity delete(@PathVariable("idAfp") int idAfp){
    if (service.delete(idAfp)){
        return new ResponseEntity<>(HttpStatus.OK);
    } else {
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
}

