package cl.pinolabs.ediControl.model.domain.dto;

public class TrabajadorDTO {
    private Integer idTrabajador;
    private String rut;
    private String nombre;
    private String apellido;
    private String correo;
    private String direccion;
    private Integer telefono;
    private Integer cargas;
    private Integer idAfp;
    private AFPDTO afpdto;

    private Integer idSalud;
    private SaludDTO saludDTO;

    private Integer idCaja;
    private CajaDTO cajaDTO;

    public Integer getIdTrabajador() {
        return idTrabajador;
    }

    public void setIdTrabajador(Integer idTrabajador) {
        this.idTrabajador = idTrabajador;
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

    public AFPDTO getAfpdto() {
        return afpdto;
    }

    public void setAfpdto(AFPDTO afpdto) {
        this.afpdto = afpdto;
    }

    public Integer getIdSalud() {
        return idSalud;
    }

    public void setIdSalud(Integer idSalud) {
        this.idSalud = idSalud;
    }

    public SaludDTO getSaludDTO() {
        return saludDTO;
    }

    public void setSaludDTO(SaludDTO saludDTO) {
        this.saludDTO = saludDTO;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public CajaDTO getCajaDTO() {
        return cajaDTO;
    }

    public void setCajaDTO(CajaDTO cajaDTO) {
        this.cajaDTO = cajaDTO;
    }
}
