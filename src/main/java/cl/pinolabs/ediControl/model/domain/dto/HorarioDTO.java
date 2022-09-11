package cl.pinolabs.ediControl.model.domain.dto;

public class HorarioDTO {
    private Integer idHorario;
    private String horario;
    private Integer horaSemanal;
    private Integer sueldo;

    public Integer getIdHorario() {
        return idHorario;
    }

    public void setIdHorario(Integer idHorario) {
        this.idHorario = idHorario;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getHoraSemanal() {
        return horaSemanal;
    }

    public void setHoraSemanal(Integer horaSemanal) {
        this.horaSemanal = horaSemanal;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }
}
