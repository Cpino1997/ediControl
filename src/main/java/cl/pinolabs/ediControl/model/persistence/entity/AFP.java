package cl.pinolabs.ediControl.model.persistence.entity;

import javax.persistence.*;

@Entity
@Table(name="afps")
public class AFP {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_afp ")
    private Integer id;

    @Column(length = 50)
    private String nombre;
    private Float descuento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getDescuento() {
        return descuento;
    }

    public void setDescuento(Float descuento) {
        this.descuento = descuento;
    }
}
