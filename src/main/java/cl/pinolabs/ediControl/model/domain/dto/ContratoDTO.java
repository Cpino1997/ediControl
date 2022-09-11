package cl.pinolabs.ediControl.model.domain.dto;

import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.Date;

public class ContratoDTO {

    private Integer idContrato;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate inicioContrato;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate terminoContrato;

    private Integer idHorario;

    private HorarioDTO horarioDTO;

    private Integer idTrabajador;

    private TrabajadorDTO trabajadorDTO;

    public Integer getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(Integer idContrato) {
        this.idContrato = idContrato;
    }

    public LocalDate getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(LocalDate inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public LocalDate getTerminoContrato() {
        return terminoContrato;
    }

    public void setTerminoContrato(LocalDate terminoContrato) {
        this.terminoContrato = terminoContrato;
    }

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public HorarioDTO getHorarioDTO() {
        return horarioDTO;
    }

    public void setHorarioDTO(HorarioDTO horarioDTO) {
        this.horarioDTO = horarioDTO;
    }

    public Integer getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Integer idTrabajador) {
        this.idTrabajador = idTrabajador;
    }

    public TrabajadorDTO getTrabajadorDTO() {
        return trabajadorDTO;
    }

    public void setTrabajadorDTO(TrabajadorDTO trabajadorDTO) {
        this.trabajadorDTO = trabajadorDTO;
    }
}
