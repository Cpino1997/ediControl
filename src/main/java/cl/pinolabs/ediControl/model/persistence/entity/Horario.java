package cl.pinolabs.ediControl.model.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name = "horarios")
public class Horario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_horario")
    private Integer id;
    private String horario;
    private Integer horaSemanal;
    private Integer sueldo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Integer getSueldo() {
        return sueldo;
    }

    public void setSueldo(Integer sueldo) {
        this.sueldo = sueldo;
    }

    public Integer getHoraSemanal() {
        return horaSemanal;
    }

    public void setHoraSemanal(Integer horaSemanal) {
        this.horaSemanal = horaSemanal;
    }
}
