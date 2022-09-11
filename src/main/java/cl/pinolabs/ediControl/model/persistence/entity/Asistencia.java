package cl.pinolabs.ediControl.model.persistence.entity;


import javax.persistence.*;
@Entity
@Table(name = "asistencias")
public class Asistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAsistencia")
    private Integer id;
    private Integer diasAsistidos;
    private Integer diasFaltados;
    private Integer horasTrabajadas;
    @Column(name = "id_trabajador")
    private Integer idTrabajador;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_trabajador", insertable = false, updatable = false)
    private Trabajador trabajador;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Trabajador getTrabajador() {
        return trabajador;
    }

    public void setTrabajador(Trabajador trabajador) {
        this.trabajador = trabajador;
    }
}
