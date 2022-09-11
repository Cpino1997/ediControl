package cl.pinolabs.ediControl.model.persistence.entity;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "trabajadores")
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_trabajador")
    private Integer id;
    @NotNull
    @Column(length = 13)
    private String rut;
    @NotNull
    @Column(length = 40)
    private String nombre;
    @Column(length = 40)
    private String apellido;
    @Column(length = 50)
    @NotNull
    private String correo;
    @Column(length = 50)
    @NotNull
    private String direccion;
    @Column(length = 10)
    @NotNull
    private Integer telefono;
    @Column(length = 10,name = "numero_cargas")
    @NotNull
    private Integer cargas;

    @Column(name = "id_afp")
    @NotNull
    private Integer idAfp;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_afp", insertable = false, updatable =false)
    private AFP afp;

    @Column(name = "id_salud")
    @NotNull
    private Integer idSalud;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_salud", insertable = false, updatable = false)
    private Salud salud;

    @Column(name = "id_caja")
    @NotNull
    private Integer idCaja;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_caja", insertable = false, updatable = false )
    private Caja caja;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public Integer getCargas() {
        return cargas;
    }

    public void setCargas(Integer cargas) {
        this.cargas = cargas;
    }

    public Integer getIdAfp() {
        return idAfp;
    }

    public void setIdAfp(Integer idAfp) {
        this.idAfp = idAfp;
    }

    public AFP getAfp() {
        return afp;
    }

    public void setAfp(AFP afp) {
        this.afp = afp;
    }

    public Integer getIdSalud() {
        return idSalud;
    }

    public void setIdSalud(Integer idSalud) {
        this.idSalud = idSalud;
    }

    public Salud getSalud() {
        return salud;
    }

    public void setSalud(Salud salud) {
        this.salud = salud;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }
}
