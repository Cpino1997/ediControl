package cl.pinolabs.ediControl.web.control;

import cl.pinolabs.ediControl.model.domain.dto.*;
import cl.pinolabs.ediControl.model.domain.service.*;
import cl.pinolabs.ediControl.model.persistence.entity.Contrato;
import cl.pinolabs.ediControl.model.persistence.entity.Horario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping("/devs")
public class devsController {

    private final AFPService afpService;
    private final SaludService saludService;
    private final CajaService cajaService;

    private final TrabajadorService trabajadorService;
    private final HorarioService horarioService;
    private final ContratoService contratoService;

    private final ParticipanteService participanteService;

    public devsController(AFPService afpService,SaludService saludService, CajaService cajaService,TrabajadorService trabajadorService, HorarioService horarioService, ContratoService contratoService, ParticipanteService participanteService) {
        this.afpService = afpService;
        this.saludService = saludService;
        this.cajaService = cajaService;
        this.trabajadorService = trabajadorService;
        this.horarioService = horarioService;
        this.contratoService = contratoService;
        this.participanteService = participanteService;
    }

    @GetMapping
    public String devs(){return"devs";}

    @PostMapping("/saveParticipante")
    public String save(@ModelAttribute ParticipanteDTO idParticipante) {
        participanteService.save(idParticipante);
        return "redirect:/devs";
    }

    /* Control AFP */

    @GetMapping("/afp")
    public String afp(Model model){
        model.addAttribute("afps",
                afpService.findAll()
                            .orElse(new ArrayList<AFPDTO>()));
            return "devs/afp";
        }
    @PostMapping("/afp/save")
    public String saveAfp(@ModelAttribute AFPDTO idAfp){
        afpService.save(idAfp);
        return "redirect:/devs/afp";
    }

    /* Control Salud */

    @GetMapping("/salud")
    public String salud(Model model){
        model.addAttribute("saluds",
                saludService.findAll()
                        .orElse(new ArrayList<SaludDTO>()));
        return "devs/salud";
    }
    @PostMapping("/salud/save")
    public String saveSalud(@ModelAttribute SaludDTO idSalud){
        saludService.save(idSalud);
        return "redirect:/devs/salud";
    }

    /* Control Caja */

    @GetMapping("/caja")
    public String caja(Model model){
        model.addAttribute("cajas",
                cajaService.findAll()
                        .orElse(new ArrayList<CajaDTO>()));
        return "devs/caja";
    }
    @PostMapping("/caja/save")
    public String saveCaja(@ModelAttribute CajaDTO idCaja){
        cajaService.save(idCaja);
        return "redirect:/devs/caja";
    }

    /* Control Trabajador */

    @GetMapping("/trabajador")
    public String trabajador(Model model){
        model.addAttribute("trabajadores",
                trabajadorService.findAll()
                        .orElse(new ArrayList<TrabajadorDTO>()));
        model.addAttribute("afps",
                afpService.findAll()
                        .orElse(new ArrayList<AFPDTO>()));
        model.addAttribute("cajas",
                cajaService.findAll()
                        .orElse(new ArrayList<CajaDTO>()));
        model.addAttribute("saluds",
                saludService.findAll()
                        .orElse(new ArrayList<SaludDTO>()));
        return "devs/trabajador";
    }
    @PostMapping("/trabajador/save")
    public String saveTrabajador(@ModelAttribute TrabajadorDTO idTrabajador){
        trabajadorService.save(idTrabajador);
        return "redirect:/devs/trabajador";
    }
    /* Control Horario */

    @GetMapping("/horario")
    public String horario(Model model){
        model.addAttribute("horarios",
                horarioService.findAll()
                        .orElse(new ArrayList<HorarioDTO>()));
        return "devs/horario";
    }
    @PostMapping("/horario/save")
    public String saveHorario(@ModelAttribute HorarioDTO idHorario){
        horarioService.save(idHorario);
        return "redirect:/devs/horario";
    }

    /* Control Contrato */

    @GetMapping("/contrato")
    public String contrato(Model model){
        model.addAttribute("contratos",
                contratoService.findAll()
                        .orElse(new ArrayList<ContratoDTO>()));
        model.addAttribute("horarios",
                horarioService.findAll()
                        .orElse(new ArrayList<HorarioDTO>()));
        model.addAttribute("trabajadores",
                trabajadorService.findAll()
                        .orElse(new ArrayList<TrabajadorDTO>()));
        return "devs/contrato";
    }
    @PostMapping("/contrato/save")
    public String saveContrato(@ModelAttribute ContratoDTO idContrato){
        contratoService.save(idContrato);
        return "redirect:/devs/contrato";
    }

}
