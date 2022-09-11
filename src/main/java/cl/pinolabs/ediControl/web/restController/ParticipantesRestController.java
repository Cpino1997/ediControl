package cl.pinolabs.ediControl.web.restController;

import cl.pinolabs.ediControl.model.domain.dto.ParticipanteDTO;
import cl.pinolabs.ediControl.model.domain.service.ParticipanteService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/participantes")
public class ParticipantesRestController {
    private final ParticipanteService service;

    public ParticipantesRestController(ParticipanteService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<List<ParticipanteDTO>> findAll(){
        return service.findAll()
                .map(participantes -> new ResponseEntity<>(participantes, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
}
