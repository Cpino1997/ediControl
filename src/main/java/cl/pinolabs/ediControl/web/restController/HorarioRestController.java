package cl.pinolabs.ediControl.web.restController;

import cl.pinolabs.ediControl.model.domain.dto.HorarioDTO;
import cl.pinolabs.ediControl.model.domain.service.HorarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/horarios")
public class HorarioRestController {
    private final HorarioService service;

    public HorarioRestController(HorarioService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<HorarioDTO>> findAll(){
        return service.findAll()
                .map(horarios -> new ResponseEntity<>(horarios, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @GetMapping("/{idHorario}")
    public ResponseEntity<HorarioDTO> findById(@PathVariable("idHorario") int idHorario){
        return service.findById(idHorario)
                .map(horarioDTO -> new ResponseEntity<>(horarioDTO, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/save")
    public ResponseEntity<HorarioDTO> save(@RequestBody HorarioDTO horarioDTO){
        return new ResponseEntity<>(service.save(horarioDTO), HttpStatus.OK);
    }
    @DeleteMapping("/del/{idHorario}")
    public ResponseEntity delete(@PathVariable("idHorario") int idHorario){
        if (service.delete(idHorario)){
            return new ResponseEntity<>(HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
