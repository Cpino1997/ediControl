package cl.pinolabs.ediControl.model.domain.dto;


public class AsistenciaDTO {
    private Integer idAsistencia;
    private Integer diasAsistidos;
    private Integer diasFaltados;
    private Integer horasTrabajadas;
    private Integer idTrabajador;
    private TrabajadorDTO trabajadorDTO;

    public Integer getIdAsistencia() {
        return idAsistencia;
    }

    public void setIdAsistencia(Integer idAsistencia) {
        this.idAsistencia = idAsistencia;
    }

    public Integer getDiasAsistidos() {
        return diasAsistidos;
    }

    public void setDiasAsistidos(Integer diasAsistidos) {
        this.diasAsistidos = diasAsistidos;
    }

    public Integer getDiasFaltados() {
        return diasFaltados;
    }

    public void setDiasFaltados(Integer diasFaltados) {
        this.diasFaltados = diasFaltados;
    }

    public Integer getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(Integer horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
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
